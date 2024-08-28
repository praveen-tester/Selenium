package AC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Reader {
	WebDriver driver;

	@Test
	public void method2() throws IOException {
		System.setProperty("Webdriver.chrome.driver","//Users//apple//Downloads//chrome-mac-arm64 3.exe");
		 driver=new ChromeDriver();
		String textFromSrc = readTextFromUrl(captchaImageUrl);
		System.out.println("Text from src attribute: " + textFromSrc);

	}
	WebElement l3=driver.findElement(By.id("captcha"));
	String captchaImageUrl=l3.getAttribute("src");
	private static String readTextFromUrl(String url) throws IOException {
		StringBuilder content = new StringBuilder();
		URL urlObject = new URL(url);
		BufferedReader reader = new BufferedReader(new InputStreamReader(urlObject.openStream()));
		String line;
		while ((line = reader.readLine()) != null) {
			content.append(line);
			content.append(System.lineSeparator());
		}
		reader.close();
		return content.toString();
	}
}


