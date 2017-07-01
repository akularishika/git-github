package com.ram.codesnippets;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.HashMap;
public class AutomateCalendar {
	
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver", "C:/Program Files/Java/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_setting_values.notifications", 2);
		chromePrefs.put("credentials_enable_service", false);
		options.setExperimentalOption("prefs", chromePrefs);
		options.addArguments("disable-infobars");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.cleartrip.com");
		//check
		String bookingDate="11-December-2018";
		String bookingDay=bookingDate.split("-")[0];
		String bookingMonth=bookingDate.split("-")[1];
		String bookingYear=bookingDate.split("-")[2];
		
		
		driver.findElement(By.xpath("//input[@id='FromDate']/parent::*//i[contains(@class,'datePicker')]")).click();
		
		WebElement calenderTable = driver.findElement(By.xpath("//div[contains(@id,'datepicker')]"));
		
		String currMonth = calenderTable.findElement(By.xpath(".//div[contains(@class,'first')]//span[contains(@class,'month')]")).getText();
		String currYear = calenderTable.findElement(By.xpath(".//div[contains(@class,'first')]//span[contains(@class,'year')]")).getText();
		
		System.out.println("Current month is "+currMonth+" and current year is "+currYear);
		WebElement nextButton = calenderTable.findElement(By.xpath(".//div[contains(@class,'last')]//a[@title='Next']"));
		while(!(bookingMonth.equalsIgnoreCase(currMonth) && bookingYear.equalsIgnoreCase(currYear))){
			nextButton.click();
			nextButton = calenderTable.findElement(By.xpath(".//div[contains(@class,'last')]//a[@title='Next']"));
			currMonth = calenderTable.findElement(By.xpath(".//div[contains(@class,'first')]//span[contains(@class,'month')]")).getText();
			currYear = calenderTable.findElement(By.xpath(".//div[contains(@class,'first')]//span[contains(@class,'year')]")).getText();
			System.out.println("Current month is "+currMonth+" and current year is "+currYear);
		}
		calenderTable.findElement(By.xpath(".//div[contains(@class,'first')]//a[@original-title and text()='"+bookingDay+"']")).click();
	}
}
