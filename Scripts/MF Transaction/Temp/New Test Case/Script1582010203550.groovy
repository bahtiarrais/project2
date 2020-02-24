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

Mobile.startExistingApplication('id.co.commbank.wealth')

Mobile.hideKeyboard()

Mobile.setEncryptedText(findTestObject('sampah/android.widget.EditText0'), 'aeHFOx8jV/A=', 0)

Mobile.tap(findTestObject('sampah/android.widget.Button0 - MASUK'), 0)

Mobile.tap(findTestObject('sampah/android.view.View0'), 0)

Mobile.waitForElementPresent(findTestObject('sampah/android.view.View0 (1)'), 0)

Mobile.tap(findTestObject('sampah/android.view.View0 (1)'), 0)

Mobile.waitForElementPresent(findTestObject('sampah/android.view.View0 - Mutual Fund Transaction'), 0)

Mobile.tap(findTestObject('sampah/android.view.View0 - Mutual Fund Transaction'), 0)

Mobile.closeApplication()

