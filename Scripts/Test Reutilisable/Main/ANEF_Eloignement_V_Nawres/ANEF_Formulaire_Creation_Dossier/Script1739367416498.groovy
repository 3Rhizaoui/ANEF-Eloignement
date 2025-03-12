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

7if (ControleChampsCreation =="True") {
"Onglet 'Dossier etranger'"
'Vérification des correspondances entres les accordéons dans la page et le menu à gauche'

WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Onglet_Dossier_Etranger'), 1,FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Accordeon/lbl_Numero_Etranger'), 1,FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Accordeon/lbl_Prefecture_Gestionnaire'), 1,FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Accordeon/lbl_Derniere_Modification'), 1,FailureHandling.STOP_ON_FAILURE)


'Accordeon Reference Dossier'

WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Accordeon/Acc_ Reference_Du_Dossier'), 1,FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Menu/Menu_Reference_Du_Dossier'), 1,FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/input_Numero_De_Dossier_FPR'), 1,FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/input_Numero_Dossier_Interne'), 1,FailureHandling.STOP_ON_FAILURE)

'Accordeon Etat Civil '
WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Accordeon/Acc_Etat_Civil'), 1,FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Menu/Menu_Fiche_Etat_Civil'), 1,FailureHandling.STOP_ON_FAILURE)



'Accordeon Biometrie '
WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Menu/Menu_Biometrie'), 1,FailureHandling.STOP_ON_FAILURE)


"Accordeon Conditions d'entrée en France "
WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Accordeon/Acc_ Conditions_D_Entree_En_France'), 1,FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Accordeon/Acc_ Conditions_D_Entree_En_France'), 1,FailureHandling.STOP_ON_FAILURE)


"Accordeon Antécédents administratifs"
WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Menu/Menu_Antecedents_Administratifs'), 1,FailureHandling.STOP_ON_FAILURE)

"Accordeon Document De Voyage "
WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Accordeon/Acc_Documents_De_Voyage'), 1,FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Menu/Menu_Documents_De_Voyage'), 1,FailureHandling.STOP_ON_FAILURE)

"Accordeon Sortant d'établissement pénitentiaire "
WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Accordeon/Acc_Etablissement_Penitentiaire'), 1,FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Menu/Menu_Sortant_D_Etablissement_Penitentiaire'), 1,FailureHandling.STOP_ON_FAILURE)

"Accordeon Consultations sécuritaires"
WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Menu/Menu_Consultations_Securitaires'), 1,FailureHandling.STOP_ON_FAILURE)

}

/***Affichage du Texte "Les champs marqués d'un* sont obligatoires"
Affichage des champs suivants :
1. Etat civil :
 => Nom *
 => Nom d'usage
 => Prénom(s)
 => Sexe * avec boutons radio Féminin ou Masculin
 => Bouton +Ajouter un prénom
 => Bouton +Ajouter une autre identité déclarée
2. Date de naissance : avec une coche Date approximative
 => Jour
 => Mois
 => Année *
3. Pays de naissance * avec une liste déroulante
4. Lieu de naissance *
5. Nationalité * avec une liste déroulante
6. Adresse
7. Case Adresse outre-mer
8. Langue(s) parlée(s) avec une liste déroulante
9. Bouton +Ajouter une langue parlée
10. Langue(s) comprise(s) avec une liste déroulante
11. Bouton +Ajouter une langue comprise
12. Photo de l'étranger avec un Bouton +Ajouter une photo
13. Document d'état civil avec un Bouton +Ajouter un document-
**/

'Remplir les champs obligatoire du formulaire'
'Generer un nom aleatoire'
String RandomNom = CustomKeywords.'tools.MyStringTools.genererChaineAleatoire'(5)
println(RandomNom)

'Renseigner Le Nom'
WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/input_Nom'), RandomNom , FailureHandling.STOP_ON_FAILURE)

'Renseigner Le Sexe (M/F)'
if(Sexe == 'Femme') {WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/btn_radio_Sexe_F'), FailureHandling.STOP_ON_FAILURE)}
if(Sexe == 'Homme') {WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/btn_radio_Sexe_M'), FailureHandling.STOP_ON_FAILURE)}

//CustomKeywords.'tools.ExecuteActions.ClickObjectJs' ('/html/body/app-root/app-layout-borderless/div[3]/app-prise-mesure/div/app-dsfr-onglet-tab/div/div[1]/app-fiche-etranger/div/div[2]/section[3]/div[2]/app-accordeon-fiche-etat-civil/section/div/form/div[1]/div[1]/div[2]/div[2]/app-dsfr-radio/div/fieldset/div/div[1]')
//CustomKeywords.'tools.ExecuteActions.ClickObjectJs'('/html/body/app-root/app-layout-borderless/div[3]/app-gestion-procedure-eloignement/div/app-confirm-modal/dialog/div/div/div/div/div[2]/app-search-etranger/app-search-box/div[1]/div/div/div[2]/div/div[2]/app-dsfr-radio/div/fieldset/div[1]/div[1]/input')
'Cocher la case date de naissance approximative'
WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/btn_Radio_Date_Naissance_Approximative'), FailureHandling.STOP_ON_FAILURE)

"Renseigner l'Année de Naissance (Majeur/Mineur)"
WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/input_Date_De_Naissance_Annee'), AnneeNaissance , FailureHandling.STOP_ON_FAILURE)

'Renseigner Le Pays De Naissance  (RPT/RUE) '
if(Nationnalite == 'RPT') {WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/select_Pays_De_Naissance'), 'ALGERIE' ,false,FailureHandling.STOP_ON_FAILURE)}
if(Nationnalite == 'RUE') {WebUI.selectOptionByValue(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/select_Pays_De_Naissance'), 'ALLEMAGNE' ,false,FailureHandling.STOP_ON_FAILURE)}

'Renseigner la Nationalité '
if(Nationnalite == 'RPT') {WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/select_Nationnalite'), 'algérienne' ,false,FailureHandling.STOP_ON_FAILURE)}
if(Nationnalite == 'RUE') {WebUI.selectOptionByValue(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/select_Nationnalite'), 'allemande' ,false,FailureHandling.STOP_ON_FAILURE)}

'Renseigner Le Lieu de Naissance pour (RPT/RUE) '
if(Nationnalite == 'RPT') { WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/input_Lieu_De_Naissance'), 'Wahran' , FailureHandling.STOP_ON_FAILURE)}
if(Nationnalite == 'RUE') { WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/input_Lieu_De_Naissance'), 'Frankfurt' , FailureHandling.STOP_ON_FAILURE)}

'Renseigner la Situation Familiale'
WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/select_Situation_Familiale'), 'Célibataire' ,false,FailureHandling.STOP_ON_FAILURE)

'Renseigner Condition d entrée en France'
WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/input_Date_Entree_En_France'), '22/03/2020')
WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/select_Condition_Entree_En_France'), 'Irrégulière' ,false,FailureHandling.STOP_ON_FAILURE)

if (ControleChampsCreation == 'true') {
'Vérifier que les elements sont presents dans l accordeon -Etat Civil' 
WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/input_Nom_Usage'), 1,FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/input_Prenom'), 1,FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/btn_Ajouter_Prenom'), 1,FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/btn_Ajouter_Identité_Declaree'), 1,FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/btn_Ajouter_Photo'), 1,FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/btn_Ajouter_Document_Etat_Civil'), 1,FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/btn_Radio_Outre_Mer'), 1,FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/btn_Ajouter_Langue_Parlee'), 1,FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/btn_Ajouter_Langue_Comprise'), 1,FailureHandling.STOP_ON_FAILURE)

"Vérifier que les elements sont presents dans l'accordeon -Situation Familiale"
WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/select_Situation_Familiale'), 1,FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/input_Nombre_Enfants'), 1,FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/btn_Ajouter_Attache_Familiale'), 1,FailureHandling.STOP_ON_FAILURE)

"Vérifier que les elements sont presents dans l'accordeon -Conditions d'entrée en france"
WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/input_Date_Entree_En_France'), 1,FailureHandling.STOP_ON_FAILURE)

"Vérifier que les elements sont presents dans l accordeon -Document de voyage et pièces d’identité"
WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/btn_Ajouter_Document_De_Voyage'), 1,FailureHandling.STOP_ON_FAILURE)

"Vérifier que les elements sont presents dans l accordeon -Diligence consulaire"
}

'Validation Creation de dossier'
WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/btn_Enregistrer'), FailureHandling.STOP_ON_FAILURE)

"Verification de l'affichage et click sur le bouton Valider et attribuer un numero Etranger"

WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/btn_Valider_Attribuer_Numero_Etranger'), 4,FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/btn_Valider_Attribuer_Numero_Etranger'), FailureHandling.STOP_ON_FAILURE)


switch (OrigineDossier){
	case 'Interpellation':
	' l Origine du Dossier est Interpellation '
	WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/select_Origine_Dossier'), 'Interpellation' ,false,FailureHandling.STOP_ON_FAILURE)
	break
	case 'SortantEtablissementPenitentiaire':
	' l Origine du Dossier est SortantEtablissementPenitentiaire'
	WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/select_Origine_Dossier'), 'Sortant d’établissement pénitentiaire' ,false,FailureHandling.STOP_ON_FAILURE)
	break
	case 'Sejour':
	' l Origine du Dossier est Sejour'
	WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/select_Origine_Dossier'), 'Séjour' ,false,FailureHandling.STOP_ON_FAILURE)
	break
	case 'Asile':
	' l Origine du Dossier est Asile'
	WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/select_Origine_Dossier'), 'Asile' ,false,FailureHandling.STOP_ON_FAILURE)
	default :
	break
	
}
'Cliquer sur le bouton Attribuer Numero Etranger'
WebUI.scrollToElement(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/btn_Confirmer_Attribuer_Numero_Etranger'), 5)

'Cliquer sur le bouton Confirmer et Attribuer Numero Etranger'
WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/btn_Confirmer_Attribuer_Numero_Etranger'), FailureHandling.STOP_ON_FAILURE)

//WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/btn_Modifier_Dossier_Etranger'), 4,FailureHandling.STOP_ON_FAILURE)
/***
Message = WebUI.getText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/h3_Message_Creation_Avec_Succes'))
println(Message)
WebUI.verifyElementText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/h3_Message_Creation_Avec_Succes'),Message, FailureHandling.STOP_ON_FAILURE)
*/

'Stocker la valeur Numero Etranger attribué '

NumeroEtrangerGenere = WebUI.getText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/p_Numero_Etranger_Genere'))

GlobalVariable.NumeroEtranger = NumeroEtrangerGenere
println(NumeroEtrangerGenere)
println(GlobalVariable.NumeroEtranger)

//println(GlobalVariable.NumeroEtranger)

//WebUI.delay(1000)

/**'Cliquer sur le bouton Valider les modifications'
WebUI.waitForElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/btn_Valider_Les_Modifications') ,10)
WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Formulaire_Creation_Dossier/Formulaire_Creation_Dossier_Input/btn_Valider_Les_Modifications'))

WebUI.delay(10)

'Rechercher Dossier après Creation'
"Cliquer sur le bouton Pilotage d'activité pour la redircetion vers la page de recherche Dossier"
WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Creation_ou_Recherche_Dossier/onglet_Pilotage_Activite'))
WebUI.waitForElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Creation_ou_Recherche_Dossier/btn_Rechercher_Dossier') ,5)

String xpathExpression = "//td[contains(text(),'" + GlobalVariable.NumeroEtranger + "')]//following-sibling::td[8]"
println(xpathExpression)
"cliquer sur l'onglet origine dossier"
switch (OrigineDossier){
	case 'Interpellation':
	' l Origine du Dossier est Interpellation '
	WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Creation_ou_Recherche_Dossier/btn_onglet_Interpellations'),FailureHandling.STOP_ON_FAILURE)
	break
	case 'SortantEtablissementPenitentiaire':
	' l Origine du Dossier est SortantEtablissementPenitentiaire'
	WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Creation_ou_Recherche_Dossier/btn_Onglet_Etablissement_Penitentiaire'),FailureHandling.STOP_ON_FAILURE)
	break
	case 'Sejour':
	' l Origine du Dossier est Sejour'
	WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Creation_ou_Recherche_Dossier/btn_Onglet_Sejour'),FailureHandling.STOP_ON_FAILURE)
	break
	case 'Asile':
	'l Origine du Dossier est Asile'
	WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Creation_ou_Recherche_Dossier/btn_Onglet_Asile'),FailureHandling.STOP_ON_FAILURE)
	default :
	break
	
}
// Définir l'élément avec son XPath
TestObject element = new TestObject('MyElement')
element.addProperty('xpath', ConditionType.EQUALS, "//td[contains(text(),'" + GlobalVariable.NumeroEtranger + "')]//following-sibling::td[8]")
WebUI.click(element)

WebUI.delay(10)
*/



