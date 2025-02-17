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
import java.awt.Color
import java.awt.Rectangle
import groovy.json.JsonOutput as JsonOutput
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.driver.DriverFactory
import com.github.kklisura.cdt.launch.ChromeLauncher;
import com.github.kklisura.cdt.services.ChromeService;
import com.github.kklisura.cdt.services.types.ChromeTab;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Collections;
import java.util.HashMap;
import java.util.List
import java.util.Map
import org.openqa.selenium.support.events.EventFiringWebDriver as EventFiringWebDriver
import groovy.json.JsonBuilder
import groovy.json.JsonSlurper

WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
'état civil'
if (PaysDeNaissance == 'France') {
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"), "Paris", FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"), "75000", FailureHandling.OPTIONAL)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"), "0712345678", FailureHandling.OPTIONAL)
	}
else {
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"), "VilleTest", FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"), "75000", FailureHandling.OPTIONAL)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
	WebUI.setText(findTestObject("null"), "0712345678", FailureHandling.OPTIONAL)
	}

'études et langue'
WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)

'situations particulières'
WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)

String [] ListSituationParticulieres = SituationParticulieres.split("-")
println  "ListSituationParticulieres :" + ListSituationParticulieres
 	if (ListSituationParticulieres.contains("RefugeOFPRA")) {WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)}
	else{WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)}
	
	if (ListSituationParticulieres.contains("APATRIDEOFPRA")) {WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)}
	else{WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)}
	
	if (ListSituationParticulieres.contains("AncienCombattant")) {WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)}
	else{WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)}
	
	if (ListSituationParticulieres.contains("MDPH")) { WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)}
	else{WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)}
	
	if (ListSituationParticulieres.contains("CarteInvalide")) {WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)}
	else{WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)}
	
	if (ListSituationParticulieres.contains("SanteDeficient")) {WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)}
	else{WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)}
	
	if (ListSituationParticulieres.contains("PlrsDemdNationalitFr")) {WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)}
	else{WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)}
	
	if (ListSituationParticulieres.contains("PossederDejaNationalitFr")) {WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)}
	else{WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)}



'Valider la Page '
WebUI.click(findTestObject("null"))
WebUI.delay(3)
def AnfCheck = WebUI.verifyElementPresent(findTestObject("null"), GlobalVariable.WaitLoadCheckZone)
if(AnfCheck) {
	KeywordUtil.markPassed( "Etape Votre Situation Actuelle est Validée")}
else {
	KeywordUtil.markFailed( "Etape Votre Situation Actuelle NON Validée")}

