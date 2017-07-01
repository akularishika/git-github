package com.ram.codesnippets;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AutomateGmail {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:/Coding/jars/chromedriver_win32_2.29/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_setting_values.notifications", 2);
		chromePrefs.put("credentials_enable_service", false);
		options.setExperimentalOption("prefs", chromePrefs);
		options.addArguments("disable-infobars");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		/*driver.get("https://accounts.google.com/SignUp");
		
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("John");
		driver.findElement(By.id("LastName")).sendKeys("Einsteen");
		
		driver.findElement(By.id("GmailAddress")).sendKeys("johnEinsteen000001");
		
		WebElement formElement = driver.findElement(By.id("createaccount"));
		
		formElement.findElement(By.name("Passwd")).sendKeys("Pass@12345");
		
		formElement.findElement(By.name("PasswdAgain")).sendKeys("Pass@12345");*/
		
		/*driver.get("https://www.cleartrip.com/flights");
		
		WebElement oneWay = driver.findElement(By.id("OneWay"));
		
		WebElement roundTrip = driver.findElement(By.id("RoundTrip"));
		
		System.out.println("Oneway is selected : "+oneWay.isSelected());
		System.out.println("roundTrip is selected : "+roundTrip.isSelected());
		
		roundTrip.click();
		
		System.out.println("Oneway is selected : "+oneWay.isSelected());
		System.out.println("roundTrip is selected : "+roundTrip.isSelected());*/
		
		driver.get("https://select2.github.io/examples.html");
		
		WebElement selectBox = driver.findElement(By.xpath("//select[not(contains(@class, 'js-example'))]"));
		
		Select myDDown = new Select(selectBox);
		
		/*myDDown.selectByVisibleText("California");
		
		Thread.sleep(1000);
		
		myDDown.selectByValue("OR");
		
		Thread.sleep(1000);
		
		myDDown.selectByIndex(8);*/
		
		List<WebElement> myOptions = myDDown.getOptions();
		
		for(WebElement myOption: myOptions){
			System.out.println(myOption.getText());
		}
		
		Thread.sleep(1000);
		
		driver.close();
		

	}

}
