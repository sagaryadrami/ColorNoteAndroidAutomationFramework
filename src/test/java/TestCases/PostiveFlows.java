package TestCases;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.HomePage;
import Pages.TextNotePage;

public class PostiveFlows extends BaseTest{
	
	@Test
	public void createNote() throws InterruptedException {
		HomePage home = new HomePage(driver);
		TextNotePage note = home.createTextNote();
		note.newNote();
		
	}

}
