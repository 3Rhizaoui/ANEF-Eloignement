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
import java.nio.file.Path
import java.nio.file.Paths
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import java.awt.datatransfer.StringSelection
import java.awt.event.KeyEvent
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


/** modify WebUI.* keywords which take TestObject as arg0
 * 
 * @author hhizaoui
 *so that they call Highlight.on() automatically
 */
CustomKeywords.'com.kazurayam.ksbackyard.HighlightElement.pandemic'()

'Connexion et Positionnement des Habilitations Agent'
//WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

'recherche de la demande En cours'
WebUI.click(findTestObject('null'))
/** S'affecter et Ouvrir la demande
 *
 */

String NBDemandeATraiter = WebUI.getText(findTestObject('null'))
if (NBDemandeATraiter == '0') {
	WebUI.click(findTestObject('null'))
	'the conteneur table'
	WebDriver driver = DriverFactory.getWebDriver()
	WebElement benef_grid = driver.findElement(By.xpath('/html/body/app-root/div[1]/app-anf/div/app-dossiers-list-verification-formelle/div/div[2]/app-dossiers-list/div/table/tbody'))
	'capture all the rows available in the table '
	List<WebElement> rows = benef_grid.findElements(By.tagName('tr'))
	println "Number of rows: " + rows.size()
	if (rows.size() > 0) {
		for (int rx = 1; rx < rows.size()+1; rx++) {
			WebElement curentNumFind = driver.findElement(By.xpath('/html/body/app-root/div[1]/app-anf/div/app-dossiers-list-verification-formelle/div/div[2]/app-dossiers-list/div/table/tbody/tr['+ rx +']/td[2]' ))
			String TextcurentNumFind = curentNumFind.getText()
			println "rows num "+ rx + " Numero de la demande = " + TextcurentNumFind
			if (TextcurentNumFind == GlobalVariable.NumDemandeNATALI) {
				println "trouvé"
				curentNumFind.click()}
			WebUI.delay(2)
	}
  }
}
else {
	WebUI.click(findTestObject('null'))
	WebUI.click(findTestObject('null'))}
String title1 = WebUI.getWindowTitle()
println "title1:" + title1
'Get index of Documentation window'
index = WebUI.getWindowIndex()
println "index:" + index
/** Zone Information */
'Etat Civil'
'Pièce d’identité attestant de la nationalité d’origine'
WebUI.click(findTestObject('null'))
WebUI.delay(1)
'Close Documentation window'
WebUI.closeWindowIndex(1)
'Switch to Documentation window'
WebUI.switchToWindowIndex(0)
WebUI.delay(2)
'Pièce d’identité attestant de la nationalité d’origine'
TestObject AccepterPieceDIdentite = findTestObject('null')
CustomKeywords.'tools.ShadowDom.clickUsingJS'(AccepterPieceDIdentite)

'Copie intégrale de l’acte de naissance avec filiation'
WebUI.click(findTestObject('null'))
WebUI.delay(1)
'Close Documentation window'
WebUI.closeWindowIndex(1)
'Switch to Documentation window'
WebUI.switchToWindowIndex(0)
WebUI.delay(2)
'Copie intégrale de l’acte de naissance avec filiation'
TestObject AccepterActeDeNaissance = findTestObject('null')
CustomKeywords.'tools.ShadowDom.clickUsingJS'(AccepterActeDeNaissance)


'Copie intégrale de l’acte de naissance avec filiation Traduit'
WebUI.click(findTestObject('null'))
WebUI.delay(1)
'Close Documentation window'
WebUI.closeWindowIndex(1)
'Switch to Documentation window'
WebUI.switchToWindowIndex(0)
WebUI.delay(2)
'Copie intégrale de l’acte de naissance avec filiation Traduit'
TestObject AccepterActeDeNaissanceTraduit = findTestObject('null')
CustomKeywords.'tools.ShadowDom.clickUsingJS'(AccepterActeDeNaissanceTraduit)


'Titre de séjour en cours de validité du postulant (recto/verso)'
WebUI.click(findTestObject('null'))
WebUI.delay(1)
'Close Documentation window'
WebUI.closeWindowIndex(1)
'Switch to Documentation window'
WebUI.switchToWindowIndex(0)
WebUI.delay(2)
'Titre de séjour en cours de validité du postulant (recto/verso)'
TestObject AccepterTitreDeSejour = findTestObject('null')
CustomKeywords.'tools.ShadowDom.clickUsingJS'(AccepterTitreDeSejour)


'Attestation de langue ou diplôme attestant du niveau de langue'
WebUI.click(findTestObject('null'))
WebUI.delay(1)
'Close Documentation window'
WebUI.closeWindowIndex(1)
'Switch to Documentation window'
WebUI.switchToWindowIndex(0)
WebUI.delay(2)
'Attestation de langue ou diplôme attestant du niveau de langue'
TestObject AccepterAttestationDeLangue = findTestObject('null')
CustomKeywords.'tools.ShadowDom.clickUsingJS'(AccepterAttestationDeLangue)

/** PARENTS **/

"Copie de l'acte de mariage"
WebUI.click(findTestObject('null'))
WebUI.delay(1)
'Close Documentation window'
WebUI.closeWindowIndex(1)
'Switch to Documentation window'
WebUI.switchToWindowIndex(0)
WebUI.delay(2)
"Copie de l'acte de mariage"
TestObject AccepterCopieActeMariageParents = findTestObject('null')
CustomKeywords.'tools.ShadowDom.clickUsingJS'(AccepterCopieActeMariageParents)


"Copie de l'acte de mariage Traduit"
WebUI.click(findTestObject('null'))
WebUI.delay(1)
'Close Documentation window'
WebUI.closeWindowIndex(1)
'Switch to Documentation window'
WebUI.switchToWindowIndex(0)
WebUI.delay(2)
"Copie de l'acte de mariage Traduit"
TestObject AccepterCopieActeMariageParentsTraduit = findTestObject('null')
CustomKeywords.'tools.ShadowDom.clickUsingJS'(AccepterCopieActeMariageParentsTraduit)


'Parent n°1'
"Copie de l'acte d'état-civil ou tout document attestant à minima les dates et lieux de naissance"
WebUI.click(findTestObject('null'))
WebUI.delay(1)
'Close Documentation window'
WebUI.closeWindowIndex(1)
'Switch to Documentation window'
WebUI.switchToWindowIndex(0)
WebUI.delay(2)
"Copie de l'acte d'état-civil ou tout document attestant à minima les dates et lieux de naissance"
TestObject AccepterCopieActeDeNaissanceParents1 = findTestObject('null')
CustomKeywords.'tools.ShadowDom.clickUsingJS'(AccepterCopieActeDeNaissanceParents1)


"Copie de l'acte d'état-civil ou tout document attestant à minima les dates et lieux de naissance Traduit"
WebUI.click(findTestObject('null'))
WebUI.delay(1)
'Close Documentation window'
WebUI.closeWindowIndex(1)
'Switch to Documentation window'
WebUI.switchToWindowIndex(0)
WebUI.delay(2)
"Copie de l'acte d'état-civil ou tout document attestant à minima les dates et lieux de naissance Traduit"
TestObject AccepterCopieActeDeNaissanceParents1Traduit = findTestObject('null')
CustomKeywords.'tools.ShadowDom.clickUsingJS'(AccepterCopieActeDeNaissanceParents1Traduit)

'Parent n°2'
"Copie de l'acte d'état-civil ou tout document attestant à minima les dates et lieux de naissance"
WebUI.click(findTestObject('null'))
WebUI.delay(1)
'Close Documentation window'
WebUI.closeWindowIndex(1)
'Switch to Documentation window'
WebUI.switchToWindowIndex(0)
WebUI.delay(2)
"Copie de l'acte d'état-civil ou tout document attestant à minima les dates et lieux de naissance"
TestObject AccepterCopieActeDeNaissanceParents2 = findTestObject('null')
CustomKeywords.'tools.ShadowDom.clickUsingJS'(AccepterCopieActeDeNaissanceParents2)


"Copie de l'acte d'état-civil ou tout document attestant à minima les dates et lieux de naissance Traduit"
WebUI.click(findTestObject('null'))
WebUI.delay(1)
'Close Documentation window'
WebUI.closeWindowIndex(1)
'Switch to Documentation window'
WebUI.switchToWindowIndex(0)
WebUI.delay(2)
"Copie de l'acte d'état-civil ou tout document attestant à minima les dates et lieux de naissance Traduit"
TestObject AccepterCopieActeDeNaissanceParents2Traduit = findTestObject('null')
CustomKeywords.'tools.ShadowDom.clickUsingJS'(AccepterCopieActeDeNaissanceParents2Traduit)

'Situation Actuelle'

"Copie intégrale de l'acte de mariage"
WebUI.click(findTestObject('null'))
WebUI.delay(1)
'Close Documentation window'
WebUI.closeWindowIndex(1)
'Switch to Documentation window'
WebUI.switchToWindowIndex(0)
WebUI.delay(2)
"Copie intégrale de l'acte de mariage"
TestObject AccepterCopieActeDeMariage = findTestObject('null')
CustomKeywords.'tools.ShadowDom.clickUsingJS'(AccepterCopieActeDeMariage)


"Pièce d'identité de votre conjoint(e) ou concubin(e)"
WebUI.click(findTestObject('null'))
WebUI.delay(1)
'Close Documentation window'
WebUI.closeWindowIndex(1)
'Switch to Documentation window'
WebUI.switchToWindowIndex(0)
WebUI.delay(2)
"Pièce d'identité de votre conjoint(e) ou concubin(e)"
TestObject AccepterDocumentIdentiteConjoint = findTestObject('null')
CustomKeywords.'tools.ShadowDom.clickUsingJS'(AccepterDocumentIdentiteConjoint)


"Les certificats de travail, concernant les 3 dernières années"
WebUI.click(findTestObject('null'))
WebUI.delay(1)
'Close Documentation window'
WebUI.closeWindowIndex(1)
'Switch to Documentation window'
WebUI.switchToWindowIndex(0)
WebUI.delay(2)
"Les certificats de travail, concernant les 3 dernières années"
TestObject AccepterCertificatDeTravailConjoint = findTestObject('null')
CustomKeywords.'tools.ShadowDom.clickUsingJS'(AccepterCertificatDeTravailConjoint)


"Contrat de travail du conjoint en cours mentionnant le montant de la rémunération, la date de prise de fonction et l’emploi occupé"
WebUI.click(findTestObject('null'))
WebUI.delay(1)
'Close Documentation window'
WebUI.closeWindowIndex(1)
'Switch to Documentation window'
WebUI.switchToWindowIndex(0)
WebUI.delay(2)
"Contrat de travail du conjoint en cours mentionnant le montant de la rémunération, la date de prise de fonction et l’emploi occupé"
TestObject AccepterContratDeTravailConjoint = findTestObject('null')
CustomKeywords.'tools.ShadowDom.clickUsingJS'(AccepterContratDeTravailConjoint)


"Les 3 derniers bulletins de salaire du conjoint"
WebUI.click(findTestObject('null'))
WebUI.delay(1)
'Close Documentation window'
WebUI.closeWindowIndex(1)
'Switch to Documentation window'
WebUI.switchToWindowIndex(0)
WebUI.delay(2)
"Les 3 derniers bulletins de salaire du conjoint"
TestObject AccepterTroisDerniersBulletinsDeSalaireConjoint = findTestObject('null')
CustomKeywords.'tools.ShadowDom.clickUsingJS'(AccepterTroisDerniersBulletinsDeSalaireConjoint)


"Bulletins de salaire du conjoint de novembre et décembre des 3 dernières années"
WebUI.click(findTestObject('null'))
WebUI.delay(1)
'Close Documentation window'
WebUI.closeWindowIndex(1)
'Switch to Documentation window'
WebUI.switchToWindowIndex(0)
WebUI.delay(2)
"Bulletins de salaire du conjoint de novembre et décembre des 3 dernières années"
TestObject AccepterBulletinsDeSalaire3ansConjoint = findTestObject('null')
CustomKeywords.'tools.ShadowDom.clickUsingJS'(AccepterBulletinsDeSalaire3ansConjoint)

'MES ENFANTS'
'Enfant n°1'

"Copie intégrale de l'acte de naissance"
WebUI.click(findTestObject('null'))
WebUI.delay(1)
'Close Documentation window'
WebUI.closeWindowIndex(1)
'Switch to Documentation window'
WebUI.switchToWindowIndex(0)
WebUI.delay(2)
"Copie intégrale de l'acte de naissance"
TestObject AccepterActeDeNaissanceEnfant1= findTestObject('null')
CustomKeywords.'tools.ShadowDom.clickUsingJS'(AccepterActeDeNaissanceEnfant1)


"Copie intégrale de l'acte de naissance Traduit"
WebUI.click(findTestObject('null'))
WebUI.delay(1)
'Close Documentation window'
WebUI.closeWindowIndex(1)
'Switch to Documentation window'
WebUI.switchToWindowIndex(0)
WebUI.delay(2)
"Copie intégrale de l'acte de naissance Traduit"
TestObject AccepterActeDeNaissanceEnfant1Traduit= findTestObject('null')
CustomKeywords.'tools.ShadowDom.clickUsingJS'(AccepterActeDeNaissanceEnfant1Traduit)


"Certificat de nationalité française"
WebUI.click(findTestObject('null'))
WebUI.delay(1)
'Close Documentation window'
WebUI.closeWindowIndex(1)
'Switch to Documentation window'
WebUI.switchToWindowIndex(0)
WebUI.delay(2)
"Certificat de nationalité française"
TestObject AccepterCertificatDeNationaliteFrEnfant1= findTestObject('null')
CustomKeywords.'tools.ShadowDom.clickUsingJS'(AccepterCertificatDeNationaliteFrEnfant1)


"Justificatif de résidence en France"
WebUI.click(findTestObject('null'))
WebUI.delay(1)
'Close Documentation window'
WebUI.closeWindowIndex(1)
'Switch to Documentation window'
WebUI.switchToWindowIndex(0)
WebUI.delay(2)
"Justificatif de résidence en France"
TestObject AccepterJustificatifDeResidenceEnFrEnfant1= findTestObject('null')
CustomKeywords.'tools.ShadowDom.clickUsingJS'(AccepterJustificatifDeResidenceEnFrEnfant1)


'Domicile actuel'

"Dernière facture de téléphone fixe, internet ou d'électricité"
WebUI.click(findTestObject('null'))
WebUI.delay(1)
'Close Documentation window'
WebUI.closeWindowIndex(1)
'Switch to Documentation window'
WebUI.switchToWindowIndex(0)
WebUI.delay(2)
"Dernière facture de téléphone fixe, internet ou d'électricité"
TestObject AccepterDocumentContratDeLocation= findTestObject('null')
CustomKeywords.'tools.ShadowDom.clickUsingJS'(AccepterDocumentContratDeLocation)


"Attestation de propriété TroisDernieresQuittancesDeLoyer"
WebUI.click(findTestObject('null'))
WebUI.delay(1)
'Close Documentation window'
WebUI.closeWindowIndex(1)
'Switch to Documentation window'
WebUI.switchToWindowIndex(0)
WebUI.delay(2)
"Attestation de propriété TroisDernieresQuittancesDeLoyer"
TestObject AccepterDocumentTroisDernieresQuittancesDeLoyer= findTestObject('null')
CustomKeywords.'tools.ShadowDom.clickUsingJS'(AccepterDocumentTroisDernieresQuittancesDeLoyer)


'Domiciles précédents'
/*********************************/

'Situation actuelle'

"Les avis d’imposition ou de non-imposition des 3 dernières années"
WebUI.click(findTestObject('null'))
WebUI.delay(1)
'Close Documentation window'
WebUI.closeWindowIndex(1)
'Switch to Documentation window'
WebUI.switchToWindowIndex(0)
WebUI.delay(2)
"Attestation de propriété TroisDernieresQuittancesDeLoyer"
TestObject AccepterAvisDimposition3Annees= findTestObject('null')
CustomKeywords.'tools.ShadowDom.clickUsingJS'(AccepterAvisDimposition3Annees)


"Bordereau de situation fiscale, modèle P. 237, daté de moins de 3 mois portant sur les 3 dernières années"
WebUI.click(findTestObject('null'))
WebUI.delay(1)
'Close Documentation window'
WebUI.closeWindowIndex(1)
'Switch to Documentation window'
WebUI.switchToWindowIndex(0)
WebUI.delay(2)
"Bordereau de situation fiscale, modèle P. 237, daté de moins de 3 mois portant sur les 3 dernières années"
TestObject AccepterBordereauDeSituationFiscale= findTestObject('null')
CustomKeywords.'tools.ShadowDom.clickUsingJS'(AccepterBordereauDeSituationFiscale)


'Situation actuelle n°1'

"Les certificats de travail, concernant si possible les 3 dernières années ou le Relevé de Carrière"
WebUI.click(findTestObject('null'))
WebUI.delay(1)
'Close Documentation window'
WebUI.closeWindowIndex(1)
'Switch to Documentation window'
WebUI.switchToWindowIndex(0)
WebUI.delay(2)
"Les certificats de travail, concernant si possible les 3 dernières années ou le Relevé de Carrière"
TestObject AccepterReleveDeCarriere= findTestObject('null')
CustomKeywords.'tools.ShadowDom.clickUsingJS'(AccepterReleveDeCarriere)


"Contrat de travail en cours, indiquant le salaire, la date d’entrée, l’emploi occupé"
WebUI.click(findTestObject('null'))
WebUI.delay(1)
'Close Documentation window'
WebUI.closeWindowIndex(1)
'Switch to Documentation window'
WebUI.switchToWindowIndex(0)
WebUI.delay(2)
"Contrat de travail en cours, indiquant le salaire, la date d’entrée, l’emploi occupé"
TestObject AccepterContratDeTravailAvecRemuneration= findTestObject('null')
CustomKeywords.'tools.ShadowDom.clickUsingJS'(AccepterContratDeTravailAvecRemuneration)


"Les 3 derniers bulletins de salaire"
WebUI.click(findTestObject('null'))
WebUI.delay(1)
'Close Documentation window'
WebUI.closeWindowIndex(1)
'Switch to Documentation window'
WebUI.switchToWindowIndex(0)
WebUI.delay(2)
"Les 3 derniers bulletins de salaire"
TestObject AccepterTroisDernieresBulletinsDeSalaire= findTestObject('null')
CustomKeywords.'tools.ShadowDom.clickUsingJS'(AccepterTroisDernieresBulletinsDeSalaire)


"Les contrats, sur les 3 dernières années le cas échéant ou le Relevé de Carrière"
WebUI.click(findTestObject('null'))
WebUI.delay(1)
'Close Documentation window'
WebUI.closeWindowIndex(1)
'Switch to Documentation window'
WebUI.switchToWindowIndex(0)
WebUI.delay(2)
"Les contrats, sur les 3 dernières années le cas échéant ou le Relevé de Carrière"
TestObject AccepterContratsSurLes3DernieresAnnees= findTestObject('null')
CustomKeywords.'tools.ShadowDom.clickUsingJS'(AccepterContratsSurLes3DernieresAnnees)


"Bulletins de salaire de novembre et décembre des 3 dernières années d'activité"
WebUI.click(findTestObject('null'))
WebUI.delay(1)
'Close Documentation window'
WebUI.closeWindowIndex(1)
'Switch to Documentation window'
WebUI.switchToWindowIndex(0)
WebUI.delay(2)
"Bulletins de salaire de novembre et décembre des 3 dernières années d'activité"
TestObject AccepterBulletinsDeSalaireDeNovembreEtDecembreDes3Annees= findTestObject('null')
CustomKeywords.'tools.ShadowDom.clickUsingJS'(AccepterBulletinsDeSalaireDeNovembreEtDecembreDes3Annees)


'Autres ressources'

"Dernier bordereau de versement des allocations familiales, de l’allocation logement, du revenu de solidarité active, etc."
WebUI.click(findTestObject('null'))
WebUI.delay(1)
'Close Documentation window'
WebUI.closeWindowIndex(1)
'Switch to Documentation window'
WebUI.switchToWindowIndex(0)
WebUI.delay(2)
"Dernier bordereau de versement des allocations familiales, de l’allocation logement, du revenu de solidarité active, etc."
TestObject AccepterDernierBordereauDeVersementDesAllocationsFamiliales = findTestObject('null')
CustomKeywords.'tools.ShadowDom.clickUsingJS'(AccepterDernierBordereauDeVersementDesAllocationsFamiliales)


'Valider La Vérification Formelle'
WebUI.click(findTestObject('null'))

'Validation de la PopUp De la validation Formelle et La Notification Du Demandeur'
TestObject TitreNotification = findTestObject('null')
TestObject Btn_NotifierLeDemandeur =  findTestObject('null')
if (WebUI.verifyElementPresent(TitreNotification, 10)) { WebUI.click(Btn_NotifierLeDemandeur)}

















































































