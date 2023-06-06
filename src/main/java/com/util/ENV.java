package com.util;

import io.github.cdimascio.dotenv.Dotenv;

public class ENV {

	public static String get(String key) {
		return Dotenv.load().get(key);
	}

}
