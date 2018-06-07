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

WebUI.scrollToElement(findTestObject('Page_BugsUI productAdd/ProductAdd_Fields/button_ADD'),0)

WebUI.click(findTestObject('Page_BugsUI productAdd/ProductAdd_Fields/button_ADD'))

WebUI.delay(3)

if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI productAdd/Error_Messages/small_Product is required'), 0)){
	productRequired = WebUI.getText(findTestObject('Page_BugsUI productAdd/Error_Messages/small_Product is required'))
	WebUI.verifyMatch(productRequired, 'Product is required !!', false)
}

if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI productAdd/Error_Messages/small_Product description is r'), 0)){
	productDescRequired = WebUI.getText(findTestObject('Page_BugsUI productAdd/Error_Messages/small_Product description is r'))
	WebUI.verifyMatch(productDescRequired, 'Product description is required !!', false)
}

if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI productAdd/Error_Messages/small_Version is required'), 0)){
	versionRequired = WebUI.getText(findTestObject('Page_BugsUI productAdd/Error_Messages/small_Version is required'))
	WebUI.verifyMatch(versionRequired, 'Version is required !!', false)
}

if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI productAdd/Error_Messages/small_Component is required'), 0)){
	componentRequired = WebUI.getText(findTestObject('Page_BugsUI productAdd/Error_Messages/small_Component is required'))
	WebUI.verifyMatch(componentRequired, 'Component is required !!', false)
}

if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI productAdd/Error_Messages/small_Component description is'), 0)){
	componentDescRequired = WebUI.getText(findTestObject('Page_BugsUI productAdd/Error_Messages/small_Component description is'))
	WebUI.verifyMatch(componentDescRequired, 'Component description is required !!', false)
}

if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI productAdd/Error_Messages/small_Email Id is required'), 0)){
	emailIdRequired = WebUI.getText(findTestObject('Page_BugsUI productAdd/Error_Messages/small_Email Id is required'))
	WebUI.verifyMatch(emailIdRequired, 'Email Id is required !!', false)
}




