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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
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

import java.awt.Robot
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection
import java.awt.event.InputEvent
import java.awt.event.KeyEvent

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





// PARTIES 1 A 7 : SCENARIO DE TNR 8 DANS CAHIER DE RECETTE DE AIDA
'PARTIE 1 : rechercher dossier'
if(((NumeroEtranger)!= ""))   {
	WebUI.callTestCase(findTestCase('null'), [NumeroEtranger:NumeroEtranger ],
	FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('null'))
}


//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
'PARTIE 2 : Cliquer sur le bouton Ajouter une visite domiciliaire'
WebUI.delay(5)

WebUI.scrollToElement(findTestObject('null'), 2)
WebUI.click(findTestObject('null'))
WebUI.delay(2)
WebUI.sendKeys(findTestObject('null'), Keys.chord(Keys.ENTER))
WebUI.delay(2)
WebUI.click(findTestObject('null'))

'PARTIE 3 : Vérifier la compositition du bloc Visite domiciliaire'
WebUI.delay(5)
WebUI.verifyOptionPresentByLabel(findTestObject('null'), 'L. 733-7', false, 1)
WebUI.verifyOptionPresentByLabel(findTestObject('null'), 'L. 733-8', false, 1)
WebUI.verifyOptionPresentByLabel(findTestObject('null'), 'L. 722-2', false, 1)
WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('null'), FondementLegal_VD, true)

WebUI.click(findTestObject('null'))

'PARTIE 4 : Saisie des champs'
WebUI.delay(3)
WebUI.delay(1)
WebUI.setText(findTestObject('null'), saisine_VD_date)
WebUI.delay(5)

WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/Ordonnance du JLD.pdf', FailureHandling.OPTIONAL)
WebUI.delay(1)

WebUI.setText(findTestObject('null'), ordonnanceJLD_VD_date)

WebUI.setText(findTestObject('null'), ordonnanceJLD_VD_heure)

WebUI.verifyOptionPresentByLabel(findTestObject('null'), 'Accord', false, 1)
WebUI.verifyOptionPresentByLabel(findTestObject('null'), 'Refus', false, 1)
WebUI.selectOptionByLabel(findTestObject('null'), decision_juge_VD, true)

WebUI.setText(findTestObject('null'), notification_VD_date)
WebUI.setText(findTestObject('null'), notification_VD_heure)

WebUI.click(findTestObject('null'))
WebUI.delay(4)
WebUI.verifyElementText(findTestObject('null'), 'Action effectuée avec succès')
WebUI.click(findTestObject('null'))
WebUI.delay(4)

'PARTIE 5 retour accueil et recherche + main courante'
WebUI.scrollToPosition(1, 1)
WebUI.delay(2)
WebUI.click(findTestObject('null'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Accueil_Principale/btn_ANEF_ELOIGNEMENT'))
WebUI.delay(2)

WebUI.callTestCase(findTestCase('null'), [NumeroEtranger:NumeroEtranger ],
	FailureHandling.STOP_ON_FAILURE)
WebUI.delay(2)
WebUI.click(findTestObject('null'))
WebUI.delay(2)
WebUI.click(findTestObject('null'))
WebUI.delay(7)

'PARTIE 6 retour sur Visite domiciliaire'
WebUI.scrollToPosition(999999, 999999)
WebUI.delay(2)
WebUI.verifyTextPresent(('Visite domiciliaire N°1'), false)
WebUI.delay(10)

'PARTIE 7 retour accueil et recherche + btn_pilotage_activite'
WebUI.scrollToPosition(1, 1)
WebUI.click(findTestObject('null'))
WebUI.delay(2)
WebUI.click(findTestObject('null'))
WebUI.setText(findTestObject('null'), NumeroEtranger)
WebUI.delay(2)
WebUI.click(findTestObject('null'))
WebUI.delay(5)

// PARTIES 8 A 17 : SCENARIO DE TNR 9 DANS CAHIER DE RECETTE DE AIDA
'PARTIE 8 : rechercher dossier'

WebUI.click(findTestObject('null'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Accueil_Principale/btn_ANEF_ELOIGNEMENT'))
WebUI.delay(2)
if(((NumeroEtranger)!= ""))   {
	WebUI.callTestCase(findTestCase('null'), [NumeroEtranger:NumeroEtranger ],
	FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('null'))
}


'PARTIE 9 : Cliquer sur le bouton Ajouter une visite domiciliaire (visite Domiciliaire N°2 )'
WebUI.delay(5)

//WebUI.scrollToElement(findTestObject('Object Repository/Fabien/ELOIGNEMENT/AjoutVisiteDomiciliaire/btn_ajout_visite_domiciliaire_2'), 5)
//WebUI.sendKeys(findTestObject('Object Repository/Fabien/ELOIGNEMENT/AjoutVisiteDomiciliaire/btn_ajout_visite_domiciliaire_2'), Keys.chord(Keys.ENTER))
//WebUI.click(findTestObject('Object Repository/Fabien/ELOIGNEMENT/AjoutVisiteDomiciliaire/btn_ajout_visite_domiciliaire_2'))
CustomKeywords.'tools.ExecuteActions.ClickObject'('/html/body/app-root/app-layout-borderless//app-mesure-oqtf//app-accordeon-mesures-execution/section//app-mesure-assignation-residence/form/div[7]/div/button')

WebUI.delay(2)
WebUI.sendKeys(findTestObject('null'), Keys.chord(Keys.ENTER))
WebUI.delay(2)
//WebUI.click(findTestObject('Object Repository/Fabien/ELOIGNEMENT/AjoutVisiteDomiciliaire/btn_ajout_visite_domiciliaire_2'))
CustomKeywords.'tools.ExecuteActions.ClickObject'('/html/body/app-root/app-layout-borderless//app-mesure-oqtf//app-accordeon-mesures-execution/section//app-mesure-assignation-residence/form/div[7]/div/button')


'PARTIE 10 : Vérifier la compositition du bloc Visite domiciliaire (visite Domiciliaire N°2 )'
WebUI.delay(5)
WebUI.verifyOptionPresentByLabel(findTestObject('null'), 'L. 733-7', false, 1)
WebUI.verifyOptionPresentByLabel(findTestObject('null'), 'L. 733-8', false, 1)
WebUI.verifyOptionPresentByLabel(findTestObject('null'), 'L. 722-2', false, 1)
WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('null'), FondementLegal_VD, true)

WebUI.click(findTestObject('null'))

'PARTIE 11 : Saisie des champs (visite Domiciliaire N°2 )'
'Verification que les chanmps de la visite domicilaire N-1 sont non saisissables'
WebUI.delay(3)
WebUI.setText(findTestObject('null'), saisine_VD_date)
WebUI.delay(5)
WebUI.verifyElementAttributeValue(findTestObject('null'), 'disabled', 'true', 5)
WebUI.delay(5)


WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/Ordonnance du JLD.pdf', FailureHandling.OPTIONAL)
WebUI.delay(1)

WebUI.setText(findTestObject('null'), ordonnanceJLD_VD_date)
WebUI.setText(findTestObject('null'), ordonnanceJLD_VD_heure)
WebUI.verifyElementAttributeValue(findTestObject('null'), 'disabled', 'true', 5)
WebUI.verifyElementAttributeValue(findTestObject('null'), 'disabled', 'true', 5)

WebUI.verifyOptionPresentByLabel(findTestObject('null'), decision_juge_VD_Accord, false, 1)
WebUI.verifyOptionPresentByLabel(findTestObject('null'), decision_juge_VD_Refus, false, 1)

WebUI.selectOptionByLabel(findTestObject('null'), decision_juge_VD_Refus, true)
WebUI.verifyElementAttributeValue(findTestObject('null'), 'disabled', 'true', 5)


WebUI.setText(findTestObject('null'), notification_VD_date)
WebUI.setText(findTestObject('null'), notification_VD_heure)
WebUI.verifyElementAttributeValue(findTestObject('null'), 'disabled', 'true', 5)
WebUI.verifyElementAttributeValue(findTestObject('null'), 'disabled', 'true', 5)

WebUI.click(findTestObject('null'))
WebUI.delay(4)
WebUI.verifyElementText(findTestObject('null'), 'Action effectuée avec succès')
WebUI.click(findTestObject('null'))
WebUI.delay(4)

'PARTIE 12 retour accueil et recherche + btn_pilotage_activite'
WebUI.click(findTestObject('null'))
WebUI.delay(2)
WebUI.click(findTestObject('null'))
WebUI.setText(findTestObject('null'), NumeroEtranger)
WebUI.delay(2)
WebUI.click(findTestObject('null'))
WebUI.delay(5)

'PARTIE 13 : rechercher dossier'
WebUI.click(findTestObject('null'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Accueil_Principale/btn_ANEF_ELOIGNEMENT'))
WebUI.delay(2)

if(((NumeroEtranger)!= ""))   {
	WebUI.callTestCase(findTestCase('null'), [NumeroEtranger:NumeroEtranger ],
	FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('null'))
}

'PARTIE 14 : Cliquer sur le bouton Ajouter une visite domiciliaire (visite Domiciliaire N°3 )'

WebUI.delay(5)
WebUI.verifyTextPresent(('Visite domiciliaire N°2'), false)
WebUI.delay(3)
//WebUI.scrollToElement(findTestObject('Object Repository/Fabien/ELOIGNEMENT/AjoutVisiteDomiciliaire/btn_ajout_visite_domiciliaire_3'), 2)
//WebUI.click(findTestObject('Object Repository/Fabien/ELOIGNEMENT/AjoutVisiteDomiciliaire/btn_ajout_visite_domiciliaire_3'))
CustomKeywords.'tools.ExecuteActions.ClickObject'('/html/body/app-root/app-layout-borderless//app-mesure-oqtf//app-accordeon-mesures-execution/section//app-mesure-assignation-residence/form/div[7]/div/button')

WebUI.delay(2)
WebUI.sendKeys(findTestObject('null'), Keys.chord(Keys.ENTER))
WebUI.delay(2)
//WebUI.click(findTestObject('Object Repository/Fabien/ELOIGNEMENT/AjoutVisiteDomiciliaire/btn_ajout_visite_domiciliaire_3'))
CustomKeywords.'tools.ExecuteActions.ClickObject'('/html/body/app-root/app-layout-borderless//app-mesure-oqtf//app-accordeon-mesures-execution/section//app-mesure-assignation-residence/form/div[7]/div/button')

'PARTIE 15 : Vérifier la compositition du bloc Visite domiciliaire (visite Domiciliaire N°3 )'
WebUI.delay(5)
WebUI.verifyOptionPresentByLabel(findTestObject('null'), 'L. 733-7', false, 1)
WebUI.verifyOptionPresentByLabel(findTestObject('null'), 'L. 733-8', false, 1)
WebUI.verifyOptionPresentByLabel(findTestObject('null'), 'L. 722-2', false, 1)
WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('null'), FondementLegal_VD, true)

WebUI.click(findTestObject('null'))


'PARTIE 16 : Saisie des champs (visite Domiciliaire N°3 )'
'Verification que les chanmps de la visite domicilaire N-1 sont non saisissables'
WebUI.delay(3)
WebUI.setText(findTestObject('null'), saisine_VD_date)
WebUI.delay(5)
WebUI.verifyElementAttributeValue(findTestObject('null'), 'disabled', 'true', 5)
WebUI.verifyElementAttributeValue(findTestObject('null'), 'disabled', 'true', 5)
WebUI.delay(5)

WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/Ordonnance du JLD.pdf', FailureHandling.OPTIONAL)
WebUI.delay(1)

WebUI.setText(findTestObject('null'), ordonnanceJLD_VD_date)
WebUI.setText(findTestObject('null'), ordonnanceJLD_VD_heure)
WebUI.verifyElementAttributeValue(findTestObject('null'), 'disabled', 'true', 5)
WebUI.verifyElementAttributeValue(findTestObject('null'), 'disabled', 'true', 5)
WebUI.verifyElementAttributeValue(findTestObject('null'), 'disabled', 'true', 5)
WebUI.verifyElementAttributeValue(findTestObject('null'), 'disabled', 'true', 5)

WebUI.verifyOptionPresentByLabel(findTestObject('null'), decision_juge_VD_Accord, false, 1)
WebUI.verifyOptionPresentByLabel(findTestObject('null'), decision_juge_VD_Refus, false, 1)
WebUI.selectOptionByLabel(findTestObject('null'), decision_juge_VD, true)
WebUI.verifyElementAttributeValue(findTestObject('null'), 'disabled', 'true', 5)
WebUI.verifyElementAttributeValue(findTestObject('null'), 'disabled', 'true', 5)


WebUI.setText(findTestObject('null'), notification_VD_date)
WebUI.setText(findTestObject('null'), notification_VD_heure)
WebUI.verifyElementAttributeValue(findTestObject('null'), 'disabled', 'true', 5)
WebUI.verifyElementAttributeValue(findTestObject('null'), 'disabled', 'true', 5)
WebUI.verifyElementAttributeValue(findTestObject('null'), 'disabled', 'true', 5)
WebUI.verifyElementAttributeValue(findTestObject('null'), 'disabled', 'true', 5)

WebUI.click(findTestObject('null'))
WebUI.delay(4)
WebUI.verifyElementText(findTestObject('null'), 'Action effectuée avec succès')
WebUI.click(findTestObject('null'))
WebUI.delay(4)

'PARTIE 17 retour accueil et recherche + btn_pilotage_activite'
WebUI.click(findTestObject('null'))
WebUI.delay(2)
WebUI.click(findTestObject('null'))
WebUI.setText(findTestObject('null'), NumeroEtranger)
WebUI.delay(2)
WebUI.click(findTestObject('null'))
WebUI.delay(5)




'Visite domiciliaire N°'




// label possibles L. 733-7 ; L. 733-8 ; L. 722-2
//Decision juge = Accord ou Refus 