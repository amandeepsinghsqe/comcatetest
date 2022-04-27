package POM;

public class PerformInspectionUtils {
	
	  public static String performInsButton = "//button[text()='Perform Inspection']";
	  public static String continueBtn = "//div[@class='footer_actions']/button[2]";
	  public static String globalValidMsg = "//div[@class='case-inspection__global-error']/h2";
	  public static String titlePIPage = "//div[@class='perform-inspection__title-text']/h1";
	  public static String addVioPI = "//div[@id='case-inspection']//input";
	  public static String selectVioList = "//div[@id='case-inspection']//div[@class='list-label']";
	  public static String invalidBtnList = "//div[@class='multi-choice-buttons']/button[text()='Invalid']";
	  public static String noteField = "//textarea[@placeholder='Enter Note']";
	  public static String footerButtons = "//div[@class='footer_actions']/button";
	  public static String addImgIcon = "//div[@class='case-inspection__attachment__title']/button";
	  public static String browseFileLink = "//div[@class='attachments-modal__drag-drop-box']/label";
	  public static String addBtnAttach = "//div[@class='attachments-modal__footer']/button[2]";
	  public static String caseVioList = "//div[@class='case-details__violation-tile']/following::div[@class='case-violation-list']";
	  public static String confirmationPopup = "//div[@class='disclaimer-modal__disclaimer-img']";
	  public static String cancelConfirmation = "//div[@class='flex-row--center']/button[text()='Cancel']";
	  public static String closeCasePopup = "//div[@class='modal-header' and text()='Close Case']";
	  public static String validBtnList = "//div[@class='multi-choice-buttons']/button[text()='Valid']";
	  public static String voluntaryToggle = "//div[@class='multi-choice-buttons']/button[text()='Voluntary']";
	  public static String cancelCloseCase = "//div[@class='modal-footer']//button[text()='Cancel']";
	  public static String issueNoticeBtn = "//div[@class='progressive-form__footer']/button";
	  public static String editVerifyVio = "//div[@class='progressive-form__title']/div/following-sibling::h2[text()='Verify Violations']";
	  public static String editVioIcon = "//div[@id='case-inspection']//button[@class='edit-btn  btn btn-default']";
	  public static String editVioPopup = "//div[@id='case-inspection']//following::div[@class='modal-header']";
	  public static String noNoticeReq = "//label[@for='no-notice']";
	  public static String noticeIssueDate = "//input[@name='issuedAt']";
	  public static String cancelEditAnimal = "//div[@class='entity-modal__footer']/button[text()='Cancel']";
	  public static String labelVioStatus1 = "//div/h2[text()='Verify Violations']/following-sibling::label";
	  public static String vioVerificationStatus= "//div[@class='case-violation__status verification-pending']/label";
	  public static String titleSection2 = "//h2[text()='Select Notice & Schedule Follow Up']";
	  public static String forcedToggle = "//div[@class='multi-choice-buttons']/button[text()='Forced']";
	  public static String closedInvalidStatus = "//div[@class='case-violation__status closed']";
	  public static String openCompliantStatus = "//div[@class='case-violation__status open']";
	  public static String noticeSelected = "//div[@class='notice-list row']//button";
	  public static String notice2 = "//div[@class='notice-list row']//button[2]";
	  public static String titleSection3 = "//h2[text()='Generate Notice']";
	  public static String noticeDatePicker = "//td[@class='rdtDay rdtActive rdtToday']/following::td[2]";
	  public static String issueNoticeButton = "//button[text()='Issue Notice & Complete Inspection']";

}
