package com.musala.simple.smarthome.devices.impl;

import com.musala.simple.smarthome.devices.AbstractSmartDevice;

public class SmartThermostat extends AbstractSmartDevice {

	@Override
	public String performAction() {
		return "Measure temperature";
	}

}
