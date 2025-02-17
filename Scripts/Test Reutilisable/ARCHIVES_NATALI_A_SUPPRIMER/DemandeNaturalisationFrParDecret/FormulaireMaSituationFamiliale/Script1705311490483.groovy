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
import com.kms.katalon.core.testobject.ConditionType
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.util.KeywordUtil

'Mes Unions Antérieures'
WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
WebUI.delay(2)
WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
WebUI.delay(2)

'Mes Enfants'
WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
WebUI.delay(2)
WebUI.click(findTestObject("null"), FailureHandling.OPTIONAL)
WebUI.delay(2)
println 'NombreEnfants ==' + NombreEnfants
def NbrEnfants = Integer.parseInt(NombreEnfants)

if (NbrEnfants > 0) {
	for (def i = 1; i <= NbrEnfants; i++) {

		TestObject objectName = new TestObject('objectName')
		def xpathNamEnfant = ListNomEnfant[(i-1)]
		CustomKeywords.'tools.ExecuteActions.SetTextObject'(xpathNamEnfant,'NameEnfant')
		def xpathPrenomEnfant = ListPrenomEnfant[(i-1)]
		CustomKeywords.'tools.ExecuteActions.SetTextObject'(xpathPrenomEnfant,'PrenomEnfant')
		def xpathSexEnfant = ListSexEnfant[(i-1)]
		CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathSexEnfant)
		def xpathDateDeNaissanceJJ = ListDateDeNaissanceJJ[(i-1)]
		CustomKeywords.'tools.ExecuteActions.SetTextObject'(xpathDateDeNaissanceJJ,'17')
		def xpathDateDeNaissanceSelectMM = ListDateDeNaissanceSelectMM[(i-1)]
		CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathDateDeNaissanceSelectMM)
		def xpathDateDeNaissanceValueMM = ListDateDeNaissanceValueMM[(i-1)]
		CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathDateDeNaissanceValueMM)
		def DateDeNaissance = 'DateDeNaissanceEnfant'+ i 
		def xpathDateDeNaissanceAAAA = ListDateDeNaissanceAAAA[(i-1)]
		objectName.addProperty('xpath', ConditionType.EQUALS, xpathDateDeNaissanceAAAA)
		if (DateDeNaissance == 'DateDeNaissanceEnfant1') {	
			DateDeNaissanceEnfant1 = DateDeNaissanceEnfant1
			CustomKeywords.'tools.ExecuteActions.SetTextObject'(xpathDateDeNaissanceAAAA,DateDeNaissanceEnfant1)}
		if (DateDeNaissance == 'DateDeNaissanceEnfant2') {	
			CustomKeywords.'tools.ExecuteActions.SetTextObject'(xpathDateDeNaissanceAAAA,DateDeNaissanceEnfant2)}
		if (DateDeNaissance == 'DateDeNaissanceEnfant3') {	
			DateDeNaissanceEnfant3 = DateDeNaissanceEnfant3
			CustomKeywords.'tools.ExecuteActions.SetTextObject'(xpathDateDeNaissanceAAAA,DateDeNaissanceEnfant3)}
		if (DateDeNaissance == 'DateDeNaissanceEnfant4') {	
			DateDeNaissanceEnfant4 = DateDeNaissanceEnfant4
			CustomKeywords.'tools.ExecuteActions.SetTextObject'(xpathDateDeNaissanceAAAA,DateDeNaissanceEnfant4)}
		
		def xpathPaysDeNaissanceSelect = ListPaysDeNaissanceSelect[(i-1)]
		CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathPaysDeNaissanceSelect)
		def PaysDeNaissance = "PaysDeNaissance" + i
		if (PaysDeNaissance == 'PaysDeNaissance1') {
			if (PaysDeNaissance1 == 'France') {
				def xpathPaysDeNaissanceFrance = ListPaysDeNaissanceFrance[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathPaysDeNaissanceFrance)
				def xpathFrCodepostal = ListFrCodepostal[(i-1)]
				CustomKeywords.'tools.ExecuteActions.SetTextObject'(xpathFrCodepostal,'75000')
				def xpathLieuDeNaissance = ListLieuDeNaissance[(i-1)]
				CustomKeywords.'tools.ExecuteActions.SetTextObject'(xpathLieuDeNaissance,'75000')}
			else {
				def xpathPaysDeNaissanceEtranger = ListPaysDeNaissanceEtranger[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathPaysDeNaissanceEtranger)
				def xpathLieuDeNaissance = ListLieuDeNaissance[(i-1)]
				CustomKeywords.'tools.ExecuteActions.SetTextObject'(xpathLieuDeNaissance,'LieuTest')}
		}	
		if (PaysDeNaissance == 'PaysDeNaissance2') {
			if (PaysDeNaissance2 == 'France') {
				def xpathPaysDeNaissanceFrance = ListPaysDeNaissanceFrance[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathPaysDeNaissanceFrance)
				def xpathFrCodepostal = ListFrCodepostal[(i-1)]
				CustomKeywords.'tools.ExecuteActions.SetTextObject'(xpathFrCodepostal,'75000')
				def xpathLieuDeNaissance = ListLieuDeNaissance[(i-1)]
				CustomKeywords.'tools.ExecuteActions.SetTextObject'(xpathLieuDeNaissance,'LieuTest')}
			else {
				def xpathPaysDeNaissanceEtranger = ListPaysDeNaissanceEtranger[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathPaysDeNaissanceEtranger)
				def xpathLieuDeNaissance = ListLieuDeNaissance[(i-1)]
				CustomKeywords.'tools.ExecuteActions.SetTextObject'(xpathLieuDeNaissance,'LieuTest')}
		}
		if (PaysDeNaissance == 'PaysDeNaissance3') {
			if (PaysDeNaissance == 'France') {
				def xpathPaysDeNaissanceFrance = ListPaysDeNaissanceFrance[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathPaysDeNaissanceFrance)
				def xpathFrCodepostal = ListFrCodepostal[(i-1)]
				CustomKeywords.'tools.ExecuteActions.SetTextObject'(xpathFrCodepostal,'75000')
				def xpathLieuDeNaissance = ListLieuDeNaissance[(i-1)]
				CustomKeywords.'tools.ExecuteActions.SetTextObject'(xpathLieuDeNaissance,'LieuTest')}
			else {
				def xpathPaysDeNaissanceEtranger = ListPaysDeNaissanceEtranger[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathPaysDeNaissanceEtranger)
				def xpathLieuDeNaissance = ListLieuDeNaissance[(i-1)]
				CustomKeywords.'tools.ExecuteActions.SetTextObject'(xpathLieuDeNaissance,'LieuTest')}
		}
		if (PaysDeNaissance == 'PaysDeNaissance4') {
			if (PaysDeNaissance == 'France') {
				def xpathPaysDeNaissanceFrance = ListPaysDeNaissanceFrance[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathPaysDeNaissanceFrance)
				def xpathFrCodepostal = ListFrCodepostal[(i-1)]
				CustomKeywords.'tools.ExecuteActions.SetTextObject'(xpathFrCodepostal,'75000')
				def xpathLieuDeNaissance = ListLieuDeNaissance[(i-1)]
				CustomKeywords.'tools.ExecuteActions.SetTextObject'(xpathLieuDeNaissance,'LieuTest')}
			else {
				def xpathPaysDeNaissanceEtranger = ListPaysDeNaissanceEtranger[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathPaysDeNaissanceEtranger)
				def xpathLieuDeNaissance = ListLieuDeNaissance[(i-1)]
				CustomKeywords.'tools.ExecuteActions.SetTextObject'(xpathLieuDeNaissance,'LieuTest')}
		}
		
		def NationaliteEnfantSelect = "NationaliteEnfant" + i
		if (NationaliteEnfantSelect == 'NationaliteEnfant1') {
			if ((NationaliteEnfant1 == 'France') && (PaysDeNaissance1 == 'France')){
				def xpathNationaliteNeFranceSelect = ListNationaliteNeFranceSelect[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathNationaliteNeFranceSelect)
				def xpathNationaliteNeFranceValue = ListNationaliteNeFranceValue[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathNationaliteNeFranceValue)}
			if ((NationaliteEnfant1 == 'France')  && (PaysDeNaissance1 == 'Non')){
				def xpathEtrangerNationaliteNeFrSelect = ListEtrangerNationaliteNeFrSelect[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathEtrangerNationaliteNeFrSelect)
				def xpathEtrangerNationaliteNeFrValue = ListEtrangerNationaliteNeFrValue[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathEtrangerNationaliteNeFrValue)}
			if ((NationaliteEnfant1 == 'Non')  && (PaysDeNaissance1 == 'Non')){	
				def xpathNationaliteSelect = ListNationaliteSelect[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathNationaliteSelect)
				def xpathNationaliteValue = ListNationaliteValue[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathNationaliteValue)}
			if ((NationaliteEnfant1 == 'Non') && (PaysDeNaissance1 == 'France')){
				def xpathNationaliteNeFranceSelect = ListNationaliteNeFranceSelect[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathNationaliteNeFranceSelect)
				def xpathEtrangerNationaliteNeFranceValue = ListEtrangerNationaliteNeFranceValue[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathEtrangerNationaliteNeFranceValue)}
		}
		if (NationaliteEnfantSelect == 'NationaliteEnfant2') {
			if ((NationaliteEnfant2 == 'France') && (PaysDeNaissance2 == 'France')) {
				def xpathNationaliteNeFranceSelect = ListNationaliteNeFranceSelect[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathNationaliteNeFranceSelect)
				def xpathNationaliteNeFranceValue = ListNationaliteNeFranceValue[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathNationaliteNeFranceValue)}
			if ((NationaliteEnfant2 == 'France')  && (PaysDeNaissance2 == 'Non')){
				def xpathEtrangerNationaliteNeFrSelect = ListEtrangerNationaliteNeFrSelect[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathEtrangerNationaliteNeFrSelect)
				def xpathEtrangerNationaliteNeFrValue = ListEtrangerNationaliteNeFrValue[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathEtrangerNationaliteNeFrValue)}
			if ((NationaliteEnfant2 == 'Non')  && (PaysDeNaissance2 == 'Non')){	
				def xpathNationaliteSelect = ListNationaliteSelect[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathNationaliteSelect)
				def xpathNationaliteValue = ListNationaliteValue[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathNationaliteValue)}
			if ((NationaliteEnfant2 == 'Non') && (PaysDeNaissance2 == 'France')){
				def xpathNationaliteNeFranceSelect = ListNationaliteNeFranceSelect[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathNationaliteNeFranceSelect)
				def xpathEtrangerNationaliteNeFranceValue = ListEtrangerNationaliteNeFranceValue[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathEtrangerNationaliteNeFranceValue)}
		}
		if (NationaliteEnfantSelect == 'NationaliteEnfant3') {
			if ((NationaliteEnfant3 == 'France')  && (PaysDeNaissance3 == 'France')){
				def xpathNationaliteNeFranceSelect = ListNationaliteNeFranceSelect[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathNationaliteNeFranceSelect)
				def xpathNationaliteNeFranceValue = ListNationaliteNeFranceValue[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathNationaliteNeFranceValue)}
			if ((NationaliteEnfant3 == 'France')  && (PaysDeNaissance3 == 'Non')){
				def xpathEtrangerNationaliteNeFrSelect = ListEtrangerNationaliteNeFrSelect[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathEtrangerNationaliteNeFrSelect)
				def xpathEtrangerNationaliteNeFrValue = ListEtrangerNationaliteNeFrValue[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathEtrangerNationaliteNeFrValue)}
			if ((NationaliteEnfant3 == 'Non')  && (PaysDeNaissance3 == 'Non')){
				def xpathNationaliteSelect = ListNationaliteSelect[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathNationaliteSelect)
				def xpathNationaliteValue = ListNationaliteValue[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathNationaliteValue)}
			if ((NationaliteEnfant3 == 'Non') && (PaysDeNaissance3 == 'France')){
				def xpathNationaliteNeFranceSelect = ListNationaliteNeFranceSelect[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathNationaliteNeFranceSelect)
				def xpathEtrangerNationaliteNeFranceValue = ListEtrangerNationaliteNeFranceValue[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathEtrangerNationaliteNeFranceValue)}
		}

		if (NationaliteEnfantSelect == 'NationaliteEnfant4') {
			if ((NationaliteEnfant4 == 'France')  && (PaysDeNaissance4 == 'France')){
				def xpathNationaliteNeFranceSelect = ListNationaliteNeFranceSelect[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathNationaliteNeFranceSelect)
				def xpathNationaliteNeFranceValue = ListNationaliteNeFranceValue[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathNationaliteNeFranceValue)}
			if ((NationaliteEnfant4 == 'France')  &&  (PaysDeNaissance4 == 'Non')){
				def xpathEtrangerNationaliteNeFrSelect = ListEtrangerNationaliteNeFrSelect[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathEtrangerNationaliteNeFrSelect)
				def xpathEtrangerNationaliteNeFrValue = ListEtrangerNationaliteNeFrValue[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathEtrangerNationaliteNeFrValue)}
			if ((NationaliteEnfant4 == 'Non')  && (PaysDeNaissance4 == 'Non')){
				def xpathNationaliteSelect = ListNationaliteSelect[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathNationaliteSelect)
				def xpathNationaliteValue = ListNationaliteValue[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathNationaliteValue)}
			if ((NationaliteEnfant1 == 'Non') && (PaysDeNaissance4 == 'France')){
				def xpathNationaliteNeFranceSelect = ListNationaliteNeFranceSelect[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathNationaliteNeFranceSelect)
				def xpathEtrangerNationaliteNeFranceValue = ListEtrangerNationaliteNeFranceValue[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathEtrangerNationaliteNeFranceValue)}
		}
		def AdresseEnfant = "AdresseEnfant" + i
			if (AdresseEnfant=="AdresseEnfant1") {
				def xpathAdresseEnfantAvecMoi = ListAdresseEnfantAvecMoi[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathAdresseEnfantAvecMoi)}
			if (AdresseEnfant=="AdresseEnfant2") {
				def xpathAdresseEnfantAlternee = ListAdresseEnfantAlternee[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathAdresseEnfantAlternee)
				def xpathImput_AdresseDeEnfant = List_Imput_AdresseDeEnfant[(i-1)]
				CustomKeywords.'tools.ExecuteActions.SetTextObject'(xpathImput_AdresseDeEnfant, '6 RUE NATHALIE LEMEL 44000 NANTES')}
			if (AdresseEnfant=="AdresseEnfant3") {
				def xpathAdresseEnfantAutreAdresse = ListAdresseEnfantAutreAdresse[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathAdresseEnfantAutreAdresse)
				def xpathImput_AdresseDeEnfant = List_Imput_AdresseDeEnfant[(i-1)]
				CustomKeywords.'tools.ExecuteActions.SetTextObject'(xpathImput_AdresseDeEnfant, '6 RUE NATHALIE LEMEL 44000 NANTES')}
			if (AdresseEnfant=="AdresseEnfant4") {
				def xpathAdresseEnfantEtranger = ListAdresseEnfantEtranger[(i-1)]
				CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathAdresseEnfantEtranger)}
		def xpathAcquisitionDeNationaliteFrancaiseEnCours = ListAcquisitionDeNationaliteFrancaiseEnCours[(i-1)]
		CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathAcquisitionDeNationaliteFrancaiseEnCours)
		def xpathEnfantAdopte = ListEnfantAdopte[(i-1)]
		CustomKeywords.'tools.ExecuteActions.ClickObject'(xpathEnfantAdopte)
		if (i < NbrEnfants) {
			WebUI.scrollToElement(objectName,3)
			WebUI.doubleClick(findTestObject("null"), FailureHandling.OPTIONAL)
			WebUI.delay(5)}
		}
}

'Valider la Page '
WebUI.click(findTestObject("null"))
def AnfCheck = WebUI.verifyElementPresent(findTestObject("null"), GlobalVariable.WaitLoadCheckZone)
if(AnfCheck) {
	KeywordUtil.markPassed( "Etape Votre Situation Actuelle est Validée")}
else {
	KeywordUtil.markFailed( "Etape Votre Situation Actuelle NON Validée")}