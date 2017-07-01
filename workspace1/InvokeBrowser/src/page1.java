import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class page1 {
	public static WebDriver driver = null;

		
		public static void main(String[] args) {
			
			
				// TODO Auto-generated method stub
				
				String CHROMEDRIVER_PATH = "C:/Program Files/Java/chromedriver.exe";
				String FIREFOXDRIVER_PATH = "C:/Program Files/Java/geckodriver.exe";
				String IEDRIVER_PATH = "C:/Program Files/Java/IEDriverServer.exe";

				String browser = "chrome";

				DesiredCapabilities capabilities = null;

				if("chrome".equals(browser)){
					System.setProperty("webdriver.chrome.driver", CHROMEDRIVER_PATH);
					ChromeOptions options = new ChromeOptions();
					Map<String, Object> chromePrefs = new HashMap<String, Object>();
					chromePrefs.put("profile.default_content_setting_values.notifications", 2);
					chromePrefs.put("credentials_enable_service", false);
					options.setExperimentalOption("prefs", chromePrefs);
					options.addArguments("disable-infobars");
					driver = new ChromeDriver(options);
				}
		
				driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
				driver.get("http://www.techno-geek.co.uk/SeleniumPractice/webform1.html");
				driver.manage().window().maximize();
				WebDriverWait wait=new WebDriverWait(driver,1000);
		
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='continue']")));
				//driver.findElement(By.xpath("//button[@id='continue']")).isEnabled();
				driver.findElement(By.xpath("//button[@id='continue']")).click();
				//System.out.println(driver.findElement(By.xpath("//button[@id='continue']")).isSelected());
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='female']")));
				driver.findElement(By.xpath("//input[@id='female']")).click();
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='CelebNo']")));
				driver.findElement(By.xpath("//input[@id='CelebNo']")).click();
				/*driver.findElement(By.xpath("//input[@id='YoutubeNo']")).click();
				driver.findElement(By.xpath("//input[@id='Above40']")).click();*/
				/*test*/
				
				
		
	}

}
