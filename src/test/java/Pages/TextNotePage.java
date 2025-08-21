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
    
    
    public void createNote() throws InterruptedException {
    	Thread.sleep(2000);
    	textOptionSelect.click();
    	Thread.sleep(1000);
    	noteEditor.sendKeys("sagar yadrami");
    	saveButton.click();
    }
	
}
