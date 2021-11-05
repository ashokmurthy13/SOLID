package com.solid.design.principle.ocp.devices;

import com.solid.design.principle.ocp.devices.Device;

public class Projector implements Device {

    @Override
    public void turnOn() {
        System.out.println("Projector turned on!!!");
    }

    @Override
    public void turnOff() {
        System.out.println("Projector turned off!!!");
    }

    // additional steps that may require to operate the device
    public void pullDownProjectorScreen() {
        System.out.println("Screen has been lowered for viewing");
    }

    public void pullUpProjectorScreen() {
        System.out.println("Screen has been raised back to normal");
    }

    @Override
    public String toString() {
        return "Projector";
    }
}
