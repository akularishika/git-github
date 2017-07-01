

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Firefox {
	
	public static WebDriver driver = null;

	
	public static void main(String[] args) throws InterruptedException {
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
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://techno-geek.co.uk/callmycab/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='sess-login1']")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("rishika");
		driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("7328904939");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rishika.qa@gmail.com");
		driver.findElement(By.xpath("//input[@data-parsley-id='55']")).sendKeys("Nine9@six6");
		driver.findElement(By.xpath("//input[@value='over_13']")).click();
		driver.findElement(By.xpath("//input[@data-parsley-id='62']")).sendKeys("teacher");
		driver.findElement(By.xpath("//input[@data-parsley-id='64']")).sendKeys("marredpally");
		//driver.findElement(By.xpath("//label[@for='development']")).click();
		driver.findElement(By.xpath("//label[@for='development']")).click();
		System.out.println(driver.findElement(By.xpath("//label[@for='development']")).isSelected());
		//driver.findElement(By.xpath("//label[@for='Design']")).click();
		driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("iam mad");
		driver.findElement(By.xpath(("//input[@id='hobby']"))).sendKeys("teaching");
		driver.findElement(By.xpath("//input[@id='submit']")).submit();
		
		
		
		
		
		
		
		
		//driver.get("https://www.google.com");
	/*	driver.get("https://login.yahoo.com");
		driver.manage().window().maximize();*/
		
		
		
		/*System.out.println((driver.getPageSource()));*/
		/*System.out.println(driver.getCurrentUrl());*/
		/*System.out.println(driver.getTitle());*/
		//or
		
		/*String title=null;
		title=driver.getTitle();
		System.out.println(title);*/
		/*driver.close();*/
		

	}

}
