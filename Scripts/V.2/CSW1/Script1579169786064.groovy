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

//'Open Apps'
//Mobile.startApplication('D:\\PROJECT\\1. PTBC\\ZZZ\\Data\\Apps\\APPS\\Apk Test\\app-enc_custumtest-debug.apk', false)
Mobile.startExistingApplication('id.co.commbank.wealth', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(0.2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\PROJECT\\1. PTBC\\ZZZ\\Data\\Apps\\Katalon_Studio_Windows_64-7.1.2\\Katalon_Studio_Windows_64-7.1.2\\screenshot\\a.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.delay(0.1, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

//Mobile.takeScreenshot('D:\\PROJECT\\1. PTBC\\ZZZ\\Data\\Apps\\Katalon_Studio_Windows_64-7.1.2\\Katalon_Studio_Windows_64-7.1.2\\screenshot\\a.png', 
//    FailureHandling.STOP_ON_FAILURE)
Mobile.pressBack()

