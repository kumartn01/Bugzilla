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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper

WebUI.selectOptionByLabel(findTestObject('Page_BugsUI productAdd/ProductAdd_Fields/select_Classification'), 'Software', false)

WebUI.setText(findTestObject('Page_BugsUI productAdd/ProductAdd_Fields/input_productName_addProduct'), 'TestProduct_Automation')

WebUI.setText(findTestObject('Page_BugsUI productAdd/ProductAdd_Fields/textarea_productDescription_ad'), 'TestProduct Automation Description')

WebUI.setText(findTestObject('Page_BugsUI productAdd/ProductAdd_Fields/input_version_addProduct'), '1')

WebUI.setText(findTestObject('Page_BugsUI productAdd/ProductAdd_Fields/input_component_addProduct'), 'Test_Component_Automation')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_BugsUI productAdd/ProductAdd_Fields/textarea_componentDescription_'), 'TestComponent Description')

WebUI.setText(findTestObject('Page_BugsUI productAdd/ProductAdd_Fields/input_AssignTO_addProduct'), 'kumar')

WebUI.scrollToElement(findTestObject('Page_BugsUI productAdd/ProductAdd_Fields/button_ADD'),0)

WebUI.click(findTestObject('Page_BugsUI productAdd/ProductAdd_Fields/button_ADD'))

if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI productAdd/Error_Messages/small_Invalid Email Id'), 0)){
	invalidEmailId = WebUI.getText(findTestObject('Page_BugsUI productAdd/Error_Messages/small_Invalid Email Id'))
	WebUI.verifyMatch(invalidEmailId, 'Invalid Email Id !!', false)
}
WebUI.delay(3)

WebUiCommonHelper.findWebElement(findTestObject('Page_BugsUI productAdd/ProductAdd_Fields/input_AssignTO_addProduct'), 2).clear()

WebUI.setText(findTestObject('Page_BugsUI productAdd/ProductAdd_Fields/input_AssignTO_addProduct'), 'kumar@happiestminds.com')

WebUI.click(findTestObject('Page_BugsUI productAdd/ProductAdd_Fields/button_ADD'))

WebUI.delay(3)

if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI productAdd/Error_Messages/small_Email Id does not exist'), 0)){
	emailDoesNotExist = WebUI.getText(findTestObject('Page_BugsUI productAdd/Error_Messages/small_Email Id does not exist'))
	WebUI.verifyMatch(emailDoesNotExist, 'Email Id does not exist !!', false)
}

WebUI.delay(3)

WebUiCommonHelper.findWebElement(findTestObject('Page_BugsUI productAdd/ProductAdd_Fields/input_AssignTO_addProduct'), 2).clear()

WebUI.setText(findTestObject('Page_BugsUI productAdd/ProductAdd_Fields/input_AssignTO_addProduct'), 'kumar.nagendra@happiestminds.com')

WebUI.click(findTestObject('Page_BugsUI productAdd/ProductAdd_Fields/button_ADD'))

WebUI.delay(1)

successAlert = WebUI.verifyElementPresent(findTestObject('Page_BugsUI productAdd/ProductAdd_Fields/div_Successfully added the pro'), 6)

def text

if(successAlert){
	text = WebUI.getText(findTestObject('Page_BugsUI productAdd/ProductAdd_Fields/div_Successfully added the pro'))
}

println('Success text is--------'+text)

WebUI.verifyMatch(text, 'Successfully added the product "TestProduct_Automation"!!!', true) 

