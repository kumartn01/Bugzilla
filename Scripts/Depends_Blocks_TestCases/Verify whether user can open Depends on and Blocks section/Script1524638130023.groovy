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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_BugsUI login/input_value_userid'), 'knagendra-ext')

WebUI.setText(findTestObject('Page_BugsUI login/input_form-control ng-untouche'), 'Tumkur@123')

WebUI.click(findTestObject('Page_BugsUI login/button_Login'))

WebUI.setText(findTestObject('Page_BugsUI Dashboard/input_navbar-search-input'), '254833')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Page_BugsUI Dashboard/input_navbar-search-input'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI_Depends_Blocks/a_Depends and Blocks'), 1)){
	
	WebUI.click(findTestObject('Page_BugsUI_Depends_Blocks/a_Depends and Blocks'))
}

WebUI.delay(2)

if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI_Depends_Blocks/h3_Bug blocks'), 1)){
	
	blocksText = WebUiBuiltInKeywords.getText(findTestObject('Page_BugsUI_Depends_Blocks/h3_Bug blocks'))
	
	if(blocksText.equals('Bug 254833 blocks :')){
		assert true
	}
	else{
		assert false
	}
}

if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI_Depends_Blocks/h3_Bug depends on'), 1)){
	
	blocksText = WebUiBuiltInKeywords.getText(findTestObject('Page_BugsUI_Depends_Blocks/h3_Bug depends on'))
	
	if(blocksText.equals('Bug 254833 depends on :')){
		assert true
	}
	else{
		assert false
	}
}

WebUI.delay(3)



