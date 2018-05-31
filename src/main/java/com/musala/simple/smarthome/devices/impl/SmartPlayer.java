package com.musala.simple.smarthome.devices.impl;

import com.musala.simple.smarthome.devices.AbstractSmartDevice;

public class SmartPlayer extends AbstractSmartDevice {

	@Override
	public String performAction() {
		return "Play music";
	}

}
