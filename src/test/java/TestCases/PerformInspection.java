package TestCases;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import CommonMethods.RandomStrings;
import CommonMethods.RobotClass;
import CommonMethods.WebDriverWaits;
import POM.PerformInspectionUtils;

public class PerformInspection extends CCP{
	public static By PerformInsButton = By.xpath(PerformInspectionUtils.performInsButton);
	public static By ContinueBtn = By.xpath(PerformInspectionUtils.continueBtn);
	public static By GlobalValidMsg = By.xpath(PerformInspectionUtils.globalValidMsg);
	public static By TitlePIPage = By.xpath(PerformInspectionUtils.titlePIPage);
	public static By AddVioPI = By.xpath(PerformInspectionUtils.addVioPI);
	public static By SelectVioList = By.xpath(PerformInspectionUtils.selectVioList);
	public static By InvalidBtnList = By.xpath(PerformInspectionUtils.invalidBtnList);
	public static By NoteField = By.xpath(PerformInspectionUtils.noteField);
	public static By FooterButtons = By.xpath(PerformInspectionUtils.footerButtons);
	public static By AddImgIcon = By.xpath(PerformInspectionUtils.addImgIcon);
	public static By BrowseFileLink = By.xpath(PerformInspectionUtils.browseFileLink);
	public static By AddBtnAttach= By.xpath(PerformInspectionUtils.addBtnAttach);
	public static By CaseVioList = By.xpath(PerformInspectionUtils.caseVioList);
	public static By ConfirmationPopup = By.xpath(PerformInspectionUtils.confirmationPopup);
	public static By CancelConfirmation = By.xpath(PerformInspectionUtils.cancelConfirmation);
	public static By CloseCasePopup = By.xpath(PerformInspectionUtils.closeCasePopup);
	public static By ValidBtnList = By.xpath(PerformInspectionUtils.validBtnList);
	public static By VoluntaryToggle = By.xpath(PerformInspectionUtils.voluntaryToggle);
	public static By CancelCloseCase = By.xpath(PerformInspectionUtils.cancelCloseCase);
    public static By IssueNoticeBtn = By.xpath(PerformInspectionUtils.issueNoticeBtn);
	public static By EditVerifyVio = By.xpath(PerformInspectionUtils.editVerifyVio);
	public static By EditVioIcon = By.xpath(PerformInspectionUtils.editVioIcon);
    public static By EditVioPopup = By.xpath(PerformInspectionUtils.editVioPopup);
	public static By LabelVioStatus1 = By.xpath(PerformInspectionUtils.labelVioStatus1);
	public static By NoNoticeReq = By.xpath(PerformInspectionUtils.noNoticeReq);
    public static By NoticeIssueDate = By.xpath(PerformInspectionUtils.noticeIssueDate);
	public static By CancelEditAnimal = By.xpath(PerformInspectionUtils.cancelEditAnimal);
	public static By VioVerificationStatus = By.xpath(PerformInspectionUtils.vioVerificationStatus);
	public static By TitleSection2 = By.xpath(PerformInspectionUtils.titleSection2);
	public static By ForcedToggle = By.xpath(PerformInspectionUtils.forcedToggle);
	public static By ClosedInvalidStatus = By.xpath(PerformInspectionUtils.closedInvalidStatus);
	public static By OpenCompliantStatus = By.xpath(PerformInspectionUtils.openCompliantStatus);
	public static By NoticeSelected = By.xpath(PerformInspectionUtils.noticeSelected);
    public static By Notice2 = By.xpath(PerformInspectionUtils.notice2);
	public static By TitleSection3 = By.xpath(PerformInspectionUtils.titleSection3);
	public static By NoticeDatePicker = By.xpath(PerformInspectionUtils.noticeDatePicker);
    public static By IssueNoticeButton = By.xpath(PerformInspectionUtils.issueNoticeButton);
  
	@Test(priority = 63)
	 public static void TC_PIP_01() {
	     extentTest = extent.startTest(" TC_PIP_01 ");
	 	  extentTest.setDescription(" Verify that 'Verification Inspection in Progress' page opens up, when user clicks on 'Perform Inspection' button under 'Abatement Activities' tile, 'Case Detail' page. ");
		 try {
	      	WebDriverWaits.WaitUntilVisible(PerformInsButton);
	      	 Thread.sleep(1000);
	      	WebDriverWaits.ClickOn(PerformInsButton);
	      	String[] Title = WebDriverWaits.GetText(TitlePIPage).split("-");
	      String TitleValid = Title[0];
	      String ActualTitle = "Verification Inspection in Progress ";
	      Assert.assertEquals(ActualTitle, TitleValid);
		} catch (InterruptedException e) {
			e.printStackTrace();
		
		} 
	 }

 @Test(priority = 64)
	 public static void TC_PIP_02() {
	     extentTest = extent.startTest(" TC_PIP_02 ");
	 	  extentTest.setDescription(" Verify that appropriate validation message appears, when user clicks on 'Continue' button without entering data in mandatory fields, on 'Verify Violations' popup. ");
		 try {
	      	 Thread.sleep(0000);
//	      	WebDriverWaits.WaitUntilVisible(ContinueBtn);
	      	WebDriverWaits.ClickOn(ContinueBtn);
	      	String ActValidMsg = WebDriverWaits.GetText(GlobalValidMsg);
	      	String ExpValidMsg = "Could not proceed. There are missing fields/information on this page.";
		      Assert.assertEquals(ActValidMsg, ExpValidMsg);
		} catch (InterruptedException e) {
			e.printStackTrace();
		
		} 
	 }
 
@Test(priority = 65)
	 public static void TC_PIP_03() {
	     extentTest = extent.startTest(" TC_PIP_03 ");
	 	  extentTest.setDescription(" Verify that the status of 'Verify Violations' section appears 'Incomplete' by default, under 'Verify Violations' section.  ");
		 try {
	      	 Thread.sleep(1000);
	     String VioStatus1 = WebDriverWaits.GetText(LabelVioStatus1);
	     Assert.assertEquals(VioStatus1, "Incomplete");
		} catch (InterruptedException e) {
			e.printStackTrace();
		
		} 
	 }
 
 @Test(priority = 66)
	 public static void TC_PIP_04() {
	     extentTest = extent.startTest(" TC_PIP_04 ");
	 	  extentTest.setDescription(" Verify that user is able to add a violation via 'Add another violation' search box, on 'Verify Violations' popup. ");
		 try {
	      	 Thread.sleep(0000);
	      	 List<WebElement> VioList = WebDriverWaits.WaitUntilVisibleList(CaseVioList);
	      	 int BeforeAdding = VioList.size();
	      	WebDriverWaits.SendKeys(AddVioPI, "Wa");
	      	WebDriverWaits.ClickOn(SelectVioList);
	      	List<WebElement> VioList2 = WebDriverWaits.WaitUntilVisibleList(CaseVioList);
	      	 int AfterAdding = VioList2.size();
	      	 if((AfterAdding==(BeforeAdding+1))==false) {
	      	 Assert.assertEquals(false, true);
	      	 }
		} catch (InterruptedException e) {
			e.printStackTrace();
		
		} 
	 }
 
@Test(priority = 67)
	 public static void TC_PIP_05() {
	     extentTest = extent.startTest(" TC_PIP_05 ");
	 	  extentTest.setDescription(" Verify that 'Verification Pending' status appears by defualt, when no toggle is selected for a violation, under 'Verify Violations' section. ");
		 try {
	      	 Thread.sleep(0000);
	String VioVerifStatus = WebDriverWaits.GetText(VioVerificationStatus);
	Assert.assertEquals(VioVerifStatus, "Verification Pending ");
		} catch (InterruptedException e) {
			e.printStackTrace();
		
		} 
	 }
 
@Test(priority = 68)
	 public static void TC_PIP_06() {
	     extentTest = extent.startTest(" TC_PIP_06 ");
	 	  extentTest.setDescription(" Verify that user is able to select any toggle button for the added violations , under 'Verify Violations' section. ");
		 try {
	      	 Thread.sleep(0000);
	      	WebDriverWaits.ClickOn(InvalidBtnList);
	      	WebElement InvalidToggle = WebDriverWaits.WaitUntilVisibleWE(InvalidBtnList);
	      	if((InvalidToggle.isEnabled())==false) {
	      		Assert.assertEquals(false, true);
	      	}
		} catch (InterruptedException e) {
			e.printStackTrace();
		
		} 
	 }
 
@Test(priority = 69)
public static void TC_PIP_07() {
   extentTest = extent.startTest(" TC_PIP_07 ");
	  extentTest.setDescription(" Verify that 'Closed, invalid, ' status appears, when user selects 'Invalid' toggle button for a violation, under 'Verify Violations' section.  ");
	 try {
	      	WebDriverWaits.ClickOn(InvalidBtnList);
	     	 Thread.sleep(1000);
    	String VioVerifStatus1 = WebDriverWaits.GetText(ClosedInvalidStatus);
   	Assert.assertEquals(VioVerifStatus1, "Closed, invalid, \n" + "Invalid Disposition");

	} catch (InterruptedException e) {
		e.printStackTrace();
	
	} 
}

@Test(priority = 70)
public static void TC_PIP_08() {
   extentTest = extent.startTest(" TC_PIP_08 ");
	  extentTest.setDescription(" Verify that 'Open, non-compliant' status appears, when user selects 'Valid' toggle button for a violation, under 'Verify Violations' section.  ");
	 try {
    	 Thread.sleep(0000);
    	WebDriverWaits.ClickOn(ValidBtnList);;
    	String VioVerifStatus1 = WebDriverWaits.GetText(OpenCompliantStatus);
   	Assert.assertEquals(VioVerifStatus1, "Open, non-compliant ");
	} catch (InterruptedException e) {
		e.printStackTrace();
	
	} 
}


 @Test(priority = 71)
	 public static void TC_PIP_09() {
	     extentTest = extent.startTest(" TC_PIP_05 ");
	 	  extentTest.setDescription(" Verify that 'Continue' button no longer appears, when 'Invalid' toggle button is selected for all the violations, on 'Verify Violations' popup. ");
		 try {
	      	 Thread.sleep(0000);
	      	 List<WebElement> InvalidList = WebDriverWaits.WaitUntilVisibleList(InvalidBtnList);
	      int CountList = InvalidList.size();
	      for(int i=0; i<CountList ;i++) {
	    	  WebElement ListClick = InvalidList.get(i);
//		      	 Thread.sleep(1000);
		      	 ListClick.click();
	      }
		      	 List<WebElement> FooterBtns = WebDriverWaits.WaitUntilVisibleList(FooterButtons); 
		      	 int sizeFootBtn = FooterBtns.size();
		      	 if((sizeFootBtn<=1)==false) {
		      		 Assert.assertEquals(false, true);
		      	 }
		} catch (InterruptedException e) {
			e.printStackTrace();
		
		} 
	 }
 

@Test(priority = 72)
	 public static void TC_PIP_10() {
	     extentTest = extent.startTest(" TC_PIP_10 ");
	 	  extentTest.setDescription(" Verify that confirmation popup opens up, when user clicks on 'Complete Inspection & Close Case' button for invalid violations, under 'Verify Violations' section. ");
		 try {
	      	Thread.sleep(0000);
	      	WebDriverWaits.ClickOn(FooterButtons);
	      	WebElement ConfirmationIcon = WebDriverWaits.WaitUntilVisibleWE(ConfirmationPopup);
	      	if((ConfirmationIcon.isDisplayed())==false) {
	      		Assert.assertEquals(false, true);
	      	}
		} catch (InterruptedException e) {
			e.printStackTrace();
		
		} 
	 }

@Test(priority = 73)
public static void TC_PIP_11() {
	extentTest = extent.startTest(" TC_PIP_11 ");
	  extentTest.setDescription(" Verify that confirmation popup gets closed, when user clicks on 'Close' button, under 'Verify Violations' section. ");
	 try {
 	 Thread.sleep(1000);
 	WebDriverWaits.ClickOn(CancelConfirmation);
	 Thread.sleep(1000);
	 List<WebElement> ConfirmationValid = driver.findElements(ConfirmationPopup);
if(((ConfirmationValid.size())<1)==false) {
	  Assert.assertEquals(false, true);
}
	} catch (InterruptedException e) {
		e.printStackTrace();
	
	} 
}


@Test(priority = 74)
public static void TC_PIP_12() {
extentTest = extent.startTest("  ");
	  extentTest.setDescription(" Verify that 'Select Notice & Schedule Follow Up' section's title appears under 'Verify Violations' section, when 'Valid' toggle button is selected for any violation. ");
	 try {
 	 Thread.sleep(1000);
 	WebDriverWaits.ClickOn(ValidBtnList);
 	WebElement Section2 = WebDriverWaits.WaitUntilVisibleWE(TitleSection2);
 	if((Section2.isDisplayed())==false) {
 	  Assert.assertEquals(false, true);
 	}
	} catch (InterruptedException e) {
		e.printStackTrace();
	
	} 
}
 
@Test(priority = 75)
public static void TC_PIP_13() {
   extentTest = extent.startTest(" TC_PIP_13 ");
	  extentTest.setDescription(" Verify that 'Close Case' popup opens up, when user clicks on 'Complete Inspection & Close Case' button for valid violations, on 'Verify Violations' popup. ");
	 try {
    	 Thread.sleep(0000);
    	List<WebElement> ValidList = WebDriverWaits.WaitUntilVisibleList(ValidBtnList);
	      int CountList1 = ValidList.size();
	      for(int i=0; i<CountList1 ;i++) {
	    	  WebElement ListClick = ValidList.get(i);
//		      	 Thread.sleep(1000);
		      	 ListClick.click();
	      }
	      WebDriverWaits.ClickOn(FooterButtons);
	      String CCPopupTitle = WebDriverWaits.GetText(CloseCasePopup);
		      		 Assert.assertEquals(CCPopupTitle, "Close Case");
	} catch (InterruptedException e) {
		e.printStackTrace();
	
	} 
}
 
@Test(priority = 76)
public static void TC_PIP_14() {
   extentTest = extent.startTest(" TC_PIP_14 ");
	  extentTest.setDescription(" Verify that 'Voluntary' toggle button appears selected by default, on 'Close Case' popup. ");
	 try {
    	 Thread.sleep(0000);
    	 WebElement VoluntaryBtn = WebDriverWaits.WaitUntilVisibleWE(VoluntaryToggle);
    	 if((VoluntaryBtn.isEnabled())==false) {
    		 Assert.assertEquals(false, true);
    	 }
	} catch (InterruptedException e) {
		e.printStackTrace();
	
	} 
}

@Test(priority = 77)
public static void TC_PIP_15() {
   extentTest = extent.startTest(" TC_PIP_15 ");
	  extentTest.setDescription(" Verify that user is able to select 'Forced' toggle button, on 'Close case' popup. ");
	 try {
    	 Thread.sleep(0000);
    	WebElement ForcedBtn = WebDriverWaits.WaitUntilVisibleWE(ForcedToggle);
   	 if((ForcedBtn.isEnabled())==false) {
   		 Assert.assertEquals(false, true);
   	 }
	} catch (InterruptedException e) {
		e.printStackTrace();
	
	} 
}

@Test(priority = 78)
public static void TC_PIP_16() {
   extentTest = extent.startTest(" TC_PIP_16 ");
	  extentTest.setDescription(" Verify that 'Close Case' popup gets closed, when user clicks on 'Cross' icon or 'Cancel' button, on 'Verify Violations' popup. ");
	 try {
    	 Thread.sleep(2000);
    	WebDriverWaits.WaitUntilVisible(CancelCloseCase);
    	WebDriverWaits.ClickOn(CancelCloseCase);
	} catch (InterruptedException e) {
		e.printStackTrace();
	
	} 
}

 
 @Test(priority = 79)
	 public static void TC_PIP_17() {
	     extentTest = extent.startTest(" TC_PIP_17 ");
	 	  extentTest.setDescription(" Verify that user is able to add notes in the 'Inspection Note' field, on the 'Verify Violations' popup. ");
		 try {
	      	 Thread.sleep(0000);
	      	WebDriverWaits.ClickOn(NoteField);
	      	 String RandomReason4 = RandomStrings.RequiredString(15);
	      	WebDriverWaits.SendKeys(NoteField, RandomReason4);
	      	
		} catch (InterruptedException e) {
			e.printStackTrace();
		
		} 
	 }
 
 
 @Test(priority = 80)
	 public static void TC_PIP_18() {
	     extentTest = extent.startTest(" TC_PIP_07 ");
	 	  extentTest.setDescription(" Verify that user is able to add an attachment under 'Attachments' tile after clicking on 'Image' icon, on 'Verify Violations' popup. ");
		 try {
	      	 Thread.sleep(0000);
	      	WebDriverWaits.ClickOn(AddImgIcon);
	      	WebDriverWaits.WaitUntilVisible(BrowseFileLink);
	      	WebDriverWaits.ClickOn(BrowseFileLink);
	      	Thread.sleep(1000);
			RobotClass.RobotClassUploadMedia("//home//sqe//Downloads//Panda_11zon.jpg"); 	
			WebDriverWaits.ClickOn(AddBtnAttach);
			
		 } catch (InterruptedException e) {
			e.printStackTrace();
		} catch (AWTException e) {
			e.printStackTrace();
		} 
	 }
 

 
@Test(priority = 81)
	 public static void TC_PIP_19() {
	     extentTest = extent.startTest(" TC_PIP_19 ");
	 	  extentTest.setDescription(" Verify that 'Select Notice & Schedule Follow Up' popup opens up, when user clicks on 'Continue' button, on 'Verify Violations' popup. ");
		 try {
	      	 Thread.sleep(1000);
		      	WebDriverWaits.ClickOn(ContinueBtn);
	         WebElement CompleteInsBtn = WebDriverWaits.WaitUntilVisibleWE(IssueNoticeBtn);
	         if((CompleteInsBtn.isDisplayed())==false) {
	        	 Assert.assertEquals(false, true);
	         }
		} catch (InterruptedException e) {
			e.printStackTrace();
		
		} 
	 }

@Test(priority = 82)
public static void TC_PIP_20() {
   extentTest = extent.startTest(" TC_PIP_20 ");
	  extentTest.setDescription(" Verify that label of the 'Verify Violations' popup appears complete after user clicks on 'Continue' button. ");
	 try {
    	 Thread.sleep(0000);
//    	WebDriverWaits.WaitUntilVisible(ContinueBtn);
//    	WebDriverWaits.ClickOn(ContinueBtn);
    	String LabelComplete = WebDriverWaits.GetText(LabelVioStatus1);
    	 Assert.assertEquals(LabelComplete, "Complete");
	} catch (InterruptedException e) {
		e.printStackTrace();
	
	} 
}

@Test(priority = 83)
	 public static void TC_PIP_21() {
	     extentTest = extent.startTest(" TC_PIP_21 ");
	 	  extentTest.setDescription(" Verify that user is able to edit the 'Verify Violations' popup, after clicking on the 'Edit' icon, on 'Select Notice & Schedule Follow Up' popup. ");
		 try {
	      	 Thread.sleep(1000);
	      	WebDriverWaits.ClickOn(EditVerifyVio);
	      	WebDriverWaits.ClickOn(EditVioIcon);
	      	String[] EditVioTitle = WebDriverWaits.GetText(EditVioPopup).split(" ");
	      	Assert.assertEquals(EditVioTitle[0], "Edit");
	     	WebDriverWaits.ClickOn(CancelEditAnimal);
	      	 Thread.sleep(2000);
//	     	WebDriverWaits.WaitUntilVisible(ContinueBtn);
	     	WebDriverWaits.ClickOn(ContinueBtn);
			} catch (InterruptedException e) {
			e.printStackTrace();
		
		} 
	 }
 

@Test(priority = 84)
public static void TC_PIP_22() {
    extentTest = extent.startTest(" TC_PIP_22 ");
	  extentTest.setDescription(" Verify that first notice appears selected by default under 'Select a notice' sub-section of the 'Select Notice & Schedule Follow Up' section. ");
	 try {
     	 Thread.sleep(0000);
     	 WebElement Notice = WebDriverWaits.WaitUntilVisibleWE(NoticeSelected);
     	 if((Notice.isEnabled())==false) {
	    	  Assert.assertEquals(false, true);
     	 }
	} catch (InterruptedException e) {
		e.printStackTrace();
	
	} 
}

@Test(priority = 85)
public static void TC_PIP_23() {
extentTest = extent.startTest(" TC_PIP_23 ");
 extentTest.setDescription(" Verify that admin user is able to select a notice under 'Select a notice' sub-section of the 'Select Notice & Schedule Follow Up' section. ");
try {
	 Thread.sleep(0000);
	WebDriverWaits.ClickOn(Notice2);
	 WebElement Notice02 = WebDriverWaits.WaitUntilVisibleWE(Notice2);
 	 if((Notice02.isEnabled())==false) {
   	  Assert.assertEquals(false, true);
 	 }
} catch (InterruptedException e) {
	e.printStackTrace();

} 
}

@Test(priority = 86)
public static void TC_PIP_24() {
extentTest = extent.startTest(" TC_PIP_24 ");
 extentTest.setDescription(" Verify that 'Generate Notice' section's title appears under 'Select a notice' sub-section of the 'Select Notice & Schedule Follow Up' section, when user selects any HTML notice. ");
try {
	 Thread.sleep(1000);
	List<WebElement> AllNotices = WebDriverWaits.WaitUntilVisibleList(NoticeSelected);
     int CountNotices = AllNotices.size();
     for(int i=0; i<CountNotices ;i++) {
   	  WebElement ListSeq = AllNotices.get(i);
//	      	 Thread.sleep(1000);
   	  String[] NoticeType = ListSeq.getText().split(" ");
   	  if(NoticeType[0]=="HTML") {
   		  ListSeq.click(); 
   		  break;
   	  }
     }
     WebElement TitleSec3 = WebDriverWaits.WaitUntilVisibleWE(TitleSection3);
     if((TitleSec3.isDisplayed())==false) {
       	 Assert.assertEquals(false, true);
        }	} catch (InterruptedException e) {
	e.printStackTrace();

} 
}


@Test(priority = 87)
public static void TC_PIP_25() {
    extentTest = extent.startTest(" TC_PIP_25 ");
	  extentTest.setDescription(" Verify that user is able to select 'No Notice Required' checkbox, on 'Select Notice & Schedule Follow Up' popup. ");
	 try {
     	 Thread.sleep(0000);
     	 WebElement NoNoticeCheckBox = WebDriverWaits.WaitUntilVisibleWE(NoNoticeReq);
     	NoNoticeCheckBox.click();
     if((NoNoticeCheckBox.isEnabled())==false) {
   	  Assert.assertEquals(false, true);
     }
     	NoNoticeCheckBox.click();
	} catch (InterruptedException e) {
		e.printStackTrace();
	} 
}

  
}
