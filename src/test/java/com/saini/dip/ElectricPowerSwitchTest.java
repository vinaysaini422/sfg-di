package com.saini.dip;

import org.junit.jupiter.api.Test;

class ElectricPowerSwitchTest {

    @Test
    public void testPress() throws Exception {
        Switchable switchableBulb=new LightBulb();
        Switch bulbPowerSwitch=new ElectricPowerSwitch(switchableBulb);
        bulbPowerSwitch.press();
        bulbPowerSwitch.press();

        Switchable switchableFan=new Fan();
        Switch fanPowerSwitch=new ElectricPowerSwitch(switchableFan);
        fanPowerSwitch.press();
        fanPowerSwitch.press();
    }

}