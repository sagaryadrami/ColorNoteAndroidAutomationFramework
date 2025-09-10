package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Utils.AppiumGestures;
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
	
	@AndroidFindBy(id="com.socialnmobile.dictapps.notepad.color.note:id/bottom_menu_reminder")
	private WebElement setReminder;
	
	@AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id='com.socialnmobile.dictapps.notepad.color.note:id/icon'])[3]")
	private WebElement colourPicker;
	
	@AndroidFindBy(id="com.socialnmobile.dictapps.notepad.color.note:id/txt4")
	private WebElement selectGreenColour;
	
	@AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id='com.socialnmobile.dictapps.notepad.color.note:id/icon'])[5]")
	private WebElement kebabMenu;

	
	@AndroidFindBy(xpath="(//android.widget.LinearLayout[@resource-id='android:id/content'])[1]")
	private WebElement checkOnNote;
	
	@AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id='com.socialnmobile.dictapps.notepad.color.note:id/icon'])[1]")
	private WebElement archive;
	
	@AndroidFindBy(id="android:id/button1")
	private WebElement okButtonOnArchivePoPUp;
	
	@AndroidFindBy(xpath="(//android.widget.LinearLayout[@resource-id='android:id/content'])[1]")
	private WebElement uncheck;
	
	@AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id='com.socialnmobile.dictapps.notepad.color.note:id/icon'])[2]")
	private WebElement DeleteNote;
	
	@AndroidFindBy(id="android:id/button1")
	private WebElement okInDeletePopUp;
	
	@AndroidFindBy(xpath="//android.widget.ListView[@resource-id='com.socialnmobile.dictapps.notepad.color.note:id/select_dialog_listview']/android.widget.LinearLayout[1]")
	private WebElement text;
	
	@AndroidFindBy(id="com.socialnmobile.dictapps.notepad.color.note:id/title")
	private WebElement noteTitle;
	
	@AndroidFindBy(id="com.socialnmobile.dictapps.notepad.color.note:id/title")
	private WebElement selectExistingNote;
	
	
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
	
	public ReminderPage longPressTheElement() throws InterruptedException {
		
			AppiumGestures longpress = new AppiumGestures(driver);
			longpress.longPressAction(createdNote1);
			Thread.sleep(2000);
			setReminder.click();
			return new ReminderPage(driver);
	
	}
	
	public void longPressNote() {
		AppiumGestures longpress = new AppiumGestures(driver);
		longpress.longPressAction(createdNote1);
	}
	
	public void selectColourPicker() {
		colourPicker.click();
		selectGreenColour.click();
	}
	
	public void viewKebabMenu() throws InterruptedException {
		Thread.sleep(2000);
		kebabMenu.click();
	}
	
	public void CheckItDone() {
		checkOnNote.click();
	}
	
	public void archiveNote() throws InterruptedException {
		archive.click();
		Thread.sleep(2000);
		okButtonOnArchivePoPUp.click();
	}
	
	public void uncheckTheNote() {
		uncheck.click();
	}
	
	public HamburgerOptionPages hamburgerOption() {
		return new HamburgerOptionPages(driver);
	}
	
	public void deleteTheNote() {
		DeleteNote.click();
		okInDeletePopUp.click();
	}
	
	public TextNotePage createTextNote() {
		addButton.click();
		text.click();
		return new TextNotePage(driver);
	}
	
	public String getTitle() {
		String title = noteTitle.getText();
		return title;
		
	}
	
	public TextNotePage selectTheExistingNote() {
		selectExistingNote.click();
		return new TextNotePage(driver);
		
	}


}
