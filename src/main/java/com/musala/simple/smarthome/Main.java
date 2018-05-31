package com.musala.simple.smarthome;

import com.musala.simple.smarthome.devices.AbstractSmartDevice;
import com.musala.simple.smarthome.devices.impl.SmartBulb;
import com.musala.simple.smarthome.devices.impl.SmartMotionDetector;
import com.musala.simple.smarthome.devices.impl.SmartPlayer;
import com.musala.simple.smarthome.devices.impl.SmartThermostat;

public class Main {

	public static void main(String[] args) {

		if (args.length == 0 || !(isNumber(args[0]))) {
			System.out.println("Incorrect input");
		} else {
			int input = Integer.parseInt(args[0]);
			String action = "";
			AbstractSmartDevice device = new AbstractSmartDevice();
			switch (input) {
			case 1:
				device = new SmartPlayer();
				action = device.performAction();
				break;
			case 2:
				device = new SmartBulb();
				action = device.performAction();
				break;
			case 3:
				device = new SmartThermostat();
				action = device.performAction();
				break;
			case 4:
				device = new SmartMotionDetector();
				action = device.performAction();
			default:
				action = device.performAction();
				break;
			}
			System.out.println(action);
		}
	}

	private static boolean isNumber(String input) {

		try {
			Integer.parseInt(input);
		} catch (NumberFormatException ex) {
			return false;
		}
		return true;
	}

}
