import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//WebUI.openBrowser(GlobalVariable.Front_URL)

//WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.Front_URL)

WebUI.delay(8, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Button/Page_AuctionSoftware- Large/Register_Btn'))

WebUI.delay(5)

WebUI.scrollToPosition(0, 200)

WebUI.click(findTestObject('Button/Page_AuctionSoftware- Large/Organization_Btn'))

WebUI.sendKeys(findTestObject('Input_fields/input_First Name_first_name'), GlobalVariable.First_Name)

WebUI.verifyMatch(GlobalVariable.First_Name, GlobalVariable.First_Name, false)

WebUI.sendKeys(findTestObject('Input_fields/input_Last Name_last_name'), GlobalVariable.Last_Name)

WebUI.verifyMatch(GlobalVariable.Last_Name, GlobalVariable.Last_Name, false)

WebUI.sendKeys(findTestObject('Input_fields/input_Email address_email'), GlobalVariable.Email_Address)

//WebUI.sendKeys(findTestObject('Input_fields/input_Confirm Email Address_confirm_email'), GlobalVariable.Confirm_Email_Address)
//WebUI.verifyMatch(GlobalVariable.Email_Address, GlobalVariable.Confirm_Email_Address, false)
WebUI.sendKeys(findTestObject('Input_fields/input_Enter your password_password'), GlobalVariable.Password)

WebUI.sendKeys(findTestObject('Input_fields/input_Re enter your password_confirm_password'), GlobalVariable.Confrim_Password)

WebUI.verifyMatch(GlobalVariable.Password, GlobalVariable.Confrim_Password, false)

WebUI.clearText(findTestObject('Input_fields/input_Mobile Number_phone'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Input_fields/input_Mobile Number_phone'), GlobalVariable.Mobile_Number)

WebUI.sendKeys(findTestObject('Input_fields/Page_AuctionSoftware- Large/input_Enter your organization name_companyname'), 
    GlobalVariable.Organization)

WebUI.selectOptionByLabel(findTestObject('Drop_Down/Page_AuctionSoftware- Large/Page_AuctionSoftware- Large/country'), 'United States', 
    false)

WebUI.selectOptionByIndex(findTestObject('Drop_Down/select_Enter your state'), '2', FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Input_fields/input_city_city'), GlobalVariable.City)

WebUI.sendKeys(findTestObject('Input_fields/input_address_address1'), GlobalVariable.Address_1)

WebUI.sendKeys(findTestObject('Input_fields/input_Enter your address line 2_address2'), GlobalVariable.Address_2)

WebUI.sendKeys(findTestObject('Input_fields/input_Zip code_zip'), GlobalVariable.Zip_Code)

WebUI.check(findTestObject('Radio_Button/Page_Register  Auction Software_Gender/span_Male'))

WebUI.click(findTestObject('Button/Page_AuctionSoftware- Large/Page_Register  Auction Software/Page_Register  Auction Software/Create my account_btn'))

WebUI.delay(10)

