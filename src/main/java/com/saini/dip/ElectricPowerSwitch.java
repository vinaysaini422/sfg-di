package com.saini.dip;

public class ElectricPowerSwitch implements Switch{
    // public LightBulb lightBulb; // Bad Practice High level ElectricPower Switch is directly dependent on LightBulb
    public Switchable client;
    public boolean on;

   /* public ElectricPowerSwitch(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
        this.on = false;
    }*/

    public ElectricPowerSwitch(Switchable client) {
        this.client = client;
        this.on = false;
    }

    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void press(){
        boolean checkOn = isOn();
        if (checkOn) {
            client.turnOff();
            this.on = false;
        } else {
            client.turnOn();
            this.on = true;
        }

    }
}
