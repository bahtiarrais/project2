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

Mobile.setEncryptedText(findTestObject('1.Fundlist/Input - Passcode'), 'aeHFOx8jV/A=', 0)

Mobile.tap(findTestObject('1.Fundlist/Button - Masuk'), 0)

Mobile.waitForElementPresent(findTestObject('4. Autoinvest/Logo - More'), 0)

Mobile.tap(findTestObject('4. Autoinvest/Logo - More'), 0)

Mobile.waitForElementPresent(findTestObject('4. Autoinvest/More All'), 0)

'Tap Autoinvest'
Mobile.tapAtPosition(200, 500)

Mobile.waitForElementPresent(findTestObject('4. Autoinvest/Header - Auto Invest'), 0)

Mobile.scrollToText('Batavia Dana Kas Maxima', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('4. Autoinvest/Button - CANCEL'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tap(findTestObject(null), 0)

Mobile.closeApplication()

