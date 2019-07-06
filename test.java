import java.io.IOException;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 
public class test {
 
        public static void main(String[] args) throws IOException, InterruptedException {
                System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless");
                chromeOptions.addArguments("--no-sandbox");
 
                WebDriver driver = new ChromeDriver(chromeOptions);
 
                driver.get("http://192.168.56.103:32771/content/about-us.php");
 
                Thread.sleep(1000);
 		String test = driver.findElement(By.id("PID-ab2-pg")).getText();
                if (test.contains("This is about page. Lorem Ipsum Dipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.")) {
                        System.out.println("Pass");
                } else {
                        System.out.println("Fail");
                }
                driver.quit();
        }
}
