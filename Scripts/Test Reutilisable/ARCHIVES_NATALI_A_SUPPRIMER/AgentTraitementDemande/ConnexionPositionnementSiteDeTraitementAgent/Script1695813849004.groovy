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
 * 
 * @author hhizaoui
 *so that they call Highlight.on() automatically
 */
CustomKeywords.'com.kazurayam.ksbackyard.HighlightElement.pandemic'()

WebUI.callTestCase(findTestCase('Test Reutilisable/Main/ANEF_Eloignement_V_Nawres/ANEF_Lancer_URL_ANEF'), [('Profiles') : 'Agent', ('EnvExec') : EnvExec ], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('Test Reutilisable/Main/ANEF_Eloignement_V_Nawres/ANEF_Identification'), [('Profiles') : 'Agent', ('NumEtrangerVisa') : NumEtrangerVisa ], FailureHandling.STOP_ON_FAILURE)
'Ouvrir App-Header Account-Menu pour positionner la bonne Habilitation'
WebUI.click(findTestObject('null'))
WebUI.click(findTestObject('null'))
//WebUI.click(findTestObject('null'))

/**Vérification De la PopUp Afficher Habilitation
 *
 */
TestObject PopUpHabilitations =findTestObject('null')
WebUI.verifyElementPresent(PopUpHabilitations, 1)
String TitrePopUpAfficherCommentaires = WebUI.getText(PopUpHabilitations)
if(!TitrePopUpAfficherCommentaires.contains('Habilitations')) {
	KeywordUtil.markPassed("Vérifier le titre de PopUp HABILITATIONS.")}
else {KeywordUtil.markPassed("Le Titre de PopUp est bien Affiché : HABILITATIONS.")}

'Choisir le site de traitement avec Profile  Vérificateur '
TestObject RoleEncadreurSite7701 =findTestObject('null')
WebUI.verifyElementPresent(RoleEncadreurSite7701, 1)
WebUI.click(RoleEncadreurSite7701)

//'Choisr le site de traitement pour les Passeports Talents'
//if ((GlobalVariable.TypeTitreDeSejour)== "TS-PT-SalariéQualifié") {
//TestObject RoleEncadreurSite7704 =findTestObject('null')
//WebUI.verifyElementPresent(RoleEncadreurSite7704, 1)
//WebUI.click(RoleEncadreurSite7704)}

TestObject ValiderHabilitations =findTestObject('null')
TestObject AnnulerHabilitations =findTestObject('null')
WebUI.verifyElementPresent(ValiderHabilitations, 1)
WebUI.verifyElementPresent(AnnulerHabilitations, 1)

if (WebUI.verifyElementClickable(ValiderHabilitations)) {WebUI.click(ValiderHabilitations)}
else {WebUI.click(AnnulerHabilitations)}


