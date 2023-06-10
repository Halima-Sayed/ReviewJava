package review11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.List;

public class E9ArrayList {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.amazon.com/");
       List<WebElement> allAtag=driver.findElements(By.xpath("//a"));
        for (WebElement e:allAtag) {
            if(!e.getText().isEmpty())
            System.out.println(e.getText());
        }
        driver.close();
    }
        }

