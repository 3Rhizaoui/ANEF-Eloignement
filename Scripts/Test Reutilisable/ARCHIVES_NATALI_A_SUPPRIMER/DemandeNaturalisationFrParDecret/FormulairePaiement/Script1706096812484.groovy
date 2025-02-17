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
import com.kms.katalon.core.util.KeywordUtil
import java.awt.Robot;
import java.awt.event.KeyEvent;


Robot r = new Robot();
'Je paie la taxe avec un timbre fiscal électronique ou je peux en acheter un en ligne'
TestObject Imput_TimbreNumero1Sur4 =findTestObject('null')
'Focus on Imput_TimbreNumero1Sur4'
WebUI.focus(Imput_TimbreNumero1Sur4)
CustomKeywords.'tools.ShadowDom.sendKeysUsingString'(Imput_TimbreNumero1Sur4, TimbreNumero1Sur4)
WebUI.delay(2)

TestObject Imput_TimbreNumero2Sur4 =findTestObject('null')
'Focus on Imput_TimbreNumero2Sur4'
WebUI.focus(Imput_TimbreNumero2Sur4)
CustomKeywords.'tools.ShadowDom.sendKeysUsingString'(Imput_TimbreNumero2Sur4, TimbreNumero2Sur4)
WebUI.delay(2)

TestObject Imput_TimbreNumero3Sur4 =findTestObject('null')
'Focus on Imput_TimbreNumero3Sur4'
WebUI.focus(Imput_TimbreNumero3Sur4)
CustomKeywords.'tools.ShadowDom.sendKeysUsingString'(Imput_TimbreNumero3Sur4, TimbreNumero3Sur4)
WebUI.delay(2)

TestObject Imput_TimbreNumero4Sur4 =findTestObject('null')
'Focus on Imput_TimbreNumero4Sur4'
WebUI.focus(Imput_TimbreNumero4Sur4)
CustomKeywords.'tools.ShadowDom.sendKeysUsingString'(Imput_TimbreNumero4Sur4, TimbreNumero4Sur4)
WebUI.delay(2)

'Consommer Le Timbre'
TestObject Btn_ConsommerLeTimbre = WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
//CustomKeywords.'tools.ShadowDom.clickUsingJS'(Btn_ConsommerLeTimbre)
WebUI.click(Btn_ConsommerLeTimbre,FailureHandling.OPTIONAL)
WebUI.delay(10)

'Vérification si le Timbre est consommé'
def TimbreConsomme= WebUI.verifyElementPresent(findTestObject('null'), 10, FailureHandling.STOP_ON_FAILURE)
if(TimbreConsomme) {KeywordUtil.markPassed( "Votre timbre a été consommé.")}
else {KeywordUtil.markFailed( " Ce timbre ne peut être consommé. Il a déjà été utilisé.")}

'Une fois le paiement effectué, vous ne pourrez plus revenir aux étapes précédentes.'
WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
WebUI.delay(10)

'Votre demande a bien été envoyée'
def DemandeEnvoyee= WebUI.verifyElementPresent(findTestObject('null'), 10, FailureHandling.STOP_ON_FAILURE)
if(DemandeEnvoyee) {KeywordUtil.markPassed( "Votre demande a bien été envoyée le 24/01/2024 à 13:14:14.Elle porte le numéro 2024X 200009.Vous allez recevoir un email de confirmation.")}
else {KeywordUtil.markFailed( "Votre Demande n'a pas été Envoyée.")}


"Vérification dans l'espace perso si la demande est bien envoyée" 
WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
TestObject link_NumDemandeNationnaliteFr = findTestObject('null')
def NumDemandeNationnaliteFr = WebUI.getText(link_NumDemandeNationnaliteFr)
GlobalVariable.NumDemandeNATALI = NumDemandeNationnaliteFr
println GlobalVariable.NumDemandeNATALI