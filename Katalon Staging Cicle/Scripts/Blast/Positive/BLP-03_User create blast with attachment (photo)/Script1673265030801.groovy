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

WebUI.navigateToUrl(GlobalVariable.Base_Url)

WebUI.click(findTestObject('Group Chat/Choose team'))

WebUI.click(findTestObject('Blast/Click blast box menu'))

WebUI.click(findTestObject('Blast/Click create blast button'))

WebUI.setText(findTestObject('Blast/Type title'), 'Ini title')

WebUI.click(findTestObject('Blast/Click insert files'))

WebUI.uploadFile(findTestObject('Blast/Send attachment (photo)'), 'C:\\Users\\62812\\OneDrive\\Pictures\\Photo1.png')

WebUI.click(findTestObject('Blast/Click insert button'))

WebUI.delay(2)

WebUI.click(findTestObject('Blast/Click publish button'))

WebUI.click(findTestObject('Blast/Choose blast (photo)'))

WebUI.verifyElementVisible(findTestObject('Blast/Photo element'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

