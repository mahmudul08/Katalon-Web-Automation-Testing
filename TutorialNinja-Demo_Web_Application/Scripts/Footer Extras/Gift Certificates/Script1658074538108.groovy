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

WebUI.click(findTestObject('Object Repository/Gift Certificates/Page_Your Store/a_Gift Certificates'))

WebUI.setText(findTestObject('Object Repository/Gift Certificates/Page_Purchase a Gift Certificate/input_concat(Recipient, , s Name)_to_name'), 
    'Noob')

WebUI.setText(findTestObject('Object Repository/Gift Certificates/Page_Purchase a Gift Certificate/input_concat(Recipient, , s e-mail)_to_email'), 
    'test@gmail.com')

WebUI.setText(findTestObject('Object Repository/Gift Certificates/Page_Purchase a Gift Certificate/input_Your Name_from_name'), 
    'noobtester@gmail.com')

WebUI.click(findTestObject('Object Repository/Gift Certificates/Page_Purchase a Gift Certificate/input_Your e-mail_from_email'))

WebUI.click(findTestObject('Object Repository/Gift Certificates/Page_Purchase a Gift Certificate/input_Your Name_from_name'))

WebUI.setText(findTestObject('Object Repository/Gift Certificates/Page_Purchase a Gift Certificate/input_Your e-mail_from_email'), 
    'noobtester@gmail.com')

WebUI.click(findTestObject('Object Repository/Gift Certificates/Page_Purchase a Gift Certificate/input_Birthday_voucher_theme_id'))

WebUI.setText(findTestObject('Object Repository/Gift Certificates/Page_Purchase a Gift Certificate/textarea_Message_message'), 
    'Happy Birthday')

WebUI.click(findTestObject('Object Repository/Gift Certificates/Page_Purchase a Gift Certificate/input_I understand that gift certificates a_cdd828'))

WebUI.click(findTestObject('Object Repository/Gift Certificates/Page_Purchase a Gift Certificate/input_I understand that gift certificates a_5317cb'))

WebUI.closeBrowser()

