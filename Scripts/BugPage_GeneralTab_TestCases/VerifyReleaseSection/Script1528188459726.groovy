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



if(WebUI.verifyElementPresent(findTestObject('BugsPage_GeneralTab/Release-Section/releaseBox'), 1)){
	
	if(WebUI.verifyElementPresent(findTestObject('BugsPage_GeneralTab/Release-Section/i_togglePlusReleaseNoteBox'), 1)){
		
		WebUI.click(findTestObject('BugsPage_GeneralTab/Release-Section/i_togglePlusReleaseNoteBox'))
		
		WebUI.verifyElementPresent(findTestObject('BugsPage_GeneralTab/Release-Section/select_PendingApproved'), 1)
		
		WebUI.verifyElementPresent(findTestObject('BugsPage_GeneralTab/Release-Section/textarea_Approved'), 1)
		
		WebUI.verifyElementPresent(findTestObject('BugsPage_GeneralTab/Release-Section/td_Category'), 1)
		
		WebUI.verifyElementPresent(findTestObject('BugsPage_GeneralTab/Release-Section/td_Affected Platforms'), 1)
		
		WebUI.verifyElementPresent(findTestObject('BugsPage_GeneralTab/Release-Section/th_Tag_type'), 1)
		
		WebUI.verifyElementPresent(findTestObject('BugsPage_GeneralTab/Release-Section/th_Name  Parent  Descrption'), 1)
		
	}
}

if(WebUI.verifyElementPresent(findTestObject('BugsPage_GeneralTab/Release-Section/button_SKU Family'), 1)){
	
	WebUI.click(findTestObject('BugsPage_GeneralTab/Release-Section/button_SKU Family'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('BugsPage_GeneralTab/Release-Section/a_SKU Family'))
	
	WebUI.delay(2)
	
}

if (WebUI.verifyAlertPresent(2)) {
	
	alertText = WebUI.getAlertText()
	
	WebUI.verifyEqual(alertText, 'Are you sure you want to edit Release Note?')
	
	WebUI.acceptAlert()
}

WebUI.click(findTestObject('BugsPage_GeneralTab/Release-Section/button_SKU Family'))

WebUI.delay(1)

WebUI.click(findTestObject('BugsPage_GeneralTab/Release-Section/a_SKU Family'))

WebUI.delay(1)

tagType_category = WebUI.getText(findTestObject('BugsPage_GeneralTab/Release-Section/button_SKU Family'))

WebUI.verifyEqual(tagType_category, 'SKU Family ')


WebUI.click(findTestObject('BugsPage_GeneralTab/Release-Section/button_Arad'))

WebUI.delay(2)

WebUI.click(findTestObject('BugsPage_GeneralTab/Release-Section/span_Alta  --------  DCS-7150'))

WebUI.scrollToElement(findTestObject('BugsPage_GeneralTab/Release-Section/select_PendingApproved'), 0)

// Selecting Multiple values for affected platform

WebUI.click(findTestObject('BugsPage_GeneralTab/Release-Section/button_SKU SKU Series'))

WebUI.delay(2)

WebUI.click(findTestObject('BugsPage_GeneralTab/Release-Section/link_SKU'))

WebUI.delay(2)

WebUI.click(findTestObject('BugsPage_GeneralTab/Release-Section/button_AffectedPlatform_description'))

WebUI.delay(2)

WebUI.click(findTestObject('BugsPage_GeneralTab/Release-Section/check_All_Options'))

WebUI.delay(2)

WebUI.click(findTestObject('BugsPage_GeneralTab/Release-Section/uncheck_All_Options'))

WebUI.delay(2)

WebUI.click(findTestObject('BugsPage_GeneralTab/Release-Section/button_AffectedPlatform_description'))

WebUI.delay(2)

WebUI.click(findTestObject('BugsPage_GeneralTab/Release-Section/button_OK'))

if (WebUI.verifyAlertPresent(2)) {
	
	WebUI.acceptAlert()
}
