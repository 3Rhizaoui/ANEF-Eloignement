package tools

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.remote.RemoteWebDriver as RemoteWebDriver
import org.openqa.selenium.remote.RemoteWebElement as RemoteWebElement
import org.openqa.selenium.JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.common.WebUiCommonHelper
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
import org.openqa.selenium.By
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.util.Locale;
import java.text.SimpleDateFormat
import java.text.ParseException;

public class ExecuteActions {

	@Keyword
	public  ClickObject (String xpathObject) {
		TestObject objectName = new TestObject('objectName')
		println xpathObject
		objectName.addProperty('xpath', ConditionType.EQUALS, xpathObject)
		//WebUI.scrollToElement(objectName,3)
		WebUI.click(objectName)
	}

	@Keyword
	public  SetTextObjectIndice (String xpathObject, String Text, Integer Indice) {
		TestObject objectName = new TestObject('objectName')
		println xpathObject
		objectName.addProperty('xpath', ConditionType.EQUALS, xpathObject)
		//WebUI.scrollToElement(objectName,3)
		WebUI.setText(objectName, Text + Indice)
	}

	@Keyword
	public  SetTextObject (String xpathObject, String Text) {
		TestObject objectName = new TestObject('objectName')
		println xpathObject
		objectName.addProperty('xpath', ConditionType.EQUALS, xpathObject)
		//WebUI.scrollToElement(objectName,3)
		WebUI.setText(objectName, Text)
	}

	@Keyword
	public  clearTextObject (String xpathObject) {
		TestObject objectName = new TestObject('objectName')
		println xpathObject
		objectName.addProperty('xpath', ConditionType.EQUALS, xpathObject)
		WebUI.clearText(objectName)
	}

	@Keyword
	public  AddSimpleDateFormat  (String startDate, Integer NbJours) {
		SimpleDateFormat currentDate = new SimpleDateFormat("dd/MM/yyyy");
		Date startDateAsDate=currentDate.parse(startDate);
		Calendar c = Calendar.getInstance();
		c.setTime(currentDate.parse(startDate));
		c.add(Calendar.DATE, NbJours);
		// number of days to add, 30 days in this case
		String outputDate= currentDate.format(c.getTime()).toString();
		println "Notre outputDate = " + outputDate;
		return outputDate;
	}

	@Keyword
	public  SetValueObjectJs (String xpathObject, String Value) {
		WebDriver driver = DriverFactory.getWebDriver()
		WebElement element = driver.findElement(By.xpath(xpathObject));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		//executor.executeScript("arguments[0].click();", element);
		executor.executeScript("arguments[0].value = Value ;", element);
	}

	@Keyword
	public  ClickObjectJs (String xpathObject) {
		WebDriver driver = DriverFactory.getWebDriver()
		WebElement element = driver.findElement(By.xpath(xpathObject));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}
}
