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

//Ajouter une mesure d'execution

if ( AjouterMesureExecution == 'True') {
	WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_Ajouter_Mesure_Execution'), FailureHandling.STOP_ON_FAILURE)

	if(TypeMesureExecution == 'Retention administrative') {
		"Retention Administrative"
		WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_radio_Retention_Administrative'), FailureHandling.STOP_ON_FAILURE)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/select_Fondement_Legal_Mesure'), FondementLegalMesure ,false,FailureHandling.STOP_ON_FAILURE)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/select_Lieu_Retention'), '0006-NICE-CRA' ,false,FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_Enregistrer'), FailureHandling.STOP_ON_FAILURE)
		
		"Ajouter une protection Contre l'eloignement"
		if(ProtectionContreEloignement =="Oui") {
			WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_radio_Protection_Contre_Eloignement_Oui'), FailureHandling.STOP_ON_FAILURE)
			WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/input_Date_Depot_Demande'), DateActuelle, FailureHandling.STOP_ON_FAILURE)
			WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/input_Heure_Depot_Demande'), '10:30', FailureHandling.STOP_ON_FAILURE)
			WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/input_Date_Avis_Ofii'), DateActuelle, FailureHandling.STOP_ON_FAILURE)
			
			"Ajouter un document"
			WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_Ajouter_Document_Protection_Contre_Eloignement'), FailureHandling.STOP_ON_FAILURE)
			WebUI.selectOptionByIndex(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/select_Type_Document'), '1' ,FailureHandling.STOP_ON_FAILURE)
			WebUI.uploadFile(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/input_Fichier_Fiche_Schengen'), RunConfiguration.getProjectDir() + '/Data Files/Fichier_Test.pdf')
		}
		" Signaler une levée de rétention "
		
		"generer un nombre aleatoire entre '1' et '8'"
		long RandomNumber = CustomKeywords.'tools.MyStringTools.getRandomNumber'(1, 8)
		println(RandomNumber)
		RandomNumberSelect = RandomNumber.toString()
		
		if( LeveeRetention=="Oui") {
			WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_Signaler_Levee_Retention'), FailureHandling.STOP_ON_FAILURE)
			WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/input_Date_Levee_Retention'), DateActuelle, FailureHandling.STOP_ON_FAILURE)
			WebUI.selectOptionByIndex(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/select_Motif_Levee_Retention'), RandomNumberSelect ,FailureHandling.STOP_ON_FAILURE)
			
			
			
		}
		
	}
	if(TypeMesureExecution == 'Visite domiciliaire') {
		WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_radio_Visite_Domiciliaire'), FailureHandling.STOP_ON_FAILURE)
		
	}
	if(TypeMesureExecution == 'Assignation a residence') {
		WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_radio_Assignation_Residence'), FailureHandling.STOP_ON_FAILURE)
		
	}
}