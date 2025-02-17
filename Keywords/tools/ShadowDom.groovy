package tools

import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.By.ByCssSelector
import com.github.kklisura.cdt.protocol.commands.Emulation as Emulation
import com.github.kklisura.cdt.protocol.commands.Page as Page
import com.github.kklisura.cdt.protocol.commands.Network as Network
import com.github.kklisura.cdt.protocol.commands.Log as Log
import com.github.kklisura.cdt.protocol.commands.Overlay as Overlay
import com.github.kklisura.cdt.protocol.commands.DOM as DOM
import com.github.kklisura.cdt.protocol.types.dom.PerformSearch
import com.github.kklisura.cdt.protocol.types.dom.RGBA
import com.github.kklisura.cdt.protocol.types.network.ErrorReason as ErrorReason
import com.github.kklisura.cdt.protocol.types.network.RequestPattern as RequestPattern
import com.github.kklisura.cdt.protocol.types.overlay.HighlightConfig
import com.github.kklisura.cdt.protocol.types.page.CaptureScreenshotFormat as CaptureScreenshotFormat
import com.github.kklisura.cdt.services.ChromeDevToolsService as ChromeDevToolsService
import com.github.kklisura.cdt.protocol.events.network.DataReceived as DataReceived
import com.katalon.cdp.CdpUtils as CdpUtils
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import java.awt.Color
import java.awt.Rectangle
import groovy.json.JsonOutput as JsonOutput
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.Cookie
import org.apache.commons.lang3.StringUtils
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URI;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import org.openqa.selenium.WebDriver as WebDriverimport
import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.util.component.LifeCycle;
import org.eclipse.jetty.util.ssl.SslContextFactory;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketClose;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketConnect;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketError;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketMessage;
import org.eclipse.jetty.websocket.api.annotations.WebSocket;
import org.eclipse.jetty.websocket.client.ClientUpgradeRequest;
import org.eclipse.jetty.websocket.client.WebSocketClient;
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities
import java.time.format.DateTimeFormatter
import com.github.kklisura.cdt.protocol.commands.Runtime
import com.github.kklisura.cdt.protocol.events.runtime.ConsoleAPICalled
import com.github.kklisura.cdt.protocol.events.runtime.ConsoleAPICalledType
import com.github.kklisura.cdt.protocol.types.runtime.RemoteObject
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import org.testng.IExecutionListener;
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import org.openqa.selenium.Keys as Keys
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class ShadowDom {

	@Keyword

	def clickUsingJS(TestObject to) {

		WebDriver driver = DriverFactory.getWebDriver()
		WebElement element = WebUiCommonHelper.findWebElement(to,2)
		//JavascriptExecutor executor = ((driver) as JavascriptExecutor)
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript('arguments[0].click()', element)}

	@Keyword

	def sendKeysUsingString(TestObject to, String txt) {

		String [] MaList = txt.split('')
		println "MaList : " + MaList
		println "MaList.length : " + MaList.length
		for (def i = 1; i <= MaList.length; i++) {
			switch (MaList[(i-1)]) {
				case '0':
					WebUI.sendKeys(to, Keys.chord(Keys.NUMPAD0))
					break
				case '1':
					WebUI.sendKeys(to, Keys.chord(Keys.NUMPAD1))
					break
				case '2':
					WebUI.sendKeys(to, Keys.chord(Keys.NUMPAD2))
					break
				case '3':
					WebUI.sendKeys(to, Keys.chord(Keys.NUMPAD3))
					break
				case '4':
					WebUI.sendKeys(to, Keys.chord(Keys.NUMPAD4))
					break
				case '5':
					WebUI.sendKeys(to, Keys.chord(Keys.NUMPAD5))
					break
				case '6':
					WebUI.sendKeys(to, Keys.chord(Keys.NUMPAD6))
					break
				case '7':
					WebUI.sendKeys(to, Keys.chord(Keys.NUMPAD7))
					break
				case '8':
					WebUI.sendKeys(to, Keys.chord(Keys.NUMPAD8))
					break
				case '9':
					WebUI.sendKeys(to, Keys.chord(Keys.NUMPAD9))
				default:
					break
			}
		}
	}

	@Keyword

	def SetTextUsingJS(TestObject to, String text) {

		WebDriver driver = DriverFactory.getWebDriver()
		WebElement element = WebUiCommonHelper.findWebElement(to,2)
		//JavascriptExecutor executor = ((driver) as JavascriptExecutor)
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].value=" + text, element)
		//executor.executeScript ('arguments[0].setAttribute("class","form-control sized-input ng-valid ng-touched ng-dirty")', element)
	}
	//executor.executeScript('arguments[0].click()', element)}


	@Keyword
	def clickDomElement(String JSPath) {
		WebDriver driver = DriverFactory.getWebDriver();
		JavascriptExecutor jsExecutor = ((JavascriptExecutor) driver)

		WebElement elementLocator = ((jsExecutor.executeScript("return " + JSPath) as WebElement))

		if (elementLocator.isDisplayed() && elementLocator.isEnabled()) {
			WebUI.delay(3)
			elementLocator.click()
			KeywordUtil.markPassed("---> Element is clicked successfully")
		}
		else {
			KeywordUtil.markFailedAndStop("---> Element is not clicked successfully")
		}
	}
}


