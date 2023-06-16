package review13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import utils.Constants;

import java.util.List;
import java.util.Map;



public class HW1Tester{
    /*
    Create an excel file for these fields store the data in excel,
    read it, and insert on this webpage using selenium.
     */
    public static void main(String[] args) {
        String path="C:\\Users\\Halim\\OneDrive\\Desktop\\ReviewJava\\Files\\AddEmployee.xlsx";

        List<Map<String, String>> empData = ExcelReader.read(path, "Sheet1");

        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%22");

        WebElement userName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement logIn = driver.findElement(By.xpath("//*[@id='btnLogin']"));
        logIn.click();

        for (Map<String, String> map : empData) {
            WebElement pim = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
            pim.click();
            WebElement empList = driver.findElement(By.xpath("//a[text()='Employee List']"));
            empList.click();
            WebElement idSearch= driver.findElement(By.xpath("//input[@name='empsearch[id]']"));
            idSearch.sendKeys("7328155");
            WebElement searchButton= driver.findElement(By.xpath("//input[@id='searchBtn']"));
            searchButton.click();
            WebElement clickOnId=driver.findElement(By.xpath("//table/tbody/tr/td[2]"));
            clickOnId.click();
            WebElement editButton=driver.findElement(By.xpath("//input[@id='btnSave']"));
            editButton.click();

            WebElement firstName= driver.findElement(By.xpath("//input[@id='personal_txtEmpFirstName']"));
            firstName.clear();
            firstName.sendKeys(map.get("FirstName"));
            WebElement middleName= driver.findElement(By.xpath("//input[@id='personal_txtEmpMiddleName']"));
            middleName.clear();
            middleName.sendKeys(map.get("MiddleName"));
            WebElement lastName= driver.findElement(By.xpath("//input[@id='personal_txtEmpLastName']"));
            lastName.clear();
            lastName.sendKeys(map.get("LastName"));
            WebElement employeeId= driver.findElement(By.xpath("//input[@id='personal_txtEmployeeId']"));
            employeeId.clear();
            employeeId.sendKeys(map.get("EmployeeId"));
            WebElement dlNumber= driver.findElement(By.xpath("//input[@id='personal_txtLicenNo']"));
            dlNumber.sendKeys(map.get("DriversLicenseNumber"));
            WebElement SSN= driver.findElement(By.xpath("//input[@id='personal_txtNICNo']"));
            SSN.sendKeys(map.get("SSNNumber"));
            WebElement otherId= driver.findElement(By.xpath("//input[@id='personal_txtOtherID']"));
            otherId.sendKeys(map.get("OtherId"));
            WebElement dlExpiryDate=driver.findElement(By.xpath("//input[@id='personal_txtLicExpDate']"));
            dlExpiryDate.click();
            WebElement selectMonth=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
            Select selMonth = new Select(selectMonth);
            selMonth.selectByVisibleText("Jan");
            WebElement selectYear=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
            Select selYear = new Select(selectYear);
            selYear.selectByVisibleText("2023");
            WebElement selectDay=driver.findElement(By.xpath("//table/tbody/tr/td[7]"));
            selectDay.click();
            WebElement sinNumber= driver.findElement(By.xpath("//input[@id='personal_txtSINNo']"));
            sinNumber.sendKeys(map.get("SINNumber"));
            WebElement gender= driver.findElement(By.xpath("//input[@id='personal_optGender_1']"));
            gender.click();
            WebElement maritalStatus= driver.findElement(By.xpath("//select[@id='personal_cmbMarital']"));
            Select sel=new Select(maritalStatus);
            sel.selectByIndex(1);
            WebElement dobCalendar=driver.findElement(By.xpath("(//img[@class='ui-datepicker-trigger'])[2]"));
             dobCalendar.click();
            WebElement selectMonth2=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
            selectMonth2.click();
            Select selMonth2 = new Select(selectMonth2);
            selMonth2.selectByVisibleText("Jan");
            WebElement selectYear2=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
            selectYear2.click();
            Select selYear2 = new Select(selectYear2);
            selYear2.selectByVisibleText("1975");
            WebElement selectDay2=driver.findElement(By.xpath("//tbody/tr[3]/td[1]"));
            selectDay2.click();
            WebElement nationality= driver.findElement(By.xpath("//select[@id='personal_cmbNation']"));
            nationality.click();
            Select sel2=new Select(nationality);
            sel2.selectByVisibleText("American");
            WebElement nickName= driver.findElement(By.xpath("//input[@id='personal_txtEmpNickName']"));
            nickName.sendKeys(map.get("NickName"));
            WebElement smoker= driver.findElement(By.xpath("//input[@id='personal_chkSmokeFlag']"));
            WebElement militaryService= driver.findElement(By.xpath("//input[@id='personal_txtMilitarySer']"));
            militaryService.sendKeys(map.get("MilitaryService"));
        }
    }
}