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


'waiting for the number of elements in the DOM to stop changing'
//CustomKeywords.'tools.WaitForLoaded.waitForElementRendering'()

/** modify WebUI.* keywords which take TestObject as arg0
 * @author hhizaoui
 *so that they call Highlight.on() automatically
 */
CustomKeywords.'com.kazurayam.ksbackyard.HighlightElement.pandemic'()

println "Créer un mot de passe sans majuscule"
WebUI.setText(findTestObject('null'), "hhizaoui001!")
WebUI.setText(findTestObject('null'), "hhizaoui001!")
WebUI.click(findTestObject('null'))
WebUI.verifyElementPresent(findTestObject('null'), 1)

println "Créer un mot de passe sans minuscule"
WebUI.setText(findTestObject('null'), "HHIZAOUI001!")
WebUI.setText(findTestObject('null'), "HHIZAOUI001!")
WebUI.click(findTestObject('null'))
WebUI.verifyElementPresent(findTestObject('null'), 1)

println "Créer un mot de passe sans caractère spécial"
WebUI.setText(findTestObject('null'), "HHizaoui0010")
WebUI.setText(findTestObject('null'), "HHizaoui0010")
WebUI.click(findTestObject('null'))
WebUI.verifyElementPresent(findTestObject('null'), 1)

println "Créer un mot de passe sans chiffre"
WebUI.setText(findTestObject('null'), "HHizaouihiza!")
WebUI.setText(findTestObject('null'), "HHizaouihiza!")
WebUI.click(findTestObject('null'))
WebUI.verifyElementPresent(findTestObject('null'), 1)

println "Saisir 2 mots de passe différents"
WebUI.setText(findTestObject('null'), "HHizaoui001!")
WebUI.setText(findTestObject('null'), "HHizaoui001!def")
WebUI.click(findTestObject('null'))
WebUI.verifyElementPresent(findTestObject('null'), 1)

println "Créer un mot de passe moins de 12 caractères"
WebUI.setText(findTestObject('null'), "HHiza001!")
WebUI.setText(findTestObject('null'), "HHiza001!")
WebUI.click(findTestObject('null'))
WebUI.verifyElementPresent(findTestObject('null'), 1)

