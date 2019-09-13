package com.allprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Neww {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\selenium\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
driver.get("https://www.carwale.com/");
driver.manage().window().maximize();


	}

}
