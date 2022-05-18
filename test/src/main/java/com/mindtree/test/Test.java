package com.mindtree.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com");
		 driver.manage().window().maximize();
		Thread.sleep(2000L);
		WebElement ele =driver.findElement(By.xpath("//*[@id=\'header\']/section/div/ul[1]/li[1]/a"));
		ele.click();
		WebElement ele2 =driver.findElement(By.xpath("//input[@id='help-center-search-input']"));
		
		ele2.sendKeys("How can i create an account with you?");
		Thread.sleep(2000L);
		ele2.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//div[contains(text(),'How can I create an account with you?')]")).click();
		
	}

}
