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

WebUI.navigateToUrl('https://fr.wowhead.com/')

WebUI.click(findTestObject('Object Repository/Page_Wowhead  Vous allez revenir/button_Jaccepte'))

WebUI.click(findTestObject('Object Repository/Page_Wowhead  Vous allez revenir/button_Refuser'))

WebUI.verifyElementPresent(findTestObject('Page_Wowhead  Cest comme prtendre tre malad_723237/a_Diablo II_header-logo'), 
    5)

WebUI.setText(findTestObject('Object Repository/Page_lardeur - Recherche Wowhead/input_Diablo II_q'), 'lardeur')

WebUI.click(findTestObject('Object Repository/Page_lardeur - Recherche Wowhead/span_Lardeur'))

WebUI.verifyElementPresent(findTestObject('Page_Lardeur - PNJ - World of Warcraft/div_Ce PNJ se trouve dans La Prison'), 
    5)

WebUI.mouseOver(findTestObject('Page_Chahuteurs de cadavre - Objet - World _4f6cc4/Page_Lardeur - PNJ - World of Warcraft/a_La Prison'))

WebUI.verifyElementPresent(findTestObject('Page_Lardeur - PNJ - World of Warcraft/Lardeur/Pop-up prison'), 5)

WebUI.waitForElementClickable(findTestObject('Page_Lardeur - PNJ - World of Warcraft/a_Chahuteurs de cadavre'), 10)

WebUI.click(findTestObject('Object Repository/Page_Lardeur - PNJ - World of Warcraft/a_Chahuteurs de cadavre'))

WebUI.verifyElementText(findTestObject('Page_Chahuteurs de cadavre - Objet - World _4f6cc4/Page_Chahuteurs de cadavre - Objet - World of Warcraft/Title_Chahuteurs de cadavre'), 
    'Chahuteurs de cadavre')

WebUI.verifyElementText(findTestObject('Page_Chahuteurs de cadavre - Objet - World _4f6cc4/Page_Chahuteurs de cadavre - Objet - World of Warcraft/span_Niveau dobjet 57'), 
    'Niveau d\'objet 57')

WebUI.verifyElementText(findTestObject('Page_Chahuteurs de cadavre - Objet - World _4f6cc4/Page_Chahuteurs de cadavre - Objet - World of Warcraft/td_Pieds'), 
    'Pieds')

WebUI.verifyElementText(findTestObject('Page_Chahuteurs de cadavre - Objet - World _4f6cc4/Page_Chahuteurs de cadavre - Objet - World of Warcraft/span_Tissu'), 
    'Tissu')

WebUI.verifyElementText(findTestObject('Page_Chahuteurs de cadavre - Objet - World _4f6cc4/Page_Chahuteurs de cadavre - Objet - World of Warcraft/span_Armure  2'), 
    'Armure : 2')

WebUI.verifyElementText(findTestObject('Page_Chahuteurs de cadavre - Objet - World _4f6cc4/Page_Chahuteurs de cadavre - Objet - World of Warcraft/span_12 Intelligence'), 
    '+12 Intelligence')

WebUI.verifyElementText(findTestObject('Page_Chahuteurs de cadavre - Objet - World _4f6cc4/Page_Chahuteurs de cadavre - Objet - World of Warcraft/span_18 Endurance'), 
    '+18 Endurance')

WebUI.verifyElementText(findTestObject('Page_Chahuteurs de cadavre - Objet - World _4f6cc4/Page_Chahuteurs de cadavre - Objet - World of Warcraft/span_11 Versatilit'), 
    '11 Versatilité')

WebUI.back()

WebUI.waitForElementClickable(findTestObject('Page_Lardeur - PNJ - World of Warcraft/a_Chausses de Lardeur'), 20)

WebUI.click(findTestObject('Object Repository/Page_Lardeur - PNJ - World of Warcraft/a_Chausses de Lardeur'))

WebUI.verifyElementText(findTestObject('Page_Chausses de Lardeur - Objet - World of_f93b8d/Page_Chausses de Lardeur - Objet - World of Warcraft/Title_Chausses de Lardeur'), 
    'Chausses de Lardeur')

WebUI.verifyElementText(findTestObject('Page_Chausses de Lardeur - Objet - World of_f93b8d/Page_Chausses de Lardeur - Objet - World of Warcraft/span_Niveau dobjet 57'), 
    'Niveau d\'objet 57')

WebUI.verifyElementText(findTestObject('Page_Chausses de Lardeur - Objet - World of_f93b8d/Page_Chausses de Lardeur - Objet - World of Warcraft/td_Jambes'), 
    'Jambes')

WebUI.verifyElementText(findTestObject('Page_Chausses de Lardeur - Objet - World of_f93b8d/Page_Chausses de Lardeur - Objet - World of Warcraft/span_Cuir'), 
    'Cuir')

WebUI.verifyElementText(findTestObject('Page_Chausses de Lardeur - Objet - World of_f93b8d/Page_Chausses de Lardeur - Objet - World of Warcraft/span_Armure  6'), 
    'Armure : 6')

WebUI.verifyElementText(findTestObject('Page_Chausses de Lardeur - Objet - World of_f93b8d/Page_Chausses de Lardeur - Objet - World of Warcraft/span_16 Agilit or Intelligence'), 
    '+16 [Agilité or Intelligence]')

WebUI.verifyElementText(findTestObject('Page_Chausses de Lardeur - Objet - World of_f93b8d/Page_Chausses de Lardeur - Objet - World of Warcraft/span_24 Endurance'), 
    '+24 Endurance')

WebUI.verifyElementText(findTestObject('Page_Chausses de Lardeur - Objet - World of_f93b8d/Page_Chausses de Lardeur - Objet - World of Warcraft/span_12 Versatilit (0.30 au niveau 70)'), 
    '+12 Versatilité (0.30% au niveau 70)')

WebUI.back()

WebUI.waitForElementClickable(findTestObject('Page_Lardeur - PNJ - World of Warcraft/a_Pioche en fer froid'), 20)

WebUI.click(findTestObject('Object Repository/Page_Lardeur - PNJ - World of Warcraft/a_Pioche en fer froid'))

WebUI.verifyElementText(findTestObject('Page_Pioche en fer froid - Objet - World of_f9e5d0/Page_Pioche en fer froid - Objet - World of Warcraft/b_Pioche en fer froid'), 
    'Pioche en fer froid')

WebUI.verifyElementText(findTestObject('Page_Pioche en fer froid - Objet - World of_f9e5d0/Page_Pioche en fer froid - Objet - World of Warcraft/span_Niveau dobjet 57'), 
    'Niveau d\'objet 57')

WebUI.verifyElementText(findTestObject('Page_Pioche en fer froid - Objet - World of_f9e5d0/Page_Pioche en fer froid - Objet - World of Warcraft/td_Deux mains'), 
    'Deux mains')

WebUI.verifyElementText(findTestObject('Page_Pioche en fer froid - Objet - World of_f9e5d0/Page_Pioche en fer froid - Objet - World of Warcraft/span_Hache'), 
    'Hache')

WebUI.verifyElementText(findTestObject('Page_Pioche en fer froid - Objet - World of_f9e5d0/Page_Pioche en fer froid - Objet - World of Warcraft/span_Dgts 4 - 10'), 
    'Dégâts : 4 - 10')

WebUI.verifyElementText(findTestObject('Page_Pioche en fer froid - Objet - World of_f9e5d0/Page_Pioche en fer froid - Objet - World of Warcraft/th_Vitesse 3.60'), 
    'Vitesse 3.60')

WebUI.verifyElementText(findTestObject('Page_Pioche en fer froid - Objet - World of_f9e5d0/Page_Pioche en fer froid - Objet - World of Warcraft/span_16 Force'), 
    '+16 Force')

WebUI.verifyElementText(findTestObject('Page_Pioche en fer froid - Objet - World of_f9e5d0/Page_Pioche en fer froid - Objet - World of Warcraft/span_24 Endurance'), 
    '+24 Endurance')

WebUI.back()

WebUI.waitForElementClickable(findTestObject('Page_Lardeur - PNJ - World of Warcraft/a_Grves de gelier voles'), 20)

WebUI.scrollToElement(findTestObject('Page_Lardeur - PNJ - World of Warcraft/a_Grves de gelier voles'), 0)

WebUI.click(findTestObject('Object Repository/Page_Lardeur - PNJ - World of Warcraft/a_Grves de gelier voles'))

WebUI.verifyElementText(findTestObject('Page_Grves de gelier voles - Objet - World of Warcraft/b_Grves de gelier voles'), 
    'Grèves de geôlier volées')

WebUI.verifyElementText(findTestObject('Page_Grves de gelier voles - Objet - World of Warcraft/span_16 Agilit or Intelligence'), 
    '+16 [Agilité or Intelligence]')

WebUI.verifyElementText(findTestObject('Page_Grves de gelier voles - Objet - World of Warcraft/span_24 Endurance'), '+24 Endurance')

WebUI.back()

WebUI.waitForElementClickable(findTestObject('Page_Lardeur - PNJ - World of Warcraft/a_Espauliers de Tourne-Cl'), 20)

WebUI.scrollToElement(findTestObject('Page_Lardeur - PNJ - World of Warcraft/a_Espauliers de Tourne-Cl'), 20)

WebUI.click(findTestObject('Object Repository/Page_Lardeur - PNJ - World of Warcraft/a_Espauliers de Tourne-Cl'))

WebUI.verifyElementText(findTestObject('Page_Espauliers de Tourne-Cl - Objet - World of Warcraft/b_Espauliers de Tourne-Cl'), 
    'Espauliers de Tourne-Clé')

WebUI.verifyElementText(findTestObject('Page_Espauliers de Tourne-Cl - Objet - World of Warcraft/span_12 Force or Intelligence'), 
    '+12 [Force or Intelligence]')

WebUI.verifyElementText(findTestObject('Page_Espauliers de Tourne-Cl - Objet - World of Warcraft/span_15 Versatilit'), '15 Versatilité')

WebUI.verifyElementText(findTestObject('Page_Espauliers de Tourne-Cl - Objet - World of Warcraft/span_18 Endurance'), '+18 Endurance')

WebUI.closeBrowser()

