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


'PARTIE 0 : RECHERCHE USAGER à partir du bouton RECHERCHER UN DOSSIER et non plus OUVRIR UN NOUVEAU DOSSIER'
'Car le DOSSIER avec OQTF réalisée et notifiée disparait'
if(((NumeroEtranger)!= ""))   {
    WebUI.callTestCase(findTestCase('null'), [NumeroEtranger:NumeroEtranger ],
	FailureHandling.STOP_ON_FAILURE)
    WebUI.click(findTestObject('null'))
    }


'PARTIE 1  ZONE PROLONGATION IRTF ICTF'

WebUI.delay(2)
WebUI.scrollToElement(findTestObject('null'), 1)
WebUI.delay(2)
//Cliquer sur le bouton Retirer la prolongation
//WebUI.click(findTestObject('null'))
CustomKeywords.'tools.ExecuteActions.ClickObjectJs'('html/body/app-root/app-layout-borderless//app-mesure-oqtf//app-accordeon-ictf-irtf/section//form//div[5]/button|/html/body/app-root/app-layout-borderless//app-mesure-oqtf//app-accordeon-ictf-irtf/section//form//div[6]/button|/html/body/app-root/app-layout-borderless//app-mesure-oqtf//app-accordeon-ictf-irtf/section//form//div[7]/button')
WebUI.delay(2)
//Champ Durée de l'IRTF : saisir 3 dans la case Année puis cliquer sur le bouton Enregistrer
WebUI.setText(findTestObject('null'), '3')
//Cliquer sur le bouton Retirer la prolongation
//WebUI.click(findTestObject('null'))
CustomKeywords.'tools.ExecuteActions.ClickObjectJs'('/html/body/app-root/app-layout-borderless//app-mesure-oqtf//app-accordeon-ictf-irtf/section//form//div[1]/div/button|/html/body/app-root/app-layout-borderless//app-mesure-oqtf//app-accordeon-ictf-irtf/section//form//div[6]//button|/html/body/app-root/app-layout-borderless//app-mesure-oqtf//app-accordeon-ictf-irtf/section/div/form//div[7]//button')
//Cliquer sur le bouton Ajouter une prolongation
//WebUI.click(findTestObject('null'))
//CustomKeywords.'tools.ExecuteActions.ClickObjectJs'('/html/body/app-root/app-layout-borderless//app-mesure-oqtf//app-accordeon-ictf-irtf/section//form//div[5]/button|/html/body/app-root/app-layout-borderless//app-mesure-oqtf//app-accordeon-ictf-irtf/section//form//div[6]/button')
CustomKeywords.'tools.ExecuteActions.ClickObjectJs'('html/body/app-root/app-layout-borderless//app-mesure-oqtf//app-accordeon-ictf-irtf/section//form//div[5]/button|/html/body/app-root/app-layout-borderless//app-mesure-oqtf//app-accordeon-ictf-irtf/section//form//div[6]/button|/html/body/app-root/app-layout-borderless//app-mesure-oqtf//app-accordeon-ictf-irtf/section//form//div[7]/button')
//Champ Durée de l'IRTF, saisir 1 dans la case Année puis cliquer sur le bouton Enregistrer

WebUI.setText(findTestObject('null'), '10')
WebUI.delay(5)
WebUI.verifyTextPresent('La durée totale des IRTF / prolongations d’IRTF ne peut pas excéder 10 ans.', false)
WebUI.delay(3)
WebUI.setText(findTestObject('null'), IRTF_ICTF_DureeDelaiProlongation)
WebUI.click(findTestObject('null'))


//'PARTIE 2 : AJOUT DE MESURE D EXECUTION'
//
////if (TopMesureExecution == '1') {
////ATTENTION dans ce cas l'appel de ELOIGNEMENT_ajout_mesure_execution n'est pas conditionné par TopMesureExecution == '1' car il est la suite de TNR-2
//WebUI.callTestCase(findTestCase('null'), [TopAjouterProlongationIRTF:TopAjouterProlongationIRTF, AJDecision_Date:AJDecision_Date, AJDecision_Notif_Date:AJDecision_Notif_Date, AJDecision_Notif_Type:AJDecision_Notif_Type, PaysRenvoi:PaysRenvoi, PaysNaissanceCreation:PaysNaissanceCreation, Resident:Resident, ValeurDureeOQTF:ValeurDureeOQTF, ValeurDureeOQTF_MM_RUE_ONLY:ValeurDureeOQTF_MM_RUE_ONLY, OQTF_duree_ICTF_IRTF_AA:OQTF_duree_ICTF_IRTF_AA, RefusDepartVolontaire:RefusDepartVolontaire, TopAjouterDecision:TopAjouterDecision, TopVD:TopVD],
//		FailureHandling.STOP_ON_FAILURE)
////}

'PARTIE 3 : AJOUT DECISION'
//WebUI.click(findTestObject('null'))
WebUI.sendKeys(findTestObject('null'), Keys.chord(Keys.ENTER))
WebUI.delay(5)
Robot robot = new Robot();
robot.keyPress(KeyEvent.VK_TAB);
sleep(15)
robot.keyRelease(KeyEvent.VK_TAB);
sleep(15)
WebUI.scrollToPosition(999999, 999999)
WebUI.delay(2)
WebUI.setText(findTestObject('null'), AJDecision_Date)
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/AjoutDecision.pdf', FailureHandling.OPTIONAL)
//WebUI.doubleClick(findTestObject('null'))
WebUI.sendKeys(findTestObject('null'), Keys.chord(Keys.ENTER))

//WebUI.click(findTestObject('null'))
WebUI.delay(10)

'PARTIE 4 : NOTIFICATION'
WebUI.doubleClick(findTestObject('null'))
//WebUI.sendKeys(findTestObject('null'), Keys.chord(Keys.ENTER))
//CustomKeywords.'tools.ExecuteActions.ClickObject'('/html/body/app-root/app-layout-borderless//div[2]/div[1]/div/ul/li[3]/button')

WebUI.delay(4)
WebUI.callTestCase(findTestCase('null'), null,
	FailureHandling.STOP_ON_FAILURE)
WebUI.delay(4)
WebUI.scrollToPosition(99999999, 99999999)

//WebUI.scrollToElement(findTestObject('null'), 4)
WebUI.delay(3)
//attention à cette étape le mode de notification est automatiquement la Voie administrative
WebUI.selectOptionByLabel(findTestObject('null'), 'Voie administrative', true)

WebUI.setText(findTestObject('null'), AJDecision_Notif_Date)
WebUI.setText(findTestObject('null'), '08:00')
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/NotificationMesureEloignement.pdf', FailureHandling.CONTINUE_ON_FAILURE)
//WebUI.click(findTestObject('null'))
WebUI.sendKeys(findTestObject('null'), Keys.chord(Keys.ENTER))

'PARTIE 5 : VERIFICATION DES DATES DU BANDEAU'
WebUI.delay(4)
WebUI.click(findTestObject('null'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Accueil_Principale/btn_ANEF_ELOIGNEMENT'))
WebUI.delay(3)
WebUI.callTestCase(findTestCase('null'), [NumeroEtranger:NumeroEtranger ],
	FailureHandling.STOP_ON_FAILURE)

BANDEAU1DEBUT="OQTF prononcée le "
BANDEAUFIN="."
BANDEAU1=BANDEAU1DEBUT+AJDecision_Date+BANDEAUFIN
println "BANDEAU1 = " + BANDEAU1
WebUI.verifyElementText(findTestObject('null'), BANDEAU1)
BANDEAU2DEBUT="OQTF notifiée le "
BANDEAU2=BANDEAU2DEBUT+AJDecision_Notif_Date+BANDEAUFIN
println "BANDEAU2 = " + BANDEAU2
WebUI.verifyElementText(findTestObject('null'), BANDEAU2)
