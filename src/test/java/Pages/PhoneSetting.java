package Pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PhoneSetting {
	
	AndroidDriver driver;
	
	public PhoneSetting(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver,Duration.ofSeconds(10)), this);
	}

	@AndroidFindBy(xpath="//android.widget.ScrollView/android.view.View[2]/android.view.View")
	private WebElement setting;
	
	public void givePermission() {
		setting.click();
	}
}
