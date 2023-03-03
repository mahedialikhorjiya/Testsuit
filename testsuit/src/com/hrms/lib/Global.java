package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {

	//var
	public WebDriver driver;
	public String url="http://183.82.103.245/nareshit/login.php";
	public String un ="nareshit";
	public String pw= "nareshit";
	
	
	//obj
	
	public String txt_loginname="txtUserName";
	public String txt_password ="//input[@name='txtPassword']";
	public String btn_login= "Submit";
	public String link_logout="Logout";
	
	
	}
