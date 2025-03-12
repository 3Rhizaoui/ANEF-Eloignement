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
import com.kms.katalon.core.configuration.RunConfiguration
import java.text.SimpleDateFormat
import java.util.Calendar

"Generer la date du jour"
// Obtenir la date et l'heure actuelles
Calendar calendar = Calendar.getInstance()
Date currentDate = calendar.getTime()

// Formater la date au format DD/MM/YYYY
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy")
String formattedDate = sdf.format(currentDate)
DateActuelle =formattedDate.toString()
println(DateActuelle)

WebUI.waitForElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/select_Fondement_Legal'), 10, FailureHandling.STOP_ON_FAILURE)
if(Mesure != 'ITF') {
	'Remplir le champ Fondement Legal'
	WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/select_Fondement_Legal'), FondementLegal ,false,FailureHandling.STOP_ON_FAILURE)


	if (Mesure == 'Expulsion') {
		if(NatureDeLacteExpulsion == 'AME') {
			"Choisir une Nature de l'Acte AME " 
			WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_radio_Nature_Acte_AME_Expulsion'), FailureHandling.STOP_ON_FAILURE)
	
			"Vérifier l'autorité Decisionnaire : Ministre de l’Intérieur "
			Autorite_Decisionnaire = WebUI.getText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/p_Autorité_Decisionnaire'), FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/p_Autorité_Decisionnaire'),'Ministre de l’Intérieur', FailureHandling.STOP_ON_FAILURE)
		}
		if(NatureDeLacteExpulsion == 'APE') {
			WebUI.delay(5)
			"Choisir une Nature de l'Acte APE "
			WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_radio_Nature_Acte_APE_Expulsion'), FailureHandling.STOP_ON_FAILURE)
		
			"Vérifier l'autorité Decisionnaire : Préfet "
			Autorite_Decisionnaire = WebUI.getText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/p_Autorité_Decisionnaire'), FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/p_Autorité_Decisionnaire'),'Préfet', FailureHandling.STOP_ON_FAILURE)
		}
		if (UrgenceAbsolueExpulsion == 'Non') {
			'Choisir une Urgence Absolue == Non '
			WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_radio_Urgence_Absolue_Non'), FailureHandling.STOP_ON_FAILURE)
		
			"Renseigner les champs Obligatoire Comex"
			WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/input_Date_Notification_Comex'), '12032025', FailureHandling.STOP_ON_FAILURE)
			WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/input_Date_Comex'), '12032025', FailureHandling.STOP_ON_FAILURE)
			WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_radio_Avis_Comex_Favorable'), FailureHandling.STOP_ON_FAILURE)
			WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/input_Date_Avis_Comex'), '15032025', FailureHandling.STOP_ON_FAILURE)
		
			"Refuser de Poursuivre la procédure d'expulsion"
			WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_radio_Poursuite_Procedure_Expulsion_Non'), FailureHandling.STOP_ON_FAILURE)
			WebUI.delay(5)
			"Vérifier que les champs de l'accordeon : Décision fixant le pays de renvoi sont desactivés "
			WebUI.verifyElementNotClickable(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/select_Pays_De_Renvoi'))
			
			WebUI.verifyElementNotClickable(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/select_Auteur_Decision'))
			WebUI.verifyElementNotClickable(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure/btn_Ajouter_Mesure_Execution'))
		
			"Accepter de Poursuivre la procédure d'expulsion"
			WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_radio_Poursuite_Procedure_Expulsion_Oui'), FailureHandling.STOP_ON_FAILURE)
			WebUI.delay(5)
			"Vérifier que les champs de l'accordeon : Décision fixant le pays de renvoi sont activés "
			WebUI.scrollToElement(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/select_Pays_De_Renvoi'),10)
			WebUI.verifyElementClickable(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/select_Pays_De_Renvoi'))
			
			WebUI.verifyElementClickable(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/select_Auteur_Decision'))
			}
			if (UrgenceAbsolueExpulsion == 'Oui') {
		
				'Choisir une Urgence Absolue == Oui '
				WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_radio_Urgence_Absolue_Oui'), FailureHandling.STOP_ON_FAILURE)
				WebUI.delay(5)
				"Vérifier que les champs de l'accordeon : Décision fixant le pays de renvoi sont activés "
				WebUI.verifyElementClickable(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/select_Pays_De_Renvoi'))
				WebUI.verifyElementClickable(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/select_Auteur_Decision'))
			}
	}
'Generer un numero aleatoire'
long NumberUsagerRandom = CustomKeywords.'tools.MyStringTools.getRandomNumber'(10, 99)
println(NumberUsagerRandom)
RandomNumber = NumberUsagerRandom.toString()

	"Renseigner les champs de l'accordeon Fondement Legal pour un OQTF "
	if (Mesure == 'OQTF') {
		if (RefuserDepartVolontaireOQTF == 'false') {
			"Accepter le delai depart Volontaire"

			WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/input_Delai_Depart_Jours'), RandomNumber, FailureHandling.STOP_ON_FAILURE)
		
			'Vérifier que le champ Expiration Delai contient la valeur -'
			//WebUI.verifyElementText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/p_Expiration_Delai'),'-', FailureHandling.STOP_ON_FAILURE)
			WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_radio_Obligation_fixee_Prefet'), FailureHandling.STOP_ON_FAILURE)
			//println("${RunConfiguration.getProjectDir()}")
			//println(RunConfiguration.getProjectDir())
		
			"Uploader un fichier dans DDV"
			String filePath = RunConfiguration.getProjectDir() + '/Data Files/Fichier_Test.pdf'
			println(filePath)
			WebUI.uploadFile(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/input_Fichier_DDV'),filePath)
		
			"Enregistrer les modifications"
			WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_Enregistrer'), FailureHandling.STOP_ON_FAILURE)
			WebUI.delay(5)
			"Ajouter une IRTF-1 "
			WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/select_Fondement_Legal_IRTF'), FondementLegalIRTF ,false, FailureHandling.STOP_ON_FAILURE)
		
			"Ajouter une IRTF-1 "
			WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/input_Duree_IRTF_Mois'), '200', FailureHandling.STOP_ON_FAILURE)
		
			"Verifier le message d'ereur de la durée legal IRTF"
			WebUI.verifyElementText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/p_Message_Erreur_Duree_IRTF'), 'Attention : la durée indiquée ne correspond pas à la durée légale maximale 10 ans')
		
			if(FondementLegalIRTF != 'L. 612-6') {
				WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/input_Duree_IRTF_Mois'), RandomNumber, FailureHandling.STOP_ON_FAILURE)
			}
		}
		
	
		if (RefuserDepartVolontaireOQTF == 'true') {
			"Refuser le delai depart Volontaire"
			WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_Refuser_Delai_Depart_Volontaire'), FailureHandling.STOP_ON_FAILURE)
			WebUI.delay(10)
			"Verifier que les champs DDV sont désactivés  "
			WebUI.verifyElementNotClickable(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/input_Delai_Depart_Jours'), FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/p_Expiration_Delai'),'-', FailureHandling.STOP_ON_FAILURE)
		
			//WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_Enregistrer'), FailureHandling.STOP_ON_FAILURE)
		
			"renseigner IRTF= 'L. 612-6' "
			WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/select_Fondement_Legal_IRTF'), 'L. 612-6' ,false, FailureHandling.STOP_ON_FAILURE)
			WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/input_Duree_IRTF_Mois'), '200', FailureHandling.STOP_ON_FAILURE)
			"Verifier le message d'ereur de la durée legal IRTF"
			WebUI.verifyElementText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/p_Message_Erreur_Duree_IRTF'), 'Attention : la durée indiquée ne correspond pas à la durée légale maximale 10 ans')
			WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/input_Duree_IRTF_Mois'), RandomNumber , FailureHandling.STOP_ON_FAILURE)
			WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_Enregistrer'), FailureHandling.STOP_ON_FAILURE)
		
		}
	}
		"Renseigner les champs de l'accordeon Fondement Legal pour une Remise Schengen "
		if (Mesure == 'RemiseSchengen')  {
	
			WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/select_Etat_Saisi_Remise_Schengen'), 'ALLEMAGNE' ,false,FailureHandling.STOP_ON_FAILURE)
			WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/input_date_Saisine_Etat_Membre'), DateActuelle, FailureHandling.STOP_ON_FAILURE)
			WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/input_Date_Reponse_Etat_Membre'), DateActuelle, FailureHandling.STOP_ON_FAILURE)
			WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/select_Etat_Remise'), 'ALLEMAGNE' ,false,FailureHandling.STOP_ON_FAILURE)
			WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/input_Duree_ICTF_Annee'), '4', FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/p_Message_Erreur_Duree_IRTF'), "L'interdiction de circulation sur le territoire ne peut pas excéder une durée de 3 ans")
			WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/input_Duree_ICTF_Annee'), '2', FailureHandling.STOP_ON_FAILURE)
			WebUI.delay(5)
			WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_Enregistrer'), FailureHandling.STOP_ON_FAILURE)
			
	
		}
	
"generer un nombre aleatoire entre '1' et '30'"
long RandomNumber = CustomKeywords.'tools.MyStringTools.getRandomNumber'(1, 30)
println(RandomNumber)
RandomNumberSelect = RandomNumber.toString()
	
	"Renseigner les champs de l'accordeon Fondement Legal pour un Transfert Dublin "

	if (Mesure == 'TransfertDublin')  {
	
		'Renseigner le champ Date Transmission de la Requête'
		WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/input_Date_Transmission_Requete'), DateActuelle, FailureHandling.STOP_ON_FAILURE)
		'Renseigner le champ Êtat Requis'
		WebUI.selectOptionByIndex(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/select_Etat_Requis'), RandomNumberSelect ,FailureHandling.STOP_ON_FAILURE)
		"Renseigner le champ Date de Reponse de l'etat requis" 
		WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/input_Date_Reponse_Etat_Requis'), DateActuelle, FailureHandling.STOP_ON_FAILURE)
		"Renseigner le champ Decision de l'Etat"
		WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/select_Decision_Etat_Requis'), DecisionEtatTransfertDublin ,false,FailureHandling.STOP_ON_FAILURE)

		"Renseigner le champ Date de fin de validité"
		WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/input_Date_Fin_Validite'), DateActuelle, FailureHandling.STOP_ON_FAILURE)
		"Renseigner le champ Date de la demande de réexamen"
		WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/input_Date_Demande_Reexamen'), DateActuelle, FailureHandling.STOP_ON_FAILURE)
		"Renseigner le champ Date de la décision de transfert "
		WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/input_Date_Decision_Transfert'), DateActuelle, FailureHandling.STOP_ON_FAILURE)
		'Renseigner le champ Êtat De Transfert'
		WebUI.selectOptionByIndex(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/select_Etat_Transfert'), RandomNumberSelect ,FailureHandling.STOP_ON_FAILURE)

	
		"Ajouter un Etat Requis si  DecisionEtatTransfertDublin = 'Refus' "
		'Ajouter un Etat Requis'
		if (DecisionEtatTransfertDublin =='Refus') {
			'Cliquer sur le boutton Ajouter Etat Requis'
			WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_Ajouter_Etat_Requis'), FailureHandling.STOP_ON_FAILURE)
			'Renseigner le champ Date Transmission de la Requête'
			WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/input_Date_Transmission_Requete_N_2'), DateActuelle , FailureHandling.STOP_ON_FAILURE)
			'Renseigner le champ Êtat Requis'
			WebUI.selectOptionByIndex(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/select_Etat_Requis_N_2'), RandomNumberSelect ,FailureHandling.STOP_ON_FAILURE)
			"Renseigner le champ Date de Reponse de l'etat requis"
			WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/input_Date_Reponse_Etat_Requis_N_2'), DateActuelle, FailureHandling.STOP_ON_FAILURE)
			"Renseigner le champ Decision de l'Etat"
			WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/select_Decision_Etat_Requis_N_2'), 'Accord' ,false,FailureHandling.STOP_ON_FAILURE)	
			"Renseigner le champ Date de la demande de réexamen"
			WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/input_Date_Demande_Reexamen_N_2'), DateActuelle, FailureHandling.STOP_ON_FAILURE)
			"Renseigner le champ Date de fin de validité"
			WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/input_Date_Fin_Validite_N_2'), DateActuelle, FailureHandling.STOP_ON_FAILURE)
			"Renseigner le champ Date de la décision de transfert "
			WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/input_Date_Decision_Transfert_N_2'),DateActuelle, FailureHandling.STOP_ON_FAILURE)
			WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_Enregistrer'), FailureHandling.STOP_ON_FAILURE)
			
		}	
	}
	if (Mesure == 'ExecutionFicheSIS' ) {
		"Ajouter un document "
		WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_Ajouter_Document'), FailureHandling.STOP_ON_FAILURE)
		WebUI.selectOptionByIndex(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/select_Type_Document'), '1' ,FailureHandling.STOP_ON_FAILURE)
	
		String filePath = RunConfiguration.getProjectDir() + '/Data Files/Fichier_Test.pdf'
		println(filePath)
		WebUI.uploadFile(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/input_Fichier_Fiche_Schengen'),filePath)
	
		WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_Enregistrer'), FailureHandling.STOP_ON_FAILURE)
	
	}

	if (Mesure == 'IAT' ) {
		"cliquer sur le bouton Durée indeterminée "
		WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_Duree_IAT_Indeterminee'), FailureHandling.STOP_ON_FAILURE)
		
		"Ajouter un document "
		WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_Ajouter_Document'), FailureHandling.STOP_ON_FAILURE)
		WebUI.selectOptionByIndex(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/select_Type_Document'), '1' ,FailureHandling.STOP_ON_FAILURE)
		WebUI.uploadFile(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/input_Fichier_Fiche_Schengen'), RunConfiguration.getProjectDir() + '/Data Files/Fichier_Test.pdf')
	
		"Renseigner le champ Date De decision"
		WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/input_Date_Decision_IAT'), DateActuelle, FailureHandling.STOP_ON_FAILURE)
		"Renseigner le champ Mode de Notification"
		WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/select_Mode_Notification'), ModeNotification ,false,FailureHandling.STOP_ON_FAILURE)
		WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/input_Date_Notification_IAT'), DateActuelle, FailureHandling.STOP_ON_FAILURE)
	
		if (ModeNotification == 'Voie administrative'){WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/input_Heure_Notification_IAT'), '13:30', FailureHandling.STOP_ON_FAILURE)}
		WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_Valider_Enregistrement_IAT'), FailureHandling.STOP_ON_FAILURE)
		//WebUI.waitForElementVisible(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_Confirmer_Enregistrement_Mesure'), 50, FailureHandling.STOP_ON_FAILURE)
		WebUI.scrollToElement(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_Confirmer_Enregistrement_Mesure'), 50, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_Confirmer_Enregistrement_Mesure'), FailureHandling.STOP_ON_FAILURE)

	
	}
	
}

if (Mesure == 'ITF' ) {
	if ( NaturePeineITF == 'Complementaire') {
		WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_Nature_Peine_Complementaire'), FailureHandling.STOP_ON_FAILURE)
		if (TypeEmprisonnement =='Ferme') {WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_Type_Emprisonnement_Ferme'), FailureHandling.STOP_ON_FAILURE)}
		if (TypeEmprisonnement =='Sursis') {WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_Type_Emprisonnement_Sursis'), FailureHandling.STOP_ON_FAILURE)}
	}
	if ( NaturePeineITF == 'Principale') {WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_Nature_Peine_Principale'), FailureHandling.STOP_ON_FAILURE)}
	if ( DureeITF == 'Temporaire') {
		WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_Duree_ITF_Temporaire'), FailureHandling.STOP_ON_FAILURE)
		"Vérifier les messages d'erreur des champs durée ITF"
		WebUI.waitForElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/input_Duree_ITF__Temporaire_Mois'), 40)
		WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/input_Duree_ITF__Temporaire_Mois'), '14', FailureHandling.STOP_ON_FAILURE)
		WebUI.verifyElementText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/p_Message_Erreur_Duree_ITF_Mois'),'Le Mois est invalide', FailureHandling.STOP_ON_FAILURE)
		WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/input_Duree_ITF__Temporaire_Mois'), '10', FailureHandling.STOP_ON_FAILURE)
		WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/input_Duree_ITF__Temporaire_Annee'), '13', FailureHandling.STOP_ON_FAILURE)
		WebUI.verifyElementText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/p_Message_Erreur_Duree_ITF_Annee'),'La durée ne peut excéder 10 ans', FailureHandling.STOP_ON_FAILURE)
	
		"Renseigner les champs Durée de l'ITF"
		WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/input_Duree_ITF__Temporaire_Annee'), '7', FailureHandling.STOP_ON_FAILURE)		
	}
	if ( DureeITF == 'Definitive') {WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_Duree_ITF_Definitive'), FailureHandling.STOP_ON_FAILURE)}
	"Renseigner les champs Date Executoire + Dtae Jugement"
	WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/input_Date_Executoire_ITF'), DateActuelle, FailureHandling.STOP_ON_FAILURE)
	WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/input_Date_Jugement_ITF'), DateActuelle, FailureHandling.STOP_ON_FAILURE)
	
	"Enregistrement de l'ITF"
	WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_Valider_Enregistrement_ITF'), FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_Confirmer_Enregistrement_Mesure'), FailureHandling.STOP_ON_FAILURE)
	
}

'Enregistrer les modifications'
WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_Enregistrer'), FailureHandling.STOP_ON_FAILURE)








