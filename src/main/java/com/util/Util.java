package com.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Base;

public class Util extends Base {

	public Util() {
		super();
	}

	public WebElement getElement(By by) {
		WebElement element = null;
		try {
			element = getDriver().findElement(by);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return element;
	}

	public void click(By by) {
		getElement(by).click();
	}
	
	public void sendKeys(By by, String text) {
		getElement(by).clear();
		getElement(by).sendKeys(text);
	}
	
	public String getText(By by) {
		return getElement(by).getText().trim();
	}

}
