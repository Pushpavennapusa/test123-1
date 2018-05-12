package h20testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumWebdriverCourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.h2otestingtools.com/#/home");
		driver.findElement(By.xpath(".//*[@id='navbarDropdown']")).click();
		driver.findElement(By.xpath(".//*[@id='navbarSupportedContent']/ul/li[2]/div/div/a[2]")).click();
		String text = driver.findElement(By.xpath("html/body/app-root/div[3]/app-courses/app-selenium/div/div[1]/h3")).getText();
		System.out.println(text);
	}

}
