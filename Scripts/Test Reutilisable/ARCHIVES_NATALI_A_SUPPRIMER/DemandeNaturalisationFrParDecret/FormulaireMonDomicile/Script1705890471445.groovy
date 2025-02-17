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
import com.kms.katalon.core.util.KeywordUtil

WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)

if (SituationFoyerActuelle == 'LOCATAIRE') {
	'Situation actuelle'
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	"Date d'entrée dans le domicile "
	WebUI.setText(findTestObject("null"),'23', FailureHandling.OPTIONAL)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"),'2017', FailureHandling.OPTIONAL)
	'Adresse '
	WebUI.setText(findTestObject("null"),'6 RUE NATHALIE LEMEL 44000 NANTES', FailureHandling.OPTIONAL)
	WebUI.delay(5)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	'Occupez-vous un second domicile pour des motifs professionnels ?'
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)	}
if (SituationFoyerActuelle == 'PROPRIETAIRE') {
	'Situation actuelle'
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	"Date d'entrée dans le domicile "
	WebUI.setText(findTestObject("null"),'23', FailureHandling.OPTIONAL)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"),'2017', FailureHandling.OPTIONAL)
	'Adresse '
	WebUI.setText(findTestObject("null"),'6 RUE NATHALIE LEMEL 44000 NANTES', FailureHandling.OPTIONAL)
	WebUI.delay(5)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	'Occupez-vous un second domicile pour des motifs professionnels ?'
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)	}
if (SituationFoyerActuelle == 'HEBERGE') {
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"),'23', FailureHandling.OPTIONAL)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"),'2017', FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"),'6 RUE NATHALIE LEMEL 44000 NANTES', FailureHandling.OPTIONAL)
	WebUI.delay(5)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	'Mon hébergeur'
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"),'Nom Hebergeur', FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"),'Type Hebergeur', FailureHandling.OPTIONAL)
	'Occupez-vous un second domicile pour des motifs professionnels ?'
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)	}
'Mes domiciles précédents'
WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)

'Valider la Page '
WebUI.click(findTestObject("null"))

def AnfCheck = WebUI.verifyElementPresent(findTestObject("null"), GlobalVariable.WaitLoadCheckZone)
if(AnfCheck) {
	KeywordUtil.markPassed( "Etape Mon Domicile est Validée")}
else {
	KeywordUtil.markFailed( "Etape  Mon Domicile  NON Validée")}








