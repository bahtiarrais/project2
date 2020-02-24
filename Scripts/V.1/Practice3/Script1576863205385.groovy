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
import com.katalon.plugin.keyword.calendar.SetDateCalendarKeyword as SetDateCalendarKeyword
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

Mobile.startApplication('D:\\PROJECT\\1. PTBC\\ZZZ\\Data\\Apps\\APPS\\Apk Test\\app-enc_custumtest-debug.apk', true)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CSrepository1/1. SP1/SP1.TextView0 - Button Lewati'), 0)

Mobile.setText(findTestObject('CSrepository1/4. SR/SR.EditText0 - Input No Telp'), '817162338', 0)

not_run: Mobile.tap(findTestObject('CSrepository1/4. SR/SR.EditText0 - Select DoB'), 0)

def value1 = CustomKeywords. 'com.kms.katalon.core.annotation.Keyword'
def value2 = CustomKeywords.'com.kms.katalon.keyword.datetime.DateTimeUtility.getCurrentdate'()


