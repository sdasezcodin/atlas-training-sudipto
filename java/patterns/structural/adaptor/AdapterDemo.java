package com.adaptor;

public class AdapterDemo {
    public static void main(String[] args) {
        // Type-C device (Adaptee)
        TypeCDevice typeCDevice = new TypeCDevice();

        // client expects a Type-A cable (Target interface)
        TypeACable cable = new CableAdapter(typeCDevice);

        // use an adapter to connect
        System.out.println("Client: Connecting using Type-A interface...");
        cable.connectWithTypeA();
    }
}
