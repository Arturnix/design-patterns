package co.devfoundry.factory.artykul;

import co.devfoundry.factory.artykul.machines.MachineType;
import co.devfoundry.factory.artykul.machines.MetalWorkingMachine;
import co.devfoundry.factory.artykul.machines.PlasticWorkingMachine;

abstract public class Factory {

    abstract public MetalWorkingMachine createMetalWorkingMachine(MachineType machineType);
    abstract public PlasticWorkingMachine createPlasticWorkingMachine(MachineType machineType);
}
