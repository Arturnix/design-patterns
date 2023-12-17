package co.devfoundry.command_pattern.artykul.command;

import co.devfoundry.command_pattern.artykul.PressMachine;

public class PressMachineMountToolCommand implements Command{

    private PressMachine pressMachine;

    public PressMachineMountToolCommand(PressMachine pressMachine) {
        this.pressMachine = pressMachine;
    }

    @Override
    public void execute() {
        pressMachine.mountTool();
    }

    @Override
    public void undo() {

    }
}
