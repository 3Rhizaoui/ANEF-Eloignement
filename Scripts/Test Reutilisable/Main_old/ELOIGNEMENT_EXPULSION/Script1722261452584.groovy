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


'ELOIGNEMENT-EXPULSION-1 : Prise de la mesure d éloignement '

'Pour cet exemple EXPULSION (autres valeurs possibles : Exécution fiche SIS L.615-1 ; IAT ; ITF ; OQTF ; Remise Schengen ; Transfert Dublin '

WebUI.selectOptionByValue(findTestObject('null'),
	'2: EXPULSION', true)

WebUI.click(findTestObject('null'))

WebUI.verifyTextPresent('Action effectuée avec succès', false)

'ELOIGNEMENT-EXPULSION-2 : page control vérifier bandeau'
WebUI.verifyTextPresent('Fiche mesure de', false)

//PBM revoir avec des variables et des concaténations de variables
//WebUI.verifyElementText(findTestObject('null'), "7703053641 - TEST-SIX Isabelle")

//PBM revoir avec des variables et des concaténations de variables
WebUI.verifyTextPresent('Numéro de la mesure', false)

//WebUI.verifyElementText(findTestObject('null'), "OQTF-24-000692")
//PBM revoir avec des variables et des concaténations de variables
WebUI.verifyTextPresent('Type de mesure', false)

//WebUI.verifyElementText(findTestObject('null'), TypeEloignement)
//WebUI.verifyElementText(findTestObject('null'), 'OQTF')
//
//WebUI.verifyTextPresent('Préfecture gestionnaire', false)
//
//WebUI.verifyElementText(findTestObject('null'), '-')

'ELOIGNEMENT-EXPULSION-3 : page control vérifier les onglets (à gauche) sous decision d eloignement'
//WebUI.verifyElementPresent(findTestObject('null'), 1)
//
//WebUI.verifyElementPresent(findTestObject('null'), 1)
//
//WebUI.verifyElementPresent(findTestObject('null'), 1)
//
//WebUI.verifyElementPresent(findTestObject('null'), 1)
//
//WebUI.verifyElementPresent(findTestObject('null'), 1)
//
//WebUI.verifyElementPresent(findTestObject('null'), 1)
//
//WebUI.verifyElementPresent(findTestObject('null'), 1)
//
//WebUI.verifyElementPresent(findTestObject('null'), 1)

//PBM revoir  WebUI.verifyElementNotClickable(
'ELOIGNEMENT-EXPULSION-4 : vérifications elements grisés ou non (cliquables ou non)'
// détails dans ELOIGNEMENT-OQTF

'ELOIGNEMENT-EXPULSION-5 : Dossier de l usager : page control detail mesure d ELOIGNEMENT (exemple avec OQTF)  '
//WebUI.waitForPageLoad(3)
//
//WebUI.verifyTextPresent('Fondement légal', false)
//
//WebUI.verifyTextPresent('Délai de départ volontaire', false)
//
//WebUI.verifyTextPresent('Durée du délai', false)
//
//WebUI.verifyTextPresent('Obligations fixées par le Préfet', false)
//
//WebUI.verifyTextPresent('ICTF/IRTF', false)
//
//WebUI.verifyTextPresent('Durée de l\'IRTF', false)
//
//WebUI.verifyTextPresent('Décision fixant le pays de renvoi', false)
//
//WebUI.verifyTextPresent('Mesures d\'exécution', false)
//
//WebUI.verifyElementPresent(findTestObject('null'),
//    1)
//
//WebUI.verifyTextPresent(TypeEloignement, false)

'ELOIGNEMENT-EXPULSION-6 Selection fondement legal + Nature acte   '

//System.out.println(FondementLegal)
//WebUI.click(findTestObject('null'))

WebUI.verifyOptionPresentByLabel(findTestObject('null'),
	'L.631-1', false, 1)
WebUI.verifyOptionPresentByLabel(findTestObject('null'),
	'L.631-2', false, 1)
WebUI.verifyOptionPresentByLabel(findTestObject('null'),
	'L.631-3', false, 1)

WebUI.selectOptionByLabel(findTestObject('null'), 'L.631-1', false)

WebUI.click(findTestObject('null'))
WebUI.verifyTextPresent('Autorité décisionnaire', false)
WebUI.verifyTextPresent('Ministre de l’Intérieur', false)
WebUI.click(findTestObject('null'))
WebUI.verifyTextPresent('Autorité décisionnaire', false)
WebUI.verifyTextPresent('Préfet', false)

if(((EXPULSION_NatureActe)== "AME"))  {
        WebUI.click(findTestObject('null'))
	}
if(((EXPULSION_NatureActe)== "APE"))  {
		WebUI.click(findTestObject('null'))
	}

	
'ELOIGNEMENT-EXPULSION-7 Urgence absolue '
WebUI.click(findTestObject('null'))
WebUI.click(findTestObject('null'))

'ELOIGNEMENT-EXPULSION-7-1 OUI=Urgence absolue '
if(((EXPULSION_UrgenceAbsolue)== "OUI"))  {
    WebUI.click(findTestObject('null'))
}

'ELOIGNEMENT-EXPULSION-8 COMEX : ONGLET COMEX ne s affiche que si URGENCE ABSOLUE = NON'
if(((EXPULSION_UrgenceAbsolue)== "NON"))  {
    WebUI.click(findTestObject('null'))

    //WebUI.setText(findTestObject('null'), "23/07/2024")
	WebUI.setText(findTestObject('null'), EXPULSION_COMEX_DateNotif_Bulletin)
    //WebUI.setText(findTestObject('null'), "24/07/2024")
	WebUI.setText(findTestObject('null'), EXPULSION_COMEX_Date)
	
    WebUI.click(findTestObject('null'))
    WebUI.click(findTestObject('null'))
	WebUI.click(findTestObject('null'))
	
	WebUI.click(findTestObject('null'))
	WebUI.click(findTestObject('null'))
	WebUI.click(findTestObject('null'))

	if 	((EXPULSION_COMEX_DocType) == 'Avis de la COMEX') {
			WebUI.click(findTestObject('null'))
		    WebUI.uploadFile(findTestObject('null'),
            'C:\\Users\\fsoreau\\OneDrive - Capgemini\\Documents\\GitHub\\ANEF-ELOIGNEMENT\\Data Files\\COMEX_Avis.pdf')
	        }
	if 	((EXPULSION_COMEX_DocType) == 'Bulletin spécial de la COMEX') {
			WebUI.click(findTestObject('null'))
			WebUI.uploadFile(findTestObject('null'),
			'C:\\Users\\fsoreau\\OneDrive - Capgemini\\Documents\\GitHub\\ANEF-ELOIGNEMENT\\Data Files\\COMEX_BulletinSpecial.pdf')
			}
	if 	((EXPULSION_COMEX_DocType) == 'PV de la COMEX') {
			WebUI.click(findTestObject('null'))
			WebUI.uploadFile(findTestObject('null'),
			'C:\\Users\\fsoreau\\OneDrive - Capgemini\\Documents\\GitHub\\ANEF-ELOIGNEMENT\\Data Files\\COMEX_PV.pdf')
			}
						
	WebUI.click(findTestObject('null'))
	WebUI.click(findTestObject('null'))		
	if 	((EXPULSION_COMEX_Renvoi) == 'OUI') {
			WebUI.click(findTestObject('null'))
			}
	if 	((EXPULSION_COMEX_Renvoi) == 'NON') {
			WebUI.click(findTestObject('null'))
			}
	
	WebUI.click(findTestObject('null'))
	WebUI.click(findTestObject('null'))			
	if 	((EXPULSION_COMEX_Avis) == 'FAVORABLE') {
	        WebUI.click(findTestObject('null'))
	        }
	if 	((EXPULSION_COMEX_Avis) == 'DEFAVORABLE') {
	    	WebUI.click(findTestObject('null'))
   	        }
	
    WebUI.setText(findTestObject('null'), EXPULSION_COMEX_Avis_Date)
    WebUI.setText(findTestObject('null'), EXPULSION_COMEX_AvisNotification_Date)
    WebUI.setText(findTestObject('null'), EXPULSION_COMEX_AvisNotification_Date)

    WebUI.click(findTestObject('null'))
    WebUI.click(findTestObject('null'))
	
	if 	((EXPULSION_COMEX_PoursuiteProcedure) == 'OUI') {
    WebUI.click(findTestObject('null'))
		   }
	if 	((EXPULSION_COMEX_PoursuiteProcedure) == 'NON') {
    WebUI.click(findTestObject('null'))
		   }
		   
}


'ELOIGNEMENT-EXPULSION-9 Decision fixant le pays de renvoi '

//Attention ces objets n'ont pas le même XPath si l'option COMEX est déployé la ' | ' a été ajouté dans les XPath des objets
WebUI.selectOptionByLabel(findTestObject('null'),
	'Nicaragua', true)
WebUI.selectOptionByLabel(findTestObject('null'), '75 Préfecture de Paris', true)

//WebUI.click(findTestObject('null'))
//if ((AuteurDecision) == 'Préfecture Seine et Marne') {
//	WebUI.click(findTestObject('null'))
//}
//if ((AuteurDecision) == '75 Préfecture de Paris') {
//	WebUI.click(findTestObject('null'))
//}

'ELOIGNEMENT-EXPULSION-10 Mesure execution'
//System.out.println(TopMesureExecution)
//System.out.println(MesureExecution)
//if ((TopMesureExecution) == '1') {
//	WebUI.callTestCase(findTestCase('null'), [('TopMesureExecution') : TopMesureExecution
//			, ('MesureExecution') : MesureExecution, ('Fondement_legal_assignation_a_residence') : Fondement_legal_assignation_a_residence,
//			AssignationResidence_dureeMM:AssignationResidence_dureeMM,	AssignationResidence_dureeJJ:AssignationResidence_dureeJJ,
//			AssignationResidence_Document:AssignationResidence_Document,
//			AssignationResidence_Peridiodicite:AssignationResidence_Peridiodicite, AssignationResidence_LieuPointage:AssignationResidence_LieuPointage, MesureExecution_AssignationResidence_Commune:MesureExecution_AssignationResidence_Commune,
//			MesureExecution_AssignationResidence_Adresse:MesureExecution_AssignationResidence_Adresse, MesureExecution_AssignationResidence_Departement_PT:MesureExecution_AssignationResidence_Departement_PT,
//			MesureExecution_AssignationResidence_Commune_PT:MesureExecution_AssignationResidence_Commune_PT, MesureExecution_AssignationResidence_HeureDe:MesureExecution_AssignationResidence_HeureDe,
//			MesureExecution_AssignationResidence_HeureA:MesureExecution_AssignationResidence_HeureA,
//			TopNonRespect:TopNonRespect, NonRespectDate:NonRespectDate, NonRespectHeure:NonRespectHeure, NonRespectMotif:NonRespectMotif,
//			NonRespect_SaisineAutoriteJudiciaire_Date:NonRespect_SaisineAutoriteJudiciaire_Date, NonRespect_DecisionAutoriteJudiciaire:NonRespect_DecisionAutoriteJudiciaire,
//			MesureExecution_RetentionAdministrative_Lieu:MesureExecution_RetentionAdministrative_Lieu, DepotDemandeDate:DepotDemandeDate, DepotDemandeHeure:DepotDemandeHeure,	AvisOFIIDate:AvisOFIIDate,
//			LeveeRetentionDate:LeveeRetentionDate, MesureExecution_RetentionAdministrative_LeveeRetentionMotif:MesureExecution_RetentionAdministrative_LeveeRetentionMotif,
//			], FailureHandling.STOP_ON_FAILURE)
//}


//******************************************














//ELOIGNEMENT-EXPULSION-1 : Dossier de l'usager : page control + prendre une mesure d'éloignement
//'cet exemple EXPULSION (autres valeurs possibles : Exécution fiche SIS L.615-1 ; Expulsion ; IAT ; ITF ; Remise Schengen ; Transfert Dublin
WebUI.verifyTextPresent('Prendre une décision', false)

WebUI.verifyTextPresent('À cette étape, vous devez choisir si vous souhaitez prendre une mesure d\'éloignement.', false)

WebUI.verifyElementPresent(findTestObject('null'), 1)
WebUI.verifyElementPresent(findTestObject('null'), 1)
WebUI.verifyElementPresent(findTestObject('null'), 1)
WebUI.verifyElementPresent(findTestObject('null'), 1)
WebUI.verifyElementPresent(findTestObject('null'), 1)
WebUI.verifyElementPresent(findTestObject('null'), 1)

//PBM la variable TypeEloignement ne remonte pas du fichier DDT => forçage de la valeur OQTF en dur
//WebUI.click(findTestObject('null'))
//WebUI.click(findTestObject('null'))
WebUI.selectOptionByLabel(findTestObject('null'), "EXPULSION", true)

WebUI.delay(3)

