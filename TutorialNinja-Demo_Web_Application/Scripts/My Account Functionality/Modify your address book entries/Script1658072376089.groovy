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

WebUI.click(findTestObject('Object Repository/Modify your address book entries/Page_Your Store/i_US Dollar_fa fa-user'))

WebUI.click(findTestObject('Object Repository/Modify your address book entries/Page_Your Store/a_Login'))

WebUI.setText(findTestObject('Object Repository/Modify your address book entries/Page_Account Login/input_E-Mail Address_email'), 
    'noobtester@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Modify your address book entries/Page_Account Login/input_Password_password'), 
    'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Object Repository/Modify your address book entries/Page_Account Login/input_Forgotten Password_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/Modify your address book entries/Page_My Account/a_Modify your address book entries'))

WebUI.click(findTestObject('Object Repository/Modify your address book entries/Page_Address Book/a_New Address'))

WebUI.setText(findTestObject('Object Repository/Modify your address book entries/Page_Address Book/input_First Name_firstname'), 
    'Noob')

WebUI.setText(findTestObject('Object Repository/Modify your address book entries/Page_Address Book/input_Last Name_lastname'), 
    'Tester')

WebUI.setText(findTestObject('Object Repository/Modify your address book entries/Page_Address Book/input_Company_company'), 
    'SQA')

WebUI.setText(findTestObject('Object Repository/Modify your address book entries/Page_Address Book/input_Address 1_address_1'), 
    'World')

WebUI.setText(findTestObject('Object Repository/Modify your address book entries/Page_Address Book/input_Address 2_address_2'), 
    'World2')

WebUI.setText(findTestObject('Object Repository/Modify your address book entries/Page_Address Book/input_City_city'), 'bogura')

WebUI.setText(findTestObject('Object Repository/Modify your address book entries/Page_Address Book/input_Post Code_postcode'), 
    '123456')

WebUI.selectOptionByValue(findTestObject('Object Repository/Modify your address book entries/Page_Address Book/select_--- Please Select ---               _80ffb3'), 
    '18', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Modify your address book entries/Page_Address Book/select_--- Please Select --- BarisalChittag_f13a22'), 
    '324', true)

WebUI.click(findTestObject('Object Repository/Modify your address book entries/Page_Address Book/input_Back_btn btn-primary'))

WebUI.closeBrowser()

