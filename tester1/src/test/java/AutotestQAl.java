import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutotestQAl {
    public static final WebDriver x = new ChromeDriver();

    @BeforeEach
     void before (){
        x.get("https://qalight.com.ua");

    }
    @Test
    void test() throws InterruptedException{
        x.findElement(By.xpath("//*[@id=\"menu-item-716\"]/a")).click();

    Thread.sleep(5000);
    }
    @AfterEach
    void ater(){
        x.quit();
    }
}
