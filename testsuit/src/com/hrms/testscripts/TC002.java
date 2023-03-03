package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC002 {
@Test
	public void tc002()throws Exception{
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.addEmp();
		obj.logout();
		obj.closeApplication();
		
	}
}
