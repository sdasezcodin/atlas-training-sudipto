package com.command;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();

        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        RemoteControl remote = new RemoteControl();

        // Turn light ON
        remote.setCommand(lightOn);
        remote.pressButton();

        // Turn light OFF
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}
