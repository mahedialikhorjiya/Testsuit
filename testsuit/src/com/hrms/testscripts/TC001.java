package com.hrms.testscripts;
import org.testng.annotations.Test;

import com.hrms.lib.*;

public class TC001 {
@Test
public void tc001() throws Exception{
	General obj = new General();
	obj.openApplication();
	obj.login();
	obj.logout();
	obj.closeApplication();
	
}
}
