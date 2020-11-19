package org.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Studies\\Java\\Workspaces\\Eclipse Workspace\\Selen\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		driver.manage().window().maximize();
		//Switch to frame
		driver.switchTo().frame(0);
		//click continue
		WebElement btnContinue=driver.findElement(By.xpath("(//img[@alt='continue'])[1]"));
		btnContinue.click();
		//Handle alert
		Alert a=driver.switchTo().alert();
		String msg=a.getText();
		System.out.println(msg);

	}

}
