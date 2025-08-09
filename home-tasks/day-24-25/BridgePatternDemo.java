interface Device {
    void turnOn();
    void turnOff();
    void setVolume(int volume);
}
class TV implements Device {
    @Override
    public void turnOn() {
        System.out.println("TV is ON");
    }
    @Override
    public void turnOff() {System.out.println("TV is OFF");}
    @Override
    public void setVolume(int volume) {
        System.out.println("TV volume set to " + volume);
    }
}
class Radio implements Device {
    @Override
    public void turnOn() {
        System.out.println("Radio is ON");
    }
    @Override
    public void turnOff() {
        System.out.println("Radio is OFF");
    }
    @Override
    public void setVolume(int volume) {
        System.out.println("Radio volume set to " + volume);
    }
}

abstract class RemoteControl {
    protected Device device; // Bridge link

    public RemoteControl(Device device) {
        this.device = device;
    }
    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void setVolume(int volume);
}

class BasicRemote extends RemoteControl {
    public BasicRemote(Device device) {
        super(device);
    }
    @Override
    public void turnOn() {
        device.turnOn();
    }
    @Override
    public void turnOff() {
        device.turnOff();
    }
    @Override
    public void setVolume(int volume) {
        device.setVolume(volume);
    }
}

public class BridgePatternDemo {
    public static void main(String[] args) {
        RemoteControl tvRemote = new BasicRemote(new TV());
        tvRemote.turnOn();
        tvRemote.setVolume(15);
        tvRemote.turnOff();

        System.out.println("----------------");

        RemoteControl radioRemote = new BasicRemote(new Radio());
        radioRemote.turnOn();
        radioRemote.setVolume(8);
        radioRemote.turnOff();
    }
}















