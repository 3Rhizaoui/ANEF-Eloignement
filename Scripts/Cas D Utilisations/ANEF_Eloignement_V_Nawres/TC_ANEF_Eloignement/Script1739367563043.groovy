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

import java.util.Locale

Locale.setDefault(new Locale("en", "US"))

'Appel Brique Réutilisable pour lancer URl ANEF pour Agent' 
WebUI.callTestCase(findTestCase('Test Cases/Test Reutilisable/Main/ANEF_Eloignement_V_Nawres/ANEF_Lancer_URL_ANEF'), [Profiles:Profiles, EnvExec:EnvExec], FailureHandling.STOP_ON_FAILURE)

'Appel Brique Réutilisable pour Identification Agent'
WebUI.callTestCase(findTestCase('Test Cases/Test Reutilisable/Main/ANEF_Eloignement_V_Nawres/ANEF_Identification'), [Profiles:Profiles,IdentifiantAgent:IdentifiantAgent,PwAgent:PwAgent,EnvExec:EnvExec], FailureHandling.STOP_ON_FAILURE)

'Appel Brique Réutilisable pour Creation ou Recherche de dossier avec un numero etranger '
WebUI.callTestCase(findTestCase('Test Cases/Test Reutilisable/Main/ANEF_Eloignement_V_Nawres/ANEF_Creation_ou_Recherche_Dossier'), [CreationOuRecherche:CreationOuRecherche,NumeroEtranger:NumeroEtranger], FailureHandling.STOP_ON_FAILURE)

if (CreationOuRecherche == 'Creation') {
	'Appel Brique Réutilisable pour Creation ou Recherche de dossier avec un numero etranger '
	WebUI.callTestCase(findTestCase('Test Cases/Test Reutilisable/Main/ANEF_Eloignement_V_Nawres/ANEF_Formulaire_Creation_Dossier'), [CreationOuRecherche:CreationOuRecherche,Sexe:Sexe, AnneeNaissance:AnneeNaissance,Nationnalite:Nationnalite,OrigineDossier:OrigineDossier,ControleChampsCreation:ControleChampsCreation , AjouterICTF:AjouterICTF],FailureHandling.STOP_ON_FAILURE)
}
println(GlobalVariable.NumeroEtranger)

/** if (CreationOuRecherche == 'Recherche') {
	'Appel Brique Réutilisable pour Creation ou Recherche de dossier avec un numero etranger '
	WebUI.callTestCase(findTestCase('Test Cases/Test Reutilisable/Main/ANEF_Eloignement_V_Nawres/ANEF_Formulaire_Recherche_Dossier'), FailureHandling.STOP_ON_FAILURE)
} */


'Appel Brique Réutilisable pour Prendre une Mesure selon les Choix : OQTF , Expulsion ,IAT ,ITF ,ExecutionFicheSIS, RemiseSchengen, TransfertDublin'
WebUI.callTestCase(findTestCase('Test Cases/Test Reutilisable/Main/ANEF_Eloignement_V_Nawres/ANEF_Prendre_Mesure'), [Mesure:Mesure,FondementLegal:FondementLegal , NatureDeLacteExpulsion:NatureDeLacteExpulsion ,NatureDeLacteExpulsion:NatureDeLacteExpulsion , UrgenceAbsolueExpulsion: UrgenceAbsolueExpulsion, RefuserDepartVolontaireOQTF : RefuserDepartVolontaireOQTF , FondementLegalIRTF:FondementLegalIRTF ,DecisionEtatTransfertDublin:DecisionEtatTransfertDublin,ModeNotification:ModeNotification , NaturePeineITF:NaturePeineITF ,TypeEmprisonnement:TypeEmprisonnement , DureeITF:DureeITF], FailureHandling.STOP_ON_FAILURE)

'Appel Brique Réutilisable pour Prendre une Decision + Notification'
boolean AprogationRetrait = GlobalVariable.AprogationRetrait
WebUI.callTestCase(findTestCase('Test Cases/Test Reutilisable/Main/ANEF_Eloignement_V_Nawres/ANEF_Ajouter_Decision_Et_Notification'), [AprogationRetrait : AprogationRetrait, ModeNotification : ModeNotification], FailureHandling.STOP_ON_FAILURE)

"Appel Brique Réutilisable pour Prendre une Mesure d'execution"
WebUI.callTestCase(findTestCase('Test Cases/Test Reutilisable/Main/ANEF_Eloignement_V_Nawres/ANEF_Prendre_Mesure_Execution'), [AjouterMesureExecution : AjouterMesureExecution ,TypeMesureExecution :TypeMesureExecution ,FondementLegalMesure : FondementLegalMesure ,ProtectionContreEloignement :ProtectionContreEloignement , LeveeRetention:LeveeRetention , Ajouter7JLD:Ajouter7JLD , ModeNotification:ModeNotification , DepartProgramme:DepartProgramme , ModaliteExecution:ModaliteExecution , Issue:Issue , Escorte:Escorte, AjouterVisiteDomiciliaire:AjouterVisiteDomiciliaire , FondementLegalVisite:FondementLegalVisite ,AjouterAssignationResidence : AjouterAssignationResidence , FondementAssignationResidence:FondementAssignationResidence , ReexamenExpulsion:ReexamenExpulsion , AjouterAprogationRetrait:AjouterAprogationRetrait , AprogationRetrait : AprogationRetrait , Mesure:Mesure , AjouterProlongationDDV:AjouterProlongationDDV ,AjouterProlongationIRTF :AjouterProlongationIRTF, AjouterIRTF2:AjouterIRTF2 ,RefuserDepartVolontaireOQTF:RefuserDepartVolontaireOQTF , NombreJLD:NombreJLD , AjouterRecoursContentieux:AjouterRecoursContentieux , AjouterRelevement:AjouterRelevement], FailureHandling.STOP_ON_FAILURE)










