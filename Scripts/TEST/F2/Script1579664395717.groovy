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

WebUI.setText(findTestObject('Page_Wealth Management System - CBA/input_Username_username'), 'ptbcsbntest1@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Wealth Management System - CBA/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Page_Wealth Management System - CBA/button_Continue'))

WebUI.setText(findTestObject('Page_Wealth Management System - CBA/input_SMS Security Code (mTAN)_otp0'), '2')

WebUI.setText(findTestObject('Page_Wealth Management System - CBA/input_SMS Security Code (mTAN)_otp1'), 'h')

WebUI.setText(findTestObject('Page_Wealth Management System - CBA/input_SMS Security Code (mTAN)_otp2'), '6')

WebUI.setText(findTestObject('Page_Wealth Management System - CBA/input_SMS Security Code (mTAN)_otp3'), 'c')

WebUI.setText(findTestObject('Page_Wealth Management System - CBA/input_SMS Security Code (mTAN)_otp4'), '1')

WebUI.setText(findTestObject('Page_Wealth Management System - CBA/input_SMS Security Code (mTAN)_otp5'), 'k')

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/a'))

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/div_SBN Online'))

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/div_Product List'))

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/button_ORDER'))

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/div_Nominal Order_InputAmount'))

WebUI.setText(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/input_Nominal Order_input-amount'), 
    '1,000,000')

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/div_Choose CASA Account No'))

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/div_2060002218-PTBC Test30'))

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/div_INFORMASI UMUM_src-components-core-Chec_797067'))

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/button_NEXT'))

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/button_NEXT'))

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/button_NEXT'))

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/a_Order SBN Online'))

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/a_Product List'))

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/div_Order Monitoring'))

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/dt_Order Code101T201913100177Status Complet_eadccc'))

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/dt_Order Code101T201913100177Status Complet_eadccc'))

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/dt_Order Code101T201913100177Status Complet_eadccc'))

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/dt_Order Code101T201913100177Status Complet_eadccc'))

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/div_Order Code101T201913100177Status Comple_0e3768'))

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/dt_Order Code101T201913100177Status Complet_eadccc'))

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/div_Order Code101T201913100177Status Comple_0e3768'))

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/div_TEST2019'))

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/a_Order Monitoring'))

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/span_Early Redemption'))

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/a_Early Redemption'))

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/div_Early Redemption'))

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/div_Choose Order Code'))

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/div_101T201913100158 - IDR 10000000'))

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/div_101T201913100158 - IDR 10000000'))

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/div_101T201913100159 - IDR 1000000'))

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/input_Nominal Early Redemption_input-amount'))

WebUI.setText(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/input_Nominal Early Redemption_input-amount'), 
    '100,000')

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/div_INFORMASI UMUM_src-components-core-Chec_797067_1'))

WebUI.doubleClick(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/button_NEXT'))

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/button_Try Again'))

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/div_Choose Order Code'))

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/path'))

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/path'))

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/div_Choose Order Code'))

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/div_101T201913100156 - IDR 500000'))

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/svg'))

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/main_Detail Customer DataCustomer NameCusto_1df1f4'))

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/a_Early Redemption'))

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/a_SBN Online'))

WebUI.click(findTestObject('Object Repository/CSrepository3/Page_Wealth Management System - CBA/a_Advisor'))

WebUI.closeBrowser()

