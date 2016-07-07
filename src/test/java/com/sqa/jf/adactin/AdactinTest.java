package com.sqa.jf.adactin;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;
import org.testng.annotations.*;

import com.sqa.jf.core.*;

/**
 *   File Name: AdactinTest.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Jun 25, 2016
 *
 */

/**
 * AdactinTest //ADDD (description of class)
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
public class AdactinTest extends BasicTest {

	/**
	 * @param baseURL
	 */
	public AdactinTest() {
		super("http://adactin.com/HotelApp");
	}

	@Test
	public void adactinTest() throws InterruptedException {
		String expectedTitle = "AdactIn.com - Search Hotel";
		AdactinHome home = new AdactinHome(getDriver());
		home.loginToWebsite();
		// Assert.assertEquals(getDriver().getTitle(), expectedTitle, "Login Not
		// Successful");
		if (!getDriver().getTitle().equals(expectedTitle)) {
			getLog().warn("unsuccessful login attempt");
		}

	}

	@Test
	public void jqueryActionsTest() throws InterruptedException {
		getDriver().get("https://jqueryui.com/resizable/");
		// Switch to working frame
		getDriver().switchTo().frame(0);
		// Check for element
		if (isElementPresent(By.className("ui-resizable-se"))) {
			System.out.println("Handle is there.");
		}
		Actions builder = new Actions(getDriver());
		builder.clickAndHold(getDriver().findElement(By.className("ui-resizable-se"))).moveByOffset(200, 200).release();
		// Generate the composite action.
		Action moveResizeHandles = builder.build();
		// Perform the compositeAction
		moveResizeHandles.perform();
		Thread.sleep(5000);
	}

}
