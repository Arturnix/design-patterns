package co.devfoundry.command_pattern.artykul.command;

import co.devfoundry.command_pattern.artykul.PressMachine;
import co.devfoundry.factory.artykul.machines.Press;

public class PressMachineTurnOffCommand implements Command{

    private PressMachine pressMachine;

    public PressMachineTurnOffCommand(PressMachine pressMachine) {
        this.pressMachine = pressMachine;
    }

    @Override
    public void execute() {
        pressMachine.turnOff();
    }

    @Override
    public void undo() {
        pressMachine.turnOn();
    }
}
