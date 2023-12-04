package com.aio.generator.utils;

public class CommonUtils {
	
	private CommonUtils() {}
	
	public static String formatField(String input) {
		return null == input? null : input.replaceAll("\"", "").trim();
	}
}
