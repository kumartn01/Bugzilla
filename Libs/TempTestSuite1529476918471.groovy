import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/SmokeTestSuite')

suiteProperties.put('name', 'SmokeTestSuite')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Arista-Bugzila Project\\BugzillaUI-Automation\\Reports\\SmokeTestSuite\\20180620_121158\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/SmokeTestSuite', suiteProperties, [new TestCaseBinding('Test Cases/Login_TestCases/VerifyPresenceOfFields_Links_LoginPage', 'Test Cases/Login_TestCases/VerifyPresenceOfFields_Links_LoginPage',  null), new TestCaseBinding('Test Cases/Login_TestCases/InvalidLoginsCases', 'Test Cases/Login_TestCases/InvalidLoginsCases',  null), new TestCaseBinding('Test Cases/Login_TestCases/ValidSuccessfulLogin', 'Test Cases/Login_TestCases/ValidSuccessfulLogin',  null), new TestCaseBinding('Test Cases/NewBugCreation_TestCases/NewBugPage', 'Test Cases/NewBugCreation_TestCases/NewBugPage',  null), new TestCaseBinding('Test Cases/NewBugCreation_TestCases/ValidateNewBugPageFields', 'Test Cases/NewBugCreation_TestCases/ValidateNewBugPageFields',  null), new TestCaseBinding('Test Cases/NewBugCreation_TestCases/VerifyValidBug_Present_In_Depends_and_Blocks_field', 'Test Cases/NewBugCreation_TestCases/VerifyValidBug_Present_In_Depends_and_Blocks_field',  null), new TestCaseBinding('Test Cases/NewBugCreation_TestCases/NewBugCreation', 'Test Cases/NewBugCreation_TestCases/NewBugCreation',  null), new TestCaseBinding('Test Cases/ProductAdd_TestCases/VerifyProductAddPageLoads', 'Test Cases/ProductAdd_TestCases/VerifyProductAddPageLoads',  null), new TestCaseBinding('Test Cases/ProductAdd_TestCases/VerifyAdditionOfSuccessfulProduct', 'Test Cases/ProductAdd_TestCases/VerifyAdditionOfSuccessfulProduct',  null), new TestCaseBinding('Test Cases/BugPage_GeneralTab_TestCases/VerifyBugInfoFields_CanBe_Edited_Commited', 'Test Cases/BugPage_GeneralTab_TestCases/VerifyBugInfoFields_CanBe_Edited_Commited',  null), new TestCaseBinding('Test Cases/BugPage_GeneralTab_TestCases/VerifyStatusBoxFields_canBe_Edited', 'Test Cases/BugPage_GeneralTab_TestCases/VerifyStatusBoxFields_canBe_Edited',  null), new TestCaseBinding('Test Cases/BugPage_GeneralTab_TestCases/VerifyPeopleBoxFields', 'Test Cases/BugPage_GeneralTab_TestCases/VerifyPeopleBoxFields',  null), new TestCaseBinding('Test Cases/BugPage_GeneralTab_TestCases/VerifyTrackingBoxFields', 'Test Cases/BugPage_GeneralTab_TestCases/VerifyTrackingBoxFields',  null), new TestCaseBinding('Test Cases/BugPage_Description_Comments_TestCases/Verify_User_Reply_Description', 'Test Cases/BugPage_Description_Comments_TestCases/Verify_User_Reply_Description',  null), new TestCaseBinding('Test Cases/Search_TestCases/VerifySearchPageLoads', 'Test Cases/Search_TestCases/VerifySearchPageLoads',  null), new TestCaseBinding('Test Cases/Search_TestCases/Search_With_PackageOnly', 'Test Cases/Search_TestCases/Search_With_PackageOnly',  null), new TestCaseBinding('Test Cases/ProductEdit_TestCases/VerifyProductEditPageLoads', 'Test Cases/ProductEdit_TestCases/VerifyProductEditPageLoads',  null), new TestCaseBinding('Test Cases/ProductEdit_TestCases/VerifyProductCanBeDeleted', 'Test Cases/ProductEdit_TestCases/VerifyProductCanBeDeleted',  null)])
