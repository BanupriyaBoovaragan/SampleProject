package org.alerts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Icici {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Studies\\Java\\Workspaces\\Eclipse Workspace\\Selen\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		driver.manage().window().maximize();
	
		
		WebElement txtUserId=driver.findElement(By.xpath("//input[@id='DUMMY1']"));
		txtUserId.sendKeys("23456789",Keys.ENTER);
		Alert a=driver.switchTo().alert();
		a.accept();
		Thread.sleep(3000);
		WebElement txtUname=driver.findElement(By.xpath("//input[@id='AuthenticationFG.USER_PRINCIPAL']"));
		Thread.sleep(4000);
		//txtUname.sendKeys("23456789");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(4000);
		WebElement txtPwd=driver.findElement(By.xpath("//input[@id='AuthenticationFG.ACCESS_CODE']"));
		txtPwd.sendKeys("23456789");
		
		Thread.sleep(8000);
		WebElement btnSubmit=driver.findElement(By.xpath("//input[@class='cta']"));
		btnSubmit.click();
		
		
	}

}
