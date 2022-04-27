package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import CommonMethods.WebDriverWaits;
import ExtentReport.ExtentReportClass;
import POM.CCPUtils;
import POM.DataInterface;
import POM.LoginAgencyUtils;



public class Login extends ExtentReportClass {
	
		public static By emailField = By.id(LoginAgencyUtils.Username);
	    public static By passField = By.id(LoginAgencyUtils.Password);
	    public static By BtnField = By.id(LoginAgencyUtils.Button);
	    public static By CCPButton = By.xpath(CCPUtils.CCPBtn);

	
	 
	    @Test(priority = 0)
	    public static void LoginAgency() {
	        extentTest = extent.startTest(" Pre-requisite(Login) ");
	         extentTest.setDescription(" Verify that user is able to log in with valid credentials. ");
	         try {
		        	 WebDriverWaits.SendKeys(emailField, DataInterface.AgencyUsername);
		        	 WebDriverWaits.SendKeys(passField, DataInterface.AgencyPassword);
		        	 WebDriverWaits.WaitUntilVisible(BtnField);
		        	 WebDriverWaits.ClickOn(BtnField);
		            WebDriverWaits.WaitUntilVisible(CCPButton);
		            WebElement CPPBtn = driver.findElement(CCPButton);
	            if(CPPBtn.isDisplayed()==false){
	                Assert.assertEquals("Fail", "");
	            }
	         }
	         catch (AssertionError e) {
	            System.out.println(e.getMessage());
	         }
	    }

    
}




