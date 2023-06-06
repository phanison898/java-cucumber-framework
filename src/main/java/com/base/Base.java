package com.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

	public static WebDriver getDriver() {
		return driver.get();
	}

	public void launchBrowser() {
		driver.set(new ChromeDriver());
		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	public void launchWebsite(String url) {
		getDriver().get(url);
	}

	public void quitBrowser() {
		getDriver().quit();
	}

	public String getTitle() {
		return getDriver().getTitle().trim();
	}
	
	public static void main(String[] args) {
		String a = "(1) Feed | Linkedin";
		String b = "Feed | Linkedin";
		System.out.println(a.contains(b));
	}

}
