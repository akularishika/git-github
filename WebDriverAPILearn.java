package com.ram.codesnippets;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverAPILearn {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/Coding/jars/chromedriver_win32_2.29/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_setting_values.notifications", 2);
		chromePrefs.put("credentials_enable_service", false);
		options.setExperimentalOption("prefs", chromePrefs);
		options.addArguments("disable-infobars");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		/*driver.get("http://www.google.co.in");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());*/
		
		driver.get("http://www.google.co.in");
		
		/*List<WebElement> hyperlinks = driver.findElements(By.tagName("a"));
		
		System.out.println(hyperlinks.size());*/
		
		WebElement gmailLink = driver.findElement(By.partialLinkText("Imag"));
		gmailLink.click();
		
		driver.close();
		
		
		
		
		
		
		
		
	}

}
