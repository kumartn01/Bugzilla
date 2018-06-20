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

WebUI.setText(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageFields/input_Summary'), 'Testing for Automation')

WebUI.setText(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageFields/input_dependsOn'), '1010101010110')

WebUI.scrollToElement(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageFields/button_Commit'), 0)

WebUI.click(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageFields/button_Commit'))

altertPresent = WebUI.verifyAlertPresent(5)

def alertText

if (altertPresent) {
    alertText = WebUI.getAlertText()

    println('alertText for wrong depends on is:-' + alertText)

    WebUI.acceptAlert()
}

if (alertText.contains('Following Bug Id(s)/Alias entered under \'Depends on\' do not exist:') && alertText.contains('1010101010110')) {
    assert true
} else {
    assert false
}

CustomKeywords.'newKey.ClearFields.ClearTextField'(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageFields/input_dependsOn'))

WebUI.setText(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageFields/input_blocks'), '1111111111')

WebUI.click(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageFields/button_Commit'))

altertPresent = WebUI.verifyAlertPresent(5)

def alertText_blocks

if (altertPresent) {
	alertText_blocks = WebUI.getAlertText()

	println('alertText for wrong Blocks on is:-' + alertText_blocks)

	WebUI.acceptAlert()
}

if (alertText_blocks.contains('Following Bug Id(s)/Alias entered under \'Blocks\' do not exist:') && alertText_blocks.contains('1111111111')) {
	assert true
} else {
	assert false
}
//----------------------------------

CustomKeywords.'newKey.ClearFields.ClearTextField'(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageFields/input_blocks'))

WebUI.setText(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageFields/input_dependsOn'), '247777')

WebUI.setText(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageFields/input_blocks'), '247777')

WebUI.click(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageFields/button_Commit'))

altertPresent = WebUI.verifyAlertPresent(2)

def alertText_circularDependency

if (altertPresent) {
	alertText_circularDependency = WebUI.getAlertText()

	println('alertText for wrong Blocks on is:-' + alertText_circularDependency)

	WebUI.acceptAlert()
}

if (alertText_circularDependency.contains('This would create a circular dependency, which is not allowed.') && alertText_circularDependency.contains('247777')) {
	assert true
} else {
	assert false
}

CustomKeywords.'newKey.ClearFields.ClearTextField'(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageFields/input_blocks'))

WebUI.setText(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageFields/input_blocks'), '193666')