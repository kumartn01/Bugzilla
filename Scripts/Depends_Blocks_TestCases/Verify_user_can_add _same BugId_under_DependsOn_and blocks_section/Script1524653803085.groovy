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

WebUI.setText(findTestObject('Page_BugsUI_Depends_Blocks/div_blockedBug1'), '252923')

WebUI.click(findTestObject('Page_BugsUI_Depends_Blocks/blocks_Add_button'))

if (WebUI.verifyAlertPresent(2)) {
	
	alertText = WebUI.getAlertText()
	
	alertText.contains('This would create a circular dependency, which is not allowed')
	
	WebUI.acceptAlert()
}

CustomKeywords.'newKey.ClearFields.ClearTextField'(findTestObject('Page_BugsUI_Depends_Blocks/div_blockedBug1'))

WebUI.setText(findTestObject('Page_BugsUI_Depends_Blocks/div_blockedBug1'), '254844')

WebUI.click(findTestObject('Page_BugsUI_Depends_Blocks/blocks_Add_button'))

WebUI.delay(2)

if (WebUI.verifyAlertPresent(2)) {
	
	alertText = WebUI.getAlertText()
	
	WebUI.verifyEqual(alertText, 'Changes have been committed successfully to Bug #254833')
	
	WebUI.acceptAlert()
}

WebUI.delay(6)

if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI_Depends_Blocks/a_254844'), 1)){
	
	assert true
}
else{
	assert false
}