package org.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Studies\\Java\\Workspaces\\Eclipse Workspace\\Selen\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		//Enter the userId,click continue.Enter password.
		driver.switchTo().frame(0);
		
		WebElement txtUname=driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		txtUname.sendKeys("23456789");
		Thread.sleep(3000);
		
		//
		WebElement btnContinue=driver.findElement(By.xpath("(//img[@alt='continue'])[1]"));
		btnContinue.click();
		
		WebElement txtPwd =driver.findElement(By.xpath("//input[@name='fldPassword']"));
		txtPwd.sendKeys("12123");
		
		

	}

}
