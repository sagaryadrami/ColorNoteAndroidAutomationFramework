package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
	
	
	AndroidDriver driver;
	
	public HomePage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver,Duration.ofSeconds(10)), this);
	}

	//driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Add']")).click();
	@AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc='Add']")
	private WebElement addButton;
	
	@AndroidFindBy(id="Add")
	private WebElement addIcon;
	
	@AndroidFindBy(id="com.socialnmobile.dictapps.notepad.color.note:id/title")
	private WebElement createdNote1;
	
	@AndroidFindBy(xpath="//android.widget.ListView[@resource-id='com.socialnmobile.dictapps.notepad.color.note:id/select_dialog_listview']/android.widget.LinearLayout[1]")
	private WebElement optionText;
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.socialnmobile.dictapps.notepad.color.note:id/title' and @text='sagar yadrami']")
	private WebElement clickOnNote;
	
	public TextNotePage clickOnAddButton() throws InterruptedException {
		Thread.sleep(1000);
		addButton.click();
		Thread.sleep(1000);
		return new TextNotePage(driver);
	}
	
	public TextNotePage editCreatedNote() throws InterruptedException {
		createdNote1.click();
		Thread.sleep(2000);
		return new TextNotePage(driver);
	}
	
	public TextNotePage onClickOptions() throws InterruptedException {
		addIcon.click();
		Thread.sleep(2000);
		optionText.click();
		return new TextNotePage(driver);
	}
	
	
}
