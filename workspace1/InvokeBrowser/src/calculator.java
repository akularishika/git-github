import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class calculator {

	
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
			
			driver.get("http://techno-geek.co.uk/callmycab/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//span[@class='sess-login1']")).click();
			WebDriverWait wait=new WebDriverWait(driver,1000);
			wait.until(ExpectedConditions.elementToBeClickable(By.id("name")));
			driver.findElement(By.id("name")).sendKeys("rishika");
		// TODO Auto-generated method stub
		/*int a=10;
		int b=30;
		int c;
		
		c=a+b;
		System.out.println(c);*/
		
		/*Scanner sc=new Scanner(System.in);
		int number1;
		int number2;
		int number3;
		
		System.out.println("Enter a num1:");
		number1=sc.nextInt();
		System.out.println("Number Entered is"+number1);
		
		System.out.println("Enter a num2:");
		number2=sc.nextInt();
		System.out.println("Number Entered is"+number2);
		
		number3=number1+number2;
		System.out.println("totoal is"+number3);*/
		
		
		//test 
			
			//to be test

	}

}
