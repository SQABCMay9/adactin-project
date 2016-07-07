/**
 *   File Name: SearchHotelPage.java<br>
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
 * SearchHotelPage //ADDD (description of class)
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
public class SearchHotel extends BasicPage {

	@FindBy(id = "adultroom")
	private static WebElement adultroomFld;

	@FindBy(id = "childroom")
	private static WebElement childroomFld;

	@FindBy(id = "datepick_in")
	private static WebElement datepickInFld;

	@FindBy(id = "datepick_out")
	private static WebElement datepickOutFld;

	@FindBy(id = "hotels")
	private static WebElement hotelsFld;

	@FindBy(id = "location")
	private static WebElement locationFld;

	@FindBy(id = "Reset")
	private static WebElement resetBtn;

	@FindBy(id = "room_nos")
	private static WebElement roomNosFld;

	@FindBy(id = "room_type")
	private static WebElement roomTypeFld;

	@FindBy(id = "Submit")
	private static WebElement submitBtn;

	/**
	 * @param driver
	 */
	public SearchHotel(WebDriver driver) {
		super(driver);
	}

}
