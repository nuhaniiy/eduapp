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

Mobile.tap(findTestObject('Samsung Shop/Galaxy Z - Menu'), 0)

Mobile.tap(findTestObject('Samsung Shop/Z Fold 6 - Menu'), 0)

Mobile.scrollToText('Do you have a device to trade-in?')

Mobile.tap(findTestObject('Samsung Shop/Tradein type Device boldNobold'), 0)

Mobile.scrollToText('No coverage')

Mobile.tap(findTestObject('Samsung Shop/No coverage - Button'), 0)

Mobile.scrollToText('Log in now to earn up to 1.5% back in Samsung Rewards Points')

Mobile.tap(findTestObject('Samsung Shop/Continue - Button'), 0)

Mobile.scrollToText('Skip add-ons')

Mobile.tap(findTestObject('Samsung Shop/Skip add-ons - Button'), 0)

Mobile.closeApplication()

