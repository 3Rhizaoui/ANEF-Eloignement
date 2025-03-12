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
import com.kms.katalon.core.configuration.RunConfiguration

//generer la date actuelle
Calendar calendar = Calendar.getInstance()
Date currentDate = calendar.getTime()

// Formater la date au format DD/MM/YYYY
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy")
String formattedDate = sdf.format(currentDate)
DateActuelle =formattedDate.toString()
println(DateActuelle)

WebUI.delay(20)
"Attendre que le bouton soit cliquable"
WebUI.waitForElementClickable(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Ajouter_Decision_Et_Notification/btn_Ajouter_Decision'), 20, FailureHandling.STOP_ON_FAILURE)

"Cliquer sur le bouton Ajouter Une Decision "
WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Ajouter_Decision_Et_Notification/btn_Ajouter_Decision'), FailureHandling.STOP_ON_FAILURE)

boolean AprogationRetrait = GlobalVariable.AprogationRetrait

if (AprogationRetrait == true) {
	WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Ajouter_Decision_Et_Notification/btn_radio_Decision_Eloignement_Concernee'), FailureHandling.STOP_ON_FAILURE)
	WebUI.uploadFile(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Ajouter_Decision_Et_Notification/input_Fichier_Decision'), RunConfiguration.getProjectDir() + '/Data Files/Fichier_Test.pdf')
	
}
"Confirmer l'Ajout de decision"
WebUI.scrollToElement(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Ajouter_Decision_Et_Notification/btn_Confirmer_Ajout_Decision'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Ajouter_Decision_Et_Notification/btn_Confirmer_Ajout_Decision'), FailureHandling.STOP_ON_FAILURE)

"Attendre que le bouton Confirmer Notification soit cliquable"
WebUI.waitForElementClickable(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Ajouter_Decision_Et_Notification/btn_Confirmer_Notification'), 20, FailureHandling.STOP_ON_FAILURE)

"Confirmer Notification"
WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Ajouter_Decision_Et_Notification/btn_Confirmer_Notification'), FailureHandling.STOP_ON_FAILURE)

if (AprogationRetrait == false) {
WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Ajouter_Decision_Et_Notification/select_Mode_Notification'), ModeNotification, false, FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Ajouter_Decision_Et_Notification/input_Date_Notification'), DateActuelle, FailureHandling.STOP_ON_FAILURE)

	if (ModeNotification == 'Voie administrative') {
		WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Ajouter_Decision_Et_Notification/input_Heure_Notification'), '14:30', FailureHandling.STOP_ON_FAILURE)		
	}
"Ajouter un fichier "
WebUI.uploadFile(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Ajouter_Decision_Et_Notification/input_Ajouter_Fichier_Notification'), RunConfiguration.getProjectDir() + '/Data Files/Fichier_Test.pdf')

"Confirmer l'ajout de Notification"
WebUI.scrollToElement(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Ajouter_Decision_Et_Notification/btn_Confirmer_Ajout_Notification'), 5, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Ajouter_Decision_Et_Notification/btn_Confirmer_Ajout_Notification'), FailureHandling.STOP_ON_FAILURE)
WebUI.waitForElementClickable(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Ajouter_Decision_Et_Notification/btn_Enregistrer'), 7, FailureHandling.STOP_ON_FAILURE)
}

if (AprogationRetrait == true) {
	WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Ajouter_Decision_Et_Notification/select_Mode_Notification_Abrogation'), ModeNotification, false, FailureHandling.STOP_ON_FAILURE)
	WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Ajouter_Decision_Et_Notification/input_Date_Notification_Abrogation'), DateActuelle, FailureHandling.STOP_ON_FAILURE)
	
	if (ModeNotification == 'Voie administrative') {
		WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Ajouter_Decision_Et_Notification/input_Heure_Notification_Abrogation'), '14:30', FailureHandling.STOP_ON_FAILURE)
	}
	"Ajouter un fichier "
	WebUI.uploadFile(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Ajouter_Decision_Et_Notification/input_Fichier_Notification_Abrogation'), RunConfiguration.getProjectDir() + '/Data Files/Fichier_Test.pdf')
	
	"Confirmer l'ajout de Notification"
	WebUI.scrollToElement(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Ajouter_Decision_Et_Notification/btn_Confirmer_Ajout_Notification_Aprogation'), 5, FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Ajouter_Decision_Et_Notification/btn_Confirmer_Ajout_Notification_Aprogation'), FailureHandling.STOP_ON_FAILURE)
}








