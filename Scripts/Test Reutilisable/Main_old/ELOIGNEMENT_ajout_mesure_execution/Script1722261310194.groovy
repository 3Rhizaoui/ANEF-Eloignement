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

//Dossier Usager OQTF : Ajouter mesure d execution : assignation à résidence
WebUI.verifyElementPresent(findTestObject('null'), 1)
WebUI.click(findTestObject('null'))

WebUI.verifyTextPresent('À cette étape vous devez choisir si vous souhaitez prendre une mesure d’exécution à l’encontre de cet étranger.', false)
WebUI.verifyElementPresent(findTestObject('null'), 5)
WebUI.verifyElementPresent(findTestObject('null'), 1)
WebUI.verifyElementPresent(findTestObject('null'), 1)
WebUI.verifyElementPresent(findTestObject('null'), 1)
//WebUI.waitForElementClickable(findTestObject ('Object Repository/Fabien/ELOIGNEMENT/dossier_etranger_usager_OQTF/OQTF_radio_button_mesure_exec_assignation_residence'), 5)
WebUI.waitForPageLoad(2)

if ((MesureExecution) == 'assignation_a_residence') {
//PBM le click sur le radio bouton ne fonctionne pas totalement : le radio bouton est entouré mais pas noirci
//WebUI.doubleClick(findTestObject('null'), 1)
    CustomKeywords.'tools.ExecuteActions.ClickObjectJs'('/html/body/app-root/app-layout-borderless/div[3]/app-mesure-oqtf/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[5]/app-accordeon-mesures-execution/section/div/app-add-mesure-execution-modal/app-confirm-modal/dialog/div/div/div/div/div[2]/div[1]/div/app-dsfr-radio/div/fieldset/div/div[1]/input')
	WebUI.sendKeys(findTestObject('null'), Keys.chord(Keys.ENTER))
	WebUI.waitForPageLoad(2)
	WebUI.click(findTestObject('null'))
	WebUI.waitForPageLoad(2)
//ATTENTION il faudra enregistrer pour passer à l'étape supplémentaire
   
	
	System.out.println(Fondement_legal_assignation_a_residence)
	if ((Fondement_legal_assignation_a_residence) == 'L. 731-1')  {
		WebUI.click(findTestObject('null')) }
	if ((Fondement_legal_assignation_a_residence) == 'L. 731-3')  {
		WebUI.click(findTestObject('null')) }
	if ((Fondement_legal_assignation_a_residence) == 'L. 743-13')  {
	    WebUI.click(findTestObject('null')) }
	
	WebUI.click(findTestObject('null'))
	WebUI.waitForPageLoad(1)
	WebUI.doubleClick(findTestObject('null'))
	
	//WebUI.verifyOptionPresentByLabel(findTestObject('null'), 'Autorisation de travail', false, 1)
	//WebUI.selectOptionByLabel(findTestObject('null'), 'Autorisation de travail', false, 1)
	
	//WebUI.selectOptionByValue(findTestObject('null'), '1: ORDONNANCE_JLD', false, 1)
	
	//WebUI.verifyOptionPresentByLabel(findTestObject('null'), 'Ordonnance du JLD', false, 1)
	//WebUI.selectOptionByLabel(findTestObject('null'), 'Ordonnance du JLD', false, 1)	
	//WebUI.selectOptionByValue(findTestObject('null'), '2: AUTORISATION_TRAVAIL', false, 1)
	//WebUI.verifyOptionPresentByLabel(findTestObject('null'), 'Avis médical', false, 1)
	//WebUI.selectOptionByLabel(findTestObject('null'), 'Avis médical', false, 1)
	//WebUI.selectOptionByValue(findTestObject('null'), '3: AVIS_MEDICAL', false, 1)
	WebUI.click(findTestObject('null'))
	
	WebUI.click(findTestObject('null'))
	WebUI.click(findTestObject('null'))
	WebUI.click(findTestObject('null'))
	
		if 	((AssignationResidence_Document) == 'Ordonnance du JLD') {
			WebUI.click(findTestObject('null'))
			WebUI.uploadFile(findTestObject('null'), 
		 'C:\\Users\\fsoreau\\OneDrive - Capgemini\\Documents\\GitHub\\ANEF-ELOIGNEMENT\\Data Files\\Ordonnance du JLD.pdf')	
		}
		if 	((AssignationResidence_Document) == 'Autorisation de travail') {
			WebUI.click(findTestObject('null'))
			WebUI.uploadFile(findTestObject('null'),
				'C:\\Users\\fsoreau\\OneDrive - Capgemini\\Documents\\GitHub\\ANEF-ELOIGNEMENT\\Data Files\\Autorisation de travail.pdf')
	    }
		if 	((AssignationResidence_Document) == 'Avis médical') {
			WebUI.click(findTestObject('null'))
			WebUI.uploadFile(findTestObject('null'),
				'C:\\Users\\fsoreau\\OneDrive - Capgemini\\Documents\\GitHub\\ANEF-ELOIGNEMENT\\Data Files\\Avis médical.pdf')
		}
		
		
//	 WebUI.doubleClick(findTestObject('null'))
	 		
			
//     WebUI.verifyElementPresent(findTestObject('null'), 0)
    WebUI.setText(findTestObject('null'), AssignationResidence_dureeJJ) 
//	WebUI.verifyElementPresent(findTestObject('null'), 0)
	 
	WebUI.setText(findTestObject('null'), AssignationResidence_dureeMM)
//	 WebUI.verifyElementPresent(findTestObject('null'), 0)

	 WebUI.verifyTextPresent("Autorisation de travail",false)
	 WebUI.verifyElementPresent(findTestObject('null'), 0)
	 
	 WebUI.setText(findTestObject('null'), AssignationResidence_Peridiodicite)
	 WebUI.selectOptionByLabel(findTestObject('null'), AssignationResidence_LieuPointage, true)
	 WebUI.setText(findTestObject('null'), MesureExecution_AssignationResidence_Commune)
	 
//	 WebUI.setText(findTestObject('null'), MesureExecution_AssignationResidence_Adresse)
	 WebUI.setText(findTestObject('null'), '8 RUE PORTEVIN 27000 EVREUX')
	 WebUI.click(findTestObject('null'))
	 WebUI.verifyTextPresent("L’étranger réside en outre-mer et vous ne trouvez pas son adresse dans les suggestions d’adresse qui vous sont proposées.", false)
	 
	 WebUI.verifyElementPresent(findTestObject('null'), 0)

	 WebUI.selectOptionByLabel(findTestObject('null'), MesureExecution_AssignationResidence_Departement_PT, true)
	 WebUI.selectOptionByLabel(findTestObject('null'), MesureExecution_AssignationResidence_Commune_PT, true)

	 //	 WebUI.verifyElementPresent(findTestObject('null'), 0)
	 WebUI.setText(findTestObject('null'), MesureExecution_AssignationResidence_HeureDe)
	 WebUI.setText(findTestObject('null'), MesureExecution_AssignationResidence_HeureA)
	 
//	 WebUI.verifyElementPresent(findTestObject('null'), 0)
	 WebUI.verifyElementPresent(findTestObject('null'), 0)
	 
	//	   fondement_legal_assignation_a_residence, true)
//   
//   WebUI.setText(findTestObject('null', AssignationResidence_dureeJJ))
//   WebUI.setText(findTestObject('null', AssignationResidence_dureeMM))
   
   }

if ((MesureExecution) == 'retention_administrative') {
	
	CustomKeywords.'tools.ExecuteActions.ClickObjectJs'('/html/body/app-root/app-layout-borderless/div[3]/app-mesure-oqtf/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[5]/app-accordeon-mesures-execution/section/div/app-add-mesure-execution-modal/app-confirm-modal/dialog/div/div/div/div/div[2]/div[1]/div/app-dsfr-radio/div/fieldset/div/div[2]/input')
	WebUI.waitForPageLoad(2)
	WebUI.sendKeys(findTestObject('null'), Keys.chord(Keys.ENTER))
	WebUI.waitForPageLoad(2)
	WebUI.click(findTestObject('null'))
	WebUI.waitForPageLoad(2)
//ATTENTION il faudra enregistrer pour passer à l'étape supplémentaire
	
	WebUI.verifyTextPresent("Rétention administrative n°1", false)
	WebUI.verifyTextPresent("Placement en rétention", false)
	WebUI.verifyTextPresent("L. 741-1", false)

	WebUI.verifyElementPresent(findTestObject('null'), 1)
	WebUI.verifyElementPresent(findTestObject('null'), 1)
	WebUI.verifyElementPresent(findTestObject('null'), 1)
	
	//WebUI.selectOptionByLabel(findTestObject('null'), 'CRA Lyon 1', true)	
	WebUI.selectOptionByLabel(findTestObject('null'), MesureExecution_RetentionAdministrative_Lieu, true)
	
	
	WebUI.click(findTestObject('null'))
	WebUI.waitForPageLoad(2)
	WebUI.click(findTestObject('null'))
	//WebUI.setText(findTestObject('null'), "20/07/2024")
	WebUI.setText(findTestObject('null'), DepotDemandeDate)
	
	//WebUI.setText(findTestObject('null'), "12:22")
	WebUI.setText(findTestObject('null'), DepotDemandeHeure)
	
	//WebUI.setText(findTestObject('null'), "23/07/2024")
	WebUI.setText(findTestObject('null'), AvisOFIIDate)
	
	WebUI.click(findTestObject('null'))
	WebUI.waitForPageLoad(2)
	WebUI.click(findTestObject('null'))
	WebUI.click(findTestObject('null'))
	WebUI.waitForPageLoad(1)
	WebUI.selectOptionByLabel(findTestObject('null'), 'Avis OFII', false)
	WebUI.uploadFile(findTestObject('null'),
		'C:\\Users\\fsoreau\\OneDrive - Capgemini\\Documents\\GitHub\\ANEF-ELOIGNEMENT\\Data Files\\avis de l OFII.pdf')
	WebUI.click(findTestObject('null'))
	
	WebUI.setText(findTestObject('null'), LeveeRetentionDate)
	//WebUI.setText(findTestObject('null'), "23/07/2024")
	
	WebUI.verifyElementPresent(findTestObject('null'), 1)
	WebUI.verifyOptionPresentByLabel(findTestObject('null'), 'Remise en liberté par le JLD', false, 1)
	WebUI.verifyOptionPresentByLabel(findTestObject('null'), 'Absence de document de voyage dans les délais utiles', false, 1)
	WebUI.verifyOptionPresentByLabel(findTestObject('null'), 'Absence de moyen de transport dans les délais utiles', false, 1)
	WebUI.verifyOptionPresentByLabel(findTestObject('null'), "Annulation de l’OQTF", false, 1)
	WebUI.verifyOptionPresentByLabel(findTestObject('null'), "Annulation de l’arrêté de maintien en rétention", false, 1)
	WebUI.verifyOptionPresentByLabel(findTestObject('null'), "Éloignement effectif", false, 1)
	WebUI.verifyOptionPresentByLabel(findTestObject('null'), "Autre", false, 1)
	WebUI.selectOptionByLabel(findTestObject('null'), MesureExecution_RetentionAdministrative_LeveeRetentionMotif, true)
	
	}

	
	
	
WebUI.waitForPageLoad(2)
System.out.println(TopNonRespect)
//if ((TopNonRespect) == '1') {   WebUI.callTestCase(findTestCase('null')) }
if ((TopNonRespect) == '1') {   
	WebUI.callTestCase(findTestCase('null'), 
		[('TopNonRespect') : TopNonRespect
			, ('MesureExecution') : MesureExecution, ('Fondement_legal_assignation_a_residence') : Fondement_legal_assignation_a_residence,
			AssignationResidence_dureeMM:AssignationResidence_dureeMM,	AssignationResidence_dureeJJ:AssignationResidence_dureeJJ,
			AssignationResidence_Document:AssignationResidence_Document,
			AssignationResidence_Peridiodicite:AssignationResidence_Peridiodicite, AssignationResidence_LieuPointage:AssignationResidence_LieuPointage, MesureExecution_AssignationResidence_Commune:MesureExecution_AssignationResidence_Commune,
			MesureExecution_AssignationResidence_Adresse:MesureExecution_AssignationResidence_Adresse, MesureExecution_AssignationResidence_Departement_PT:MesureExecution_AssignationResidence_Departement_PT,
			MesureExecution_AssignationResidence_Commune_PT:MesureExecution_AssignationResidence_Commune_PT, MesureExecution_AssignationResidence_HeureDe:MesureExecution_AssignationResidence_HeureDe,
			MesureExecution_AssignationResidence_HeureA:MesureExecution_AssignationResidence_HeureA,
			NonRespectDate:NonRespectDate, NonRespectHeure:NonRespectHeure, NonRespectMotif:NonRespectMotif,
			NonRespect_SaisineAutoriteJudiciaire_Date:NonRespect_SaisineAutoriteJudiciaire_Date, NonRespect_DecisionAutoriteJudiciaire:NonRespect_DecisionAutoriteJudiciaire,
			], FailureHandling.STOP_ON_FAILURE)
}

//WebUI.click(findTestObject('null'), 10)
//WebUI.sendKeys(findTestObject('null'), Keys.chord(Keys.ENTER))
//WebUI.waitForPageLoad(2)
//WebUI.verifyElementPresent(findTestObject('null'), 5)
//WebUI.click(findTestObject('null'))
//WebUI.delay(3)

