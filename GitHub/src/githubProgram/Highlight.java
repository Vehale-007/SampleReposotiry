package githubProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Highlight {
	static WebDriver d;
	public void highlight() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\VelocityTraning\\SetUp\\ChromeDriver100_SeleniumFile\\chromedriver_win32 (1)\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.navigate().to("https://www.demoblaze.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement phones = d.findElement(By.xpath("//a[contains(text(),'Phones')]"));
		highlightElement(phones);
		Thread.sleep(3000);
		System.out.println("Webelement is highlighted sucessfully");
		d.quit();
	}
	public static void highlightElement(WebElement ele) {
		JavascriptExecutor j = (JavascriptExecutor)d;   
		j.executeScript("arguments[0].setAttribute('style','background : green; border: 2px solid red;')", ele);
	}
	public static void main(String[] args) throws InterruptedException {
		Highlight x = new Highlight();
		x.highlight();
	}
}
