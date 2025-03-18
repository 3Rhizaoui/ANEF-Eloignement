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
import org.openqa.selenium.WebElement
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.ConditionType
import org.openqa.selenium.Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


"Generer la date du jour"
// Obtenir la date et l'heure actuelles
Calendar calendar = Calendar.getInstance()
Date currentDate = calendar.getTime()

// Formater la date au format DD/MM/YYYY
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy")
String formattedDate = sdf.format(currentDate)
DateActuelle =formattedDate.toString()

//Ajouter une mesure d'execution

// Définir la locale en "fr_FR" (France, format 24h)


if ( AjouterMesureExecution == 'True') {
	
	if(Mesure =="OQTF") {
		
		if(AjouterProlongationDDV == "Oui" && RefuserDepartVolontaireOQTF == "false") {
			
			GlobalVariable.AprogationRetrait = false
			boolean AprogationRetrait = GlobalVariable.AprogationRetrait
			println(AprogationRetrait)
			"Ajouter Une prolongation DDV "
			WebUI.waitForElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_Ajouter_Prolongation_DDV'), 5, FailureHandling.STOP_ON_FAILURE)
			WebUI.delay(3)
			CustomKeywords.'tools.ExecuteActions.ClickObjectJs'('//app-accordeon-delai-depart-volontaire/section/div/form//button[contains(text(),"Ajouter une prolongation")]')
			
			//WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_Ajouter_Prolongation_DDV'), FailureHandling.STOP_ON_FAILURE)
			WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/input_Duree_Delai_Prolongation'), '25', FailureHandling.STOP_ON_FAILURE)
			WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_Enregistrer'), FailureHandling.STOP_ON_FAILURE)
			"Ajouter une decision + Notification"
			WebUI.callTestCase(findTestCase('Test Cases/Test Reutilisable/Main/ANEF_Eloignement_V_Nawres/ANEF_Ajouter_Decision_Et_Notification'), [ AprogationRetrait : AprogationRetrait , ModeNotification : ModeNotification], FailureHandling.STOP_ON_FAILURE)
			
		}
		
		if( AjouterProlongationIRTF == "Oui" && RefuserDepartVolontaireOQTF == "false") {
			
			GlobalVariable.AprogationRetrait = false
			boolean AprogationRetrait = GlobalVariable.AprogationRetrait
			println(AprogationRetrait)
			"Ajouter Une prolongation IRTF "
			WebUI.scrollToElement(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_Ajouter_Prolongation_IRTF'), 5, FailureHandling.STOP_ON_FAILURE)
			WebUI.delay(3)
			
			CustomKeywords.'tools.ExecuteActions.ClickObjectJs'('//app-accordeon-ictf-irtf/section//form//button[contains(text(),"Ajouter une prolongation")]')
			
			//WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_Ajouter_Prolongation_IRTF'), FailureHandling.STOP_ON_FAILURE)
			WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/input_Ptolongation_IRTF'), '2', FailureHandling.STOP_ON_FAILURE)
			WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_Enregistrer'), FailureHandling.STOP_ON_FAILURE)
			
			"Ajouter une decision + Notification"
			WebUI.callTestCase(findTestCase('Test Cases/Test Reutilisable/Main/ANEF_Eloignement_V_Nawres/ANEF_Ajouter_Decision_Et_Notification'), [ AprogationRetrait : AprogationRetrait , ModeNotification : ModeNotification], FailureHandling.STOP_ON_FAILURE)
			
		}
		if( AjouterIRTF2 == "Oui" ) {
			
			GlobalVariable.AprogationRetrait = false
			boolean AprogationRetrait = GlobalVariable.AprogationRetrait
			println(AprogationRetrait)
			WebUI.delay(3)
			"Ajouter Un IRTF "
			
			CustomKeywords.'tools.ExecuteActions.ClickObjectJs'('//app-accordeon-ictf-irtf//button[contains(text()," Ajouter une IRTF")]')
			//WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_Ajouter_IRTF'), FailureHandling.STOP_ON_FAILURE)
			WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/select_Fondement_Legal_IRTF_2'), 'L. 612-7' ,false, FailureHandling.STOP_ON_FAILURE)
			"Renseigner le champ duree IRTF2"
			WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/input_Duree_IRTF_2_Mois'), '2', FailureHandling.STOP_ON_FAILURE)
			
			"Enregistrer les modifications"
			WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_Enregistrer'), FailureHandling.STOP_ON_FAILURE)
			
			"Ajouter une decision + Notification"
			WebUI.callTestCase(findTestCase('Test Cases/Test Reutilisable/Main/ANEF_Eloignement_V_Nawres/ANEF_Ajouter_Decision_Et_Notification'), [ AprogationRetrait : AprogationRetrait , ModeNotification : ModeNotification], FailureHandling.STOP_ON_FAILURE)
			
		}
					
	}
	
	if (Mesure=="RemiseSchengen" && AjouterICTF=="Oui") {
		GlobalVariable.AprogationRetrait = false
		boolean AprogationRetrait = GlobalVariable.AprogationRetrait
		println(AprogationRetrait)
		"Ajouter Une prolongation ICTF "
		WebUI.scrollToElement(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_Ajouter_ICTF'), 5, FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(3)
		
		CustomKeywords.'tools.ExecuteActions.ClickObjectJs'('//app-accordeon-ictf-irtf/section/div/form/button[contains(text()," Ajouter une ICTF")]')
		
		//WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_Ajouter_Prolongation_IRTF'), FailureHandling.STOP_ON_FAILURE)
		WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/input_Duree_ICTF_Annee'), '2', FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_Enregistrer'), FailureHandling.STOP_ON_FAILURE)
		
		"Ajouter une decision + Notification"
		WebUI.callTestCase(findTestCase('Test Cases/Test Reutilisable/Main/ANEF_Eloignement_V_Nawres/ANEF_Ajouter_Decision_Et_Notification'), [ AprogationRetrait : AprogationRetrait , ModeNotification : ModeNotification], FailureHandling.STOP_ON_FAILURE)
		
	}
	

	if (TypeMesureExecution == 'Retention administrative') {
		WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_Ajouter_Mesure_Execution'), FailureHandling.STOP_ON_FAILURE)
		"Retention Administrative"
		WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_radio_Retention_Administrative'), FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_Confirmer_Mesure_Execution'), FailureHandling.STOP_ON_FAILURE)
		
		if ( Mesure == "Expulsion" || Mesure == "IAT") {
			WebUI.delay(3)
			WebUI.waitForElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/select_Fondement_Legal_Mesure'), 5, FailureHandling.STOP_ON_FAILURE)
			//WebUI.scrollToPosition(0, 500)
			WebUI.scrollToElement(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/select_Fondement_Legal_Mesure'), 10)
			WebUI.selectOptionByIndex(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/select_Fondement_Legal_Mesure'), 2 ,FailureHandling.STOP_ON_FAILURE)
		}
		WebUI.scrollToElement(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/select_Lieu_Retention'), 10)
		WebUI.delay(2)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/select_Lieu_Retention'), '0006-NICE-CRA' ,false,FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_Enregistrer'), FailureHandling.STOP_ON_FAILURE)
		
		"Ajouter une protection Contre l'eloignement"	
		if (ProtectionContreEloignement =="Oui") {
			
			WebUI.scrollToElement(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_radio_Protection_Contre_Eloignement_Oui'), 10)
			WebUI.delay(3)
			WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_radio_Protection_Contre_Eloignement_Oui'), FailureHandling.STOP_ON_FAILURE)
			"Ajouter un document"
			WebUI.scrollToElement(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_Ajouter_Document_Protection_Contre_Eloignement'), 10)
			WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_Ajouter_Document_Protection_Contre_Eloignement'), FailureHandling.STOP_ON_FAILURE)
			
			WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/input_Date_Depot_Demande'), DateActuelle, FailureHandling.STOP_ON_FAILURE)
			WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/input_Heure_Depot_Demande'), '10:30', FailureHandling.STOP_ON_FAILURE)
			WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/input_Date_Avis_Ofii'), DateActuelle, FailureHandling.STOP_ON_FAILURE)
			WebUI.selectOptionByIndex(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/select_Type_Document'), 1 ,FailureHandling.STOP_ON_FAILURE)
			WebUI.uploadFile(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/input_Fichier_Protection_Eloignement'), RunConfiguration.getProjectDir() + '/Data Files/Fichier_Test.pdf')
			WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_Enregistrer'), FailureHandling.STOP_ON_FAILURE)
			
			
			
		}
		GlobalVariable.AprogationRetrait = false
		boolean AprogationRetrait = GlobalVariable.AprogationRetrait
		WebUI.callTestCase(findTestCase('Test Cases/Test Reutilisable/Main/ANEF_Eloignement_V_Nawres/ANEF_Ajouter_Decision_Et_Notification'), [AprogationRetrait : AprogationRetrait ,ModeNotification : "Voie administrative"], FailureHandling.STOP_ON_FAILURE)
		
		" Signaler une levée de rétention "
		
		"generer un nombre aleatoire entre '1' et '8'"
		long RandomNumber = CustomKeywords.'tools.MyStringTools.getRandomNumber'(1, 8)
		println(RandomNumber)
		RandomNumberSelect = RandomNumber.toString()
		//ICI  il faut rajouter l'appel de UC decision + notification 
		
	
		WebUI.delay(3)
		"Ajouter 7 JLD"
		if (Ajouter7JLD =='Oui') {
			int nbreJLD = 1
			/***while (nbreJLD <= 1) {
				
				WebUI.scrollToElement(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_Ajouter_JLD'), 10)
				WebUI.delay(3)
				WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_Ajouter_JLD'), FailureHandling.STOP_ON_FAILURE)
				//WebUI.uploadFile(findTestObject('xpath=(//input[@id="input-add-file-1"])'+ [nbreJLD +1]), RunConfiguration.getProjectDir() + '/Data Files/Fichier_Test.pdf')
				//xpath = '(//input[@id="input-add-file-1"])'+ [nbreJLD +1]
				String xpath = '(//button[@id="btn-add-file-1"])[' + (nbreJLD + 1) + ']'
				println(xpath)
				//xpath = xpath.toString()
				//WebUI.uploadFile(findTestObject(xpath), RunConfiguration.getProjectDir() + '/Data Files/Fichier_Test.pdf')
				
				
				WebElement fileInput = DriverFactory.getWebDriver().findElement(By.xpath(xpath))
				fileInput.sendKeys(getProjectDir() + "/Data Files/Fichier_Test.pdf")
				nbreJLD++
			}*/
			while (nbreJLD <= 3) {
				// Scroll to the button to add the file input
				WebUI.scrollToElement(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_Ajouter_JLD'), 10)
				WebUI.delay(2)
			
				// Click the button to trigger the addition of file input
				WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_Ajouter_JLD'), FailureHandling.STOP_ON_FAILURE)
			
				// Generate dynamic XPath for the file input element
				//String xpath = '(//input[@id="input-add-file-1"])[' + (nbreJLD + 1) + ']'
				String xpath = '(//input[@id="input-add-file-1"])[2]'
				println("Dynamic XPath: " + xpath)
			
				// Create a dynamic TestObject
				TestObject dynamicTestObject = new TestObject()
				dynamicTestObject.addProperty("xpath", ConditionType.EQUALS, xpath)
			
				// Upload the file using the dynamically created TestObject
				//WebUI.uploadFile(dynamicTestObject, RunConfiguration.getProjectDir() + "/Data Files/Fichier_Test.pdf")
				//WebUI.uploadFile(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/input_Fichier_JLD'), RunConfiguration.getProjectDir() + '/Data Files/Fichier_Test.pdf')
							
				// Increment the counter for next iteration
				nbreJLD++
			}
			
			
		}
		
		if( LeveeRetention=="Oui") {
			WebUI.scrollToElement(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_Signaler_Levee_Retention'), 10)
			WebUI.delay(3)
			WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_Signaler_Levee_Retention'), FailureHandling.STOP_ON_FAILURE)
			WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/input_Date_Levee_Retention'), DateActuelle, FailureHandling.STOP_ON_FAILURE)
			WebUI.selectOptionByIndex(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/select_Motif_Levee_Retention'), RandomNumberSelect ,FailureHandling.STOP_ON_FAILURE)
			WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_Enregistrer'), FailureHandling.STOP_ON_FAILURE)
			"Ajouter une deuxieme mesure d'execution "
			WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_Ajouter_Mesure_Execution'), FailureHandling.STOP_ON_FAILURE)
			WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_radio_Retention_Administrative'), FailureHandling.STOP_ON_FAILURE)
			WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_Confirmer_Mesure_Execution'), FailureHandling.STOP_ON_FAILURE)
			WebUI.waitForElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_Confirmer_Mesure_Execution'), 4, FailureHandling.STOP_ON_FAILURE)
			if (Mesure != "OQTF") { WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/select_Fondement_Legal_Mesure'), "L. 753-1" ,false,FailureHandling.STOP_ON_FAILURE) }
			WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/select_Lieu_Retention'), '0751-PARIS 1 (ENPP)-CRA' ,false,FailureHandling.STOP_ON_FAILURE)
			WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_Enregistrer'), FailureHandling.STOP_ON_FAILURE)
		}
		
	if(TypeMesureExecution == 'Visite domiciliaire' || AjouterVisiteDomiciliaire == "Oui") {
		
		"Cliquer sur l'accordeon Mesure Execution"
		WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/acc_Mesure_Execution'), FailureHandling.STOP_ON_FAILURE)
		
		"Ajouter une Mesure d'exécution : visite Domiciliaire"
		WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_Ajouter_Mesure_Execution'), FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_radio_Visite_Domiciliaire'), FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_Confirmer_Mesure_Execution'), FailureHandling.STOP_ON_FAILURE)
		
		
		
		"Renseigner le champ Fondement Legal de la Visite"
		WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/select_Fondement_Visite'), FondementLegalVisite ,false,FailureHandling.STOP_ON_FAILURE)
		
		"Renseigner les champs Date et Heure de la saisine et Ordonnance JLD  "
		WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/input_Date_Saisine_JLD'), DateActuelle, FailureHandling.STOP_ON_FAILURE)
		WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/input_Date_Ordonnance_JLD'), DateActuelle, FailureHandling.STOP_ON_FAILURE)
		WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/input_Heure_Ordonnance_JLD'), '10:30', FailureHandling.STOP_ON_FAILURE)
		
		"Ajouter Un fichier"
		WebUI.uploadFile(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/input_Fichier_Visite_Domiciliaire'), RunConfiguration.getProjectDir() + '/Data Files/Fichier_Test.pdf')
		
		"Ajouter une decision du Juge"
		WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/select_Decision_Juge'), "Accord" ,false,FailureHandling.STOP_ON_FAILURE)
		
		"Renseigner Date/Heure de la Mise en Execution"
		WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/input_Date_Mise_Execution'), DateActuelle, FailureHandling.STOP_ON_FAILURE)
		WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/input_Heure_Mise_Execution'), '12:30', FailureHandling.STOP_ON_FAILURE)
		
		"Enregistrer les modifications"
		WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_Enregistrer'), FailureHandling.STOP_ON_FAILURE)
		
	}
	if ( TypeMesureExecution == 'Assignation a residence' || AjouterAssignationResidence== "Oui") {
		
		"Ajouter une mesure d'execution : Assignation a residence "
		WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_Ajouter_Mesure_Execution'), FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_radio_Assignation_Residence'), FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_Confirmer_Mesure_Execution'), FailureHandling.STOP_ON_FAILURE)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/select_Fondement_Legal_Mesure'), FondementAssignationResidence ,false, FailureHandling.STOP_ON_FAILURE)
		
		"Renseigner la duree de l'assignation"
		WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/input_Duree_Assignation_Jours'), "15", FailureHandling.STOP_ON_FAILURE)
		WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/input_Duree_Assignation_Mois'), "7", FailureHandling.STOP_ON_FAILURE)
		
		"Renseigner les modalites d'assignation "
		WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/input_Periodicite_Pointage'), "quotidienne", FailureHandling.STOP_ON_FAILURE)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/select_Lieu_Pointage'), "Gendarmerie" ,false,FailureHandling.STOP_ON_FAILURE)
		WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/input_Commune_Pointage'), "Paris", FailureHandling.STOP_ON_FAILURE)
		//WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/input_Adresse_Assignation'), "20 Rue Lecourbe 75015 Paris", FailureHandling.STOP_ON_FAILURE)
		//WebUI.waitForElementVisible(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/input_Adresse_Assignation'), 10, FailureHandling.STOP_ON_FAILURE)
		
		//WebUI.sendKeys(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/select_Adresse_Assignation'), Keys.ENTER)
		//WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/select_Adresse_Assignation'), FailureHandling.STOP_ON_FAILURE)
		//WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/input_Adresse_Assignation'), "20 Rue Lecourbe 75015 Paris" ,false,FailureHandling.STOP_ON_FAILURE)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/select_Departement_Assignation'), "Paris" ,false,FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(2)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/select_Commune_Assignation'), "Paris 15e Arrondissement" ,false,FailureHandling.STOP_ON_FAILURE)
		
		"Enregistrer les modifications"
		WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_Enregistrer'), FailureHandling.STOP_ON_FAILURE)
		
		
	}
	"Ajouter une mesure d'execution : Reexamination Expulsion"
	if ( ReexamenExpulsion == "Oui") {
		WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/select_Autorite_Competente_Reexamen'), "Ministre de l'Intérieur" ,false,FailureHandling.STOP_ON_FAILURE)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/select_Pays_Residence_Reexamen'), "FRANCE" ,false,FailureHandling.STOP_ON_FAILURE)
		"Ajouter un Document "
		WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_Ajouter_Document_Reexamen'), FailureHandling.STOP_ON_FAILURE)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/select_Type_Document_Reexamen'), "PV de la COMEX" ,false,FailureHandling.STOP_ON_FAILURE)
		WebUI.uploadFile(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/input_Fichier_Reexamen'), RunConfiguration.getProjectDir() + '/Data Files/Fichier_Test.pdf')
		
		"Renseigner les Champs pour une reexamination"
		WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/select_Fondement_Legal_Reexamen'), "L. 632-3" ,false,FailureHandling.STOP_ON_FAILURE)
		WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/input_date_Reception_Abrobation'), DateActuelle, FailureHandling.STOP_ON_FAILURE)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/select_Avis_Comex_Reexamen'), "Favorable" ,false,FailureHandling.STOP_ON_FAILURE)
		WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/input_Date_Avis_Comex_Reexamen'), DateActuelle, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_radio_Decision_Abrogation_Oui'), FailureHandling.STOP_ON_FAILURE)
		
		"Enregistrer les modifications"
		WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_Enregistrer'), FailureHandling.STOP_ON_FAILURE)
		
		
		
	}
	"Ajouter une Aprogation/retrait" 
	if(AjouterAprogationRetrait == "Oui") {
		
		GlobalVariable.AprogationRetrait = true
		//boolean AprogationRetrait = GlobalVariable.AprogationRetrait
		println(AprogationRetrait)
		WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/acc_Aprogation_Retrait'), FailureHandling.STOP_ON_FAILURE)
		
		WebUI.callTestCase(findTestCase('Test Cases/Test Reutilisable/Main/ANEF_Eloignement_V_Nawres/ANEF_Ajouter_Decision_Et_Notification'), [ AprogationRetrait : GlobalVariable.AprogationRetrait , ModeNotification : ModeNotification], FailureHandling.STOP_ON_FAILURE)
		
		}
		"Ajouter un depart Programmé"
		if( DepartProgramme =="Oui")	{
			"Cliquer sur l'accordeon Depart programmé "
			WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/acc_Depart_Programme'), FailureHandling.STOP_ON_FAILURE)
			WebUI.selectOptionByIndex(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/select_Type_Vecteur'), 1 ,FailureHandling.STOP_ON_FAILURE)
			WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/input_Date_Accuse_Reception'), '10032025', FailureHandling.STOP_ON_FAILURE)
			WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/input_Date_Depart_Programmee'), '11032025', FailureHandling.STOP_ON_FAILURE)
			WebUI.setText(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/input_Heure_Depart_Programmee'), '1430', FailureHandling.STOP_ON_FAILURE)
			
			if( ModaliteExecution=="RetourForce") {
				"Retour Forcé "
				WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/select_Modalite_Execution'), 'Retour forcé' ,false,FailureHandling.STOP_ON_FAILURE)
				if (Escorte=="Oui") {WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_radio_Escorte_Oui'), FailureHandling.STOP_ON_FAILURE)}
				if (Escorte=="Non") {WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_radio_Escorte_Non'), FailureHandling.STOP_ON_FAILURE)}
				}
			if(ModaliteExecution=="RetourVolontaire") {
				" Retour volontaire  "
				WebUI.selectOptionByLabel(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/select_Modalite_Execution'), 'Retour volontaire' ,false,FailureHandling.STOP_ON_FAILURE)
					
				}
			if (Issue=="NE") {
				WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_radio_Issue_NE'), FailureHandling.STOP_ON_FAILURE)
				WebUI.selectOptionByIndex(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/select_Motif_Non_Embarquement'), 3 ,FailureHandling.STOP_ON_FAILURE)
				WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_Enregistrer'), FailureHandling.STOP_ON_FAILURE)
				
				}
			if (Issue=="BE") {
				//WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_radio_Issue_BE'), FailureHandling.STOP_ON_FAILURE)
				//WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_Enregistrer'), FailureHandling.STOP_ON_FAILURE)
				//WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_Confirmer_Execution_Mesure'), FailureHandling.STOP_ON_FAILURE)
				
				
			}
			if (Issue=="ANNULE") {
				WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_radio_Issue_ANNULE'), FailureHandling.STOP_ON_FAILURE)}
				WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_Enregistrer'), FailureHandling.STOP_ON_FAILURE)
			}
			
		}
		

	"Ajouter un Recours Contentieux"
	if (AjouterRecoursContentieux == "Oui") {
		WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/acc_Recours_Contentieux'), FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/btn_radio_decision_Recours_Contentieux'), FailureHandling.STOP_ON_FAILURE)
		WebUI.uploadFile(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Execution/input_Fichier_Recours_Contentieux'), RunConfiguration.getProjectDir() + '/Data Files/Fichier_Test.pdf')
		WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Prendre_Mesure_Formulaire/btn_Enregistrer'), FailureHandling.STOP_ON_FAILURE)
		
		
	}
}