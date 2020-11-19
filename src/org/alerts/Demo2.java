package org.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Studies\\Java\\Workspaces\\Eclipse Workspace\\Selen\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	//confirm alert
	WebElement btn=driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
btn.click();

WebElement btnConfirm=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
btnConfirm.click();

Alert a=driver.switchTo().alert();
String txt=a.getText();
System.out.println(txt);
a.accept();
//a.dismiss();

	}

}
