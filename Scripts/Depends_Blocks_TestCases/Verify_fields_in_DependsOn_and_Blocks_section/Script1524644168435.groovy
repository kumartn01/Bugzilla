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

WebUI.verifyElementPresent(findTestObject('Page_BugsUI_Depends_Blocks/dependsOn_deleteButton'), 1)

WebUI.verifyElementPresent(findTestObject('Page_BugsUI_Depends_Blocks/dependsOn_ID'), 1)

WebUI.verifyElementPresent(findTestObject('Page_BugsUI_Depends_Blocks/dependsOn_Priority'), 1)

WebUI.verifyElementPresent(findTestObject('Page_BugsUI_Depends_Blocks/dependsOn_Summary'), 1)

WebUI.verifyElementPresent(findTestObject('Page_BugsUI_Depends_Blocks/dependsOn_Assigned To'), 1)

WebUI.verifyElementPresent(findTestObject('Page_BugsUI_Depends_Blocks/dependOn_Status'), 1)

WebUI.verifyElementPresent(findTestObject('Page_BugsUI_Depends_Blocks/div_dependsOnBug1'), 1)

WebUI.verifyElementPresent(findTestObject('Page_BugsUI_Depends_Blocks/dependsOn_Add_button'), 1)


//Blocks Section verification

WebUI.verifyElementPresent(findTestObject('Page_BugsUI_Depends_Blocks/blocks_deleteButton'), 1)

WebUI.verifyElementPresent(findTestObject('Page_BugsUI_Depends_Blocks/blocks_ID'), 1)

WebUI.verifyElementPresent(findTestObject('Page_BugsUI_Depends_Blocks/blocks_Priority'), 1)

WebUI.verifyElementPresent(findTestObject('Page_BugsUI_Depends_Blocks/blocks_Summary'), 1)

WebUI.verifyElementPresent(findTestObject('Page_BugsUI_Depends_Blocks/blocks_Assigned To'), 1)

WebUI.verifyElementPresent(findTestObject('Page_BugsUI_Depends_Blocks/blocks_Status'), 1)

WebUI.verifyElementPresent(findTestObject('Page_BugsUI_Depends_Blocks/div_blockedBug1'), 1)

WebUI.verifyElementPresent(findTestObject('Page_BugsUI_Depends_Blocks/blocks_Add_button'), 1)

