package org.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Studies\\Java\\Workspaces\\Eclipse Workspace\\Selen\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	//prompt alert
	WebElement btn=driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
btn.click();

WebElement btnPrompt=driver.findElement(By.xpath("//button[@class='btn btn-info']"));
btnPrompt.click();

Alert a=driver.switchTo().alert();
//insert value
a.sendKeys("greens");
//to click ok
a.accept();

	}

}
