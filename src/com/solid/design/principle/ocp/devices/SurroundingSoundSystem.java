package com.solid.design.principle.ocp.devices;

public class SurroundingSoundSystem implements Device {

    @Override
    public void turnOn() {
        System.out.println("Sound system turned on!!!");
    }

    @Override
    public void turnOff() {
        System.out.println("Sound system turned off!!!");
    }

    @Override
    public String toString() {
        return "SurroundingSoundSystem";
    }
}
