package Pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Tutorial {
	
	AndroidDriver driver;
	public Tutorial(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver,Duration.ofSeconds(10)), this);
	}
	
	//driver.findElement(AppiumBy.id("com.socialnmobile.dictapps.notepad.color.note:id/step1_next")).click();
	@AndroidFindBy(id="com.socialnmobile.dictapps.notepad.color.note:id/step1_next")
	private WebElement Step1;
	
	//driver.findElement(AppiumBy.id("com.socialnmobile.dictapps.notepad.color.note:id/btn_start")).click();
	@AndroidFindBy(id="com.socialnmobile.dictapps.notepad.color.note:id/btn_start")
	private WebElement start;
	
	//driver.findElement(AppiumBy.id("com.socialnmobile.dictapps.notepad.color.note:id/tutorial_overlay")).click();
	@AndroidFindBy(id="com.socialnmobile.dictapps.notepad.color.note:id/tutorial_overlay")
	private WebElement tutorial;
	
	//driver.findElement(AppiumBy.id("com.socialnmobile.dictapps.notepad.color.note:id/btn_skip")).click();
	@AndroidFindBy(id="com.socialnmobile.dictapps.notepad.color.note:id/btn_skip")
	private WebElement skip;
	
	public HomePage userManual() throws InterruptedException {
		Step1.click();
		Thread.sleep(1000);
		start.click();
		Thread.sleep(1000);
		tutorial.click();
		Thread.sleep(1000);
		skip.click();
		return new HomePage(driver);
	}
}
