import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


//TC004
WebUI.setText(findTestObject('Page_BugsUI login/input_value_userid'), 'knagendra-ext')

loginButtonClickable = WebUI.verifyElementClickable(findTestObject('Page_BugsUI login/button_Login'))

if (loginButtonClickable) {
    WebUI.click(findTestObject('Page_BugsUI login/button_Login'))
}

WebUI.verifyElementText(findTestObject('Page_BugsUI login/small_Password is Required.'), 'Password is Required.')

//End of TC004
//TC005 Begins
WebUI.setText(findTestObject('Page_BugsUI login/input_form-control ng-untouche'), '123')

WebUiCommonHelper.findWebElement(findTestObject('Page_BugsUI login/input_value_userid'), 2).clear()

WebUI.click(findTestObject('Page_BugsUI login/button_Login'))

WebUI.verifyElementText(findTestObject('Page_BugsUI login/small_User Id is Required.'), 'User Id is Required.')

//End of TC005
//TC006 Begins
WebUI.setText(findTestObject('Page_BugsUI login/input_value_userid'), 'knagendra-ext')

WebUI.click(findTestObject('Page_BugsUI login/button_Login'))

WebUI.delay(3)

if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI login/small_Invalid User IdPassword'), 0)){
	text = WebUI.getText(findTestObject('Page_BugsUI login/small_Invalid User IdPassword'))
	WebUI.verifyMatch(text, 'Invalid User Id/Password !!', false)
}
//End of TC006
WebUI.closeBrowser()

