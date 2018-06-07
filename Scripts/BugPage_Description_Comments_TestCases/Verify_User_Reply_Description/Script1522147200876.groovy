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

WebUI.scrollToElement(findTestObject('BugsPage_Description/h3_Description'),0)

if(WebUI.verifyElementPresent(findTestObject('BugsPage_Description/description_Opened_date'), 0)){
	
	openedDate = WebUiBuiltInKeywords.getText(findTestObject('BugsPage_Description/description_Opened_date'))
	
	println('length of text is:'+openedDate.length())
	
	WebUI.verifyEqual(openedDate.length(), 28)
	
}

if(WebUI.verifyElementPresent(findTestObject('BugsPage_Description/a_Reply'), 0)){
	
	WebUI.click(findTestObject('BugsPage_Description/a_Reply'))
	
	if(WebUI.verifyElementPresent(findTestObject('BugsPage_Description/textarea_form-control input-sm'), 0)){
		
		WebUI.setText(findTestObject('BugsPage_Description/textarea_form-control input-sm'), 'Automation-Reply-Description')
		
		if(WebUI.verifyElementPresent(findTestObject('BugsPage_Description/button_OK'), 0)){
			
			WebUI.click(findTestObject('BugsPage_Description/button_OK'))
		}
	}
}

WebUI.delay(3)

if(WebUI.verifyElementPresent(findTestObject('BugsPage_Description/div_In reply to Bug Description'), 0)){
	
	assert true
}
else{
	assert false
}





