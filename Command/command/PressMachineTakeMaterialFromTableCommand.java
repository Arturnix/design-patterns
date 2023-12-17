package co.devfoundry.command_pattern.artykul.command;

import co.devfoundry.command_pattern.artykul.PressMachine;

public class PressMachineTakeMaterialFromTableCommand implements Command{

    private PressMachine pressMachine;

    public PressMachineTakeMaterialFromTableCommand(PressMachine pressMachine) {
        this.pressMachine = pressMachine;
    }

    @Override
    public void execute() {
        pressMachine.takeMaterialFromTable();
    }

    @Override
    public void undo() {
        pressMachine.placeMaterialOnPressTable();
    }
}
