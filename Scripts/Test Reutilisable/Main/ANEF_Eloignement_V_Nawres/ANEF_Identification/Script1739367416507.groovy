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


/** modify WebUI.* keywords which take TestObject as arg0
 * @author hhizaoui
 *so that they call Highlight.on() automatically
 */
CustomKeywords.'com.kazurayam.ksbackyard.HighlightElement.pandemic'()

/**Identification : Portail Usager
 */
if (Profiles == 'Usager') {
WebUI.delay(5)
' Cliquer sur le lien Se Connecter :'
 WebUI.click(findTestObject('null'))

"Appel de l'action Réutilisable pour contourner l'erreur lié à la confidentialité"
WebUI.callTestCase(findTestCase('Test Reutilisable/Main/ANEF_Eloignement_V_Nawres/Erreur_lie_a_la_confidentialite'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.delay(5)
"Renseigner l'Identifiant et le mot de passe :"
WebUI.setText(findTestObject('null'), NumEtrangerVisa)
GlobalVariable.NumEtrangerVisa = NumEtrangerVisa
WebUI.setEncryptedText(findTestObject('null'), GlobalVariable.Password)
WebUI.click(findTestObject('Object Repository/Connexion Usager/link_SeConnecter'))
WebUI.delay(15)
"Vérification position sur la page d'accueil"
WebUI.verifyElementPresent(findTestObject('null'), 2, FailureHandling.STOP_ON_FAILURE)}

"Identification : Portail Agent"
if (Profiles == 'Agent') {
if ( EnvExec == "URLPortailAgentQualif") { 
	WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_ANEF_Connexion/Input_UserNameAgent'), IdentifiantAgent)
	WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_ANEF_Connexion/Input_PasswordAgent'),PwAgent)}
if ( EnvExec == "URLPortailAgentPreProd"){
	WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_ANEF_Connexion/Input_UserNameAgent'),IdentifiantAgent )
	WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_ANEF_Connexion/Input_PasswordAgent'),PwAgent )}

WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_ANEF_Connexion/btn_Valider_Conx_Agent'))}


//Identification : Si la variable Portail incorrecte ou vide : Message d'erreur

else {
	println "Vérifier le Portail de votre connexion Usager ou Agent"
}
WebUI.delay(5)
WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Accueil_Principale/btn_ANEF_Eloignement'), 1,FailureHandling.STOP_ON_FAILURE)
