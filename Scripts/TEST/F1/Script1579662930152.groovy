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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://wms-cba-frontend-test.additiv.com/')

WebUI.setText(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/input_Username_username'), 
    'ptbcsbntest1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/input_Password_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/button_Continue'))

WebUI.delay(60)

WebUI.waitForElementPresent(findTestObject('CSrepository3/Page_Wealth Management System - CBA/a_More'), 120)

WebUI.click(findTestObject('CSrepository3/Page_Wealth Management System - CBA/a_More'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.setText(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/input_SMS Security Code (mTAN)_otp0'), 
    '')

not_run: WebUI.setText(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/input_SMS Security Code (mTAN)_otp1'), 
    '')

not_run: WebUI.setText(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/input_SMS Security Code (mTAN)_otp2'), 
    '')

not_run: WebUI.setText(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/input_SMS Security Code (mTAN)_otp3'), 
    '')

not_run: WebUI.setText(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/input_SMS Security Code (mTAN)_otp4'), 
    '')

not_run: WebUI.setText(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/input_SMS Security Code (mTAN)_otp5'), 
    '')

WebUI.closeBrowser()

