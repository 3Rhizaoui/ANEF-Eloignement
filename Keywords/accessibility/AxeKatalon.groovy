package accessibility

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.util.KeywordUtil
import java.text.SimpleDateFormat
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.driver.DriverFactory
import com.deque.html.axecore.selenium.AxeBuilder;
import com.deque.html.axecore.selenium.AxeReporter;
import com.deque.html.axecore.selenium.ResultType;
import com.deque.html.axecore.results.Results;
import com.deque.html.axecore.results.Rule;
import static com.deque.html.axecore.selenium.AxeReporter.getReadableAxeResults;
import internal.GlobalVariable



public class AxeKatalon {

	@Keyword
	def checkAccessibility() {
		Results results = new AxeBuilder().analyze(DriverFactory.getWebDriver())
		List<Rule> violations = results.getViolations()
		if(violations.size() == 0){
			KeywordUtil.logInfo("No Violation Found")
		}
		String AxeReportPath = RunConfiguration.getReportFolder()+ File.separator
		String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new java.util.Date())
		String AxeViolationReportPath=AxeReportPath + "AccessibilityViolations_" + timeStamp
		AxeReporter.writeResultsToJsonFile(AxeViolationReportPath,results)
		KeywordUtil.logInfo("Violation Report Path"+ AxeViolationReportPath)

		if(getReadableAxeResults(ResultType.Violations.getKey(),DriverFactory.getWebDriver(),violations) ){
			AxeReporter.writeResultsToTextFile(AxeViolationReportPath, AxeReporter.getAxeResultString())
		}
	}
}
