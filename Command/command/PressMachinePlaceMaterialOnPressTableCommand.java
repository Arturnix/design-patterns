package co.devfoundry.command_pattern.artykul.command;

import co.devfoundry.command_pattern.artykul.PressMachine;

public class PressMachinePlaceMaterialOnPressTableCommand implements Command{

    private PressMachine pressMachine;

    public PressMachinePlaceMaterialOnPressTableCommand(PressMachine pressMachine) {
        this.pressMachine = pressMachine;
    }

    @Override
    public void execute() {
        pressMachine.placeMaterialOnPressTable();
    }

    @Override
    public void undo() {
        pressMachine.takeMaterialFromTable();
    }
}
