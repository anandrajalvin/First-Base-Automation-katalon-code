import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class LoginSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */


	@Given("the user is on the Login Page")
	def userinLoginPage() {
		WebUI.callTestCase(findTestCase('UI Check/Open Broswer'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Button/Page_AuctionSoftware- Large/Login_btn'))
	}

	@When("the user enters the username")
	def Enterusername() {
		WebUI.sendKeys(findTestObject('Input_fields/input_Email address_email'), GlobalVariable.Email_Address)
	}

	@And("the user enters the password")
	def Enterpassword() {
		WebUI.sendKeys(findTestObject('Input_fields/input_Enter your password_password'), GlobalVariable.Password)
	}

	@And("click the Login button")
	def Loginbtn() {
		WebUI.click(findTestObject('Page_Login  Auction Software_btn/span_Login'))
	}


	@Then("the user should be logged in")
	def VerifyLogin() {
		WebUI.check(findTestObject('Toast Messgae/Toast_Message'), FailureHandling.STOP_ON_FAILURE)
		WebUI.getText(findTestObject('Toast Messgae/Toast_Message'))
		WebUI.closeBrowser()
	}
}