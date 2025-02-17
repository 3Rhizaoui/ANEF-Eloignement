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

WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
switch (RessourcesActuelles) {
	case 'SALARIE':
	'Situation De Mes Ressources Actuelle SALARIE'
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"),'14', FailureHandling.OPTIONAL)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"),'2013', FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"),'Profession Ressources', FailureHandling.OPTIONAL)
	'Informations sur mon employeur'
	WebUI.setText(findTestObject("null"),'Nom Employeur', FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"),'Adresse Employeur', FailureHandling.OPTIONAL)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"),'6 RUE NATHALIE LEMEL 44000 NANTES', FailureHandling.OPTIONAL)
	break
	case 'LYCEEN':
	'Situation De Mes Ressources Actuelle LYCEEN'
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"),'14', FailureHandling.OPTIONAL)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"),'2013', FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"),'EtablissementDeFormationLyceen', FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"),'FiliereLyceen', FailureHandling.OPTIONAL)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	break
	case 'ETUDIANT':
	'Situation De Mes Ressources Actuelle ETUDIANT'
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"),'14', FailureHandling.OPTIONAL)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"),'2013', FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"),'EtablissementDeFormationLyceen', FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"),'FiliereLyceen', FailureHandling.OPTIONAL)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	break
	case 'PROF_LIBERALES':
	'Situation De Mes Ressources Actuelle PROF_LIBERALES'
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"),'14', FailureHandling.OPTIONAL)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"),'2013', FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"),'Profession Ressources', FailureHandling.OPTIONAL)
	'Informations sur mon employeur'
	WebUI.setText(findTestObject("null"),'Nom Employeur', FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"),'Adresse Employeur', FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"),'1234567890', FailureHandling.OPTIONAL)
	break
	case 'ARTISANT_COMMERCANT':
	'Situation De Mes Ressources Actuelle ARTISANT_COMMERCANT'
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"),'14', FailureHandling.OPTIONAL)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"),'2013', FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"),'Profession Ressources', FailureHandling.OPTIONAL)
	'Informations sur mon employeur'
	WebUI.setText(findTestObject("null"),'Nom Employeur', FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"),'Adresse Employeur', FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"),'1234567890', FailureHandling.OPTIONAL)
	break
	case 'STAGIAIRE_FORMATION':
	'Situation De Mes Ressources Actuelle STAGIAIRE_FORMATION'
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"),'14', FailureHandling.OPTIONAL)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"),'2013', FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"),'Profession Ressources', FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"),'Organisme de formation', FailureHandling.OPTIONAL)
	break
	case 'SANS_EMPLOI':
	'Situation De Mes Ressources Actuelle SANS_EMPLOI'
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"),'14', FailureHandling.OPTIONAL)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"),'2013', FailureHandling.OPTIONAL)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	break
	case 'RETRAITE':
	'Situation De Mes Ressources Actuelle RETRAITE'
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"),'14', FailureHandling.OPTIONAL)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"),'2013', FailureHandling.OPTIONAL)
	default :
	break
}

'Mes Autres Ressources'
WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
String [] ListMesAutresRessources = MesAutresRessources.split("-")
println  "ListMesAutresRessources :" + ListMesAutresRessources

'Percevez-vous des prestations sociales auprès de la CAF ? *'
if (ListMesAutresRessources.contains("PrestationsSocialesCAF")) {WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)}
else {WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)}

"Percevez-vous des prestations sociales auprès d'autres organismes ? *"
if (ListMesAutresRessources.contains("PrestationsSocialesAutresOrganismes")) {
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"), "PreciserLesPrestationsAutresOrganismes")}
else {WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)}

"Percevez-vous des revenus mobiliers et/ou immobiliers en provenance de France ? *"
if (ListMesAutresRessources.contains("RevenusMobiliersFr")) {WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)}
else {WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)}

"Percevez-vous des revenus mobiliers et/ou immobiliers en provenance de l'étranger ? *"
if (ListMesAutresRessources.contains("RevenusMobiliersEtranger")) {WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)}
else {WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)} 
	
"Percevez-vous une pension alimentaire ? *"
if (ListMesAutresRessources.contains("PensionAlimentaire")) {WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)}
else {WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)}
"Percevez-vous une pension d'invalidité ? *"	
if (ListMesAutresRessources.contains("PensionInvalidite")) {WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)}
else {WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)}
	
"Percevez-vous une pension de réversion ? *"
if (ListMesAutresRessources.contains("PensionDeReversion")) {WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)}
else {WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)}	
	
"Percevez-vous tout autre type de pension ? *"
if (ListMesAutresRessources.contains("AutreTypeDePension")) {
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"), "PreciserLeTypeEtOrigineDuTypeDePension")}
else {WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)}	
	
"Êtes-vous pris en charge par une autre personne (parents, conjoint/concubin ou tiers) ? *"
if (ListMesAutresRessources.contains("ChargeParUneAutrePersonne")) {
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)}
else {WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)}
	
	
'Mes situations précédentes'
WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)

'Check de la Page '
def AnfCheck = WebUI.verifyElementPresent(findTestObject("null"), GlobalVariable.WaitLoadCheckZone)
if(AnfCheck) {
	KeywordUtil.markPassed( "Etape Mes Ressources est Validée")}
else {
	KeywordUtil.markFailed( "Etape Mes Ressources NON Validée")}

'Validation des pages Recapitulatifs'
'Valider Et Voir Le Recapitulatif'
TestObject ValiderEtVoirLeRecapitulatif = findTestObject("null")
WebUI.scrollToElement(ValiderEtVoirLeRecapitulatif,3)
WebUI.click(ValiderEtVoirLeRecapitulatif)

'Valider Et Verifier Parents Et Fratrie 2sur5'
TestObject ValiderEtVerifierParentsEtFratrie2sur5 = findTestObject("null")
WebUI.scrollToElement(ValiderEtVerifierParentsEtFratrie2sur5,3)
WebUI.click(ValiderEtVerifierParentsEtFratrie2sur5)

'Valider Et Verifier MaSituation Familiale 3sur5'
TestObject ValiderEtVerifierMaSituationFamiliale3sur5 = findTestObject("null")
WebUI.scrollToElement(ValiderEtVerifierMaSituationFamiliale3sur5,3)
WebUI.click(ValiderEtVerifierMaSituationFamiliale3sur5)

'Valider Et Verifier Mon Domicile 4sur5'
TestObject ValiderEtVerifierMonDomicile4sur5 = findTestObject("null")
WebUI.scrollToElement(ValiderEtVerifierMonDomicile4sur5,3)
WebUI.click(ValiderEtVerifierMonDomicile4sur5)

'Valider Et Verifier Mes Ressources 5sur5'
TestObject ValiderEtVerifierMesRessources5sur5 = findTestObject("null")
WebUI.scrollToElement(ValiderEtVerifierMesRessources5sur5,3)
WebUI.click(ValiderEtVerifierMesRessources5sur5)

"Passer à l'ajout De Documents"
TestObject PasserAjoutDeDocuments = findTestObject("null")
WebUI.scrollToElement(PasserAjoutDeDocuments,3)
WebUI.click(PasserAjoutDeDocuments)

'Validation du récapitulatif'
WebUI.callTestCase(findTestCase('null'),[:], FailureHandling.STOP_ON_FAILURE)





