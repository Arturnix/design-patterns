package co.devfoundry.command_pattern.artykul.command;

import co.devfoundry.command_pattern.artykul.PressMachine;

public class PressMachineTurnOnCommand implements Command{

    private PressMachine pressMachine;

    public PressMachineTurnOnCommand(PressMachine pressMachine) {
        this.pressMachine = pressMachine;
    }

    @Override
    public void execute() {
        pressMachine.turnOn();
    }

    @Override
    public void undo() {
        pressMachine.turnOff();
    }
}
