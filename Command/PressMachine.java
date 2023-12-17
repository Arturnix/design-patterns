package co.devfoundry.command_pattern.artykul;

public class PressMachine {

    public void turnOn() {
        System.out.println("Press turned on.");
    }

    public void mountTool() {
        System.out.println("Tool mounted.");
    }

    public void placeMaterialOnPressTable() {
        System.out.println("Material placed.");
    }

    public void checkSensors() {
        System.out.println("Material is in the correct position.");
    }

    public void startProcess() {
        System.out.println("Stroke is moving down. Pressing in progress.");
    }

    public void processFinished() {
        System.out.println("Stroke is moving up. Process finished.");
    }

    public void takeMaterialFromTable() {
        System.out.println("Processed material collected.");
    }

    public void turnOff() {
        System.out.println("Machine turned off.");
    }
}
