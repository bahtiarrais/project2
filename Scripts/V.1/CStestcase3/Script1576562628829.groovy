import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

'Path of the Apk File Store in path variable'
def path = com.kms.katalon.core.configuration.RunConfiguration.getProjectDir() + '/Data Files/app-enc_custumtest-debug.apk'

'Start the application'
Mobile.startApplication(path, true)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CSrepository1/1. SP1/SP1.Button0 - Button Lanjut'), 0)

Mobile.tap(findTestObject('CSrepository1/2. SP2/SP2.Button0 - Button Lanjut'), 0)

Mobile.tap(findTestObject('CSrepository1/3. SP3/SP3.Button0 - Button Lanjut'), 0)

Mobile.setText(findTestObject('CSrepository1/4. SR/SR.EditText0 - Input No Telp'), '817162338', 0)

Mobile.tap(findTestObject('null'), 0)

'Wait for element Present of Heading API Demos'
Mobile.waitForElementPresent(findTestObject('null'), 45)

Mobile.tapAndHold(findTestObject('null'), 10, 10)

'Scroll to Views text'
Mobile.scrollToText('10', FailureHandling.STOP_ON_FAILURE)

'Tap on Views'
Mobile.tap(findTestObject('CSrepository1/4. SR/10'), 20)

'Scroll to Tabs text'
Mobile.scrollToText('Jan', FailureHandling.STOP_ON_FAILURE)

'Close the Application'
Mobile.closeApplication()

