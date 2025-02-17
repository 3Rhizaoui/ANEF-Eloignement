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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import org.openqa.selenium.Capabilities as Capabilities
import org.openqa.selenium.remote.RemoteWebDriver as RemoteWebDriver
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebDriver
import org.openqa.selenium.remote.LocalFileDetector
import org.openqa.selenium.support.events.EventFiringWebDriver
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.selenium.driver.CRemoteWebDriver
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.remote.LocalFileDetector as LocalFileDetector
import org.openqa.selenium.remote.RemoteWebDriver
import org.openqa.selenium.support.events.EventFiringWebDriver
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.remote.LocalFileDetector as LocalFileDetector
import org.openqa.selenium.remote.RemoteWebDriver
import org.openqa.selenium.support.events.EventFiringWebDriver
import com.kms.katalon.core.util.KeywordUtil

//UPLOAD DE PJ avec le chemin relatif DEBUT
'RunConfiguration for get Execution Properties Driver'
Map RunBrowserConfiguration = RunConfiguration.getExecutionProperties()
String DriverName = GlobalVariable.DriverName
EventFiringWebDriver driver = DriverFactory.getWebDriver()
WebDriver wrappedDriver = driver.getWrappedDriver()
System.out.println(wrappedDriver.getClass())
if (wrappedDriver.class == CRemoteWebDriver) {
	wrappedDriver.setFileDetector(new LocalFileDetector())
}
String SpecificDownloadDirectory = ""
  
'Upload file attachment'
if (DriverName =='FIREFOX_DRIVER') {
	  SpecificDownloadDirectory = (RunConfiguration.getProjectDir() + "/Data Files/").replace(/\//, '\\')
	  }
else if (wrappedDriver.class == 'CRemoteWebDriver'){
	 SpecificDownloadDirectory = new File(RunConfiguration.getProjectDir() + "/Data Files/").getCanonicalPath()}
else {
	  SpecificDownloadDirectory = (RunConfiguration.getProjectDir() + "/Data Files")
	  println "SpecificDownloadDirectory : " + SpecificDownloadDirectory }
//UPLOAD DE PJ avec le chemin relatif FIN


/** modify WebUI.* keywords which take TestObject as arg0
 * @author fsoreau
 *so that they call Highlight.on() automatically
 */
'Call Highlight.on() automatically'
CustomKeywords.'com.kazurayam.ksbackyard.HighlightElement.pandemic'()


'waiting for the number of elements in the DOM to stop changing'
CustomKeywords.'tools.WaitForLoadedPage.waitForElementRendering'()


'ELOIGNEMENT-SCHENGEN-1 : Prise de la mesure d éloignement SCHENGEN'

'Pour cet exemple IATE (autres valeurs possibles : Exécution fiche SIS L.615-1 ; IAT ; ITF ; OQTF ; Remise_Schengen ; Transfert Dublin '

WebUI.verifyTextPresent("À cette étape, vous devez choisir si vous souhaitez prendre une mesure d'éloignement.", false)
WebUI.verifyElementPresent(findTestObject('null'), 1)
WebUI.verifyElementPresent(findTestObject('null'), 1)
WebUI.verifyElementPresent(findTestObject('null'), 1)
WebUI.verifyElementPresent(findTestObject('null'), 1)
WebUI.verifyElementPresent(findTestObject('null'), 1)
WebUI.verifyElementPresent(findTestObject('null'), 1)


WebUI.selectOptionByValue(findTestObject('null'),
	'6: REMISE_SCHENGEN', true)

WebUI.click(findTestObject('null'))

//WebUI.verifyTextPresent('Action effectuée avec succès', false)
//WebUI.verifyElementText(findTestObject('null'), 'Action effectuée avec succès')
                                                                                                                     
'ELOIGNEMENT-SCHENGEN-2 : page control vérifier bandeau'
WebUI.delay(3)
WebUI.verifyTextPresent('Fiche mesure de', false)
println "NumEtrangerRecup = " + NumEtrangerRecup
intercalaire = ' - '
intercalaire2 = ' '
fiche_nom_concatenation = NumEtrangerRecup + intercalaire + NomEtrangerEloignement + intercalaire2 + PrenomEtrangerEloignement
println "fiche_nom_concatenation = " + fiche_nom_concatenation

//PBM revoir avec des variables et des concaténations de variables

WebUI.verifyElementText(findTestObject('null'), fiche_nom_concatenation)
WebUI.verifyTextPresent('Numéro de la mesure', false)
WebUI.verifyElementText(findTestObject('null'), 'Remise Schengen')

WebUI.verifyTextPresent('Type de mesure', false)
WebUI.delay(3)

'ELOIGNEMENT-SCHENGEN-3 : page control vérifier les onglets (à gauche) sous decision d eloignement'
WebUI.verifyElementPresent(findTestObject('null'), 1)
//
//WebUI.verifyElementPresent(findTestObject('null'), 1)
//
//WebUI.verifyElementPresent(findTestObject('null'), 1)
//
//WebUI.verifyElementPresent(findTestObject('null'), 1)
//
//WebUI.verifyElementPresent(findTestObject('null'), 1)
//
//WebUI.verifyElementPresent(findTestObject('null'), 1)
//
//WebUI.verifyElementPresent(findTestObject('null'), 1)
//
//WebUI.verifyElementPresent(findTestObject('null'), 1)

//PBM revoir  WebUI.verifyElementNotClickable(


'ELOIGNEMENT-SCHENGEN-4 Selection fondement legal + Nature acte'
'Les FL sont indentiques pour un usager RPT ou RUE'
WebUI.verifyOptionPresentByLabel(findTestObject('null'),
		'L. 621-2', false, 1)
WebUI.verifyOptionPresentByLabel(findTestObject('null'),
		'L. 621-3', false, 1)
WebUI.verifyOptionPresentByLabel(findTestObject('null'),
		'L. 621-4', false, 1)
WebUI.verifyOptionPresentByLabel(findTestObject('null'),
		'L. 621-5', false, 1)
WebUI.verifyOptionPresentByLabel(findTestObject('null'),
		'L. 621-6', false, 1)
WebUI.verifyOptionPresentByLabel(findTestObject('null'),
		'L. 621-7', false, 1)	


WebUI.selectOptionByLabel(findTestObject('null'), SCHENGEN_FL, false)


'ELOIGNEMENT-SCHENGEN-RUE-5 : ETAT SAISI'
	WebUI.click(findTestObject('null'))
	if (SCHENGEN_etat_saisi == 'ALLEMAGNE') { WebUI.click(findTestObject('null')) }
	if (SCHENGEN_etat_saisi == 'AUTRICHE')  { WebUI.click(findTestObject('null')) }
	if (SCHENGEN_etat_saisi == 'BELGIQUE')  { WebUI.click(findTestObject('null')) }
	if (SCHENGEN_etat_saisi == 'BULGARIE')  { WebUI.click(findTestObject('null')) }
	if (SCHENGEN_etat_saisi == 'ESPAGNE')   { WebUI.click(findTestObject('null')) }
	if (SCHENGEN_etat_saisi == 'FRANCE')    { WebUI.click(findTestObject('null')) }
	if (SCHENGEN_etat_saisi == 'HONGRIE')    { WebUI.click(findTestObject('null')) }
	if (SCHENGEN_etat_saisi == 'IRLANDE')   { WebUI.click(findTestObject('null')) }
	if (SCHENGEN_etat_saisi == 'ITALIE')    { WebUI.click(findTestObject('null')) }
	if (SCHENGEN_etat_saisi == 'NORVEGE')    { WebUI.click(findTestObject('null')) }
	if (SCHENGEN_etat_saisi == 'POLOGNE')    { WebUI.click(findTestObject('null')) }
	if (SCHENGEN_etat_saisi == 'PORTUGAL')    { WebUI.click(findTestObject('null')) }
	if (SCHENGEN_etat_saisi == 'SUEDE')    { WebUI.click(findTestObject('null')) }

	
'ELOIGNEMENT-SCHENGEN-RUE-6 : ETAT MEMBRE SAISINE + REPONSE DATE'
	WebUI.setText(findTestObject('null'), SCHENGEN_etat_membre_saisine_date)
	WebUI.setText(findTestObject('null'), SCHENGEN_etat_membre_reponse_date)

'ELOIGNEMENT-SCHENGEN-RUE-7 : VERIFIER NOUVEL ETAT (2) : SAISIR + RETRAIT'
	WebUI.click(findTestObject('null'))
	WebUI.click(findTestObject('null'))

'ELOIGNEMENT-SCHENGEN-RUE-8 : SAISIR NOUVEL ETAT (2)'
	     if (TOP_SCHENGEN_saisir_etat2 == 'OUI') { WebUI.click(findTestObject('null'))
	//		 WebUI.click(findTestObject('null'))
	//         if (SCHENGEN_etat_saisi2 == 'ITALIE') { WebUI.click(findTestObject('null')) }
	//         if (SCHENGEN_etat_saisi2 == 'ALLEMAGNE') { WebUI.click(findTestObject('null')) }
			 WebUI.selectOptionByLabel(findTestObject('null'), SCHENGEN_etat_saisi2, false)
			 WebUI.delay(5)
			 WebUI.setText(findTestObject('null'), SCHENGEN_etat_membre2_saisine_date)
			 WebUI.delay(1)
			 WebUI.setText(findTestObject('null'), SCHENGEN_etat_membre2_reponse_date)
	     }
	WebUI.delay(5)
'ELOIGNEMENT-SCHENGEN-RUE-9 : ITF'
	WebUI.setText(findTestObject('null'), SCHENGEN_ICTF)

'ELOIGNEMENT-SCHENGEN-RUE-10 : ETAT REMISE'
	WebUI.selectOptionByLabel(findTestObject('null'), SCHENGEN_etat_saisi, false)

'ELOIGNEMENT-SCHENGEN-11 DERNIER ETAPE ENREGISTRER'
WebUI.delay(2)
//WebUI.click(findTestObject(Object Repository/Fabien/ELOIGNEMENT/dossier_etranger_usage_SCHENGEN/btn_enregistrer_schengen'))




//println "SCHENGEN_FL = " + IAT_FL
//if (IAT_FL == "L.321-1")  {WebUI.selectOptionByLabel(findTestObject('null'), 'L.321-1', false) }
