package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class BasePage implements Wrapper{

	public RemoteWebDriver driver;
	public Properties prop;
	public BasePage()
	{
		prop = new Properties();
		try {
			prop.load(new FileInputStream(new File("src/test/java/resources/ObjectRepository.properties")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void invokeApp(String URL)
	{
		System.setProperty("webdriver.chrome.driver", "/Users/ajayraju/Downloads/chromedriverformacbook");
		driver = new ChromeDriver();
		driver.get(prop.getProperty(URL));
	}
	
	public void takeScreenshot() {
		// TODO Auto-generated method stub
		long number = 10000l;
		number = (long) Math.floor(Math.random()*100000+100000l);
		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		File path = new File("./screenshots/snap"+number+".jpeg");
		try {
			FileUtils.copyFile(screenshot, path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void elementsendText(String xpath, String value) {
		// TODO Auto-generated method stub
		try {
			driver.findElement(By.xpath(prop.getProperty(xpath))).sendKeys(value);
		} catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			System.err.println("ElementNotVisibleException"+ e);
		} catch (ElementNotInteractableException e){
			System.err.println("ElementNotInteractableException"+ e);
		} catch (NoSuchElementException e){
			System.err.println("NoSuchElementException"+ e);
		} finally{
			takeScreenshot();
		}
		
	}
	public void elementClick(String xpath) {
		// TODO Auto-generated method stub
		try {
			driver.findElement(By.xpath(xpath)).click();
		} catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			System.err.println("ElementNotVisibleException"+ e);
		} catch (ElementNotInteractableException e){
			System.err.println("ElementNotInteractableException"+ e);
		} catch (NoSuchElementException e){
			System.err.println("NoSuchElementException"+ e);
		} finally{
			takeScreenshot();
		}
	}
	public void selectDropDownbyIndex(String xpath, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement element = driver.findElement(By.xpath(prop.getProperty(xpath)));	
			Select options = new Select(element);
			options.selectByIndex(value);
		} catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			System.err.println("ElementNotVisibleException"+ e);
		} catch (ElementNotInteractableException e){
			System.err.println("ElementNotInteractableException"+ e);
		} catch (NoSuchElementException e){
			System.err.println("NoSuchElementException"+ e);
		} finally{
			takeScreenshot();
		}
	}
	public void selectDropDownbyValue(String xpath, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement element = driver.findElement(By.xpath(prop.getProperty(xpath)));	
			Select options = new Select(element);
			options.selectByValue(value);
		} catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			System.err.println("ElementNotVisibleException"+ e);
		} catch (ElementNotInteractableException e){
			System.err.println("ElementNotInteractableException"+ e);
		} catch (NoSuchElementException e){
			System.err.println("NoSuchElementException"+ e);
		} finally{
			takeScreenshot();
		}
	}
	public void selectDropDownbyVisibleText(String xpath, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement element = driver.findElement(By.xpath(prop.getProperty(xpath)));	
			Select options = new Select(element);
			options.selectByVisibleText(value);
		} catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			System.err.println("ElementNotVisibleException"+ e);
		} catch (ElementNotInteractableException e){
			System.err.println("ElementNotInteractableException"+ e);
		} catch (NoSuchElementException e){
			System.err.println("NoSuchElementException"+ e);
		} finally{
			takeScreenshot();
		}
	}
	public void switchFrame(String xpath) {
		// TODO Auto-generated method stub
		try {
			WebElement element = driver.findElement(By.xpath(prop.getProperty(xpath)));
			driver.switchTo().frame(element);
		} catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			System.err.println("ElementNotVisibleException"+ e);
		} catch (ElementNotInteractableException e){
			System.err.println("ElementNotInteractableException"+ e);
		} catch (NoSuchElementException e){
			System.err.println("NoSuchElementException"+ e);
		} catch (NoSuchFrameException e){
			System.err.println("NoSuchFrameException"+ e);
		} finally{
			takeScreenshot();
		}
	}
	public void defaultFrame() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().defaultContent();
		} catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			System.err.println("ElementNotVisibleException"+ e);
		} catch (ElementNotInteractableException e){
			System.err.println("ElementNotInteractableException"+ e);
		} catch (NoSuchElementException e){
			System.err.println("NoSuchElementException"+ e);
		} catch (NoSuchFrameException e){
			System.err.println("NoSuchFrameException"+ e);
		} finally{
			takeScreenshot();
		}
		
	}
	public void switchToWindow() {
		// TODO Auto-generated method stub
		try {
			String window = driver.getWindowHandle();
			driver.switchTo().window(window);
		} catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			System.err.println("ElementNotVisibleException"+ e);
		} catch (ElementNotInteractableException e){
			System.err.println("ElementNotInteractableException"+ e);
		} catch (NoSuchElementException e){
			System.err.println("NoSuchElementException"+ e);
		} catch (NoSuchWindowException e){
			System.err.println("NoSuchFrameException"+ e);
		} finally{
			takeScreenshot();
		}
		
	}

	
}
