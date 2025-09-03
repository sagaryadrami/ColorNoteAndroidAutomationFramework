package Pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ReminderPage {

	AndroidDriver driver;
	
	public ReminderPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver,Duration.ofSeconds(10)), this);
	}
	
	@AndroidFindBy(id="com.socialnmobile.dictapps.notepad.color.note:id/button1")
	private WebElement doneBtn;
	
	public PhoneSetting setReminder() {
		doneBtn.click();
		return new PhoneSetting(driver);
	}
}
