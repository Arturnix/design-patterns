package co.devfoundry.command_pattern.artykul.command;

import co.devfoundry.command_pattern.artykul.PressMachine;

public class PressMachineStartProcessCommand implements Command{

    private PressMachine pressMachine;

    public PressMachineStartProcessCommand(PressMachine pressMachine) {
        this.pressMachine = pressMachine;
    }

    @Override
    public void execute() {
        pressMachine.startProcess();
    }

    @Override
    public void undo() {

    }
}
