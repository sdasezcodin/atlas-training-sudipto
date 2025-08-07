package com.adaptor;

class CableAdapter implements TypeACable {
    private TypeCDevice typeCDevice;

    public CableAdapter(TypeCDevice typeCDevice) {
        this.typeCDevice = typeCDevice;
    }

    @Override
    public void connectWithTypeA() {
        System.out.println("Adapter: Converting Type-A to Type-C...");
        typeCDevice.connectWithTypeC();
    }
}