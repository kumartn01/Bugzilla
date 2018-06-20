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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.setText(findTestObject('Page_BugsUI login/input_value_userid'), 'knagendra-ext')

WebUI.setText(findTestObject('Page_BugsUI login/input_form-control ng-untouche'), 'Tumkur@123')

WebUI.click(findTestObject('Page_BugsUI login/button_Login'))

WebUI.verifyElementAttributeValue(findTestObject('Page_BugsUI login/a_BugsUI'), 'text', 'BugsUI ', 2)

WebUI.delay(2)

if(WebUI.verifyElementVisible(findTestObject('Page_BugsUI Dashboard/a_Product'))){
	
	WebUI.click(findTestObject('Page_BugsUI Dashboard/a_Product'))
	
	WebUI.click(findTestObject('Page_BugsUI Dashboard/a_EDIT'))
}

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Page_BugsUI productEdit/classificationDropdown'), 'Software', false)

WebUI.delay(25)

WebUI.selectOptionByLabel(findTestObject('Page_BugsUI productEdit/packageDropdown'), 'Apple',false)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Page_BugsUI productEdit/version_delete_button'),4)

WebUI.click(findTestObject('Page_BugsUI productEdit/version_delete_button'))

if (WebUI.verifyAlertPresent(7)) {
	
	WebUI.acceptAlert()
}

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Page_BugsUI productEdit/div_version_Product must have atleast'), 0)

deleteMandatoryVersionMessage = WebUiBuiltInKeywords.getText(findTestObject('Page_BugsUI productEdit/div_version_Product must have atleast'))

WebUI.verifyEqual(deleteMandatoryVersionMessage, 'Product must have atleast 1 version !!!')


