package com.solid.design.principle.ocp.remotes;

import com.solid.design.principle.ocp.devices.Device;

// Singleton Class. Since there is one, and only one, remote control
public class RemoteControl {

    private Device device = null;
    private static final RemoteControl INSTANCE = new RemoteControl();

    private RemoteControl() {
    }

    public static RemoteControl getInstance() {
        return INSTANCE;
    }

    public void connectToDevice(Device device) {
        this.device = device;
        System.out.println("Connected to " + device);
    }

    public void clickOnButton() {
        device.turnOn();
    }

    public void clickOffButton() {
        device.turnOff();
    }
}
