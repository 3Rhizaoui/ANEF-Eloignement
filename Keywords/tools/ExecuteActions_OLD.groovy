package tools

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords

public class ExecuteActions_OLD {

	@Keyword
	public  ClickObject (String xpathObject) {
		TestObject objectName = new TestObject('objectName')
		println xpathObject
		objectName.addProperty('xpath', ConditionType.EQUALS, xpathObject)
		//WebUI.scrollToElement(objectName,3)
		WebUI.click(objectName)}

	@Keyword
	public  SetTextObjectIndice (String xpathObject, String Text, Integer Indice) {
		TestObject objectName = new TestObject('objectName')
		println xpathObject
		objectName.addProperty('xpath', ConditionType.EQUALS, xpathObject)
		//WebUI.scrollToElement(objectName,3)
		WebUI.setText(objectName, Text + Indice)}

	@Keyword
	public  SetTextObject (String xpathObject, String Text) {
		TestObject objectName = new TestObject('objectName')
		println xpathObject
		objectName.addProperty('xpath', ConditionType.EQUALS, xpathObject)
		//WebUI.scrollToElement(objectName,3)
		WebUI.setText(objectName, Text)}
}
