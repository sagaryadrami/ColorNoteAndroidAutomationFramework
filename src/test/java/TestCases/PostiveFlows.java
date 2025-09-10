package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.HomePage;
import Pages.TextNotePage;

public class PostiveFlows extends BaseTest{
	
	@Test
	public void createNote() throws InterruptedException {
		HomePage home = new HomePage(driver);
		TextNotePage note = home.createTextNote();
		HomePage home1 = note.newNote();
		String title = home1.getTitle();
		Assert.assertEquals(title, "sagar");
	}
	
	@Test(dependsOnMethods="createNote")
	public void editExistingNote() {
		HomePage homePage = new HomePage(driver);
		TextNotePage note = homePage.selectTheExistingNote();
		HomePage home = note.editExistingNote();
		String title = home.getTitle();
		Assert.assertEquals(title, "sagar yadrami");
	}

}
