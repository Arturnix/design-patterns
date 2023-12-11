package co.devfoundry.factory.artykul;

import co.devfoundry.factory.artykul.machines.*;

public class HeavyIndustryFactory extends Factory{
    @Override
    public MetalWorkingMachine createMetalWorkingMachine(MachineType machineType) {

        switch (machineType) {
            case PRESS:
                return new Press(1100, 350, 402);
            default:
                throw new UnsupportedOperationException("Unknown machine type.");
        }
    }

    @Override
    public PlasticWorkingMachine createPlasticWorkingMachine(MachineType machineType) {

        switch (machineType) {
            case INTRUSION_MACHINE:
                return new IntrusionMachine(93, 234,112);
            default:
                throw new UnsupportedOperationException("Unknown machine type.");
        }
    }
}
