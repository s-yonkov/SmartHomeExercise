package com.musala.simple.smarthome.devices.impl;

import com.musala.simple.smarthome.devices.AbstractSmartDevice;

public class SmartBulb extends AbstractSmartDevice {

	@Override
	public String performAction() {
		return "Light is on";
	}

}
