package com.solid.design.principle.ocp.devices;

public class Television implements Device {
    @Override
    public void turnOn() {
        System.out.println("Television turned on!!!");
    }

    @Override
    public void turnOff() {
        System.out.println("Television turned off!!!");
    }

    // additional steps that may be required to operate your device
    private void SwitchToFavoriteChannel() {
        System.out.println("Switched to your favorite Channel");
    }

    private void turnOnTVAlarm() {
        System.out.println("TV Alarm set for you to wake up in the morning");
    }

    public String toString() {
        return "Television";
    }
}
