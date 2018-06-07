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

WebUI.delay(2)

if(WebUI.verifyElementPresent(findTestObject('BugsPage_GeneralTab/Status-Box/statusBox'), 1)){
	
	if(WebUI.verifyElementPresent(findTestObject('BugsPage_GeneralTab/Status-Box/i_togglePlusStatusBox'), 1)){
		
		WebUI.click(findTestObject('BugsPage_GeneralTab/Status-Box/i_togglePlusStatusBox'))
		
		WebUI.verifyElementPresent(findTestObject('BugsPage_GeneralTab/Status-Box/statusBox_status_dropdown'), 1)
		
		WebUI.verifyElementPresent(findTestObject('BugsPage_GeneralTab/Status-Box/statusBox_Platform_dropdown'), 1)
		
		WebUI.verifyElementPresent(findTestObject('BugsPage_GeneralTab/Status-Box/statusBox_Priority_dropdown'), 1)
		
		WebUI.verifyElementPresent(findTestObject('BugsPage_GeneralTab/Status-Box/statusBox_Severity_dropdown'), 1)
		
		WebUI.verifyElementPresent(findTestObject('BugsPage_GeneralTab/Status-Box/statusBox_Resoluion_dropdown'), 1)
		
		WebUI.verifyElementPresent(findTestObject('BugsPage_GeneralTab/Status-Box/i_toggleMinusStatusBox'), 1)
	}
	
}

WebUI.selectOptionByLabel(findTestObject('BugsPage_GeneralTab/Status-Box/statusBox_status_dropdown'), 'CLOSED', false)

WebUI.click(findTestObject('BugsPage_GeneralTab/button_COMMIT'))
WebUI.delay(2)

if (WebUI.verifyAlertPresent(2)) {
	
	alertText = WebUI.getAlertText()
	
	if(alertText.contains('Please specify atleast one of the following:Fixed by changelist')){
		
		assert true
		
		WebUI.acceptAlert()
	}
	else{
		assert false
	}
}

if(WebUI.verifyElementPresent(findTestObject('BugsPage_GeneralTab/checkbox_forceCommit'), 1)){
	
	WebUI.click(findTestObject('BugsPage_GeneralTab/checkbox_forceCommit'))
	
	WebUI.click(findTestObject('BugsPage_GeneralTab/button_COMMIT'))
	
	WebUI.delay(2)
}

if (WebUI.verifyAlertPresent(2)) {
	
	alertText = WebUI.getAlertText()
	
	if(alertText.contains('Do you want to add comments?')){
		
		assert true
		
		WebUI.dismissAlert()
	}
	else{
		assert false
	}
}

if (WebUI.verifyAlertPresent(2)) {
	
	alertText = WebUI.getAlertText()
	
	if(alertText.contains('Changes have been committed successfully to Bug #247777')){
		
		assert true
		
		WebUI.acceptAlert()
	}
	else{
		assert false
	}
}

WebUI.delay(6)

WebUI.click(findTestObject('BugsPage_GeneralTab/Status-Box/i_togglePlusStatusBox'))

WebUI.selectOptionByLabel(findTestObject('BugsPage_GeneralTab/Status-Box/statusBox_status_dropdown'), 'NEW', false)

WebUI.click(findTestObject('BugsPage_GeneralTab/button_COMMIT'))

if (WebUI.verifyAlertPresent(2)) {
	
	alertText = WebUI.getAlertText()
	
	if(alertText.contains('Do you want to add comments?')){
		
		assert true
		
		WebUI.dismissAlert()
	}
	else{
		assert false
	}
}

if (WebUI.verifyAlertPresent(2)) {
	
	alertText = WebUI.getAlertText()
	
	if(alertText.contains('Changes have been committed successfully to Bug #247777')){
		
		assert true
		
		WebUI.acceptAlert()
	}
	else{
		assert false
	}
}

WebUI.delay(2)