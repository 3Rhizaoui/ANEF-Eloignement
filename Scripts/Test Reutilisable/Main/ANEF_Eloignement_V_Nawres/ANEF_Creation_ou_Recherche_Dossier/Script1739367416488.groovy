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
import org.apache.commons.lang.RandomStringUtils as RandStr

'Accèder à la page d\'accueil  ANEF eloignement'
WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Accueil_Principale/btn_ANEF_Eloignement'))

'Vérifier la position de la page d\'accueil eloignement'
WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Creation_ou_Recherche_Dossier/btn_Rechercher_Dossier'),1, FailureHandling.STOP_ON_FAILURE)
WebUI.delay(5)
"Cliquer sur le bouton Recherche Globale"
WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Creation_ou_Recherche_Dossier/btn_Rechercher_Dossier'))
'Choisir la methode de Creation d\'un nouveau dossier pour un numero etranger inexistant'
if (CreationOuRecherche == 'Creation') {
    
	// appel Fonction de Generation d'un Numero etranger aleatoire contenant 9 chiffres 
	long NumberUsagerRandom = CustomKeywords.'tools.MyStringTools.getRandomNumber'(100000000L, 9999999999L)
	println(NumberUsagerRandom)
	NumberUsager = NumberUsagerRandom.toString()
	
	//Inserer la valeur aleatoire générée dans le champs "Numero_Etranger 
    WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Creation_ou_Recherche_Dossier/Input_Numero_etranger'), NumberUsager , FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Creation_ou_Recherche_Dossier/Input_Numero_etranger'), FailureHandling.STOP_ON_FAILURE)
	// Scroll Until element is Visible 
	WebUI.scrollToElement(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Creation_ou_Recherche_Dossier/btn_Lancer_La_Recherche'), 5, FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Creation_ou_Recherche_Dossier/btn_Lancer_La_Recherche'), FailureHandling.STOP_ON_FAILURE)
	WebUI.delay(10)
	WebUI.scrollToElement(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Creation_ou_Recherche_Dossier/btn_Aucune_Correspondance'), 5, FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Creation_ou_Recherche_Dossier/btn_Aucune_Correspondance'), FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Creation_ou_Recherche_Dossier/btn_Creer_Un_Dossier_Etranger'), FailureHandling.STOP_ON_FAILURE)
	WebUI.delay(10)
}
if (CreationOuRecherche == 'Recherche') {
	WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Creation_ou_Recherche_Dossier/Input_Numero_etranger'), NumeroEtranger , FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Creation_ou_Recherche_Dossier/Input_Numero_etranger'), FailureHandling.STOP_ON_FAILURE)
	// Scroll Until element is Visible
	WebUI.scrollToElement(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Creation_ou_Recherche_Dossier/btn_Lancer_La_Recherche'), 5, FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Creation_ou_Recherche_Dossier/btn_Lancer_La_Recherche'), FailureHandling.STOP_ON_FAILURE)
	WebUI.delay(5)
	WebUI.scrollToElement(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Creation_ou_Recherche_Dossier/btn_Radio_Selectionner_Dossier'), 5, FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Creation_ou_Recherche_Dossier/btn_Radio_Selectionner_Dossier'), FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Creation_ou_Recherche_Dossier/btn_Choisir_Dossier_Etranger'), FailureHandling.STOP_ON_FAILURE)
	
	
}




