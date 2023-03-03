package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class General extends Global {

	public void openApplication() {
		System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println("Application opened");
		
	}
	public void closeApplication() {
		driver.quit();
		System.out.println("application  closed");
		
	}
	
	public void login() throws Exception {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.xpath(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		Thread.sleep(3000);
		System.out.println("Login Completed");
		
	}
	public void logout() {
		
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout Completed");
		
	}
	
	public void addEmp() {
		System.out.println("Adding new emp");
	}
	
	public void delEmp() {
		System.out.println("delete completed");
		
	}
	
}
