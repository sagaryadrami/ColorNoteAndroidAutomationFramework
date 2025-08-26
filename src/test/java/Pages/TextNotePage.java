package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TextNotePage {
	
	AndroidDriver driver;
	
	public TextNotePage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver,Duration.ofSeconds(10)), this);
	}
	
	//driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id='com.socialnmobile.dictapps.notepad.color.note:id/icon'])[1]")).click();
    @AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id='com.socialnmobile.dictapps.notepad.color.note:id/icon'])[1]")
    private WebElement textOptionSelect;
    
    //driver.findElement(AppiumBy.id("com.socialnmobile.dictapps.notepad.color.note:id/edit_note"));
    @AndroidFindBy(id="com.socialnmobile.dictapps.notepad.color.note:id/edit_note")
    private WebElement noteEditor;
    
    //driver.findElement(AppiumBy.id("com.socialnmobile.dictapps.notepad.color.note:id/back_btn")).click();
    @AndroidFindBy(id="com.socialnmobile.dictapps.notepad.color.note:id/back_btn")
    private WebElement saveButton;
    
    
    @AndroidFindBy(id="com.socialnmobile.dictapps.notepad.color.note:id/back_btn")
    private WebElement backButton;
    
    @AndroidFindBy(id="com.socialnmobile.dictapps.notepad.color.note:id/edit_btn")
    private WebElement editBtn;
    
//    @AndroidFindBy(id="com.socialnmobile.dictapps.notepad.color.note:id/edit_note")
//    private WebElement ctnEditBtnCursor;
    
    public HomePage createNote() throws InterruptedException {
    	Thread.sleep(2000);
    	textOptionSelect.click();
    	Thread.sleep(1000);
    	noteEditor.sendKeys("sagar yadrami");
    	saveButton.click();
    	backButton.click();
    	return new HomePage(driver);
    }
    
    public void continueEditNote() {
    	editBtn.click();
    	noteEditor.sendKeys(" new edited note testing trying to save it .........");
    	saveButton.click();
    }
	
}
