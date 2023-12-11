package co.devfoundry.factory.artykul;

import co.devfoundry.factory.artykul.machines.*;

public class LightIndustryFactory extends Factory{

    @Override
    public MetalWorkingMachine createMetalWorkingMachine(MachineType machineType) {

        switch (machineType) {
            case PRESS:
                return new Press(750, 100,325);
            default:
                throw new UnsupportedOperationException("Unknown machine type.");
        }
    }

    @Override
    public PlasticWorkingMachine createPlasticWorkingMachine(MachineType machineType) {

        switch (machineType) {
            case INTRUSION_MACHINE:
                return new IntrusionMachine(89, 220, 103);
            default:
                throw new UnsupportedOperationException("Unknown machine type.");
        }
    }
}
