// use try catch method to work with web drivers

package Base;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;

import Utils.TestUtil;
//import Utils.WebEventListener;

public class TestBase {
	public static ChromeDriver driver;
	public static Properties prop;
	
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("E:\\eclipse_workspace_2\\myntra.com_automation\\src\\main\\java\\configuration\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
//	@SuppressWarnings("deprecation")
	public static void initialization(){
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vipin.Grover\\OneDrive - AssetMark, Inc\\Documents\\chromedriver.exe");	
			driver = new ChromeDriver(); 
		}
//		else if(browserName.equals("FF")){
//			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vipin.Grover\\OneDrive - AssetMark, Inc\\Documents\\geckodriver");	
//			driver = new FirefoxDriver(); 
//		}
		
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Utils.TestUtil.PAGE_LOAD_TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utils.TestUtil.IMPLICIT_WAIT));
		
		driver.get(prop.getProperty("url"));
		
	}

}
