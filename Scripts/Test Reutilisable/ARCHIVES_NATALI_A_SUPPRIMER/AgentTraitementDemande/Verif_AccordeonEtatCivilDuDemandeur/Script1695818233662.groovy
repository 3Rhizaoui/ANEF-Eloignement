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
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.util.KeywordUtil
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By
import org.openqa.selenium.WebElement as WebElement
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.SelectorMethod
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.TestObjectProperty
/** modify WebUI.* keywords which take TestObject as arg0
 * @author hhizaoui
 *so that they call Highlight.on() automatically
 */
CustomKeywords.'com.kazurayam.ksbackyard.HighlightElement.pandemic'()


/**Vérification De l'Accordéon ÉTAT CIVIL
 */
'Vérifier Existance  Du Accordeon Etat Civil'
TestObject AccordeonEtatCivil=findTestObject('null')
WebUI.verifyElementPresent(AccordeonEtatCivil, 1)
'Vérifier le Texte Du Accordeon Etat Civil'
String TitreAccordeonEtatCivil = WebUI.getText(AccordeonEtatCivil)
if(!TitreAccordeonEtatCivil.contains('ÉTAT CIVIL')) {
	KeywordUtil.markFailed("Vérifier le titre de L'accordéon ÉTAT CIVIL.")}
else {KeywordUtil.markPassed("Le Titre de L'accordéon est bien Affiché : ÉTAT CIVIL.")}


/** Vérification Des Pj 
 * Photographie
 * Signature
 * Passeport
 * Copie du titre de séjour
 */

//Photographie
'Vérifier la case à cocher du Document manquant de la Photographie '
TestObject DocManquantPhotographie=findTestObject('null')
WebUI.verifyElementPresent(DocManquantPhotographie, 1)
WebUI.check(DocManquantPhotographie)
'Vérifier le Titre du Texte Document manquant de la Photographie '
TestObject MsgDocumentManquant =findTestObject('null')
WebUI.verifyElementPresent(MsgDocumentManquant, 1)
String TitreMsgDocumentManquantPhotographie = WebUI.getText(MsgDocumentManquant)
if(!TitreMsgDocumentManquantPhotographie.contains('Préciser le document manquant au demandeur * :')) {
	KeywordUtil.markFailed("Vérifier le titre de Message Préciser le document manquant Photographie au demandeur.")}
else {KeywordUtil.markPassed("Le Titre  de Message est bien Affiché : Préciser le document manquant Photographie au demandeur.")}
'Vérifier le champ Texte Document manquant de la Photographie '
TestObject TxtDocManquantPhotographie=findTestObject('null')
WebUI.verifyElementPresent(TxtDocManquantPhotographie, 1)
WebUI.setText(TxtDocManquantPhotographie, 'Préciser le document manquant Photographie au demandeur')
'Annulation Du Document Manquant'
WebUI.check(DocManquantPhotographie)

'Vérifier Photographie et voir Document '
TestObject objVoirDocPhotographie=findTestObject('null')
CustomKeywords.'tools.OpenPopupInTab.OpenBrowserTab'(objVoirDocPhotographie)
CustomKeywords.'tools.OpenPopupInTab.CloseBrowserTab'()
WebUI.delay(2)
'Rejeter le document'
WebUI.click(findTestObject('null'))
WebUI.doubleClick(findTestObject('null'))
WebUI.setText(findTestObject('null'), 'Observations Photographie pour le demandeur')
WebUI.click(findTestObject('null'))


//Signature

'Vérifier la case à cocher du Document manquant de la Signature '
TestObject DocManquantSignature=findTestObject('null')
WebUI.verifyElementPresent(DocManquantSignature, 1)
WebUI.check(DocManquantSignature)
'Vérifier le Titre du Texte Document manquant de la Signature '
TestObject MsgDocumentManquantSignature =findTestObject('null')
WebUI.verifyElementPresent(MsgDocumentManquantSignature, 1)
String TitreMsgDocumentManquantSignature = WebUI.getText(MsgDocumentManquantSignature)
if(!TitreMsgDocumentManquantSignature.contains('Préciser le document manquant au demandeur * :')) {
	KeywordUtil.markFailed("Vérifier le titre de Message Préciser le document manquant Signature au demandeur.")}
else {KeywordUtil.markPassed("Le Titre  de Message est bien Affiché : Préciser le document manquant Signature au demandeur.")}
'Vérifier le champ Texte Document manquant de la Signature '
TestObject TxtDocManquantSignature=findTestObject('null')
WebUI.verifyElementPresent(TxtDocManquantSignature, 1)
WebUI.setText(TxtDocManquantPhotographie, 'Préciser le document manquant Signature au demandeur')
'Annulation Du Document Manquant'
WebUI.check(DocManquantSignature)

'Vérifier Signature et voir Document '
TestObject objVoirDocSignature=findTestObject('null')
CustomKeywords.'tools.OpenPopupInTab.OpenBrowserTab'(objVoirDocSignature)
CustomKeywords.'tools.OpenPopupInTab.CloseBrowserTab'()
WebUI.delay(2)
'Rejeter le document'
WebUI.click(findTestObject('null'))
WebUI.doubleClick(findTestObject('null'))
WebUI.setText(findTestObject('null'), 'Observations Signature pour le demandeur')
WebUI.click(findTestObject('null'))


//Passeport
'Vérifier la case à cocher du Document manquant du Passeport '
TestObject DocManquantPasseport=findTestObject('null')
WebUI.verifyElementPresent(DocManquantPasseport, 1)
WebUI.check(DocManquantPasseport)
'Vérifier le Titre du Texte Document manquant du Passeport '
TestObject MsgDocumentManquantPasseport =findTestObject('null')
WebUI.verifyElementPresent(MsgDocumentManquantPasseport, 1)
String TitreMsgDocumentManquantPasseport = WebUI.getText(MsgDocumentManquantPasseport)
if(!TitreMsgDocumentManquantPasseport.contains('Préciser le document manquant au demandeur * :')) {
	KeywordUtil.markFailed("Vérifier le titre de Message Préciser le document manquant Passeport au demandeur.")}
else {KeywordUtil.markPassed("Le Titre  de Message est bien Affiché : Préciser le document manquant Passeport au demandeur.")}
'Vérifier le champ Texte Document manquant du Passeport '
TestObject TxtDocManquantPasseport=findTestObject('null')
WebUI.verifyElementPresent(TxtDocManquantPasseport, 1)
WebUI.setText(TxtDocManquantPasseport, 'Préciser le document manquant Passeport au demandeur')
'Annulation Du Document Manquant'
WebUI.check(DocManquantPasseport)

'Vérifier Passeport et voir Document '
TestObject objVoirDocPasseport=findTestObject('null')
CustomKeywords.'tools.OpenPopupInTab.OpenBrowserTab'(objVoirDocPasseport)
CustomKeywords.'tools.OpenPopupInTab.CloseBrowserTab'()
WebUI.delay(2)
'Rejeter le document'
WebUI.click(findTestObject('null'))
WebUI.doubleClick(findTestObject('null'))
WebUI.setText(findTestObject('null'), 'Observations Passeport pour le demandeur')
WebUI.click(findTestObject('null'))

//Copie du titre de séjour
'Vérifier la case à cocher du Document manquant de la Copie du titre de séjour '
TestObject DocManquantCopieTitreSejour=findTestObject('null')
WebUI.verifyElementPresent(DocManquantCopieTitreSejour, 1)
WebUI.check(DocManquantCopieTitreSejour)
'Vérifier le Titre du Texte Document manquant du Passeport '
TestObject MsgDocumentManquantCopieTitreSejour =findTestObject('null')
WebUI.verifyElementPresent(MsgDocumentManquantCopieTitreSejour, 1)
String TitreMsgDocumentManquantCopieTitreSejour = WebUI.getText(MsgDocumentManquantCopieTitreSejour)
if(!TitreMsgDocumentManquantCopieTitreSejour.contains('Préciser le document manquant au demandeur * :')) {
	KeywordUtil.markFailed("Vérifier le titre de Message Préciser le document manquant la Copie du titre de séjour au demandeur.")}
else {KeywordUtil.markPassed("Le Titre  de Message est bien Affiché : Préciser le document manquant la Copie du titre de séjour au demandeur.")}
'Vérifier le champ Texte Document manquant de la Copie du titre de séjour '
TestObject TxtDocManquantCopieTitreSejour=findTestObject('null')
WebUI.verifyElementPresent(TxtDocManquantPasseport, 1)
WebUI.setText(TxtDocManquantCopieTitreSejour, 'Préciser le document manquant la Copie du titre de séjour au demandeur')
'Annulation Du Document Manquant'
WebUI.check(DocManquantCopieTitreSejour)

'Vérifier la Copie du titre de séjour et voir Document '
TestObject objVoirDocCopieTitreSejour=findTestObject('null')
CustomKeywords.'tools.OpenPopupInTab.OpenBrowserTab'(objVoirDocCopieTitreSejour)
CustomKeywords.'tools.OpenPopupInTab.CloseBrowserTab'()
WebUI.delay(2)
'Rejeter le document'
WebUI.click(findTestObject('null'))
WebUI.doubleClick(findTestObject('null'))
WebUI.setText(findTestObject('null'), 'Observations de la Copie du titre de séjour pour le demandeur')
WebUI.click(findTestObject('null'))

// Valider et Enregistrer

TestObject EnregistrerQuitter = findTestObject('null')
WebUI.click(EnregistrerQuitter)