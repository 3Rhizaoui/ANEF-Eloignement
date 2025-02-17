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
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;



/** modify WebUI.* keywords which take TestObject as arg0
 * @author fsoreau
 *so that they call Highlight.on() automatically
 */
'Call Highlight.on() automatically'
CustomKeywords.'com.kazurayam.ksbackyard.HighlightElement.pandemic'()


'waiting for the number of elements in the DOM to stop changing'
CustomKeywords.'tools.WaitForLoadedPage.waitForElementRendering'()

'1. Clic sur la tuile ANEF-ELOIGNEMENT '
WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Accueil_Principale/btn_ANEF_ELOIGNEMENT'), 1)
WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_Accueil_Principale/btn_ANEF_ELOIGNEMENT'))


'2. Arrivée Accueil Portail agent ELOIGNEMENT : page control + search and select   '

WebUI.verifyElementPresent(findTestObject('null'), 1)
WebUI.verifyElementPresent(findTestObject('null'), 1)
WebUI.verifyElementPresent(findTestObject('null'), 1)
WebUI.verifyElementPresent(findTestObject('null'),  1)

//WebUI.click(findTestObject('null'))


'3 Choisir le type de dossier en arrivée pour les procédures d éloignement à appliquer      '

if(((DossierArrivee)== "refus_admission_sejour"))  {
	WebUI.click(findTestObject('null'))
	WebUI.waitForPageLoad(6)
	
	WebUI.setText(findTestObject('null'), NomEtrangerEloignement)

	WebUI.verifyElementPresent(findTestObject('null'), 1)
	WebUI.verifyElementPresent(findTestObject('null'), 1)
	WebUI.verifyElementPresent(findTestObject('null'), 1)
	WebUI.verifyElementPresent(findTestObject('null'), 1)
	WebUI.verifyElementPresent(findTestObject('null'), 1)
	WebUI.verifyElementPresent(findTestObject('null'), 9)
	WebUI.sendKeys(findTestObject('null'), Keys.chord(Keys.ENTER))
	}

if(((DossierArrivee)== "sortants_etablissements_penitentiaire"))  {
	WebUI.click(findTestObject('null'))
	}
	
if(((DossierArrivee)== "refus_admission_sejour"))  {
	WebUI.click(findTestObject('null'))
	}

if(((DossierArrivee)== "deboutes_droits_asile"))  {
	WebUI.click(findTestObject('null'))
	}
	
'4 Cliquer sur le bouton Prendre une mesure d eloignement'	
WebUI.waitForPageLoad(9)
WebUI.click(findTestObject('null'))
WebUI.click(findTestObject('null'))

'5 Page control de la fenêtre Prendre une mesure d eloignement'

WebUI.callTestCase(findTestCase('null'), null)
'ELOIGNEMENT-OQTF-1 : Dossier de l usager : Fenetre "Prendre un decision'
'Step commune à tous les types d ELOIGNEMENT'

	
'6. Orientation en fonction du type de procédure d ELOIGNEMENT OQTF, EXPULSION,      '		
if(((TypeEloignement)== "OQTF"))     	{
	WebUI.callTestCase(findTestCase('null'), [TypeEloignement:TypeEloignement, FondementLegal:FondementLegal, OQTF_duree_IRTF_MM:OQTF_duree_IRTF_MM,
			PaysRenvoi:PaysRenvoi, AuteurDecision:AuteurDecision, AuteurDecisionValue:AuteurDecisionValue, ValeurDureeOQTF:ValeurDureeOQTF, fondement_legal_OQTF_IRTF:fondement_legal_OQTF_IRTF,
			TopMesureExecution:TopMesureExecution, MesureExecution:MesureExecution, Fondement_legal_assignation_a_residence:Fondement_legal_assignation_a_residence, 
			AssignationResidence_dureeMM:AssignationResidence_dureeMM,	AssignationResidence_dureeJJ:AssignationResidence_dureeJJ,	
			AssignationResidence_Document:AssignationResidence_Document,
			AssignationResidence_Peridiodicite:AssignationResidence_Peridiodicite, AssignationResidence_LieuPointage:AssignationResidence_LieuPointage, MesureExecution_AssignationResidence_Commune:MesureExecution_AssignationResidence_Commune,
			MesureExecution_AssignationResidence_Adresse:MesureExecution_AssignationResidence_Adresse, MesureExecution_AssignationResidence_Departement_PT:MesureExecution_AssignationResidence_Departement_PT,
			MesureExecution_AssignationResidence_Commune_PT:MesureExecution_AssignationResidence_Commune_PT, MesureExecution_AssignationResidence_HeureDe:MesureExecution_AssignationResidence_HeureDe,
			MesureExecution_AssignationResidence_HeureA:MesureExecution_AssignationResidence_HeureA,
            TopNonRespect:TopNonRespect, NonRespectDate:NonRespectDate, NonRespectHeure:NonRespectHeure, NonRespectMotif:NonRespectMotif,
			NonRespect_SaisineAutoriteJudiciaire_Date:NonRespect_SaisineAutoriteJudiciaire_Date, NonRespect_DecisionAutoriteJudiciaire:NonRespect_DecisionAutoriteJudiciaire,	
			MesureExecution_RetentionAdministrative_Lieu:MesureExecution_RetentionAdministrative_Lieu, DepotDemandeDate:DepotDemandeDate, DepotDemandeHeure:DepotDemandeHeure,	AvisOFIIDate:AvisOFIIDate,
			LeveeRetentionDate:LeveeRetentionDate, MesureExecution_RetentionAdministrative_LeveeRetentionMotif:MesureExecution_RetentionAdministrative_LeveeRetentionMotif,
			], 
		FailureHandling.STOP_ON_FAILURE)
            }

if(((TypeEloignement)== "EXPULSION"))	{
	WebUI.callTestCase(findTestCase('null'), [TypeEloignement:TypeEloignement,
		    EXPULSION_NatureActe:EXPULSION_NatureActe,	EXPULSION_UrgenceAbsolue:EXPULSION_UrgenceAbsolue,	EXPULSION_COMEX_DateNotif_Bulletin:EXPULSION_COMEX_DateNotif_Bulletin, EXPULSION_COMEX_Date:EXPULSION_COMEX_Date,
            EXPULSION_COMEX_DocType:EXPULSION_COMEX_DocType, EXPULSION_COMEX_Renvoi:EXPULSION_COMEX_Renvoi, EXPULSION_COMEX_Avis:EXPULSION_COMEX_Avis, EXPULSION_COMEX_Avis_Date:EXPULSION_COMEX_Avis_Date,	
	        EXPULSION_COMEX_AvisNotification_Date:EXPULSION_COMEX_AvisNotification_Date, EXPULSION_COMEX_AvisNotification_Heure:EXPULSION_COMEX_AvisNotification_Heure, EXPULSION_checkbox_COMEX_PoursuiteProcedure:EXPULSION_COMEX_PoursuiteProcedure,
		    ],
		FailureHandling.STOP_ON_FAILURE)
			}
			
if(((TypeEloignement)== "IAT"))	        {
	WebUI.callTestCase(findTestCase('null'), [TypeEloignement:TypeEloignement], FailureHandling.STOP_ON_FAILURE)
			}
												
if(((TypeEloignement)== "ITF"))	        {
	WebUI.callTestCase(findTestCase('null'), [TypeEloignement:TypeEloignement], FailureHandling.STOP_ON_FAILURE)
			}
																		
if(((TypeEloignement)== "REMISE_SCHENGEN"))	{
	WebUI.callTestCase(findTestCase('null'), [TypeEloignement:TypeEloignement], FailureHandling.STOP_ON_FAILURE)
			}
																																									
if(((TypeEloignement)== "SIS_L.615-1"))	{
	WebUI.callTestCase(findTestCase('null'), [TypeEloignement:TypeEloignement], FailureHandling.STOP_ON_FAILURE)
			}
																																				
if(((TypeEloignement)== "TRANSFERT_DUBLIN"))	{
	WebUI.callTestCase(findTestCase('null'), [TypeEloignement:TypeEloignement], FailureHandling.STOP_ON_FAILURE)
            }
						

			
			
			
/** modify WebUI.* keywords which take TestObject as arg0
 * @author hhizaoui
 *so that they call Highlight.on() automatically
 */
"Call Highlight.on() automatically"
//CustomKeywords.'com.kazurayam.ksbackyard.HighlightElement.pandemic'()

//'RunConfiguration: getExecutionProperties Driver '
//def DriverName = CustomKeywords.'tools.GetExecutionProperties.PropertieNameDriver'()

"contournement du message d'erreur lié à la confidentialité :"
//if ((DriverName =='CHROME_DRIVER') || ('EDGE_CHROMIUM_DRIVER') || 'HEADLESS_DRIVER'){
//	if(WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_ANEF_Confidentialité/Btn_Parametres Avances'),2,FailureHandling.OPTIONAL)){
//		WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_ANEF_Confidentialité/Btn_Parametres Avances'),FailureHandling.OPTIONAL)
//		WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_ANEF_Confidentialité/Link_Proceed-Link'),FailureHandling.OPTIONAL)}}

//"contournement du message d'erreur lié à la confidentialité :"
//if ((DriverName =='IE_DRIVER')){
//	if(WebUI.verifyElementPresent(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_ANEF_Confidentialité/Btn_Parametres Avances'),2,FailureHandling.OPTIONAL)){
//		WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_ANEF_Confidentialité/Btn_Parametres Avances'),FailureHandling.OPTIONAL)
//		WebUI.click(findTestObject('Object Repository/ANEF_Eloignement_V_Nawres/Page_ANEF_Confidentialité/Link_Proceed-Link'),FailureHandling.OPTIONAL)}}
WebUI.delay(3)
