import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainTest {

    @Test
    public void solveTrianglePuzzle() {
        //System.setProperty("driver.chrome.driver", "C:/chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://playground.learnqa.ru/puzzle/triangle");

        WebElement giveUpButton = driver.findElement(By.xpath("//button[contains(text(), 'Я сдаюсь')]"));
        if (giveUpButton.isDisplayed()) {
            giveUpButton.click();

            WebElement button2 = driver.findElement(By.xpath("//a[contains(text(), 'Ссылка на ответы')]"));
            WebElement button3 = driver.findElement(By.xpath("//button[contains(text(), 'Спрятать ответы')]"));

            if (button2.isDisplayed() && button3.isDisplayed()) {
                System.out.println("Тест пройден");
            }
            else{
                System.out.println("Новые кнопки не найдены!");
            }

        } else {
            System.out.println("Кнопка 'Я сдаюсь' не найдена на странице!");
        }
        driver.quit();
    }
}