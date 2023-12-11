package co.devfoundry.factory.artykul.machines;

abstract public class MetalWorkingMachine {

    private int strokeHeight;
    private int strokeForce;
    private int safetyDistance;

    public MetalWorkingMachine(int strokeHeight, int strokeForce, int safetyDistance) {
        this.strokeHeight = strokeHeight;
        this.strokeForce = strokeForce;
        this.safetyDistance = safetyDistance;
    }

    public int getStrokeHeight() {
        return strokeHeight;
    }

    public int getStrokeForce() {
        return strokeForce;
    }

    public int getSafetyDistance() {
        return safetyDistance;
    }
}
