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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

/**
 * @author hhizaoui
 */


CustomKeywords.'com.kazurayam.ksbackyard.HighlightElement.pandemic'()
'Appel Brique Réutilisable pour lancer URl ANEF pour Usager ou Agent'
WebUI.callTestCase(findTestCase('Test Reutilisable/Main/ANEF_Eloignement_V_Nawres/ANEF_Lancer_URL_ANEF'), [('Profiles') : 'Usager', ('EnvExec') : EnvExec ], FailureHandling.STOP_ON_FAILURE)

//'Appel Brique Réutilisable pour Créer un Compte Usager'
//WebUI.callTestCase(findTestCase('null'), [('NumEtrangerVisa') : NumEtrangerVisa, ('DateDebut') : DateDebut
//     , ('DateFin') : DateFin, ('EnvExec') :EnvExec], FailureHandling.STOP_ON_FAILURE)

'Appel Brique Réutilisable pour Identification Usager ou Agent'
WebUI.callTestCase(findTestCase('Test Reutilisable/Main/ANEF_Eloignement_V_Nawres/ANEF_Identification'), [('Profiles') : 'Usager', ('NumEtrangerVisa') : NumEtrangerVisa],
FailureHandling.STOP_ON_FAILURE)

'Appel Brique Réutilisable pour une Demande De Naturalisation Fr Par Decret Usager'
WebUI.callTestCase(findTestCase('null'),
		[:], FailureHandling.STOP_ON_FAILURE)

'Appel Brique Réutilisable pour la saisie Du Formulaire Votre Situation Actuelle Usager'
WebUI.callTestCase(findTestCase('null'),
		[('PaysDeNaissance'):PaysDeNaissance, ('SituationParticulieres') : SituationParticulieres], FailureHandling.STOP_ON_FAILURE)

'Appel Brique Réutilisable pour la saisie Du Formulaire Information sur les Parents Et Fratrie Actuel'
WebUI.callTestCase(findTestCase('null'),
		[('SituationFamilialeActuelle') : SituationFamilialeActuelle, ('NombreFreresEtSoeurs') : NombreFreresEtSoeurs, ('NationaliteParent1') : NationaliteParent1, ('ParentConnu') : ParentConnu, ('NationaliteParent2') : NationaliteParent2], FailureHandling.STOP_ON_FAILURE)


'Appel Brique Réutilisable pour la saisie Du Formulaire Information sur La Situation Familiale Actuelle'
WebUI.callTestCase(findTestCase('null'),
		[('SituationFamilialeActuelle'):SituationFamilialeActuelle, ('NombreEnfants'):NombreEnfants, ('DateDeNaissanceEnfant1'):DateDeNaissanceEnfant1, ('DateDeNaissanceEnfant2'):DateDeNaissanceEnfant2, ('DateDeNaissanceEnfant3'):DateDeNaissanceEnfant3, ('DateDeNaissanceEnfant4'):DateDeNaissanceEnfant4,	('AdresseEnfant1'): AdresseEnfant1, ('AdresseEnfant2'): AdresseEnfant2, ('AdresseEnfant3'): AdresseEnfant3, ('AdresseEnfant4'): AdresseEnfant4, ('PaysDeNaissance1'):PaysDeNaissance1, ('PaysDeNaissance2'):PaysDeNaissance2, ('PaysDeNaissance3'):PaysDeNaissance3, ('PaysDeNaissance4'):PaysDeNaissance4, ('NationaliteEnfant1'): NationaliteEnfant1, ('NationaliteEnfant2'):NationaliteEnfant2, ('NationaliteEnfant3'): NationaliteEnfant3, ('NationaliteEnfant4'):NationaliteEnfant4 ],FailureHandling.STOP_ON_FAILURE)

'Appel Brique Réutilisable pour la saisie Du Formulaire Mon Domicile'
WebUI.callTestCase(findTestCase('null'),
		[('SituationFoyerActuelle') : SituationFoyerActuelle], FailureHandling.STOP_ON_FAILURE)

'Appel Brique Réutilisable pour la saisie Du Formulaire Mes Ressources'
WebUI.callTestCase(findTestCase('null'),
		[('RessourcesActuelles') : RessourcesActuelles, ('MesAutresRessources') : MesAutresRessources], FailureHandling.STOP_ON_FAILURE)

'Appel Brique Réutilisable pour la saisie Du Formulaire Mes Documents'
WebUI.callTestCase(findTestCase('null'),[ ('ParentConnu') : ParentConnu], FailureHandling.STOP_ON_FAILURE)

if (Paiement == 'Oui') {
'Appel Brique Réutilisable pour la saisie Du Formulaire Paiement'
WebUI.callTestCase(findTestCase('null'),
		[('TimbreNumero1Sur4') : TimbreNumero1Sur4, ('TimbreNumero2Sur4') : TimbreNumero2Sur4, ('TimbreNumero3Sur4') : TimbreNumero3Sur4,('TimbreNumero4Sur4') : TimbreNumero4Sur4], FailureHandling.STOP_ON_FAILURE)
}

if (TraitementAgent == 'Oui') {

'Appel Brique Réutilisable "ConnexionPositionnementSiteDeTraitementAgent" pour lancer URl, Conx et Positionnement Agent'
WebUI.callTestCase(findTestCase('null'), [('Profiles') : 'Usager', ('EnvExec') : EnvExec, ('NumEtrangerVisa') : NumEtrangerVisa ], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

'Appel Brique Réutilisable pour lancer URl ANEF pour Usager ou Agent'
WebUI.callTestCase(findTestCase('Test Reutilisable/Main/ANEF_Eloignement_V_Nawres/ANEF_Lancer_URL_ANEF'), [('Profiles') : 'Usager', ('EnvExec') : EnvExec ], FailureHandling.STOP_ON_FAILURE)

'Appel Brique Réutilisable pour Identification Usager ou Agent'
WebUI.callTestCase(findTestCase('Test Reutilisable/Main/ANEF_Eloignement_V_Nawres/ANEF_Identification'), [('Profiles') : 'Usager', ('NumEtrangerVisa') : NumEtrangerVisa],
FailureHandling.STOP_ON_FAILURE)

'Mes Notifications'
TestObject  MesNotificationDemandeur =  findTestObject('null')
WebUI.click(MesNotificationDemandeur)
'Voir Toutes Mes Notifications'
TestObject  VoirToutesMesNotificationsDemandeur =  findTestObject('null')
WebUI.click(VoirToutesMesNotificationsDemandeur)

'Confirmation de dépôt'
TestObject  ConfirmationDeDepotDemandeur =  findTestObject('null')
if (WebUI.verifyElementPresent(ConfirmationDeDepotDemandeur, 10)) {
	def text = WebUI.getText(findTestObject)
	if (text == 'Confirmation de dépôt') {
		CustomKeywords.'tools.markPasseAndStop.markPasseAndStopTest'(text)}
	else {CustomKeywords.'tools.markErreurAndStop.markErreurAndStopTest'("Le texte de la Notification n'est pas conforme")}
}
}
