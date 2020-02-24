import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import com.detroitlabs.katalonmobileutil.testobject.TextField


'Path of the Apk File Store in path variable'
def path = com.kms.katalon.core.configuration.RunConfiguration.getProjectDir() + '/Data Files/app-enc_custumtest-debug.apk'

'Start the application'
Mobile.startApplication(path, true)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CSrepository1/1. SP1/SP1.TextView0 - Button Lewati'), 0)

Mobile.setText(findTestObject('CSrepository1/4. SR/SR.EditText0 - Input No Telp'), '817162338', 0)

Mobile.tap(findTestObject('CSrepository1/4. SR/SR.EditText0 - Select DoB'), 0, FailureHandling.STOP_ON_FAILURE)

'Wait for element Present of Heading API Demos'
Mobile.waitForElementPresent(findTestObject('CSrepository1/PracticeR/android.widget.NumberPicker0 - TGL'), 1)

'Scroll to Views text'
Mobile.scrollToText('20', FailureHandling.STOP_ON_FAILURE)

'Wait for element Present of Heading API Demos'
Mobile.waitForElementPresent(findTestObject('CSrepository1/PracticeR/android.widget.NumberPicker0 - BLN'), 1)

'Scroll to Views text'
Mobile.scrollToText('Jul', FailureHandling.STOP_ON_FAILURE)

'Wait for element Present of Heading API Demos'
Mobile.waitForElementPresent(findTestObject('CSrepository1/PracticeR/android.widget.NumberPicker0 - THN'), 1)

'Scroll to Views text'
Mobile.scrollToText('2000', FailureHandling.STOP_ON_FAILURE)

'Tap on Views'
not_run: Mobile.tap(findTestObject('CSrepository1/PracticeR/android.widget.TextView0 - Views'), 20)

'Scroll to Tabs text'
not_run: Mobile.scrollToText('Tabs', FailureHandling.STOP_ON_FAILURE)

