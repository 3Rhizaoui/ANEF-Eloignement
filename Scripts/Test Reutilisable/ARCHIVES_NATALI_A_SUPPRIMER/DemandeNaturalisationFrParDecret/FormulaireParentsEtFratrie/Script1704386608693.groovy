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

WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)

'Informations état civil des Parents'
TestObject Check_Parents1Inconnu = findTestObject('null')
TestObject Check_Parents2Inconnu = findTestObject('null')

'Mes-parents'
switch (ParentConnu) {
    case '0':
        'Informations état civil des Parents'
        if (WebUI.verifyElementNotChecked(Check_Parents1Inconnu, 1, FailureHandling.OPTIONAL)) {
            WebUI.click(Check_Parents1Inconnu, FailureHandling.OPTIONAL)}
        if (WebUI.verifyElementNotChecked(Check_Parents2Inconnu, 1, FailureHandling.OPTIONAL)) {
            WebUI.click(Check_Parents2Inconnu, FailureHandling.OPTIONAL)}
        break
    case '1':
        'Informations état civil du Parent 1'
        if (WebUI.verifyElementChecked(Check_Parents1Inconnu, 1, FailureHandling.OPTIONAL)) {
            WebUI.click(Check_Parents1Inconnu, FailureHandling.OPTIONAL)}
        if (WebUI.verifyElementNotChecked(Check_Parents2Inconnu, 1, FailureHandling.OPTIONAL)) {
            WebUI.click(Check_Parents2Inconnu, FailureHandling.OPTIONAL)}
        WebUI.setText(findTestObject('null'), 'TestNomParent', FailureHandling.OPTIONAL)
        WebUI.setText(findTestObject('null'), 'TestPrenom', FailureHandling.OPTIONAL)
        'Sexe'
        WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
        'Date de naissance'
        WebUI.setText(findTestObject('null'), '21', FailureHandling.OPTIONAL)
        WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
        WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
        WebUI.setText(findTestObject('null'), '1945', FailureHandling.OPTIONAL)
        'Pays de naissance'
        WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
        WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
        'Lieu de naissance'
        WebUI.setText(findTestObject('null'), 'Montréal', FailureHandling.OPTIONAL)
        'Nationalité'
        WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
        if (NationaliteParent1 == 'France') {
            WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
        } else {
            WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)}
        break
    case '2':
        'Informations état civil des Deux Parents 1 & 2'
        'Informations état civil du Parent 1'
        if (WebUI.verifyElementChecked(Check_Parents1Inconnu, 1, FailureHandling.OPTIONAL)) {
            WebUI.click(Check_Parents1Inconnu, FailureHandling.OPTIONAL)}
        if (WebUI.verifyElementNotChecked(Check_Parents2Inconnu, 1, FailureHandling.OPTIONAL)) {
            WebUI.click(Check_Parents2Inconnu, FailureHandling.OPTIONAL)}
        WebUI.click(findTestObject('null'))
        WebUI.clearText(findTestObject('null'))
        WebUI.setText(findTestObject('null'), 'TestNomParent', FailureHandling.OPTIONAL)
        WebUI.click(findTestObject('null'))
        WebUI.clearText(findTestObject('null'))
        WebUI.setText(findTestObject('null'), 'TestPrenom', FailureHandling.OPTIONAL)
        'Sexe'
        WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
        'Date de naissance'
        WebUI.setText(findTestObject('null'), '21', FailureHandling.OPTIONAL)
        WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
        WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
        WebUI.setText(findTestObject('null'), '1945', FailureHandling.OPTIONAL)
        'Pays de naissance'
        WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
        WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
        'Lieu de naissance'
        WebUI.setText(findTestObject('null'), 'Montréal', FailureHandling.OPTIONAL)
        'Nationalité'
        WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
        if (NationaliteParent1 == 'France') {
            WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
        } else {
            WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)}
       'Informations état civil du Parent 2'
        if (WebUI.verifyElementChecked(Check_Parents2Inconnu, 1, FailureHandling.OPTIONAL)) {
            WebUI.click(Check_Parents2Inconnu, FailureHandling.OPTIONAL)}
        
        if (WebUI.verifyElementChecked(Check_Parents1Inconnu, 1, FailureHandling.OPTIONAL)) {
            WebUI.click(Check_Parents1Inconnu, FailureHandling.OPTIONAL)}
        WebUI.clearText(findTestObject('null'))
        WebUI.setText(findTestObject('null'), 'TestNomParent', FailureHandling.OPTIONAL)
        WebUI.clearText(findTestObject('null'))
        WebUI.setText(findTestObject('null'), 'TestPrenom', FailureHandling.OPTIONAL)
        'Sexe'
        WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
        'Date de naissance'
        WebUI.setText(findTestObject('null'), '21', FailureHandling.OPTIONAL)
        WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
        WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
        WebUI.setText(findTestObject('null'), '1945', FailureHandling.OPTIONAL)
        'Pays de naissance'
        WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
        WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
        'Lieu de naissance'
        WebUI.setText(findTestObject('null'), 'Montréal', FailureHandling.OPTIONAL)
        'Nationalité'
        WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
        if (NationaliteParent2 == 'France') {
            WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
        } else {
            WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)}
    default:
        break
}

'Mes frères et Soeurs'
WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
println('NombreFreresEtSoeurs ==' + NombreFreresEtSoeurs)
def NombreFreresEtSoeurs = Integer.parseInt(NombreFreresEtSoeurs)
if (NombreFreresEtSoeurs > 0) {
    WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
    for (def i = 1; i <= NombreFreresEtSoeurs; i++) {
        TestObject objectName = new TestObject('objectName')
        def xpathNomFreresEtSoeurs = ListNomFreresEtSoeurs[(i - 1)]
        CustomKeywords.'tools.ExecuteActions.SetTextObject'(xpathNomFreresEtSoeurs, 'NomFreresEtSoeurs')
        def xpathPrenomFreresEtSoeurs = ListPrenomFreresEtSoeurs[(i - 1)]
        CustomKeywords.'tools.ExecuteActions.SetTextObject'(xpathPrenomFreresEtSoeurs, 'PrenomFreresEtSoeurs')
        def xpathSexeFreresEtSoeurs = ListSexeFreresEtSoeurs[(i - 1)]
        CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathSexeFreresEtSoeurs)
        def xpathDateNeFreresEtSoeursJJ = ListDateNeFreresEtSoeursJJ[(i - 1)]
        CustomKeywords.'tools.ExecuteActions.SetTextObject'(xpathDateNeFreresEtSoeursJJ, '14')
        def xpathDateNeFreresEtSoeursSelectMM = ListDateNeFreresEtSoeursSelectMM[(i - 1)]
        CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathDateNeFreresEtSoeursSelectMM)
        def xpathDateNeFreresEtSoeursValueMM = ListDateNeFreresEtSoeursValueMM[(i - 1)]
        CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathDateNeFreresEtSoeursValueMM)
        def xpathDateNeFreresEtSoeursAAAA = ListDateNeFreresEtSoeursAAAA[(i - 1)]
        CustomKeywords.'tools.ExecuteActions.SetTextObject'(xpathDateNeFreresEtSoeursAAAA, '2000')
        def xpathPaysNeFreresEtSoeursSelect = ListPaysNeFreresEtSoeursSelect[(i - 1)]
        CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathPaysNeFreresEtSoeursSelect)
        def xpathPaysNeFreresEtSoeursValue = ListPaysNeFreresEtSoeursValue[(i - 1)]
        CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathPaysNeFreresEtSoeursValue)
        def xpathVilleNeFreresEtSoeurs = ListVilleNeFreresEtSoeurs[(i - 1)]
        CustomKeywords.'tools.ExecuteActions.SetTextObject'(xpathVilleNeFreresEtSoeurs, 'TestVilleFreresEtSoeurs')
        def xpathNationaliteFreresEtSoeursSelect = ListNationaliteFreresEtSoeursSelect[(i - 1)]
        CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathNationaliteFreresEtSoeursSelect)
        def xpathNationaliteFreresEtSoeursValue = ListNationaliteFreresEtSoeursValue[(i - 1)]
        CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathNationaliteFreresEtSoeursValue)
        def xpathAdresseActuelleFreresEtSoeurs = ListAdresseActuelleFreresEtSoeurs[(i - 1)]
        CustomKeywords.'tools.ExecuteActions.SetTextObject'(xpathAdresseActuelleFreresEtSoeurs, 'TestAdresseActuelleFreresEtSoeurs')}
} else {
    WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)}

'Valider la Page '
WebUI.click(findTestObject('null'))
def AnfCheck = WebUI.verifyElementPresent(findTestObject("null"), GlobalVariable.WaitLoadCheckZone)
if(AnfCheck) {KeywordUtil.markPassed( "Etape Parents et Fraterie est Validée")}
else {KeywordUtil.markFailed( "Etape Parents et Fraterie NON Validée")}

'Ma situation actuelle'
WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)

if (SituationFamilialeActuelle == 'CELIBATAIRE') {
    'Informations état civil des Parents CELIBATAIRES'
    WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
    WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)}
if (SituationFamilialeActuelle == 'SEPARE') {
    'Informations état civil des Parents SEPARES'
    WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
    WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)}
if (SituationFamilialeActuelle == 'DIVORCE') {
    'Informations état civil des Parents DIVORCES'
    WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
    WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)}
if (SituationFamilialeActuelle == 'MARIE') {
    'Informations état civil des Parents MARIE'
    WebUI.click(findTestObject('null'), FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('null'), FailureHandling.STOP_ON_FAILURE)
    WebUI.setText(findTestObject('null'), '12', FailureHandling.OPTIONAL)
    WebUI.click(findTestObject('null'), FailureHandling.STOP_ON_FAILURE)
    WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
    WebUI.setText(findTestObject('null'), '2011', FailureHandling.OPTIONAL)
    WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
    WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
    WebUI.setText(findTestObject('null'), 'VilleMariage Test', FailureHandling.OPTIONAL)
    'Mon conjoint'
    WebUI.setText(findTestObject('null'), 'NomConjoint', FailureHandling.OPTIONAL)
    WebUI.setText(findTestObject('null'), 'PrenomConjoint', FailureHandling.OPTIONAL)
	WebUI.click(findTestObject('null'))
    WebUI.setText(findTestObject('null'), '23', FailureHandling.OPTIONAL)
    WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
    WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
    WebUI.setText(findTestObject('null'),'1987', FailureHandling.OPTIONAL)
    WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
    WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
    WebUI.setText(findTestObject('null'), 'VilleNaissanceConjointTest', FailureHandling.OPTIONAL)
    WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
    WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
    WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
    WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
    'Informations sur votre conjoint / concubin'
    WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
    WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
    WebUI.setText(findTestObject('null'), 'ProfessionConjoint', FailureHandling.OPTIONAL)
    'Informations sur son employeur'
    WebUI.setText(findTestObject('null'), 'NomEmployeurConjoint', FailureHandling.OPTIONAL)
    WebUI.setText(findTestObject('null'), 'AdresseEmployeurConjoint', FailureHandling.OPTIONAL)}
if (SituationFamilialeActuelle == 'VEUF') {
    'Informations état civil des Parents DIVORCES'
    WebUI.click(findTestObject('null'), FailureHandling.STOP_ON_FAILURE)
    WebUI.click(findTestObject('null'), FailureHandling.STOP_ON_FAILURE)
    WebUI.setText(findTestObject('null'), '12', FailureHandling.OPTIONAL)
    WebUI.click(findTestObject('null'), FailureHandling.STOP_ON_FAILURE)
    WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
    WebUI.setText(findTestObject('null'), '2011', FailureHandling.OPTIONAL)
    WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
    WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
    WebUI.setText(findTestObject('null'), 'VilleMariage Test', FailureHandling.OPTIONAL)
    'Mon conjoint'
    WebUI.setText(findTestObject('null'), 'NomConjoint', FailureHandling.OPTIONAL)
    WebUI.setText(findTestObject('null'), 'PrenomConjoint', FailureHandling.OPTIONAL)
    WebUI.click(findTestObject('null'))
    WebUI.setText(findTestObject('null'), '23', FailureHandling.OPTIONAL)
    WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
    WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
    WebUI.setText(findTestObject('null'), '2016', FailureHandling.OPTIONAL)
    WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
    WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
    WebUI.setText(findTestObject('null'), 'VilleNaissanceConjointTest', FailureHandling.OPTIONAL)
    WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
    WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
    'Date De Décès Conjoint'
    WebUI.setText(findTestObject('null'), '24', FailureHandling.OPTIONAL)
    WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
    WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
    WebUI.setText(findTestObject('null'), '2019', FailureHandling.OPTIONAL)
    'Informations sur votre conjoint / concubin'
    WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
    WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)
    WebUI.setText(findTestObject('null'), 'ProfessionConjoint', FailureHandling.OPTIONAL)
    'Informations sur son employeur'
    WebUI.setText(findTestObject('null'), 'NomEmployeurConjoint', FailureHandling.OPTIONAL)
    WebUI.setText(findTestObject('null'), 'AdresseEmployeurConjoint', FailureHandling.OPTIONAL)}