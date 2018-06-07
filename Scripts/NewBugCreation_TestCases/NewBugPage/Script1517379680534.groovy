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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By


WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.setText(findTestObject('Page_BugsUI login/input_value_userid'), 'knagendra-ext')

WebUI.setText(findTestObject('Page_BugsUI login/input_form-control ng-untouche'), 'Tumkur@123')

WebUI.click(findTestObject('Page_BugsUI login/button_Login'))

WebUI.delay(3)

newBugTabVisible = WebUI.verifyElementVisible(findTestObject('Page_BugsUI Dashboard/a_New bug'))

if (newBugTabVisible) {
    WebUI.click(findTestObject('Page_BugsUI Dashboard/a_New bug'))
}

//TC023
WebUI.verifyElementText(findTestObject('Page_BugsUI New Bug/h5_Please select the classific'), 'Please select the classification and package :')

WebUI.verifyElementText(findTestObject('Page_BugsUI New Bug/span_Classification'), 'Classification :')

WebUI.delay(3)

//TC024
defaultClassificationValue = WebUiBuiltInKeywords.getText(findTestObject('Page_BugsUI New Bug/DefaultClassification'))

println('------Selected default value------:' + defaultClassificationValue)

WebUI.verifyEqual(defaultClassificationValue, '')

//End of TC024
//TC025
defaultPackageUIValue = WebUiBuiltInKeywords.getText(findTestObject('Page_BugsUI New Bug/DefaultPackageUI'))

println('------Selected default package value------:' + defaultPackageUIValue)

WebUI.verifyEqual(defaultPackageUIValue, '')

//End of TC025
WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Page_BugsUI New Bug/DropdownClassification'), 'Software', false)

WebUI.verifyElementText(findTestObject('Page_BugsUI New Bug/span_Package'), 'Package :')

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('Page_BugsUI New Bug/DropdownPackage'), 'BugsUITest', false)

WebUI.verifyElementPresent(findTestObject('Page_BugsUI New Bug/div_box-body'), 2)

WebUI.verifyElementPresent(findTestObject('Page_BugsUI New Bug/span_Status'), 2)

