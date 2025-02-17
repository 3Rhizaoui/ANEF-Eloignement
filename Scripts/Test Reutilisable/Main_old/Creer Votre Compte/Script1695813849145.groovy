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
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.exception.StepErrorException;
import com.kms.katalon.core.exception.StepFailedException;
import com.kms.katalon.core.logging.ErrorCollector;
import com.kms.katalon.core.logging.KeywordLogger;
import java.net.URI;
import com.kms.katalon.core.exception.StepErrorException;
import com.kms.katalon.core.exception.StepFailedException;
import com.kms.katalon.core.logging.ErrorCollector;
import com.kms.katalon.core.logging.KeywordLogger;
import java.util.concurrent.TimeUnit;
import org.eclipse.jetty.websocket.client.ClientUpgradeRequest;
import org.eclipse.jetty.websocket.client.WebSocketClient;

'waiting for the number of elements in the DOM to stop changing'
//CustomKeywords.'tools.WaitForLoadedPage.waitForElementRendering'()

/** modify WebUI.* keywords which take TestObject as arg0
 * @author hhizaoui
 *so that they call Highlight.on() automatically
 */

'Call Highlight.on() automatically'
CustomKeywords.'com.kazurayam.ksbackyard.HighlightElement.pandemic'()
WebUI.waitForPageLoad(5)

'Cliquer sur le lien Se Connecter :'
 WebUI.click(findTestObject('null'))
 if (EnvExec == 'URL_ANEFQualif') {
"Appel de l'action Réutilisable pour contourner l'erreur lié à la confidentialité"
WebUI.callTestCase(findTestCase('Test Reutilisable/Main/ANEF_Eloignement_V_Nawres/Erreur_lie_a_la_confidentialite'), [:], FailureHandling.STOP_ON_FAILURE)
 }
"Première visiteq? Créez votre compte :"
WebUI.click(findTestObject('null'))

WebUI.waitForPageLoad(5)
println ("NumEtrangerVisa = "+ NumEtrangerVisa)
"Fournir Le Numéro de votre visa ou votre numéro étranger :"
WebUI.setText(findTestObject('null'), NumEtrangerVisa)

" Fournir La Date de début de validité :"
GlobalVariable.DateDebut=  DateDebut
def DateDebut = CustomKeywords.'tools.MyStringTools.ParsedDateDebut'()
ParsedDateDebut = CustomKeywords.'tools.MyStringTools.ParsedDateDebut'()
WebUI.setText(findTestObject('null'), ParsedDateDebut[0])
WebUI.selectOptionByIndex(findTestObject('null'), ParsedDateDebut[1])
WebUI.setText(findTestObject('null'), ParsedDateDebut[2])

" Fournir La Date de fin de validité :"
GlobalVariable.DateFin=  DateFin
def DateFin = CustomKeywords.'tools.MyStringTools.ParsedDateFin'()
ParsedDateFin = CustomKeywords.'tools.MyStringTools.ParsedDateFin'()
WebUI.setText(findTestObject('null'), ParsedDateFin[0])
WebUI.selectOptionByIndex(findTestObject('null'), ParsedDateFin[1])
WebUI.setText(findTestObject('null'), ParsedDateFin[2])

"Validation de la page pour la création du compte :"
WebUI.click(findTestObject('null'))

/*************************************************************************************/
'Vérification si Certaines informations que vous avez saisies sont incorrectes. Veuillez vérifier votre saisie. pb serveur AGERDF'
'Appel Brique Réutilisable VerificationCertainesInformationsSontIncorrectes' 
WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.OPTIONAL)
'Exit TestCase'
if (GlobalVariable.StopTestCase == true) {
	return null
}
/*************************************************************************************/
'Vérification si le compte existe déjà(message Erreur : Il semblerait que vos informations soient déjà associées à un compte.)'
'Appel Brique Réutilisable VerificationSiCompteExisteDeja'
WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.OPTIONAL)

'Exit TestCase'
if (GlobalVariable.StopTestCase == true) {
	return null
}

' Création de Email utilisateur'
def MonEmail = NumEtrangerVisa + '@yopmail.com'
WebUI.delay(2)
WebUI.setText(findTestObject('null'), MonEmail)
WebUI.setText(findTestObject('null'), MonEmail)
WebUI.click(findTestObject('null'))
WebUI.delay(2)
WebUI.click(findTestObject('null'))
WebUI.delay(2)

/**Ecouter les évennement NetWork et page
 * concatination URL création PW
 * */
'Get all cookies after Event NetWork in Page'
CustomKeywords.'tools.GetWebCookieByNamedCollected.GetWebCookie'()

'Navigation à URL  Qualification et Création MDP'
if (EnvExec == 'URL_ANEFQualif') {
String URL_CreationMDP = GlobalVariable.URLpwQualif + GlobalVariable.Token
WebUI.navigateToUrl(URL_CreationMDP)}

'Navigation à URL Préprode  et Création MDP'
if (EnvExec == 'URL_ANEFPreProd') {
String URL_CreationMDP = GlobalVariable.URLpwPreProd + GlobalVariable.Token
WebUI.navigateToUrl(URL_CreationMDP)}

'Vérification de la conformité du nouveau MDP'
WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

'Renseigner PDM Valide'
WebUI.setEncryptedText(findTestObject('null'), GlobalVariable.Password)
WebUI.setEncryptedText(findTestObject('null'), GlobalVariable.Password)
WebUI.click(findTestObject('null'))
"Retour à l'accueil"
WebUI.click(findTestObject('null'))
WebUI.waitForPageLoad(5)
