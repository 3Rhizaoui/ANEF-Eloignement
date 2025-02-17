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
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.util.KeywordUtil
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import java.awt.Robot
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection
import java.awt.event.KeyEvent
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI



/** modify WebUI.* keywords which take TestObject as arg0
* so that they call Highlight.on() automatically
*/
CustomKeywords.'com.kazurayam.ksbackyard.HighlightElement.pandemic'()

/**Vérification De la PopUp Afficher Commentaires
 *
 */
TestObject LinkLesCommentaires=findTestObject('null')
WebUI.verifyElementPresent(LinkLesCommentaires, 1)
WebUI.click(LinkLesCommentaires)
TestObject PopUpAfficherCommentaires =findTestObject('null')
WebUI.verifyElementPresent(PopUpAfficherCommentaires, 1)
String TitrePopUpAfficherCommentaires = WebUI.getText(PopUpAfficherCommentaires)
if(!TitrePopUpAfficherCommentaires.contains('AFFICHER LES COMMENTAIRES')) {
	KeywordUtil.markFailed("Vérifier le titre de PopUp AFFICHER LES COMMENTAIRES.")}
else {KeywordUtil.markPassed("Le Titre de PopUp est bien Affiché : AFFICHER LES COMMENTAIRES.")}


TestObject PopUpCommentairesBtnFermer =findTestObject('null')
WebUI.verifyElementPresent(PopUpCommentairesBtnFermer, 1)
WebUI.click(PopUpCommentairesBtnFermer)


/**Vérification Du Texte Statut de La Demande Avec Vérification Du Numéro de La demande
 * 
 */
TestObject StatutDemandeurAvecNumEtranger = findTestObject('null')
WebUI.verifyElementPresent(StatutDemandeurAvecNumEtranger, 1)
String NumEtranger = WebUI.getText(StatutDemandeurAvecNumEtranger)
if(!NumEtranger.contains(GlobalVariable.NumEtrangerVisa)) {	
	KeywordUtil.markFailed("Vérifier le Numéro Etranger de la demande ouverte.")}
else {KeywordUtil.markPassed("Le Numéro Etranger de la demande est bien Affiché.")}


/**Vérification De la PopUp Historique de la demande
 * 
 */
TestObject AfficherHistorique= findTestObject('null')
WebUI.verifyElementPresent(AfficherHistorique, 1)
WebUI.click(AfficherHistorique)
TestObject PopUpHistoriqueDeLaDemande =findTestObject('null')
WebUI.verifyElementPresent(PopUpHistoriqueDeLaDemande, 1)
String TitreHistoriqueDeLaDemande = WebUI.getText(PopUpHistoriqueDeLaDemande)
if(!TitreHistoriqueDeLaDemande.contains('HISTORIQUE DE LA DEMANDE')) {
	KeywordUtil.markFailed("Vérifier le titre de PopUp Historique de la demande.")}
else {KeywordUtil.markPassed("Le Titre de PopUp est bien Affiché : Historique de la demande.")}

TestObject ListeAction =findTestObject('null')
WebUI.verifyElementPresent(ListeAction, 1)
WebUI.click(ListeAction)

TestObject PopUpHistoBtnFermer =findTestObject('null')
WebUI.verifyElementPresent(PopUpHistoBtnFermer, 1)
WebUI.click(PopUpHistoBtnFermer)


/**Vérification De la PopUp Afficher Les Document Additionnels
 * 
 */
TestObject AfficherDocumentsAdditionnels= findTestObject('null')
WebUI.verifyElementPresent(AfficherDocumentsAdditionnels, 1)
WebUI.click(AfficherDocumentsAdditionnels)
TestObject PopUpDocsAdditionnels =findTestObject('null')
WebUI.verifyElementPresent(PopUpDocsAdditionnels, 1)
String TitrePopUpDocsAdditionnels = WebUI.getText(PopUpDocsAdditionnels)
if(!TitrePopUpDocsAdditionnels.contains('DOCUMENTS ADDITIONNELS')) {
	KeywordUtil.markFailed("Vérifier le titre de PopUp DOCUMENTS ADDITIONNELS.")}
else {KeywordUtil.markPassed("Le Titre de PopUp est bien Affiché : DOCUMENTS ADDITIONNELS.")}
/*
TestObject AjouterNouveauDocument =findTestObject('null')
WebUI.verifyElementPresent(AjouterNouveauDocument, 1)
WebUI.click(AjouterNouveauDocument)

TestObject TypeDocument =findTestObject('null')
WebUI.verifyElementPresent(TypeDocument, 1)
WebUI.click(TypeDocument)
*/
TestObject PopUpDocumentAddBtnFermer =findTestObject('null')
WebUI.verifyElementPresent(PopUpDocumentAddBtnFermer, 1)
WebUI.click(PopUpDocumentAddBtnFermer)



/**Vérification De la PopUp TRANSFERER
 * 
 */
TestObject LinkTransferer=findTestObject('null')
WebUI.verifyElementPresent(LinkTransferer, 1)
WebUI.click(LinkTransferer)
TestObject PopUpTransferer =findTestObject('null')
WebUI.verifyElementPresent(PopUpTransferer, 1)
String TitrePopUpTransferer = WebUI.getText(PopUpTransferer)
if(!TitrePopUpTransferer.contains('TRANSFÉRER LA DEMANDE')) {
	KeywordUtil.markFailed("Vérifier le titre de PopUp TRANSFÉRER LA DEMANDE.")}
else {KeywordUtil.markPassed("Le Titre de PopUp est bien Affiché : TRANSFÉRER LA DEMANDE.")}

TestObject TransfererA =findTestObject('null')
WebUI.verifyElementPresent(TransfererA, 1)
WebUI.doubleClick(TransfererA)
WebUI.delay(2)
TestObject PopUpTransfererBtnAnnuler =findTestObject('null')
WebUI.verifyElementPresent(PopUpTransfererBtnAnnuler, 2)
WebUI.click(PopUpTransfererBtnAnnuler)



/**Vérification De la PopUp REAFFECTER
 *
 */
TestObject LinkReaffecter=findTestObject('null')
WebUI.verifyElementPresent(LinkReaffecter, 1)
WebUI.click(LinkReaffecter)
TestObject PopUpReaffecter =findTestObject('null')
WebUI.verifyElementPresent(PopUpReaffecter, 1)
String TitrePopUpReaffecter = WebUI.getText(PopUpReaffecter)
if(!TitrePopUpReaffecter.contains('RÉAFFECTER LA DEMANDE')) {
	KeywordUtil.markFailed("Vérifier le titre de PopUp RÉAFFECTER LA DEMANDE.")}
else {KeywordUtil.markPassed("Le Titre de PopUp est bien Affiché : RÉAFFECTER LA DEMANDE.")}

TestObject ReaffecterA =findTestObject('null')
WebUI.verifyElementPresent(ReaffecterA, 1)
WebUI.doubleClick(ReaffecterA)

TestObject PopUpReaffecterBtnConfirmer =findTestObject('null')
WebUI.verifyElementPresent(PopUpReaffecterBtnConfirmer, 1)
WebUI.click(PopUpReaffecterBtnConfirmer)


/**Vérification De la PopUp PRODUIRE UNE ATTESTATION DE PROLONGATION
 *
 */

TestObject LinkAttestationProlongation=findTestObject('null')
WebUI.verifyElementPresent(LinkAttestationProlongation, 1)
WebUI.click(LinkAttestationProlongation)
TestObject PopUpAttestationProlongation =findTestObject('null')
WebUI.verifyElementPresent(PopUpAttestationProlongation, 1)
String TitrePopUpAttestationProlongation = WebUI.getText(PopUpAttestationProlongation)
if(!TitrePopUpAttestationProlongation.contains('PRODUIRE UNE ATTESTATION DE PROLONGATION')) {
	KeywordUtil.markFailed("Vérifier le titre de PopUp PRODUIRE UNE ATTESTATION DE PROLONGATION.")}
else {KeywordUtil.markPassed("Le Titre de PopUp est bien Affiché : PRODUIRE UNE ATTESTATION DE PROLONGATION.")}

TestObject MotifProlongation =findTestObject('null')
WebUI.verifyElementPresent(MotifProlongation, 1)
WebUI.doubleClick(MotifProlongation)

TestObject PopUpAttestationProlongationBtnAnnuler =findTestObject('null')
WebUI.verifyElementPresent(PopUpAttestationProlongationBtnAnnuler, 1)
WebUI.click(PopUpAttestationProlongationBtnAnnuler)


/**Vérification Des Boutons De La Page De Traitement De La Demande  (verifyElementPresent , verifyElementClickable)
 *Enregistrer et quitter
 *Suspendre l’instruction
 *Clôturer la demande
 *Valider l'adresse / Rapatrier le dossier
 * < RETOUR À TOUTES LES DEMANDES 
 */

TestObject Btn_EnregistrerQuitter =findTestObject('null')
WebUI.verifyElementPresent(Btn_EnregistrerQuitter, 1)
WebUI.verifyElementClickable(Btn_EnregistrerQuitter)

TestObject Btn_SuspendreInstruction =findTestObject('null')
WebUI.verifyElementPresent(Btn_SuspendreInstruction, 1)
WebUI.verifyElementClickable(Btn_SuspendreInstruction)

TestObject Btn_ClôturerLaDemande =findTestObject('null')
WebUI.verifyElementPresent(Btn_ClôturerLaDemande, 1)
WebUI.verifyElementClickable(Btn_ClôturerLaDemande)

TestObject Btn_ValiderAdresseRapatrierLeDossier =findTestObject('null')
WebUI.verifyElementPresent(Btn_ValiderAdresseRapatrierLeDossier, 1)
WebUI.verifyElementClickable(Btn_ValiderAdresseRapatrierLeDossier)

TestObject link_RetourAToutesLesDemandes =findTestObject('null')
WebUI.verifyElementPresent(link_RetourAToutesLesDemandes, 1)
WebUI.verifyElementClickable(link_RetourAToutesLesDemandes)