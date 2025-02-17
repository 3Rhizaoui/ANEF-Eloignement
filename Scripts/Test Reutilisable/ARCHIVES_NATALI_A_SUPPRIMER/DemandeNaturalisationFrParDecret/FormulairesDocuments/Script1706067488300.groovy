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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.driver.DriverFactory

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebDriver
import org.openqa.selenium.remote.LocalFileDetector
import org.openqa.selenium.support.events.EventFiringWebDriver
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.selenium.driver.CRemoteWebDriver
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.remote.LocalFileDetector as LocalFileDetector
import org.openqa.selenium.remote.RemoteWebDriver
import org.openqa.selenium.support.events.EventFiringWebDriver
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.remote.LocalFileDetector as LocalFileDetector
import org.openqa.selenium.remote.RemoteWebDriver
import org.openqa.selenium.support.events.EventFiringWebDriver
import com.kms.katalon.core.util.KeywordUtil

/** modify WebUI.* keywords which take TestObject as arg0
 * @author hhizaoui
 *so that they call Highlight.on() automatically
 */
CustomKeywords.'com.kazurayam.ksbackyard.HighlightElement.pandemic'()

'RunConfiguration for get Execution Properties Driver'
Map RunBrowserConfiguration = RunConfiguration.getExecutionProperties()
String DriverName = GlobalVariable.DriverName
EventFiringWebDriver driver = DriverFactory.getWebDriver()
WebDriver wrappedDriver = driver.getWrappedDriver()
System.out.println(wrappedDriver.getClass())
if (wrappedDriver.class == CRemoteWebDriver) {
	wrappedDriver.setFileDetector(new LocalFileDetector())
}
String SpecificDownloadDirectory = ""
  
'Upload file attachment'
if (DriverName =='FIREFOX_DRIVER') {
	  SpecificDownloadDirectory = (RunConfiguration.getProjectDir() + "/Data Files/").replace(/\//, '\\')
	  }
else if (wrappedDriver.class == 'CRemoteWebDriver'){
	 SpecificDownloadDirectory = new File(RunConfiguration.getProjectDir() + "/Data Files/").getCanonicalPath()}
else {
	  SpecificDownloadDirectory = (RunConfiguration.getProjectDir() + "/Data Files")
	  println "SpecificDownloadDirectory : " + SpecificDownloadDirectory }
 
'Documents Justificatifs Correspondant à votre situation :Demande de Nationalité '
/********************************************************************************************************/
/******'état civil'****/
WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
'Joindre un  justificatif Passeport'
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/Passeport.pdf', FailureHandling.OPTIONAL)
"Joindre un  justificatif Copie intégrale de l'acte de naissance avec filiation"
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/EtatCivil.pdf', FailureHandling.OPTIONAL)
"Joindre un  justificatif Copie intégrale de l'acte de naissance avec filiation Avec Traduction"
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/EtatCivilTraduit.pdf', FailureHandling.OPTIONAL)
'Titre de séjour du postulant en cours de validité (copie recto/verso)'
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/TitreDeSejour.pdf', FailureHandling.OPTIONAL)

/******'études et langue'****/
WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
'Attestation de langue ou diplôme attestant le niveau de langue'
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/AttestationDeLangue.pdf', FailureHandling.OPTIONAL)
WebUI.delay(5)
'Valider la Page '
WebUI.click(findTestObject("null"))
WebUI.delay(5)
def AnfCheck = WebUI.verifyElementPresent(findTestObject("null"), GlobalVariable.WaitLoadCheckZone)
if(AnfCheck) {
	KeywordUtil.markPassed( "Etape Votre Situation Actuelle est Validée")}
else {
	KeywordUtil.markFailed( "Etape Votre Situation Actuelle NON Validée")}

/********************************************'Parents Et Fraterie'************************************************************/
/******'Parents'****/

/******'Cas 2 Parents Connus '****/

if (ParentConnu == '2') {
"Joindre un  justificatif Copie de l'acte de mariage Parents"
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/CopieActeDeMariageParents.pdf', FailureHandling.OPTIONAL)
"Joindre un  justificatif Copie de l'acte de mariage Parents Traduit"
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/CopieActeDeMariageParentsTraduit.pdf', FailureHandling.OPTIONAL)

"Joindre un  justificatif Copie de l'acte de Naissance  Parent1"
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/CopieActeDeNaissanceParent1.pdf', FailureHandling.OPTIONAL)
"Joindre un  justificatif Copie de l'acte de naissance  Parent1 Traduit"
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/CopieActeDeNaissanceParent1Traduit.pdf', FailureHandling.OPTIONAL)

"Joindre un  justificatif Copie de l'acte de Naissance Parent2"
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/CopieActeDeNaissanceParent2.pdf', FailureHandling.OPTIONAL)
"Joindre un  justificatif Copie de l'acte de mariage Parents Traduit"
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/CopieActeDeNaissanceParent2Traduit.pdf', FailureHandling.OPTIONAL)
}
/******'Cas 1 Parent Connu '****/
if (ParentConnu == '1') {
	"Titre de séjour en cours de validité du (des) parent(s) résidant en France *"
	WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/CopieActeDeMariageParents.pdf', FailureHandling.OPTIONAL)
	"Titre de séjour en cours de validité du (des) parent(s) résidant en France *Traduit"
	WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/CopieActeDeMariageParentsTraduit.pdf', FailureHandling.OPTIONAL)
		
	"Joindre un  justificatif Copie de l'acte de Naissance  Parent1"
	WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/CopieActeDeNaissanceParent1.pdf', FailureHandling.OPTIONAL)
	"Joindre un  justificatif Copie de l'acte de naissance  Parent1 Traduit"
	WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/CopieActeDeNaissanceParent1Traduit.pdf', FailureHandling.OPTIONAL)
}


WebUI.delay(5)
'Valider la Page '
WebUI.click(findTestObject("null"))
WebUI.delay(5)
AnfCheck = WebUI.verifyElementPresent(findTestObject("null"), GlobalVariable.WaitLoadCheckZone)
if(AnfCheck) {KeywordUtil.markPassed( "Etape Votre Situation Actuelle est Validée")}
else {KeywordUtil.markFailed( "Etape Votre Situation Actuelle NON Validée")}

/********************************************'Ma situation actuelle'************************************************************/
/******'Mariage et Conjoint'****/
"Copie intégrale de l'acte de mariage"
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/CopieIntegraleDeActeDeMariage.pdf', FailureHandling.OPTIONAL)

"Document d'identité du conjoint attestant la (ou les) nationalité(s) d'origine"
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/DocumentIdentiteDuConjointAttestantNationaliteOrigine.pdf', FailureHandling.OPTIONAL)

"Les certificats de travail du conjoint, concernant si possible les 3 dernières années ou le relevé de carrière"
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/CertificatsDeTravailDuConjoint.pdf', FailureHandling.OPTIONAL)

"Contrat de travail du conjoint en cours mentionnant le montant de la rémunération, la date de prise de fonction et l’emploi occupé "
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/ContratDeTravailDuConjoint.pdf', FailureHandling.OPTIONAL)

"Les 3 derniers bulletins de salaire du conjoint"
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/Les3DerniersBulletinsDeSalaireDuConjoint.pdf', FailureHandling.OPTIONAL)
WebUI.delay(3)
"Bulletins de salaire du conjoint de novembre et décembre des 3 dernières années"
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/BulletinsDeSalaireDuConjoint.pdf', FailureHandling.OPTIONAL)

/******'Mes Enfants'****/
'Enfant 1'
"Copie intégrale de l'acte de naissance Enfant 1"
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/ActeDeNaissanceEnfant1.pdf', FailureHandling.OPTIONAL)
"Copie intégrale de l'acte de naissance Enfant 1 Traduction "
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/ActeDeNaissanceEnfant1Traduit.pdf', FailureHandling.OPTIONAL)
'Certificat de nationalité française Enfant 1'
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/CertificatDeNationaliteFrEnfant1.pdf', FailureHandling.OPTIONAL)
'Justificatif de résidence en France Enfant 1'
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/JustificatifDeResidenceEnFrEnfant1.pdf', FailureHandling.OPTIONAL)

'Enfant 2'
"Copie intégrale de l'acte de naissance Enfant 2"
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/ActeDeNaissanceEnfant2.pdf', FailureHandling.OPTIONAL)
"Copie intégrale de l'acte de naissance Enfant 2 Traduction "
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/ActeDeNaissanceEnfant2Traduit.pdf', FailureHandling.OPTIONAL)
'Certificat de nationalité française Enfant 2'
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/CertificatDeNationaliteFrEnfant2.pdf', FailureHandling.OPTIONAL)
'Justificatif de résidence en France Enfant 2'
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/JustificatifDeResidenceEnFrEnfant2.pdf', FailureHandling.OPTIONAL)

'Enfant 3'
"Copie intégrale de l'acte de naissance Enfant 3"
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/ActeDeNaissanceEnfant3.pdf', FailureHandling.OPTIONAL)
"Copie intégrale de l'acte de naissance Enfant 3 Traduction "
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/ActeDeNaissanceEnfant3Traduit.pdf', FailureHandling.OPTIONAL)
'Certificat de nationalité française Enfant 3'
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/CertificatDeNationaliteFrEnfant3.pdf', FailureHandling.OPTIONAL)
'Justificatif de résidence en France Enfant 3'
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/JustificatifDeResidenceEnFrEnfant3.pdf', FailureHandling.OPTIONAL)
'Décision autorisant le regroupement familial Enfant 3'
WebUI.uploadFile(findTestObject('Object Repository/Pages_Documents/Btn_ChoisirFichier_DecisionAutorisantLeRegroupementFamilialEnfant3'), SpecificDownloadDirectory +'/RegroupementFamilialEnfant3.pdf', FailureHandling.OPTIONAL)

'Enfant 4'
"Copie intégrale de l'acte de naissance Enfant 4"
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/ActeDeNaissanceEnfant4.pdf', FailureHandling.OPTIONAL)
"Copie intégrale de l'acte de naissance Enfant 4 Traduction "
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/ActeDeNaissanceEnfant4Traduit.pdf', FailureHandling.OPTIONAL)
'Décision autorisant le regroupement familial Enfant 4'
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/RegroupementFamilialEnfant4.pdf', FailureHandling.OPTIONAL)
"Décision autorisant le regroupement familial"
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/DecisionAutorisantRegroupementFamilial.pdf', FailureHandling.OPTIONAL)
WebUI.delay(5)


'Valider la Page '
WebUI.click(findTestObject("null"))
WebUI.delay(5)
AnfCheck = WebUI.verifyElementPresent(findTestObject("null"), GlobalVariable.WaitLoadCheckZone)
if(AnfCheck) {KeywordUtil.markPassed( "Etape Votre Situation Actuelle est Validée")}
else {KeywordUtil.markFailed( "Etape Votre Situation Actuelle NON Validée")}

/********************************************'Mon Domicile'************************************************************/
/******'Mon domicile actuel'****/
"Joindre un  justificatif Contrat de location"
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/ContratDeLocation.pdf', FailureHandling.OPTIONAL)
"Joindre un  justificatif Trois dernières quittances de loyer"
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/TroisDernieresQuittancesDeLoyer.pdf', FailureHandling.OPTIONAL)
"Joindre un  justificatif Justificatif de domicile datant de moins de 6 mois"
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/JustificatifDomicileDeMoinsDe6Mois.pdf', FailureHandling.OPTIONAL)

/******'Mes domiciles précédents'****/
"Joindre un  justificatif Casier judiciaire étranger des pays où vous avez résidé 6 mois et plus au cours des dernières années, ou des pays dont vous avez la nationalité"
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/CasierJudiciaireEtranger.pdf', FailureHandling.OPTIONAL)

"Joindre un  justificatif Traduit Casier judiciaire étranger des pays où vous avez résidé 6 mois et plus au cours des dernières années, ou des pays dont vous avez la nationalité"
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/CasierJudiciaireEtrangerTraduit.pdf', FailureHandling.OPTIONAL)
WebUI.delay(5)
/******'Mon domicile actuel'****/
'Valider la Page '
WebUI.delay(5)
AnfCheck = WebUI.verifyElementPresent(findTestObject("null"), GlobalVariable.WaitLoadCheckZone)
if(AnfCheck) {KeywordUtil.markPassed( "Etape Mon Domicile est Validée")}
else {	KeywordUtil.markFailed( "Etape  Mon Domicile  NON Validée")}
WebUI.click(findTestObject("null"))


/********************************************'Ressource'************************************************************/
/******'Ma situation actuelle'****/
"Avis d’imposition (ou de non-imposition) des 3 dernières années"
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/AvisDimposition3Annees.pdf', FailureHandling.OPTIONAL)

"Bordereau de situation fiscale (modèle P. 237) datant de moins de 3 mois portant sur les 3 dernières années"
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/BordereauDeSituationFiscale.pdf', FailureHandling.OPTIONAL)

/******Situation actuelle n°1****/
"Les certificats de travail, concernant si possible les 3 dernières années ou le Relevé de Carrière"
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/ReleveDeCarriere.pdf', FailureHandling.OPTIONAL)

"Contrat de travail en cours mentionnant le montant de la rémunération, la date de prise de fonction et l’emploi occupé"
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/ContratDeTravailAvecRemuneration.pdf', FailureHandling.OPTIONAL)

"Les 3 derniers bulletins de salaire "
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/TroisDernieresBulletinsDeSalaire.pdf', FailureHandling.OPTIONAL)

"Les contrats, sur les 3 dernières années le cas échéant ou le Relevé de Carrière"
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/ContratsSurLes3DernieresAnnees.pdf', FailureHandling.OPTIONAL)

"Bulletins de salaire de novembre et décembre des 3 dernières années"
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/BulletinsDeSalaireDeNovembreEtDecembreDes3Annees.pdf', FailureHandling.OPTIONAL)

/******Mes Autres Ressources****/
"Dernier bordereau de versement des allocations familiales, de l'allocation logement, du revenu de solidarité active, etc."
'Dernier bordereau de versement des allocations familiales'
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/DernierBordereauDeVersementDesAllocationsFamiliales.pdf', FailureHandling.OPTIONAL)

"Attestation bancaire précisant le montant des revenus mobiliers et/ou immobiliers en provenance de France *"
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/AttestationBancaireRevenusMobiliers.pdf', FailureHandling.OPTIONAL)

"Copie du (ou des) contrat(s) de bail"
WebUI.uploadFile(findTestObject('null'), SpecificDownloadDirectory +'/CopieDuContratDeBail.pdf', FailureHandling.OPTIONAL)


WebUI.delay(5)
'Check de la Page '
AnfCheck = WebUI.verifyElementPresent(findTestObject("null"), GlobalVariable.WaitLoadCheckZone)
if(AnfCheck) {KeywordUtil.markPassed( "Etape Mes Ressources est Validée")}
else {KeywordUtil.markFailed( "Etape Mes Ressources NON Validée")}
WebUI.delay(5)
WebUI.click(findTestObject("null"))