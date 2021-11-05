package com.solid.design.principle.ocp.user;

import com.solid.design.principle.ocp.devices.Projector;
import com.solid.design.principle.ocp.devices.Television;
import com.solid.design.principle.ocp.remotes.RemoteControl;

public class Person {

    public static void main(String[] args) {

        // Devices in Home
        Television television = new Television();
        Projector projector = new Projector();

        //remote control
        RemoteControl remoteControl = RemoteControl.getInstance();

        remoteControl.connectToDevice(television);
        remoteControl.clickOnButton();
        remoteControl.clickOffButton();

        remoteControl.connectToDevice(projector);
        remoteControl.clickOnButton();
        remoteControl.clickOffButton();
    }
}
