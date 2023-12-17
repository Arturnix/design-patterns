package co.devfoundry.command_pattern.artykul.command;

import co.devfoundry.command_pattern.artykul.PressMachine;

public class PressMachineCheckSensorsCommand implements Command{

    private PressMachine pressMachine;

    public PressMachineCheckSensorsCommand(PressMachine pressMachine) {
        this.pressMachine = pressMachine;
    }

    @Override
    public void execute() {
        pressMachine.checkSensors();
    }

    @Override
    public void undo() {

    }
}
