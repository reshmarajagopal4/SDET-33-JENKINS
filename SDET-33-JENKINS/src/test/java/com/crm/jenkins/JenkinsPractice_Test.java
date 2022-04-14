package com.crm.jenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class JenkinsPractice_Test {
	
	
	@Test
	
	public void jenkinsPracticeTest_1() {
		
	String browser = System.getProperty("BROWSER");
	String url=System.getProperty("URL");
		
	Reporter.log("jenkins started",true);
	
	
	}
	@Test
	public void jenkinsPracticeTest_2() {
		
		Reporter.log("jenkins ended",true);
		
	}

}
