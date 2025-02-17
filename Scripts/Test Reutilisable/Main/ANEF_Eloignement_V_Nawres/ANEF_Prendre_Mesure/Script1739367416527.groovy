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

WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure/btn_Prendre_Mesure'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(5)
switch (Mesure){
	
	case 'OQTF':
	' Prendre Une Mesure OQTF  '
	WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure/select_Type_Mesure'), 'OQTF' ,false,FailureHandling.STOP_ON_FAILURE)
	'Cliquer sur le bourron Confirmer Mesure'
	WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure/btn_Confirmer_Mesure'), FailureHandling.STOP_ON_FAILURE)
	WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure/btn_Supprimer_Fiche_Mesure'),2, FailureHandling.STOP_ON_FAILURE)
	break
	
	case 'Expulsion':
	' Prendre Une Mesure Expulsion  '
	WebUI.waitForElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure/select_Type_Mesure'), 10, FailureHandling.STOP_ON_FAILURE)
	WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure/select_Type_Mesure'), 'Expulsion' ,false,FailureHandling.STOP_ON_FAILURE)
	'Cliquer sur le bourron Confirmer Mesure'
	WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure/btn_Confirmer_Mesure'), FailureHandling.STOP_ON_FAILURE)
	WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure/btn_Supprimer_Fiche_Mesure'),2, FailureHandling.STOP_ON_FAILURE)
	
	break
	
	case 'IAT':
	' Prendre Une Mesure IAT  '
	WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure/select_Type_Mesure'), 'IAT' ,false,FailureHandling.STOP_ON_FAILURE)
	'Cliquer sur le bourron Confirmer Mesure'
	WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure/btn_Confirmer_Mesure'), FailureHandling.STOP_ON_FAILURE)
	WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure/btn_Supprimer_Fiche_Mesure'),2, FailureHandling.STOP_ON_FAILURE)
	
	
	break
	
	case 'ITF':
	' Prendre Une Mesure ITF  '
	WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure/select_Type_Mesure'), 'ITF' ,false,FailureHandling.STOP_ON_FAILURE)
	'Cliquer sur le bourron Confirmer Mesure'
	WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure/btn_Confirmer_Mesure'), FailureHandling.STOP_ON_FAILURE)
	WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure/btn_Supprimer_Fiche_Mesure'),2, FailureHandling.STOP_ON_FAILURE)
	
	
	break
	
	case 'ExecutionFicheSIS':
	' Prendre Une Mesure ExecutionFicheSIS  '
	WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure/select_Type_Mesure'), 'Exécution fiche SIS L.615-1' ,false,FailureHandling.STOP_ON_FAILURE)
	'Cliquer sur le bourron Confirmer Mesure'
	WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure/btn_Confirmer_Mesure'), FailureHandling.STOP_ON_FAILURE)
	WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure/btn_Supprimer_Fiche_Mesure'),2, FailureHandling.STOP_ON_FAILURE)
	
	
	break
	
	case 'RemiseSchengen':
	' Prendre Une Mesure RemiseSchengen  '
	WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure/select_Type_Mesure'), 'Remise Schengen' ,false,FailureHandling.STOP_ON_FAILURE)
	'Cliquer sur le bourron Confirmer Mesure'
	WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure/btn_Confirmer_Mesure'), FailureHandling.STOP_ON_FAILURE)
	//WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure/btn_Supprimer_Fiche_Mesure'),2, FailureHandling.STOP_ON_FAILURE)
	
	break
	
	case 'TransfertDublin':
	' Prendre Une Mesure TransfertDublin  '
	WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure/select_Type_Mesure'), 'Transfert Dublin' ,false,FailureHandling.STOP_ON_FAILURE)
	'Cliquer sur le bourron Confirmer Mesure'
	WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure/btn_Confirmer_Mesure'), FailureHandling.STOP_ON_FAILURE)
	WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure/btn_Supprimer_Fiche_Mesure'),2, FailureHandling.STOP_ON_FAILURE)
	
	
	default :
	break	
}

WebUI.callTestCase(findTestCase('Test Cases/Test Reutilisable/Main/ANEF_Eloignement_V_Nawres/ANEF_Prendre_Mesure_Formulaire'),[ Mesure:Mesure ,FondementLegal : FondementLegal , NatureDeLacteExpulsion : NatureDeLacteExpulsion, UrgenceAbsolueExpulsion : UrgenceAbsolueExpulsion,RefuserDepartVolontaireOQTF:RefuserDepartVolontaireOQTF ,FondementLegalIRTF:FondementLegalIRTF , DecisionEtatTransfertDublin:DecisionEtatTransfertDublin ,ModeNotification:ModeNotification ,NaturePeineITF:NaturePeineITF ,TypeEmprisonnement:TypeEmprisonnement , DureeITF:DureeITF],FailureHandling.STOP_ON_FAILURE)

