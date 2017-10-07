package com.aMu.imageP.util;

import java.util.ResourceBundle;

public class Utils {

	public static String getProperties(String key) {
		ResourceBundle sysProperties = ResourceBundle.getBundle("sys");
		return sysProperties.getString(key);
	}
	
	public static void main(String[] args) {
		System.out.println(getProperties("uploadRoot"));
	}
	
}
