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


/**
 * @author fsoreau
 */
//d'après TNR R.TSPT Supp90-Etudiant


CustomKeywords.'com.kazurayam.ksbackyard.HighlightElement.pandemic'()

'Appel Brique Réutilisable pour lancer URl ANEF pour Usager ou Agent'
//WebUI.callTestCase(findTestCase('Test Reutilisable/Main/ANEF_Eloignement_V_Nawres/ANEF_Lancer_URL_ANEF'), [Profiles:'Usager'], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('Test Reutilisable/Main/ANEF_Eloignement_V_Nawres/ANEF_Lancer_URL_ANEF'), [Profiles:'Agent'], FailureHandling.STOP_ON_FAILURE)

'Appel Brique Réutilisable pour Identification Usager ou Agent'
WebUI.callTestCase(findTestCase('null'), [Profiles:'Agent'], FailureHandling.STOP_ON_FAILURE)

//WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Accueil_Principale/btn_ANEF_ELOIGNEMENT'), 1)
//WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Accueil_Principale/btn_ANEF_ELOIGNEMENT'))


'Appel Brique Réutilisable pour création JDD'
//WebUI.callTestCase(findTestCase('null'), [DossierArrivee:DossierArrivee, NomEtrangerEloignement:NomEtrangerEloignement, PrenomEtrangerEloignement:PrenomEtrangerEloignement,
//	NumDossierInterne:NumDossierInterne, PaysNaissanceCreation:PaysNaissanceCreation , VilleNaissanceCreation:VilleNaissanceCreation, NationaliteNaissanceCreation:NationaliteNaissanceCreation,
//	JJNaissanceCreation:JJNaissanceCreation,  MMNaissanceCreation:MMNaissanceCreation,   AANaissanceCreation:AANaissanceCreation,
//	ModeleNom:ModeleNom, ModeleGenre:ModeleGenre, ModeleAAAANaissance:ModeleAAAANaissance, DateEntreeFranceCreation:DateEntreeFranceCreation, SituationFamilialeCreation:SituationFamilialeCreation,
//	ConditionEntreeFranceCreation:ConditionEntreeFranceCreation
//	 ], FailureHandling.STOP_ON_FAILURE)


//'Appel Brique Réutilisable pour arrivée dans l accueil ELOIGNEMENT'

WebUI.callTestCase(findTestCase('null'), [DossierArrivee:DossierArrivee, NomEtrangerEloignement:NomEtrangerEloignement, TypeEloignement:TypeEloignement,
	   FondementLegal:FondementLegal, ValeurDureeOQTF:ValeurDureeOQTF, TopMesureExecution:TopMesureExecution, MesureExecution: MesureExecution,
	Fondement_legal_assignation_a_residence:Fondement_legal_assignation_a_residence, AssignationResidence_dureeMM:AssignationResidence_dureeMM,	AssignationResidence_dureeJJ:AssignationResidence_dureeJJ,
	AssignationResidence_Document:AssignationResidence_Document,
	AssignationResidence_Peridiodicite:AssignationResidence_Peridiodicite, AssignationResidence_LieuPointage:AssignationResidence_LieuPointage, MesureExecution_AssignationResidence_Commune:MesureExecution_AssignationResidence_Commune,
	MesureExecution_AssignationResidence_Adresse:MesureExecution_AssignationResidence_Adresse, MesureExecution_AssignationResidence_Departement_PT:MesureExecution_AssignationResidence_Departement_PT,
	MesureExecution_AssignationResidence_Commune_PT:MesureExecution_AssignationResidence_Commune_PT, MesureExecution_AssignationResidence_HeureDe:MesureExecution_AssignationResidence_HeureDe,
	MesureExecution_AssignationResidence_HeureA:MesureExecution_AssignationResidence_HeureA,
	TopNonRespect:TopNonRespect, NonRespectDate:NonRespectDate, NonRespectHeure:NonRespectHeure, NonRespectMotif:NonRespectMotif, NonRespect_SaisineAutoriteJudiciaire_Date:NonRespect_SaisineAutoriteJudiciaire_Date,
	NonRespect_DecisionAutoriteJudiciaire:NonRespect_DecisionAutoriteJudiciaire,
	MesureExecution_RetentionAdministrative_Lieu:MesureExecution_RetentionAdministrative_Lieu, DepotDemandeDate:DepotDemandeDate, DepotDemandeHeure:DepotDemandeHeure,	AvisOFIIDate:AvisOFIIDate,
	LeveeRetentionDate:LeveeRetentionDate, MesureExecution_RetentionAdministrative_LeveeRetentionMotif:MesureExecution_RetentionAdministrative_LeveeRetentionMotif,
	AuteurDecision:AuteurDecision,
	EXPULSION_NatureActe:EXPULSION_NatureActe,	EXPULSION_UrgenceAbsolue:EXPULSION_UrgenceAbsolue,	EXPULSION_COMEX_DateNotif_Bulletin:EXPULSION_COMEX_DateNotif_Bulletin, EXPULSION_COMEX_Date:EXPULSION_COMEX_Date,
	EXPULSION_COMEX_DocType:EXPULSION_COMEX_DocType, EXPULSION_COMEX_Renvoi:EXPULSION_COMEX_Renvoi, EXPULSION_COMEX_Avis:EXPULSION_COMEX_Avis, EXPULSION_COMEX_Avis_Date:EXPULSION_COMEX_Avis_Date,
	EXPULSION_COMEX_AvisNotification_Date:EXPULSION_COMEX_AvisNotification_Date, EXPULSION_COMEX_AvisNotification_Heure:EXPULSION_COMEX_AvisNotification_Heure, EXPULSION_checkbox_COMEX_PoursuiteProcedure:EXPULSION_COMEX_PoursuiteProcedure,
	fondement_legal_OQTF_IRTF:fondement_legal_OQTF_IRTF, OQTF_duree_IRTF_MM:OQTF_duree_IRTF_MM, PaysRenvoi:PaysRenvoi], FailureHandling.STOP_ON_FAILURE)

//WebUI.callTestCase(findTestCase('Test Reutilisable/DemandeOuRenouvelle_TitreSejour/FormulaireMotifDeLaDemande'), [TypeTitreDeSejour:TypeTitreDeSejour, Titre:Titre], FailureHandling.STOP_ON_FAILURE


'Appel Brique Réutilisable pour déconnexion du portail agent ELOIGNEMENT'
//WebUI.callTestCase(findTestCase('null'), [Profiles:'Agent'], FailureHandling.STOP_ON_FAILURE)




