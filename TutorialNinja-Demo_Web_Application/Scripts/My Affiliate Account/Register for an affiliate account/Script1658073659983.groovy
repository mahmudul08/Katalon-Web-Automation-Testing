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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://tutorialsninja.com/demo/')

WebUI.click(findTestObject('Object Repository/Register for an affiliate account/Page_Your Store/a_My Account'))

WebUI.click(findTestObject('Object Repository/Register for an affiliate account/Page_Your Store/a_Login'))

WebUI.setText(findTestObject('Object Repository/Register for an affiliate account/Page_Account Login/input_E-Mail Address_email'), 
    'noobtester@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Register for an affiliate account/Page_Account Login/input_Password_password'), 
    'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Object Repository/Register for an affiliate account/Page_Account Login/input_Forgotten Password_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/Register for an affiliate account/Page_My Account/a_Register for an affiliate account'))

WebUI.setText(findTestObject('Object Repository/Register for an affiliate account/Page_Your Affiliate Information/input_Company_company'), 
    'SQA')

WebUI.setText(findTestObject('Object Repository/Register for an affiliate account/Page_Your Affiliate Information/input_Web Site_website'), 
    'https://www.google.com')

WebUI.setText(findTestObject('Object Repository/Register for an affiliate account/Page_Your Affiliate Information/input_Tax ID_tax'), 
    '123456789')

WebUI.click(findTestObject('Object Repository/Register for an affiliate account/Page_Your Affiliate Information/input_Bank Transfer_payment'))

WebUI.setText(findTestObject('Object Repository/Register for an affiliate account/Page_Your Affiliate Information/input_Bank Name_bank_name'), 
    'abcd')

WebUI.setText(findTestObject('Object Repository/Register for an affiliate account/Page_Your Affiliate Information/input_ABABSB number (Branch Number)_bank_br_618171'), 
    'ac125')

WebUI.setText(findTestObject('Object Repository/Register for an affiliate account/Page_Your Affiliate Information/input_SWIFT Code_bank_swift_code'), 
    '123456')

WebUI.setText(findTestObject('Object Repository/Register for an affiliate account/Page_Your Affiliate Information/input_Account Name_bank_account_name'), 
    '123456798')

WebUI.setText(findTestObject('Object Repository/Register for an affiliate account/Page_Your Affiliate Information/input_Account Number_bank_account_number'), 
    '1234568790')

WebUI.click(findTestObject('Object Repository/Register for an affiliate account/Page_Your Affiliate Information/input_About Us_agree'))

WebUI.click(findTestObject('Object Repository/Register for an affiliate account/Page_Your Affiliate Information/input_About Us_btn btn-primary'))

WebUI.closeBrowser()
