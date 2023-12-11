package co.devfoundry.factory.artykul.machines;

abstract public class PlasticWorkingMachine {

    private int tempOfIntrusion;
    private int safetyDistance;
    private int stopTime;

    protected PlasticWorkingMachine(int tempOfIntrusion, int safetyDistance, int stopTime) {
        this.tempOfIntrusion = tempOfIntrusion;
        this.safetyDistance = safetyDistance;
        this.stopTime = stopTime;
    }

    public int getTempOfIntrusion() {
        return tempOfIntrusion;
    }

    public int getSafetyDistance() {
        return safetyDistance;
    }

    public int getStopTime() {
        return stopTime;
    }
}
