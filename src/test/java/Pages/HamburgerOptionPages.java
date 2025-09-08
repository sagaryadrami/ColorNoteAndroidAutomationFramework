package Pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Utils.AppiumGestures;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HamburgerOptionPages {

	AndroidDriver driver;
	
	public HamburgerOptionPages(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver,Duration.ofSeconds(10)), this);
	}
	
	
	@AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id='com.socialnmobile.dictapps.notepad.color.note:id/icon'])[5]")
	private WebElement hamburgerMenu;
	
	@AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id='com.socialnmobile.dictapps.notepad.color.note:id/icon'])[2]")
	private WebElement archive;
	
	@AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id='com.socialnmobile.dictapps.notepad.color.note:id/icon'])[4]")
	private WebElement noteInArchive;
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='com.socialnmobile.dictapps.notepad.color.note:id/premium_btn']")
	private WebElement note1;
	
	@AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id='com.socialnmobile.dictapps.notepad.color.note:id/icon'])[1]")
	private WebElement unArchive;
	
	@AndroidFindBy(id="com.socialnmobile.dictapps.notepad.color.note:id/icon_nav")
	private WebElement backBtn;
	
	 @AndroidFindBy(id="com.socialnmobile.dictapps.notepad.color.note:id/page_note")
	 private WebElement home;
	
	public void hamburgeroption() {
		hamburgerMenu.click();
		
	}
	
	public void viewArchive() throws InterruptedException {
		archive.click();
		AppiumGestures gesture = new AppiumGestures(driver);
		Thread.sleep(2000);
		gesture.longPressAction(note1);
		unArchive.click();
		backBtn.click();
		home.click();
	}
}
