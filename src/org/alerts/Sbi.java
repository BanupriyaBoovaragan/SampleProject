package org.alerts;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sbi {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Studies\\Java\\Workspaces\\Eclipse Workspace\\Selen\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.manage().window().maximize();
				
		WebElement btnContinueLogin=driver.findElement(By.xpath("//a[text()='CONTINUE TO LOGIN'][1]"));
		btnContinueLogin.click();
		Thread.sleep(3000);
		WebElement btnLogin=driver.findElement(By.xpath("//input[@id='Button2']"));
		btnLogin.click();
		
		Alert a=driver.switchTo().alert();
		
		
		String txt=a.getText();
		System.out.println("\n\n"+txt);
		a.accept();
	}

}
