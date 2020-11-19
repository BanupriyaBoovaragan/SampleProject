package org.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Studies\\Java\\Workspaces\\Eclipse Workspace\\Selen\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
		//Click button to display an alert box and click ok button
	WebElement btnAlert=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
btnAlert.click();
Alert a=driver.switchTo().alert();
String txt=a.getText();
System.out.println(txt);
a.accept();
	}

}
