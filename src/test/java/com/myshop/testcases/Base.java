package com.myshop.testcases;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.myshop.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	ReadConfig readconf = new ReadConfig();
	String url = readconf.getbaseUrl();
	String browser = readconf.getbrowser();
	public static WebDriver driver;

	public static Logger logger;
	@BeforeClass
	public void setup() {
		String browser = "chrome";
		switch (browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			driver = null;
			break;
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		logger=LogManager.getLogger("Myshop");

	}

	@AfterClass
	public void teardown() {
		driver.close();
		driver.quit();
	}
}
