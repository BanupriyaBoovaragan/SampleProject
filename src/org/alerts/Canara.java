package org.alerts;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Canara {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Studies\\Java\\Workspaces\\Eclipse Workspace\\Selen\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		driver.manage().window().maximize();
		
		
		WebElement btnLogin=driver.findElement(By.xpath("//input[@class='btn btn-default']"));
		btnLogin.click();
		
		Alert a=driver.switchTo().alert();
		String msg=a.getText();
		System.out.println(msg);
		a.accept();

	}

}
