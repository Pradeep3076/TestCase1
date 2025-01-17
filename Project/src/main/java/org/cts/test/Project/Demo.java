package org.cts.test.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raja sekar\\eclipse-workspace\\MavenDay3\\Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		WebElement f=driver.findElement(By.name("field-keywords"));
		f.click();
		
		WebElement se=driver.findElement(By.xpath("(//input[@class='nav-input'])[1]"));
		se.click();
		
		WebElement phone=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]"));
		Thread.sleep(3000);
		
		WebElement button=driver.findElement(By.id("//input[@id='add-to-cart-button']"));
		button.click();
		
		WebElement co=driver.findElement(By.xpath("//span[@class='a-size-medium a-color-price']"));
		String s=co.getAttribute("id");
		System.out.println(s);
		}

}
