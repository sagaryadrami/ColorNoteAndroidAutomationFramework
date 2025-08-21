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
	
	public TextNotePage clickOnAddButton() throws InterruptedException {
		Thread.sleep(1000);
		addButton.click();
		Thread.sleep(1000);
		return new TextNotePage(driver);
	}
	
}
