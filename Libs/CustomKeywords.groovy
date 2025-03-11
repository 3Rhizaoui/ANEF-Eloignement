
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.TestObject

import java.lang.String

import java.lang.Object

import org.apache.poi.ss.usermodel.Sheet

import java.util.List

import org.apache.poi.ss.usermodel.Workbook

import org.apache.poi.ss.usermodel.Row

import org.apache.poi.ss.usermodel.Cell

import java.util.Map

import org.openqa.selenium.WebElement



def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectOptionByName"(
    	TestObject dropdownObject	
     , 	String listItemNames	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectOptionByName(
        	dropdownObject
         , 	listItemNames)
}


def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectOptionByName"(
    	TestObject dropdownObject	
     , 	String listItemNames	
     , 	boolean isSelect	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectOptionByName(
        	dropdownObject
         , 	listItemNames
         , 	isSelect)
}


def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectAllOption"(
    	TestObject dropdownObject	
     , 	boolean isSelect	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectAllOption(
        	dropdownObject
         , 	isSelect)
}


def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectAllOption"(
    	TestObject dropdownObject	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectAllOption(
        	dropdownObject)
}


def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.verifyOptionSelectedByName"(
    	TestObject dropdownObject	
     , 	String expectedName	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).verifyOptionSelectedByName(
        	dropdownObject
         , 	expectedName)
}


def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectSubOptionByIndex"(
    	TestObject dropdownObject	
     , 	String optionGroupName	
     , 	Object range	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectSubOptionByIndex(
        	dropdownObject
         , 	optionGroupName
         , 	range)
}


def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectSubOptionByIndex"(
    	TestObject dropdownObject	
     , 	String optionGroupName	
     , 	Object range	
     , 	boolean isSelect	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectSubOptionByIndex(
        	dropdownObject
         , 	optionGroupName
         , 	range
         , 	isSelect)
}


def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectSubOptionByName"(
    	TestObject dropdownObject	
     , 	String optionGroupName	
     , 	String listItemNames	
     , 	boolean isSelect	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectSubOptionByName(
        	dropdownObject
         , 	optionGroupName
         , 	listItemNames
         , 	isSelect)
}


def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectSubOptionByName"(
    	TestObject dropdownObject	
     , 	String optionGroupName	
     , 	String listItemNames	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectSubOptionByName(
        	dropdownObject
         , 	optionGroupName
         , 	listItemNames)
}


def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.verifyOptionItemsStatus"(
    	TestObject dropdownObject	
     , 	String listItemNames	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).verifyOptionItemsStatus(
        	dropdownObject
         , 	listItemNames)
}


def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.verifyOptionItemsStatus"(
    	TestObject dropdownObject	
     , 	String listItemNames	
     , 	boolean expectedStatus	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).verifyOptionItemsStatus(
        	dropdownObject
         , 	listItemNames
         , 	expectedStatus)
}


def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectOptionByIndex"(
    	TestObject dropdownObject	
     , 	Object range	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectOptionByIndex(
        	dropdownObject
         , 	range)
}


def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectOptionByIndex"(
    	TestObject dropdownObject	
     , 	Object range	
     , 	boolean isSelect	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectOptionByIndex(
        	dropdownObject
         , 	range
         , 	isSelect)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getColumnsByIndex"(
    	Sheet sheet	
     , 	java.util.List<java.lang.Integer> columnIndexes	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getColumnsByIndex(
        	sheet
         , 	columnIndexes)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getTableContent"(
    	Sheet sheet	
     , 	int startRow	
     , 	int endRow	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getTableContent(
        	sheet
         , 	startRow
         , 	endRow)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getDataRows"(
    	Sheet sheet	
     , 	java.util.List<java.lang.Integer> rowIndexs	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getDataRows(
        	sheet
         , 	rowIndexs)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoExcels"(
    	Workbook workbook1	
     , 	Workbook workbook2	
     , 	boolean isValueOnly	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoExcels(
        	workbook1
         , 	workbook2
         , 	isValueOnly)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoExcels"(
    	Workbook workbook1	
     , 	Workbook workbook2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoExcels(
        	workbook1
         , 	workbook2)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoSheets"(
    	Sheet sheet1	
     , 	Sheet sheet2	
     , 	boolean isValueOnly	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoSheets(
        	sheet1
         , 	sheet2
         , 	isValueOnly)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoSheets"(
    	Sheet sheet1	
     , 	Sheet sheet2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoSheets(
        	sheet1
         , 	sheet2)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoRows"(
    	Row row1	
     , 	Row row2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoRows(
        	row1
         , 	row2)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoRows"(
    	Row row1	
     , 	Row row2	
     , 	boolean isValueOnly	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoRows(
        	row1
         , 	row2
         , 	isValueOnly)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.createExcelSheet"(
    	Workbook workbook	
     , 	String sheetName	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createExcelSheet(
        	workbook
         , 	sheetName)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.createExcelSheet"(
    	Workbook workbook	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createExcelSheet(
        	workbook)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getSheetNames"(
    	Workbook workbook	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getSheetNames(
        	workbook)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.createExcelFile"(
    	String filePath	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createExcelFile(
        	filePath)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.createWorkbook"(
    	String filePath	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createWorkbook(
        	filePath)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.createExcelSheets"(
    	Workbook workbook	
     , 	java.util.List<String> sheetNames	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createExcelSheets(
        	workbook
         , 	sheetNames)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.saveWorkbook"(
    	String filePath	
     , 	Workbook workbook	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).saveWorkbook(
        	filePath
         , 	workbook)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getWorkbook"(
    	String filePath	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getWorkbook(
        	filePath)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.locateCell"(
    	Sheet sheet	
     , 	Object cellContent	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).locateCell(
        	sheet
         , 	cellContent)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellByIndex"(
    	Sheet sheet	
     , 	int rowIdx	
     , 	int colIdx	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellByIndex(
        	sheet
         , 	rowIdx
         , 	colIdx)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet"(
    	String filePath	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheet(
        	filePath)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet"(
    	String filePath	
     , 	int sheetIndex	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheet(
        	filePath
         , 	sheetIndex)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet"(
    	Workbook wbs	
     , 	String sheetName	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheet(
        	wbs
         , 	sheetName)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet"(
    	Workbook wbs	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheet(
        	wbs)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellByAddress"(
    	Sheet sheet	
     , 	String cellAddress	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellByAddress(
        	sheet
         , 	cellAddress)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValue"(
    	Cell cell	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValue(
        	cell)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellIndexByAddress"(
    	Sheet sheet	
     , 	String cellAddress	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellIndexByAddress(
        	sheet
         , 	cellAddress)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValueByAddress"(
    	Sheet sheet	
     , 	String cellAddress	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValueByAddress(
        	sheet
         , 	cellAddress)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getRowIndexByCellContent"(
    	Sheet sheet	
     , 	String cellContent	
     , 	int columnIdxForCell	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getRowIndexByCellContent(
        	sheet
         , 	cellContent
         , 	columnIdxForCell)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getMapOfKeyValueRows"(
    	Sheet sheet	
     , 	int keyRowIdx	
     , 	int valueRowIdx	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getMapOfKeyValueRows(
        	sheet
         , 	keyRowIdx
         , 	valueRowIdx)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValueByRangeAddress"(
    	Sheet sheet	
     , 	String topLeftAddress	
     , 	String rightBottomAddress	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValueByRangeAddress(
        	sheet
         , 	topLeftAddress
         , 	rightBottomAddress)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValuesByRangeIndexes"(
    	Sheet sheet	
     , 	int rowInd1	
     , 	int colInd1	
     , 	int rowInd2	
     , 	int colInd2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValuesByRangeIndexes(
        	sheet
         , 	rowInd1
         , 	colInd1
         , 	rowInd2
         , 	colInd2)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.setValueToCellByAddresses"(
    	Sheet sheet	
     , 	Map content	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).setValueToCellByAddresses(
        	sheet
         , 	content)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheetByName"(
    	String filePath	
     , 	String sheetName	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheetByName(
        	filePath
         , 	sheetName)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.setValueToCellByAddress"(
    	Sheet sheet	
     , 	String cellAddress	
     , 	Object value	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).setValueToCellByAddress(
        	sheet
         , 	cellAddress
         , 	value)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValueByIndex"(
    	Sheet sheet	
     , 	int rowIdx	
     , 	int colIdx	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValueByIndex(
        	sheet
         , 	rowIdx
         , 	colIdx)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoCells"(
    	Cell cell1	
     , 	Cell cell2	
     , 	boolean isValueOnly	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoCells(
        	cell1
         , 	cell2
         , 	isValueOnly)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoCells"(
    	Cell cell1	
     , 	Cell cell2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoCells(
        	cell1
         , 	cell2)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.setValueToCellByIndex"(
    	Sheet sheet	
     , 	int rowIndex	
     , 	int colIndex	
     , 	Object value	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).setValueToCellByIndex(
        	sheet
         , 	rowIndex
         , 	colIndex
         , 	value)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getAttribute"(
    	WebElement element	
     , 	String attribute	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getAttribute(
        	element
         , 	attribute)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.selectDropdown"(
    	WebElement parentElement	
     , 	String label	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).selectDropdown(
        	parentElement
         , 	label)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.selectDropdown"(
    	String label	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).selectDropdown(
        	label)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.setExplicitWait"(
    	int seconds	
     , 	int pollingTime	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).setExplicitWait(
        	seconds
         , 	pollingTime)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getShadowElement"(
    	WebElement parent	
     , 	String selector	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getShadowElement(
        	parent
         , 	selector)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.setImplicitWait"(
    	int seconds	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).setImplicitWait(
        	seconds)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.selectCheckbox"(
    	WebElement parentElement	
     , 	String label	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).selectCheckbox(
        	parentElement
         , 	label)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.selectCheckbox"(
    	String label	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).selectCheckbox(
        	label)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getSiblingElements"(
    	WebElement element	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getSiblingElements(
        	element)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getSiblingElement"(
    	WebElement element	
     , 	String selector	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getSiblingElement(
        	element
         , 	selector)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getChildElements"(
    	WebElement parent	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getChildElements(
        	parent)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.isDisabled"(
    	WebElement element	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).isDisabled(
        	element)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.selectRadio"(
    	String label	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).selectRadio(
        	label)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.selectRadio"(
    	WebElement parentElement	
     , 	String label	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).selectRadio(
        	parentElement
         , 	label)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.findElement"(
    	String cssSelector	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).findElement(
        	cssSelector)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getParentElement"(
    	WebElement element	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getParentElement(
        	element)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.findElementInsideParent"(
    	WebElement parent	
     , 	String cssSelector	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).findElementInsideParent(
        	parent
         , 	cssSelector)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getPreviousSiblingElement"(
    	WebElement element	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getPreviousSiblingElement(
        	element)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getAllShadowElement"(
    	WebElement parent	
     , 	String selector	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getAllShadowElement(
        	parent
         , 	selector)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getNextSiblingElement"(
    	WebElement element	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getNextSiblingElement(
        	element)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.findElementsInsideParent"(
    	WebElement parent	
     , 	String cssSelector	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).findElementsInsideParent(
        	parent
         , 	cssSelector)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.findElements"(
    	String cssSelector	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).findElements(
        	cssSelector)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.isVisible"(
    	WebElement element	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).isVisible(
        	element)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.isChecked"(
    	WebElement element	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).isChecked(
        	element)
}


def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.scrollTo"(
    	WebElement element	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).scrollTo(
        	element)
}


def static "com.kms.katalon.webui.keyword.vuejs.RichTextEditorKeywords.setCaretPosition"(
    	TestObject toContainer	
     , 	int position	) {
    (new com.kms.katalon.webui.keyword.vuejs.RichTextEditorKeywords()).setCaretPosition(
        	toContainer
         , 	position)
}


def static "com.kms.katalon.webui.keyword.vuejs.RichTextEditorKeywords.deleteRangeOfText"(
    	TestObject toContainer	
     , 	int startPos	
     , 	int charCount	) {
    (new com.kms.katalon.webui.keyword.vuejs.RichTextEditorKeywords()).deleteRangeOfText(
        	toContainer
         , 	startPos
         , 	charCount)
}


def static "com.kms.katalon.webui.keyword.vuejs.RichTextEditorKeywords.selectTextFormat"(
    	TestObject toMenuBar	
     , 	String format	
     , 	boolean isActive	) {
    (new com.kms.katalon.webui.keyword.vuejs.RichTextEditorKeywords()).selectTextFormat(
        	toMenuBar
         , 	format
         , 	isActive)
}


def static "com.kms.katalon.webui.keyword.vuejs.RichTextEditorKeywords.getContentText"(
    	TestObject toContainer	) {
    (new com.kms.katalon.webui.keyword.vuejs.RichTextEditorKeywords()).getContentText(
        	toContainer)
}


def static "com.kms.katalon.webui.keyword.vuejs.RichTextEditorKeywords.selectRangeOfText"(
    	TestObject toContainer	
     , 	int startPos	
     , 	int charCount	) {
    (new com.kms.katalon.webui.keyword.vuejs.RichTextEditorKeywords()).selectRangeOfText(
        	toContainer
         , 	startPos
         , 	charCount)
}


def static "com.testwithhari.katalon.plugins.Gmail.sendEmail"(
    	String from_emailaddress	
     , 	String email_password	
     , 	String to_emailaddress	
     , 	String email_subject	
     , 	String email_body	) {
    (new com.testwithhari.katalon.plugins.Gmail()).sendEmail(
        	from_emailaddress
         , 	email_password
         , 	to_emailaddress
         , 	email_subject
         , 	email_body)
}


def static "com.testwithhari.katalon.plugins.Gmail.deleteAllEMails"(
    	String emailID	
     , 	String password	
     , 	String folderLableName	) {
    (new com.testwithhari.katalon.plugins.Gmail()).deleteAllEMails(
        	emailID
         , 	password
         , 	folderLableName)
}


def static "com.testwithhari.katalon.plugins.Gmail.getEmailsCount"(
    	String emailID	
     , 	String password	
     , 	String folderLableName	) {
    (new com.testwithhari.katalon.plugins.Gmail()).getEmailsCount(
        	emailID
         , 	password
         , 	folderLableName)
}


def static "com.testwithhari.katalon.plugins.Gmail.readLatestEMailBodyContent"(
    	String emailID	
     , 	String password	
     , 	String folderLableName	) {
    (new com.testwithhari.katalon.plugins.Gmail()).readLatestEMailBodyContent(
        	emailID
         , 	password
         , 	folderLableName)
}
