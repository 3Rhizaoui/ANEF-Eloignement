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
import com.github.kklisura.cdt.protocol.commands.Fetch as Fetch
import com.github.kklisura.cdt.protocol.commands.Page as Page
import com.github.kklisura.cdt.services.ChromeDevToolsService as ChromeDevToolsService
import com.github.kklisura.cdt.launch.ChromeLauncher as ChromeLauncher
import com.github.kklisura.cdt.protocol.commands.Network as Network
import com.github.kklisura.cdt.services.ChromeService as ChromeService
import com.github.kklisura.cdt.services.types.ChromeTab as ChromeTab
import com.katalon.cdp.CdpUtils as CdpUtils
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.annotation.BeforeTestCase as BeforeTestCase
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.firefox.FirefoxOptions as FirefoxOptions
import org.openqa.selenium.firefox.FirefoxProfile as FirefoxProfile
import org.openqa.selenium.firefox.ProfilesIni as ProfilesIni
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.driver.WebUIDriverType as WebUIDriverType
import java.io.File as File
import java.io.IOException as IOException
import java.io.PrintStream as PrintStream
import java.net.ConnectException as ConnectException
import java.net.InetSocketAddress as InetSocketAddress
import java.net.MalformedURLException as MalformedURLException
import java.net.Proxy as Proxy
import java.net.Socket as Socket
import java.net.URISyntaxException as URISyntaxException
import java.net.URL as URL
import java.security.GeneralSecurityException as GeneralSecurityException
import java.text.MessageFormat as MessageFormat
import java.util.HashMap as HashMap
import java.util.Map as Map
import java.util.Optional as Optional
import java.util.Set as Set
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import java.util.concurrent.TimeUnit as TimeUnit
import org.apache.commons.lang.exception.ExceptionUtils as ExceptionUtils
import org.apache.commons.lang3.StringUtils as StringUtils
import org.openqa.selenium.Alert as Alert
import org.openqa.selenium.BuildInfo as BuildInfo
import org.openqa.selenium.Capabilities as Capabilities
import org.openqa.selenium.NoAlertPresentException as NoAlertPresentException
import org.openqa.selenium.NoSuchWindowException as NoSuchWindowException
import org.openqa.selenium.WebDriver.Timeouts as Timeouts
import org.openqa.selenium.WebDriverException as WebDriverException
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.openqa.selenium.edge.EdgeDriver as EdgeDriver
import org.openqa.selenium.edge.EdgeDriverService as EdgeDriverService
import org.openqa.selenium.firefox.GeckoDriverService as GeckoDriverService
import org.openqa.selenium.ie.InternetExplorerDriver as InternetExplorerDriver
import org.openqa.selenium.ie.InternetExplorerDriverLogLevel as InternetExplorerDriverLogLevel
import org.openqa.selenium.ie.InternetExplorerDriverService as InternetExplorerDriverService
import org.openqa.selenium.ie.InternetExplorerOptions as InternetExplorerOptions
import org.openqa.selenium.net.NetworkUtils as NetworkUtils
import org.openqa.selenium.remote.CapabilityType as CapabilityType
import org.openqa.selenium.remote.CommandExecutor as CommandExecutor
import org.openqa.selenium.remote.CommandInfo as CommandInfo
import org.openqa.selenium.remote.DesiredCapabilities as DesiredCapabilities
import org.openqa.selenium.remote.HttpCommandExecutor as HttpCommandExecutor
import org.openqa.selenium.remote.RemoteWebDriver as RemoteWebDriver
import org.openqa.selenium.remote.SessionId as SessionId
import org.openqa.selenium.remote.UnreachableBrowserException as UnreachableBrowserException
import org.openqa.selenium.remote.http.HttpClient.Factory as Factory
import org.openqa.selenium.remote.internal.OkHttpClient as OkHttpClient
import org.openqa.selenium.safari.SafariDriver as SafariDriver
import org.openqa.selenium.support.events.EventFiringWebDriver as EventFiringWebDriver
import com.kms.katalon.core.appium.driver.SwipeableAndroidDriver as SwipeableAndroidDriver
import com.kms.katalon.core.appium.exception.AppiumStartException as AppiumStartException
import com.kms.katalon.core.appium.exception.MobileDriverInitializeException as MobileDriverInitializeException
import com.kms.katalon.core.driver.IDriverType as DriverType
import com.kms.katalon.core.event.EventBusSingleton as EventBusSingleton
import com.kms.katalon.core.event.TestingEvent as TestingEvent
import com.kms.katalon.core.event.TestingEventType as TestingEventType
import com.kms.katalon.core.exception.StepFailedException as StepFailedException
import com.kms.katalon.core.logging.LogLevel as LogLevel
import com.kms.katalon.core.network.ProxyInformation as ProxyInformation
import com.kms.katalon.core.network.ProxyOption as ProxyOption
import com.kms.katalon.core.util.internal.JsonUtil as JsonUtil
import com.kms.katalon.core.util.internal.ProxyUtil as ProxyUtil
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.constants.CoreWebuiMessageConstants as CoreWebuiMessageConstants
import com.kms.katalon.core.webui.constants.StringConstants as StringConstants
import com.kms.katalon.core.webui.driver.firefox.CFirefoxDriver47 as CFirefoxDriver47
import com.kms.katalon.core.webui.driver.firefox.CGeckoDriver as CGeckoDriver
import com.kms.katalon.core.webui.driver.ie.InternetExploreDriverServiceBuilder as InternetExploreDriverServiceBuilder
import com.kms.katalon.core.webui.exception.BrowserNotOpenedException as BrowserNotOpenedException
import com.kms.katalon.core.webui.util.FileExcutableUtil as FileExcutableUtil
import com.kms.katalon.core.webui.util.FileUtil as FileUtil
import com.kms.katalon.core.webui.util.FirefoxExecutable as FirefoxExecutable
import com.kms.katalon.core.webui.util.OSUtil as OSUtil
import com.kms.katalon.core.webui.util.WebDriverPropertyUtil as WebDriverPropertyUtil
import com.kms.katalon.core.webui.util.WebDriverProxyUtil as WebDriverProxyUtil
import com.kms.katalon.selenium.driver.CChromeDriver as CChromeDriver
import com.kms.katalon.selenium.driver.CEdgeDriver as CEdgeDriver
import com.kms.katalon.selenium.driver.CFirefoxDriver as CFirefoxDriver
import com.kms.katalon.selenium.driver.CInternetExplorerDriver as CInternetExplorerDriver
import com.kms.katalon.selenium.driver.CRemoteWebDriver as CRemoteWebDriver
import com.kms.katalon.selenium.driver.CSafariDriver as CSafariDriver
import io.appium.java_client.MobileCommand as MobileCommand
import io.appium.java_client.ios.IOSDriver as IOSDriver
import io.appium.java_client.remote.AppiumCommandExecutor as AppiumCommandExecutor
import okhttp3.Authenticator as Authenticator
import okhttp3.Credentials as Credentials
import okhttp3.Request as Request
import okhttp3.Response as Response
import okhttp3.Route as Route
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths
import java.nio.file.Files as Files
import com.github.kklisura.cdt.protocol.types.page.PrintToPDF as PrintToPDF
import com.github.kklisura.cdt.protocol.types.page.PrintToPDFTransferMode as PrintToPDFTransferMode
import com.github.kklisura.cdt.services.factory.impl.DefaultWebSocketContainerFactory as DefaultWebSocketContainerFactory
import java.io.FileOutputStream as FileOutputStream
import java.util.Base64 as Base64
import java.net.URI as URI
import org.eclipse.jetty.websocket.client.WebSocketClient as WebSocketClient
import org.eclipse.jetty.websocket.client.WebSocketUpgradeRequest as WebSocketUpgradeRequest
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriverLogLevel as FirefoxDriverLogLevel
import org.openqa.selenium.safari.SafariOptions as SafariOptions
import org.openqa.selenium.edge.EdgeOptions as EdgeOptions
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import com.kms.katalon.core.testobject.RequestObject as RequestObject
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty as TestObjectProperty
import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper as MobileElementCommonHelper
import com.kms.katalon.core.webui.exception.WebElementNotFoundException as WebElementNotFoundException
import org.apache.hc.client5.http.classic.HttpClient as HttpClient
import org.apache.hc.client5.http.classic.methods.HttpPost as HttpPost
import org.apache.hc.core5.http.io.entity.StringEntity as StringEntity
import org.openqa.selenium.chrome.ChromeDriverService as ChromeDriverService
import com.fasterxml.jackson.databind.ObjectMapper as ObjectMapper
import com.kms.katalon.core.util.internal.Base64 as Base64
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.UnexpectedAlertBehaviour as UnexpectedAlertBehaviour

/** modify WebUI.* keywords which take TestObject as arg0
 * @author hhizaoui
 *so that they call Highlight.on() automatically
 */
'Call Highlight.on() automatically'

//CustomKeywords.'com.kazurayam.ksbackyard.HighlightElement.pandemic'()
/**
	Runtime.getRuntime().exec('taskkill /f /im chrome.exe')
	Runtime.getRuntime().exec('taskkill /f /im chromedriver.exe')
	Runtime.getRuntime().exec('taskkill /f /im geckodriver.exe')
*/
'RunConfiguration: getProjectDir for LogDriver '
String projDir = RunConfiguration.getProjectDir()

'RunConfiguration: getExecutionProperties Driver '
Map RunBrowserConfiguration = RunConfiguration.getExecutionProperties()

String DriverName = RunBrowserConfiguration.get('drivers').get('system').get('WebUI').get('browserType')

println('DriverName :' + DriverName)

println('Driverpath :' + RunBrowserConfiguration.get('drivers'))

/**Lancer un navigateur avec l'URL de l'application ANEF pour Portail Usager:
 */


if (Profiles == 'Usager') {
    switch (DriverName) {
        case 'CHROME_DRIVER':
            //			'Init standard WebDrive FireFox session Capabilities Specific for Download Directory customizedDownloadDirectory'
            //			GlobalVariable.downloadPath =(RunConfiguration.getProjectDir()+ "/Data Files/Downloads/")
            //			println "GlobalVariable.downloadPath :" + GlobalVariable.downloadPath
            //			String projectDir = (RunConfiguration.getProjectDir()+ "/Data Files/Downloads/").replace(/\//, '\\\\')
            //			println "projectDir :" + projectDir
            //			String JsonTxt = '{'+'"CHROME_DRIVER"'+':{'+'"args"'+':['+'"--incognito"'+','+'"--start-maximized"'+'],'+'"prefs"'+':{'+'"download.default_directory"'+':'+'"'+ projectDir+'"'+','+'"download_dir"'+':'+'"'+projectDir+'"'+','+'"download.prompt_for_download"'+':false}}}'
            //			String fileName = "com.kms.katalon.core.webui.chrome.properties"
            //			
            //			CustomKeywords.'tools.JsonWriter.WriterFile'(JsonTxt, fileName)
            //			
            //			println "DriverName :" + DriverName
            //			println "Driverpath :" + RunBrowserConfiguration.get("drivers")
            CustomKeywords.'tools.CapabilitiesSpecificDownloadDirectory.SetSpecificDownloadDirectoryIfNeeded'()

            WebUI.openBrowser(GlobalVariable.URL_ANEFQualif)

            //WebUI.maximizeWindow()

            //System.setProperty("webdriver.chrome.logfile", "'" +  projDir + "'" + "./chromedriver.log");
            //System.setProperty("webdriver.chrome.verboseLogging", "true");
            'Appel de l\'action Réutilisable pour contourner l\'erreur lié à la confidentialité'
            WebUI.callTestCase(findTestCase('Test Reutilisable/Main/ANEF_Eloignement_V_Nawres/Erreur_lie_a_la_confidentialite'), [:], FailureHandling.STOP_ON_FAILURE)

            WebUI.delay(5)

            'Vérification de l\'étape :'
            WebUI.verifyElementVisible(findTestObject('null'), FailureHandling.STOP_ON_FAILURE)

            break
        case 'HEADLESS_DRIVER':
            CustomKeywords.'tools.CapabilitiesSpecificDownloadDirectory.SetSpecificDownloadDirectoryIfNeeded'()

            WebUI.navigateToUrl(GlobalVariable.URL_ANEFQualif)

            //WebUI.maximizeWindow()

            //			System.setProperty("webdriver.chrome.logfile", "'" +  projDir + "'" + "./chromedriver.log");
            //			System.setProperty("webdriver.chrome.verboseLogging", "true");
            'Appel de l\'action Réutilisable pour contourner l\'erreur lié à la confidentialité'
            WebUI.callTestCase(findTestCase('Test Reutilisable/Main/ANEF_Eloignement_V_Nawres/Erreur_lie_a_la_confidentialite'), [:], FailureHandling.STOP_ON_FAILURE)

            WebUI.delay(5)

            'Vérification de l\'étape :'
            WebUI.verifyElementVisible(findTestObject('null'), FailureHandling.STOP_ON_FAILURE)

            break
        case 'FIREFOX_DRIVER':
            CustomKeywords.'tools.CapabilitiesSpecificDownloadDirectory.SetSpecificDownloadDirectoryIfNeeded'()

            WebUI.navigateToUrl(GlobalVariable.URL_ANEFQualif)

            //WebUI.openBrowser(GlobalVariable.URL_ANEFQualif)
            //WebUI.maximizeWindow()

            'Appel de l\'action Réutilisable pour contourner l\'erreur lié à la confidentialité'
            WebUI.callTestCase(findTestCase('Test Reutilisable/Main/ANEF_Eloignement_V_Nawres/Erreur_lie_a_la_confidentialite'), [:], FailureHandling.STOP_ON_FAILURE)

            WebUI.delay(5)

            'Vérification de l\'étape :'
            WebUI.verifyElementVisible(findTestObject('null'), FailureHandling.STOP_ON_FAILURE)

            break
        case 'FIREFOX_HEADLESS_DRIVER':
            CustomKeywords.'tools.CapabilitiesSpecificDownloadDirectory.SetSpecificDownloadDirectoryIfNeeded'()

            WebUI.navigateToUrl(GlobalVariable.URL_ANEFQualif)

            //WebUI.openBrowser(GlobalVariable.URL_ANEFQualif)
            //WebUI.maximizeWindow()

            'Appel de l\'action Réutilisable pour contourner l\'erreur lié à la confidentialité'
            WebUI.callTestCase(findTestCase('Test Reutilisable/Main/ANEF_Eloignement_V_Nawres/Erreur_lie_a_la_confidentialite'), [:], FailureHandling.STOP_ON_FAILURE)

            WebUI.delay(5)

            'Vérification de l\'étape :'
            WebUI.verifyElementVisible(findTestObject('null'), FailureHandling.STOP_ON_FAILURE)

            break
        case 'EDGE_CHROMIUM_DRIVER':
            CustomKeywords.'tools.CapabilitiesSpecificDownloadDirectory.SetSpecificDownloadDirectoryIfNeeded'()

            WebUI.navigateToUrl(GlobalVariable.URL_ANEFQualif)

            //WebUI.maximizeWindow()

            //			System.setProperty("webdriver.chrome.logfile", "'" +  projDir + "'" + "./chromedriver.log");
            //			System.setProperty("webdriver.chrome.verboseLogging", "true");
            //			"Appel de l'action Réutilisable pour contourner l'erreur lié à la confidentialité"
            WebUI.callTestCase(findTestCase('Test Reutilisable/Main/ANEF_Eloignement_V_Nawres/Erreur_lie_a_la_confidentialite'), [:], FailureHandling.STOP_ON_FAILURE)

            WebUI.delay(5)

            'Vérification de l\'étape :'
            WebUI.verifyElementVisible(findTestObject('null'), FailureHandling.STOP_ON_FAILURE)

            break
        case 'EDGE_DRIVER':
            CustomKeywords.'tools.CapabilitiesSpecificDownloadDirectory.SetSpecificDownloadDirectoryIfNeeded'()

            WebUI.navigateToUrl(GlobalVariable.URL_ANEFQualif)

            System.setProperty('webdriver.chrome.logfile', (('\'' + projDir) + '\'') + './chromedriver.log')

            System.setProperty('webdriver.chrome.verboseLogging', 'true')

            'Appel de l\'action Réutilisable pour contourner l\'erreur lié à la confidentialité'
            WebUI.callTestCase(findTestCase('Test Reutilisable/Main/ANEF_Eloignement_V_Nawres/Erreur_lie_a_la_confidentialite'), [:], FailureHandling.STOP_ON_FAILURE)

            WebUI.delay(5)

            'Vérification de l\'étape :'
            WebUI.verifyElementVisible(findTestObject('null'), FailureHandling.STOP_ON_FAILURE)

            break
        case 'IE_DRIVER':
            CustomKeywords.'tools.CapabilitiesSpecificDownloadDirectory.SetSpecificDownloadDirectoryIfNeeded'()

            WebUI.openBrowser(GlobalVariable.URL_ANEFQualif)

            System.setProperty('webdriver.chrome.logfile', (('\'' + projDir) + '\'') + './chromedriver.log')

            System.setProperty('webdriver.chrome.verboseLogging', 'true')

            'Appel de l\'action Réutilisable pour contourner l\'erreur lié à la confidentialité'
            WebUI.callTestCase(findTestCase('Test Reutilisable/Main/ANEF_Eloignement_V_Nawres/Erreur_lie_a_la_confidentialite'), [:], FailureHandling.STOP_ON_FAILURE)

            WebUI.delay(5)

            'Vérification de l\'étape :'
            WebUI.verifyElementVisible(findTestObject('null'), FailureHandling.STOP_ON_FAILURE)

            break
    }
}

/**Lancer un navigateur avec l'URL de l'application ANEF pour Portail Agent:
 */
if (Profiles == 'Agent') {
    
//	CustomKeywords.'tools.CapabilitiesSpecificDownloadDirectory.SetSpecificDownloadDirectoryIfNeeded'()	
//Mise en commentaire par Fabien SOREAU	 pour lancement TNR sur PrePROD
//	WebUI.openBrowser(GlobalVariable.URLPortailAgentQualif)	
if ( EnvExec == "URLPortailAgentQualif") {	WebUI.openBrowser(GlobalVariable.URLPortailAgentQualif)}	
if ( EnvExec == "URLPortailAgentPreProd") {	WebUI.openBrowser(GlobalVariable.URLPortailAgentPreProd)}
	
    //WebUI.maximizeWindow()

    //System.setProperty('webdriver.chrome.logfile', (('\'' + projDir) + '\'') + './chromedriver.log')

    //System.setProperty('webdriver.chrome.verboseLogging', 'true') // Appel de l'action Réutilisable pour contourner l'erreur lié à la confidentialité
    //WebUI.callTestCase(findTestCase('Test Reutilisable/Main/ANEF_Eloignement_V_Nawres/Erreur_lie_a_la_confidentialite'), [:], FailureHandling.STOP_ON_FAILURE)
    //Vérification de l'étape :
    //WebUI.verifyElementVisible(findTestObject('null'), FailureHandling.STOP_ON_FAILURE)
} else {
    println('Vérifier le Portail de votre connexion Usager ou Agent')

    WebUI.acceptAlert()
}

