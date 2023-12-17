package co.devfoundry.command_pattern.artykul;

import co.devfoundry.command_pattern.artykul.command.*;

public class Main {
    public static void main(String[] args) {

        PressMachine pressMachine = new PressMachine();
        WorkshopApp workshopApp = new WorkshopApp();

        workshopApp.addToQueue(new PressMachineTurnOnCommand(pressMachine));
        workshopApp.addToQueue(new PressMachineMountToolCommand(pressMachine));
        workshopApp.addToQueue(new PressMachinePlaceMaterialOnPressTableCommand(pressMachine));
        workshopApp.addToQueue(new PressMachineCheckSensorsCommand(pressMachine));
        workshopApp.addToQueue(new PressMachineStartProcessCommand(pressMachine));
        workshopApp.addToQueue(new PressMachineProcessFinishedCommand(pressMachine));
        workshopApp.addToQueue(new PressMachineTakeMaterialFromTableCommand(pressMachine));
        workshopApp.addToQueue(new PressMachineTurnOffCommand(pressMachine));

        workshopApp.run();
        workshopApp.undoLastCommand();

    }
}
