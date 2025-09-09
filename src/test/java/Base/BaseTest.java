package Base;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseTest {
    
    protected AndroidDriver driver;

    @BeforeClass
    public void setup() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformName("Android")
                .setDeviceName("Android Device")
                .setUdid("ZD222K58ZV")   // your real device ID
               // .setApp("C:\\Users\\sagar.yadrami\\eclipse-workspace\\cirocolife-qaAutomation\\src\\main\\java\\Resources\\app-dev-wr.apk")
                .setAutomationName("UiAutomator2")
                .setAutoGrantPermissions(true);
        
        
        options.setAppActivity("com.socialnmobile.colornote.activity.Main");
        options.setAppPackage("com.socialnmobile.dictapps.notepad.color.note");

        options.setNoReset(true);
       options.setFullReset(false);

        
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);

      
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        System.out.println("✅ App launched on real device!");
    }
    
    
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("🛑 Appium driver session closed.");
        }
    }
}
