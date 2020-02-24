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

Mobile.startApplication('D:\\PROJECT\\1. PTBC\\ZZZ\\Data\\Apps\\APPS\\Apk Test\\app-enc_custumtest-debug.apk', true)

Mobile.delay(0.5)

Mobile.tap(findTestObject('CSrepository1/Practice5/android.widget.TextView0 - Lewati'), 0)

Mobile.delay(0.5)

Mobile.tap(findTestObject('CSrepository1/Practice5/android.widget.EditText0 - Pilih tanggal lahir Anda'), 0)

Mobile.delay(0.5)

for (i = 1; i < 10; i++) {
    Mobile.swipe(312, 1000, 312, 850)
}

Mobile.delay(0.5)

for (i = 2; i < 10; i++) {
    Mobile.swipe(500, 1000, 500, 850)
}

Mobile.delay(0.5)

for (i = 1990; i < 2000; i++) {
    Mobile.swipe(688, 1000, 688, 850)
}

Mobile.delay(0.5)

