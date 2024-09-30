package com.myshop.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties prop;
	String path = "C:\\Users\\Jawed\\eclipse-workspace\\Myshop\\configuration\\config.properties";

	public  ReadConfig() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(path);
			prop.load(fis);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getbaseUrl() {
		String urlvalue = prop.getProperty("baseUrl");
		if (urlvalue != null) {
			return urlvalue;
		} else
			throw new RuntimeException("url not specified in config file");
	}
	
	public String getbrowser() {
		String browservalue = prop.getProperty("browser");
		if (browservalue != null) {
			return browservalue;
		} else
			throw new RuntimeException("browser not specified in config file");
	}
}
