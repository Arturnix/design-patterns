package co.devfoundry.command_pattern.artykul.command;

import co.devfoundry.command_pattern.artykul.PressMachine;

public class PressMachineProcessFinishedCommand implements Command{

    private PressMachine pressMachine;

    public PressMachineProcessFinishedCommand(PressMachine pressMachine) {
        this.pressMachine = pressMachine;
    }

    @Override
    public void execute() {
        pressMachine.processFinished();
    }

    @Override
    public void undo() {

    }
}
