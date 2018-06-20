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

//TC030
//WebUI.setText(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageFields/input_Summary'), 'Testing for Automation')

WebUI.setText(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageFields/input_Description'), 'Description for Test automation')

WebUI.scrollToElement(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageFields/button_Commit'),0)

WebUI.click(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageFields/button_Commit'))

altertPresent = WebUI.verifyAlertPresent(6)

def alertText

if(altertPresent){
	alertText = WebUI.getAlertText()
	WebUI.acceptAlert()
}

newBugNo = WebUI.getText(findTestObject('Page_BugsUI New Bug/BugNo'))
bugId = newBugNo.substring(5, 11)

println("alert text is -"+alertText)
println("bugId -"+bugId)
if(alertText.contains(bugId)){
	assert true
}
else{
	assert false
}

WebUI.closeBrowser()








