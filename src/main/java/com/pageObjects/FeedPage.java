package com.pageObjects;

import org.openqa.selenium.By;

import com.util.Util;

public class FeedPage extends Util {

	private final By usernameText = By.xpath("//a[contains(@id,'ember')]/div[2]");

	public FeedPage() {
		super();
	}

	public String getUsername() {
		return getText(usernameText);
	}
}
