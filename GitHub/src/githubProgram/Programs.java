package githubProgram;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Programs {
	
	static WebDriver d;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\VelocityTraning\\SetUp\\ChromeDriver100_SeleniumFile\\chromedriver_win32 (1)\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.navigate().to("https://www.google.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> links = d.findElements(By.tagName("a"));
		System.out.println("Total links : " + links.size());
		List<String> urlList = new ArrayList<String>();
		for(WebElement e: links) {
			String url = e.getAttribute("href");
			urlList.add(url);
		}
		long stTime = System.currentTimeMillis();
		urlList.parallelStream().forEach(e -> brokenLinks(e));
		long endtime = System.currentTimeMillis();
		System.out.println("Total time : " + (endtime - stTime));
		d.quit();
	}
	public static void brokenLinks(String linkUrl) {
		try {
			URL url = new URL(linkUrl);
			HttpURLConnection http = (HttpURLConnection)url.openConnection();
			http.setConnectTimeout(5000);
			http.connect();
			if(http.getResponseCode() >= 400) {
				System.out.println(linkUrl + "--> " + http.getResponseMessage());
			}else {
				System.out.println(linkUrl + "--> " + http.getResponseMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
