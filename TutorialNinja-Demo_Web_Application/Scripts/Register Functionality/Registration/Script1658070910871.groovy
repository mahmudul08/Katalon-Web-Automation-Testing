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

WebUI.click(findTestObject('Object Repository/Registration/Page_Your Store/span_My Account'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Your Store/a_Register'))

WebUI.setText(findTestObject('Object Repository/Registration/Page_Register Account/input_First Name_firstname'), 'Noob')

WebUI.setText(findTestObject('Object Repository/Registration/Page_Register Account/input_Last Name_lastname'), 'Tester')

WebUI.setText(findTestObject('Object Repository/Registration/Page_Register Account/input_E-Mail_email'), 'noobtester@gmail.com')

WebUI.setText(findTestObject('Object Repository/Registration/Page_Register Account/input_Telephone_telephone'), '01365478925')

WebUI.setEncryptedText(findTestObject('Object Repository/Registration/Page_Register Account/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.setEncryptedText(findTestObject('Object Repository/Registration/Page_Register Account/input_Password Confirm_confirm'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Registration/Page_Register Account/input_Privacy Policy_agree'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Register Account/input_Privacy Policy_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Your Account Has Been Created/a_Continue'))

WebUI.closeBrowser()

