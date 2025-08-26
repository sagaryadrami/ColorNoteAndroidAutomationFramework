package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.HomePage;
import Pages.TextNotePage;
import Pages.Tutorial;
import io.appium.java_client.AppiumBy;

public class FirstFlow extends BaseTest {

	@Test
	public void createNote() throws InterruptedException {
		
		Tutorial tutorial = new Tutorial(driver);
		HomePage home = tutorial.userManual();
		TextNotePage note = home.clickOnAddButton();
		note.createNote();
	}
	
	
	@Test(dependsOnMethods="createNote")
	public void editTheNote() throws InterruptedException {
		HomePage home = new HomePage(driver);
		TextNotePage note = home.editCreatedNote();
		note.continueEditNote();
	}
	
	
}
