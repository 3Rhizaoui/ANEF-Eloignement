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
import java.awt.Robot;
import java.awt.event.KeyEvent;
import com.google.gson.GsonBuilder
import org.testng.IExecutionListener;
import com.kms.katalon.core.util.KeywordUtil
import org.openqa.selenium.JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.testobject.SelectorMethod


TestObject Span_JeDemandeLaNationaliteFrancaise = findTestObject("null")
WebUI.click(Span_JeDemandeLaNationaliteFrancaise, FailureHandling.OPTIONAL)
WebUI.click(Span_JeDemandeLaNationaliteFrancaise, FailureHandling.OPTIONAL)
WebUI.delay(2)

'Fermer la PopUp Condition d’accès au service en ligne'
Robot r = new Robot();
r.keyPress(KeyEvent.VK_ESCAPE);
r.keyRelease(KeyEvent.VK_ESCAPE);

def verifyElementPresent = WebUI.verifyElementPresent(findTestObject("null"), 2, FailureHandling.OPTIONAL)
if (verifyElementPresent) {
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)}
else if (EnvExec == 'URL_ANEFQualif') {
	TestObject CheckBox_IndiquerVotreSouhait = findTestObject("null")
	//Change selection method from another selector to CSS selector
	CheckBox_IndiquerVotreSouhait.setSelectorMethod(SelectorMethod.CSS)
	//CustomKeywords.'tools.ShadowDom.clickUsingJS'(CheckBox_IndiquerVotreSouhait)
	WebUI.enhancedClick(CheckBox_IndiquerVotreSouhait)
	TestObject CheckBox_JeSuisDansAutreSituation = findTestObject("null")
	//CustomKeywords.'tools.ShadowDom.clickUsingJS'(CheckBox_JeSuisDansAutreSituation)
	WebUI.enhancedClick(CheckBox_JeSuisDansAutreSituation)
	TestObject CheckBox_JeSouhaiteDeposerUneDemandeParDecret = findTestObject("null")
	WebUI.enhancedClick(CheckBox_JeSouhaiteDeposerUneDemandeParDecret)
	//CustomKeywords.'tools.ShadowDom.clickUsingJS'(CheckBox_JeSouhaiteDeposerUneDemandeParDecret)
	TestObject Btn_JeContinue = findTestObject("null")
	//CustomKeywords.'tools.ShadowDom.clickUsingJS'(Btn_JeContinue)
	WebUI.enhancedClick(Btn_JeContinue)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
}
else {
	TestObject CheckBox_JeSouhaiteDeposerUneDemandeParDecret = findTestObject("null")
	//Change selection method from another selector to CSS selector
	CheckBox_JeSouhaiteDeposerUneDemandeParDecret.setSelectorMethod(SelectorMethod.CSS)
	//CustomKeywords.'tools.ShadowDom.clickUsingJS'(CheckBox_JeSouhaiteDeposerUneDemandeParDecret)
	WebUI.enhancedClick(CheckBox_JeSouhaiteDeposerUneDemandeParDecret)
	TestObject Btn_JeContinue = findTestObject("null")
	//Change selection method from another selector to CSS selector
	Btn_JeContinue.setSelectorMethod(SelectorMethod.CSS)
	//CustomKeywords.'tools.ShadowDom.clickUsingJS'(Btn_JeContinue)
	WebUI.enhancedClick(Btn_JeContinue)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
}