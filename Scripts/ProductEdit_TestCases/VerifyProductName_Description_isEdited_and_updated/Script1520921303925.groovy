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

WebUI.delay(4)

WebUI.selectOptionByLabel(findTestObject('Page_BugsUI productEdit/classificationDropdown'), 'Software', false)

WebUI.delay(25)

WebUI.selectOptionByLabel(findTestObject('Page_BugsUI productEdit/packageDropdown'), 'TestProduct_Automation',false)

WebUI.delay(5)

CustomKeywords.'newKey.ClearFields.ClearTextField'(findTestObject('Page_BugsUI productEdit/textarea_productDescription_ed'))

WebUI.setText(findTestObject('Page_BugsUI productEdit/textarea_productDescription_ed'), 'test auto desc')

CustomKeywords.'newKey.ClearFields.ClearTextField'(findTestObject('Page_BugsUI productEdit/input_productName_editProduct'))

WebUI.setText(findTestObject('Page_BugsUI productEdit/input_productName_editProduct'), 'TestProduct_Automation1')

WebUI.click(findTestObject('Page_BugsUI productEdit/button_Update'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Page_BugsUI productEdit/div_Successfully updated the p'), 9)

successfulUpdateMessage = WebUiBuiltInKeywords.getText(findTestObject('Page_BugsUI productEdit/div_Successfully updated the p'))

println('------Selected default package value------:' + successfulUpdateMessage)

WebUI.verifyEqual(successfulUpdateMessage, 'Successfully updated the product "TestProduct_Automation"!!!')

WebUI.selectOptionByLabel(findTestObject('Page_BugsUI productEdit/classificationDropdown'), 'Software', false)

WebUI.delay(15)

WebUI.selectOptionByLabel(findTestObject('Page_BugsUI productEdit/packageDropdown'), 'TestProduct_Automation1',false)

WebUI.delay(5)

