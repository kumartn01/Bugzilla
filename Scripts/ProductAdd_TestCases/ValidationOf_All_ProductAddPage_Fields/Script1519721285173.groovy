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

WebUI.verifyElementText(findTestObject('Page_BugsUI productAdd/ProductAdd_Fields/span_Classification'), 'Classification :')

WebUI.verifyElementPresent(findTestObject('Page_BugsUI productAdd/ProductAdd_Fields/select_Classification'), 0)

WebUI.verifyElementText(findTestObject('Page_BugsUI productAdd/ProductAdd_Fields/span_Product'), 'Product :')

WebUI.verifyElementPresent(findTestObject('Page_BugsUI productAdd/ProductAdd_Fields/input_productName_addProduct'), 0)

WebUI.verifyElementText(findTestObject('Page_BugsUI productAdd/ProductAdd_Fields/span_Description'), 'Description :')

WebUI.verifyElementPresent(findTestObject('Page_BugsUI productAdd/ProductAdd_Fields/textarea_productDescription_ad'), 0)

WebUI.verifyElementText(findTestObject('Page_BugsUI productAdd/ProductAdd_Fields/span_Closed for bug entry'), 'Closed for bug entry :')

WebUI.verifyElementPresent(findTestObject('Page_BugsUI productAdd/ProductAdd_Fields/input_bugentry_addProduct'), 0)

WebUI.verifyElementText(findTestObject('Page_BugsUI productAdd/ProductAdd_Fields/span_Version'), 'Version :')

WebUI.verifyElementPresent(findTestObject('Page_BugsUI productAdd/ProductAdd_Fields/input_version_addProduct'), 0)

WebUI.verifyElementText(findTestObject('Page_BugsUI productAdd/ProductAdd_Fields/span_Component'), 'Component :')

WebUI.verifyElementPresent(findTestObject('Page_BugsUI productAdd/ProductAdd_Fields/input_component_addProduct'), 0)

//WebUI.verifyElementText(findTestObject('Page_BugsUI productAdd/ProductAdd_Fields/span_Comp Desc'), 'Comp Desc :')

//WebUI.verifyElementPresent(findTestObject('Page_BugsUI productAdd/ProductAdd_Fields/textarea_componentDescription_'), 0)

WebUI.verifyElementText(findTestObject('Page_BugsUI productAdd/ProductAdd_Fields/span_Default Assignee'), 'Default Assignee :')

WebUI.verifyElementPresent(findTestObject('Page_BugsUI productAdd/ProductAdd_Fields/input_AssignTO_addProduct'), 0)

