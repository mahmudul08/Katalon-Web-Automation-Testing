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

WebUI.click(findTestObject('Object Repository/Tester/Page_Your Store/a_Returns'))

WebUI.setText(findTestObject('Object Repository/Tester/Page_Product Returns/input_First Name_firstname'), 'Noob ')

WebUI.setText(findTestObject('Object Repository/Tester/Page_Product Returns/input_Last Name_lastname'), 'Tester')

WebUI.setText(findTestObject('Object Repository/Tester/Page_Product Returns/input_E-Mail_email'), 'noobtester')

WebUI.setText(findTestObject('Object Repository/Tester/Page_Product Returns/input_Telephone_telephone'), '123456789')

WebUI.setText(findTestObject('Object Repository/Tester/Page_Product Returns/input_Order ID_order_id'), '123')

WebUI.click(findTestObject('Object Repository/Tester/Page_Product Returns/i_Order Date_fa fa-calendar'))

WebUI.click(findTestObject('Object Repository/Tester/Page_Product Returns/td_26'))

WebUI.setText(findTestObject('Object Repository/Tester/Page_Product Returns/input_Order ID_order_id'), '123')

WebUI.setText(findTestObject('Object Repository/Tester/Page_Product Returns/input_Product Name_product'), 'macs')

WebUI.setText(findTestObject('Object Repository/Tester/Page_Product Returns/input_Product Code_model'), '0123')

WebUI.click(findTestObject('Object Repository/Tester/Page_Product Returns/label_Dead On Arrival'))

WebUI.setText(findTestObject('Object Repository/Tester/Page_Product Returns/textarea_Faulty or other details_comment'), 
    'no')

WebUI.click(findTestObject('Object Repository/Tester/Page_Product Returns/input_Back_btn btn-primary'))

WebUI.setText(findTestObject('Object Repository/Tester/Page_Product Returns/input_E-Mail_email'), 'noobtester@gmail.com')

WebUI.click(findTestObject('Object Repository/Tester/Page_Product Returns/input_Back_btn btn-primary'))

WebUI.closeBrowser()

