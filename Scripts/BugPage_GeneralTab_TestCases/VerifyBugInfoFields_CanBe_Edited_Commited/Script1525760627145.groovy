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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_BugsUI login/input_value_userid'), 'knagendra-ext')

WebUI.setText(findTestObject('Page_BugsUI login/input_form-control ng-untouche'), 'Tumkur@123')

WebUI.click(findTestObject('Page_BugsUI login/button_Login'))

WebUI.setText(findTestObject('Page_BugsUI Dashboard/input_navbar-search-input'), '247777')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Page_BugsUI Dashboard/input_navbar-search-input'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

if(WebUI.verifyElementPresent(findTestObject('BugsPage_GeneralTab/a_General'), 1)){
	
	WebUI.verifyElementAttributeValue(findTestObject('BugsPage_GeneralTab/a_General'), 'text', 'General', 5)
}

if(WebUI.verifyElementPresent(findTestObject('BugsPage_GeneralTab/bugInfoBox'), 1)){
	
	if(WebUI.verifyElementPresent(findTestObject('BugsPage_GeneralTab/i_togglePlusBugInfoBox'), 1)){
		
		WebUI.click(findTestObject('BugsPage_GeneralTab/i_togglePlusBugInfoBox'))
		
		WebUI.verifyElementPresent(findTestObject('BugsPage_GeneralTab/input_alias'), 1)
		
		WebUI.verifyElementPresent(findTestObject('BugsPage_GeneralTab/i_toggleMinusBugInfoBox'), 1)
	}
	
}

CustomKeywords.'newKey.ClearFields.ClearTextField'(findTestObject('BugsPage_GeneralTab/input_alias'))

WebUI.setText(findTestObject('BugsPage_GeneralTab/input_alias'), 'Automation_AliasName')

WebUI.click(findTestObject('BugsPage_GeneralTab/button_COMMIT'))

if (WebUI.verifyAlertPresent(2)) {
	
	alertText = WebUI.getAlertText()
	
	WebUI.verifyEqual(alertText, 'Changes have been committed successfully to Bug #247777')
	
	WebUI.acceptAlert()
}

WebUI.delay(6)

WebUI.click(findTestObject('BugsPage_GeneralTab/i_togglePlusBugInfoBox'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('BugsPage_GeneralTab/bugInfo_Package'), 1)

WebUI.verifyElementPresent(findTestObject('BugsPage_GeneralTab/bugInfo_classification'), 1)

WebUI.verifyElementPresent(findTestObject('BugsPage_GeneralTab/bugInfo_Component'), 1)

CustomKeywords.'newKey.ClearFields.ClearTextField'(findTestObject('BugsPage_GeneralTab/input_alias'))

newAliasName =WebUI.getText(findTestObject('BugsPage_GeneralTab/input_alias'))

WebUI.setText(findTestObject('BugsPage_GeneralTab/input_alias'), 'auto')

WebUI.click(findTestObject('BugsPage_GeneralTab/button_COMMIT'))

if (WebUI.verifyAlertPresent(2)) {
	
	WebUI.acceptAlert()
}

WebUI.delay(4)





