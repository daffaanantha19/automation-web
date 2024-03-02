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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.matahari.com/')

WebUI.click(findTestObject('Object Repository/automation-web/Page_Belanja Online Fashion Lifestyle Gampa_b07c33/span_Search_svg-mthr-users-profile'))

WebUI.setText(findTestObject('Object Repository/automation-web/Page_Customer Login  matahari.com/input_Nomor Handphoneemail_loginusername'), 
    'username')

WebUI.setEncryptedText(findTestObject('Object Repository/automation-web/Page_Customer Login  matahari.com/input_Password (minimal 8 karakter)_loginpassword'), 
    'JUonJ7I/XhnIqJiwNdC4ag==')

WebUI.click(findTestObject('Object Repository/automation-web/Page_Customer Login  matahari.com/button_Masuk'))

WebUI.click(findTestObject('Object Repository/automation-web/Page_Belanja Online Fashion Lifestyle Gampa_b07c33/div_FLAT SHOES WANITA'))

WebUI.click(findTestObject('Object Repository/automation-web/Page_Jual Sepatu Flat Terbaru Untuk Kamu  m_5372e8/img_BELI_product-image-photo lazyloaded'))

WebUI.click(findTestObject('Object Repository/automation-web/Page_St. Yves Ballerinas Ribbon Women  mata_bd4a1d/div_BLACK_option-label-color-277-item-17259'))

WebUI.click(findTestObject('Object Repository/automation-web/Page_St. Yves Ballerinas Ribbon Women  mata_bd4a1d/div_37'))

WebUI.click(findTestObject('Object Repository/automation-web/Page_St. Yves Ballerinas Ribbon Women  mata_bd4a1d/div_BLACK_option-label-color-277-item-17259'))

WebUI.click(findTestObject('Object Repository/automation-web/Page_St. Yves Ballerinas Ribbon Women  mata_bd4a1d/span_Tambah ke keranjang'))

WebUI.click(findTestObject('Object Repository/automation-web/Page_St. Yves Ballerinas Ribbon Women  mata_bd4a1d/div_Tambah ke keranjang'))

WebUI.click(findTestObject('Object Repository/automation-web/Page_St. Yves Ballerinas Ribbon Women  mata_bd4a1d/a_Lihat Keranjang'))

WebUI.click(findTestObject('Object Repository/automation-web/Page_Keranjang  matahari.com/a_Hapus item'))

WebUI.click(findTestObject('Object Repository/automation-web/Page_Keranjang  matahari.com/span_Hapus'))

WebUI.closeBrowser()

