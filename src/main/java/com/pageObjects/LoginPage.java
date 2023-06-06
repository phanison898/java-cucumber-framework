package com.pageObjects;

import org.openqa.selenium.By;

import com.util.Util;

public class LoginPage extends Util {

	private final By usernameTextInput = By.xpath("//input[@id='session_key']");

	private final By passwordTextInput = By.xpath("//input[@id='session_password']");

	private final By signInButton = By.xpath("//button[@data-id='sign-in-form__submit-btn']");

	public LoginPage() {
		super();
	}

	public void enterCredentials(String username, String password) {
		sendKeys(usernameTextInput, username);
		sendKeys(passwordTextInput, password);
	}

	public FeedPage clickSignInButton() {
		click(signInButton);
		return new FeedPage();
	}
}
