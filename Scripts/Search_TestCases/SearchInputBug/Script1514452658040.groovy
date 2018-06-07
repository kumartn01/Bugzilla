import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.google.common.collect.Multimaps.Keys.KeysEntrySet as KeysEntrySet
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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.setText(findTestObject('Page_BugsUI login (1)/input_value_email'), 'kumar.nagendra@happiestminds.com')

WebUI.setText(findTestObject('Page_BugsUI login (1)/input_form-control ng-untouche'), 'Kumar@123')

WebUI.click(findTestObject('Page_BugsUI login (1)/button_Login'))

WebUI.setText(findTestObject('Page_BugsUI Dashboard/input_navbar-search-input'), '193666')

WebUI.delay(20)

WebUI.sendKeys(findTestObject('Page_BugsUI Dashboard/input_navbar-search-input'), Keys.chord(Keys.ENTER))

WebUI.waitForElementAttributeValue(findTestObject('BugsPage_GeneralTab/a_General'), 'text', 'General', 20)

WebUI.verifyElementAttributeValue(findTestObject('BugsPage_GeneralTab/a_General'), 'text', 'General', 20)

String val = 'General'

if (val.equals('General')) {
    assert true
} else {
    assert false
}

WebUI.closeBrowser()

CustomKeywords.'newKey.Dashboard.add2nums'(2, 4)

