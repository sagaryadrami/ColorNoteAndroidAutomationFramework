package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.HamburgerOptionPages;
import Pages.HomePage;
import Pages.PhoneSetting;
import Pages.ReminderPage;
import Pages.TextNotePage;
import Pages.Tutorial;
import Utils.AppiumGestures;
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
	
	@Test(dependsOnMethods="editTheNote")
	public void createSecondNote() throws InterruptedException {
		HomePage homepage = new HomePage(driver);
		TextNotePage note = homepage.clickOnAddButton();
		HomePage home = note.createNote();
		//home.editCreatedNote();
	}
	
	@Test(dependsOnMethods="createSecondNote")
	public void changeColour() throws InterruptedException {
		HomePage home = new HomePage(driver);
		TextNotePage note = home.editCreatedNote();
		note.changeTheme();
		
	}
	
	@Test(dependsOnMethods="changeColour")
	public void longHoldTheNote() throws InterruptedException {
		HomePage home = new HomePage(driver);
		ReminderPage reminder = home.longPressTheElement();
		//reminder.setReminder();
	}
	
	@Test(dependsOnMethods="longHoldTheNote")
	public void givePermissionAndroidSetting() {
		ReminderPage reminder = new ReminderPage(driver);
		PhoneSetting setting = reminder.setReminder();
	    try {
	        setting.givePermission();   // try to click Allow
	        System.out.println("Permission granted successfully.");
	    } catch (Exception e) {
	        System.out.println("Permission already assigned");
	    }
	}
	
	@Test(dependsOnMethods="givePermissionAndroidSetting")
	public void changeColourFromHome() throws InterruptedException {
		HomePage home = new HomePage(driver);
		home.longPressNote();
		home.selectColourPicker();
		home.longPressNote();
		home.viewKebabMenu();
		home.CheckItDone();
	}
	
	@Test(dependsOnMethods="changeColourFromHome")
	public void archiveTheNote() throws InterruptedException {
		HomePage home = new HomePage(driver);
		home.longPressNote();
		home.archiveNote();
		
	}
	
	@Test(dependsOnMethods="archiveTheNote")
	public void unarchiveNote() throws InterruptedException {
		HamburgerOptionPages option = new HamburgerOptionPages(driver);
		option.hamburgeroption();
		option.viewArchive();
	}
	
	@Test(dependsOnMethods="unarchiveNote")
	public void uncheckAndDeleteNote() throws InterruptedException {
		HomePage page = new HomePage(driver);
		page.longPressNote();
		page.viewKebabMenu();
		page.uncheckTheNote();
		page.longPressNote();
		page.deleteTheNote();
	}
}
