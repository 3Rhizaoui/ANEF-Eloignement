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



//Bloc IRTF N°1 : cliquer sur le bouton Ajouter une prolongation
//Champ Durée de l'IRTF : saisir 3 dans la case Année puis cliquer sur le bouton Enregistrer
//Cliquer sur le bouton Retirer la prolongation
//Cliquer sur le bouton Ajouter une prolongation
//Champ Durée de l'IRTF, saisir 1 dans la case Année puis cliquer sur le bouton Enregistrer
//Cliquer sur le bouton Ajouter une décision
//Sélectionner une Date de décision et ajouter une PJ
//Cliquer sur le bouton Confirmer l'ajout

//Bloc IRTF N°1 : cliquer sur le bouton Ajouter une prolongation
//Champ Durée de l'IRTF : saisir 3 dans la case Année puis cliquer sur le bouton Enregistrer
//Cliquer sur le bouton Retirer la prolongation
//Cliquer sur le bouton Ajouter une prolongation
//Champ Durée de l'IRTF, saisir 1 dans la case Année puis cliquer sur le bouton Enregistrer
//Cliquer sur le bouton Ajouter une décision
//Sélectionner une Date de décision et ajouter une PJ
//Cliquer sur le bouton Confirmer l'ajout










WebUI.click(findTestObject('null'))
WebUI.delay(2)
//WebUI.doubleClick(findTestObject('Object Repository/Fabien/ELOIGNEMENT/bandeau_information'))
WebUI.click(findTestObject('Object Repository/Fabien/ELOIGNEMENT/bandeau_information'))
//WebUI.sendKeys(findTestObject('Object Repository/Fabien/ELOIGNEMENT/bandeau_information'), Keys.chord(Keys.ENTER))
WebUI.delay(10)
WebUI.click(findTestObject('null'))





WebUI.click(findTestObject('null'))
WebUI.delay(1)
WebUI.click(findTestObject('null'))


WebUI.setText(findTestObject('null'), '3')
WebUI.click(findTestObject('null'))

WebUI.delay(1)

WebUI.doubleClick(findTestObject('null'))
//WebUI.clearText(findTestObject('null'))
WebUI.setText(findTestObject('null'), '')
WebUI.setText(findTestObject('null'), '1')


WebUI.click(findTestObject('null'))
WebUI.click(findTestObject('null'))


'Arrivée dans sous fenêtre Ajout de decision'
WebUI.delay(4)
WebUI.verifyElementPresent(findTestObject('null'), 1)
WebUI.setText(findTestObject('null'), '28/08/2024')
WebUI.verifyElementPresent(findTestObject('null'), 1)
WebUI.uploadFile(findTestObject('null'),
	'C:\\Users\\fsoreau\\OneDrive - Capgemini\\Documents\\GitHub\\ANEF-ELOIGNEMENT\\Data Files\\ProlongationIRTF')
//WebUI.doubleClick(findTestObject('null'))
WebUI.sendKeys(findTestObject('null'), Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('null'), '-')



