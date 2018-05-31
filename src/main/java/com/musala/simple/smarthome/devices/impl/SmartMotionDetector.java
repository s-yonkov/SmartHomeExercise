package com.musala.simple.smarthome.devices.impl;

import com.musala.simple.smarthome.devices.AbstractSmartDevice;

public class SmartMotionDetector extends AbstractSmartDevice {

	@Override
	public String performAction() {
		return "Detect motion";
	}

}
