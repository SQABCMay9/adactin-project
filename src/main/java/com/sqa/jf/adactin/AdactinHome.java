/**
 *   File Name: HomePage.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Jun 25, 2016
 *
 */

package com.sqa.jf.adactin;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import com.sqa.jf.core.*;

/**
 * HomePage //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class AdactinHome extends BasicPage {

	@FindBy(id = "login")
	private static WebElement loginButton;

	private static String password = "HYMNI1";

	@FindBy(id = "password")
	private static WebElement passwordField;

	private static String username = "SQABCMar21";
	@FindBy(id = "username")
	private static WebElement usernameField;

	public AdactinHome(WebDriver driver) {
		super(driver);
	}

	public void loginToWebsite() {
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		loginButton.click();
	}

}
