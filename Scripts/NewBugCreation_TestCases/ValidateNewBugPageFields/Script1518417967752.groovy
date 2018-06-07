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


//WebUI.verifyElementPresent(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageLabels/span_Est.Hours'),0)

WebUI.verifyElementText(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageLabels/span_Est.Hours'), 'Est.Hours :')

WebUI.verifyElementPresent(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageFields/input_EstimatedHrs'), 0)

WebUI.verifyElementText(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageLabels/span_Cc'),'Cc :')

WebUI.verifyElementPresent(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageFields/input_CC'), 0)

WebUI.verifyElementText(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageLabels/span_Assign To'),'Assign To : *')

WebUI.verifyElementPresent(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageFields/input_AssignTo'), 0)

WebUI.verifyElementText(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageLabels/span_Reporter'),'Reporter : *')

WebUI.verifyElementPresent(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageFields/input_Reporter'), 0)

WebUI.verifyElementText(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageLabels/span_Priority'),'Priority :')

WebUI.verifyElementPresent(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageFields/select-Priority'), 0)

WebUI.verifyElementText(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageLabels/span_Platform'),'Platform :')

WebUI.verifyElementPresent(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageFields/select_platform'), 0)

WebUI.verifyElementText(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageLabels/span_Build'),'Build :')

WebUI.verifyElementPresent(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageFields/input_Build'), 0)

WebUI.verifyElementText(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageLabels/span_Severity'),'Severity :')

WebUI.verifyElementPresent(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageFields/select_Severity'), 0)

WebUI.verifyElementText(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageLabels/span_Version'),'Version :')

WebUI.verifyElementPresent(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageFields/select_Version'), 0)

WebUI.verifyElementText(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageLabels/span_Component'),'Component :')

WebUI.verifyElementPresent(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageFields/select-Component'), 0)

WebUI.verifyElementText(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageLabels/span_Status'),'Status :')

//WebUI.verifyElementPresent(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageFields/input_EstimatedHrs'), 0)

WebUI.verifyElementText(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageFields/Mandatory-Mark'),'*')

WebUI.verifyElementText(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageLabels/span_Summary'),'Summary : *')

WebUI.verifyElementPresent(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageFields/input_Summary'), 0)

WebUI.verifyElementText(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageLabels/span_Description'),'Description :')

WebUI.verifyElementPresent(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageFields/input_EstimatedHrs'), 0)

WebUI.verifyElementText(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageLabels/span_Depends on'),'Depends on :')

WebUI.verifyElementPresent(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageFields/input_EstimatedHrs'), 0)

WebUI.verifyElementText(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageLabels/span_Blocks'),'Blocks :')

WebUI.verifyElementPresent(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageFields/input_EstimatedHrs'), 0)

WebUI.verifyElementPresent(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageFields/button_Commit'),0)

//WebUI.verifyElementPresent(findTestObject('ValidateNewBugPageFieldsObjects/NewBugPageMessages/small_Summary is required'))

//WebUI.closeBrowser()

