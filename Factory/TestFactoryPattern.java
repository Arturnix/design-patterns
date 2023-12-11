package co.devfoundry.factory.artykul;

import co.devfoundry.factory.artykul.machines.MachineType;
import co.devfoundry.factory.artykul.machines.MetalWorkingMachine;
import co.devfoundry.factory.artykul.machines.PlasticWorkingMachine;

public class TestFactoryPattern {
    public static void main(String[] args) {

        Factory lightIndustryFactory = new LightIndustryFactory();
        Factory heavyIndustryFactory = new HeavyIndustryFactory();

        MetalWorkingMachine lightPress = lightIndustryFactory.createMetalWorkingMachine(MachineType.PRESS);

        PlasticWorkingMachine heavyIntrusionMachine = heavyIndustryFactory.createPlasticWorkingMachine(MachineType.INTRUSION_MACHINE);
    }
}
