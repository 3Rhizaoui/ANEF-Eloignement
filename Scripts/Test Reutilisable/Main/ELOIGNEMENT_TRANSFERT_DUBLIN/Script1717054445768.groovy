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
import com.kms.katalon.core.configuration.RunConfiguration
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;



/** modify WebUI.* keywords which take TestObject as arg0
 * @author fsoreau
 *so that they call Highlight.on() automatically
 */
'Call Highlight.on() automatically'
CustomKeywords.'com.kazurayam.ksbackyard.HighlightElement.pandemic'()


'waiting for the number of elements in the DOM to stop changing'
CustomKeywords.'tools.WaitForLoadedPage.waitForElementRendering'()


//ELOIGNEMENT-TRANSFERT_DUBLIN-1 : Dossier de l'usager : page control + prendre une mesure d'éloignement
//'cet exemple TRANSFERT_DUBLIN (autres valeurs possibles : Exécution fiche SIS L.615-1 ; Expulsion ; IAT ; ITF ; Remise Schengen ; Transfert Dublin
WebUI.verifyTextPresent('Prendre une décision', false)

WebUI.verifyTextPresent('À cette étape, vous devez choisir si vous souhaitez prendre une mesure d\'éloignement.', false)

WebUI.verifyElementPresent(findTestObject('null'), 1)
WebUI.verifyElementPresent(findTestObject('null'), 1)
WebUI.verifyElementPresent(findTestObject('null'), 1)
WebUI.verifyElementPresent(findTestObject('null'), 1)
WebUI.verifyElementPresent(findTestObject('null'), 1)
WebUI.verifyElementPresent(findTestObject('null'), 1)

//PBM la variable TypeEloignement ne remonte pas du fichier DDT => forçage de la valeur OQTF en dur
//WebUI.click(findTestObject('null'))
//WebUI.click(findTestObject('null'))
WebUI.selectOptionByLabel(findTestObject('null'), "TRANSFERT_DUBLIN", true)

WebUI.delay(3)