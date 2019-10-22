package com.qualitystream.tutorial;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Choucair_David_l_lopez {
	
	private WebDriver driver;
	By empleoLinklocator = By.linkText("Empleos");
	By registrerPageLocator =By.xpath("//img[@src=\"https://www.choucairtesting.com/wp-content/uploads/2019/07/banner.png\"]");
	By palabraclavelocator=By.id("search_keywords");
	By ubicaiconlocator=By.id("search_location");
	By  botonbuscar= By.xpath("//div[@class='search_submit']");
	
	By ingresaraoferta=By.xpath("//ul [@class =\"job_listings\"]");
	By bannerempleoLocator = By.xpath("//img [@src=\"https://www.choucairtesting.com/wp-content/uploads/2019/07/analista_pruebas.jpg\"]");
	
	By inscribirtrabajoLocator =By.xpath("//INPUT [@class='application_button button']");
	
	
	
	By nombreregistroLocator = By.name("your-name");
	By correoregistroLocator = By.name("your-email");
	By  botonenviar= By.xpath("//input [@class='wpcf7-form-control wpcf7-submit']");
	By captchaLocator = By.xpath("//div [@class='rc-inline-block']");


	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.choucairtesting.com/");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test_ingreso_empleo() throws InterruptedException {
		
		driver.findElement(empleoLinklocator).click();
		Thread.sleep(2000);
		if (driver.findElement(registrerPageLocator).isDisplayed()) {
			driver.findElement(palabraclavelocator).sendKeys("pruebas");
			driver.findElement(ubicaiconlocator).sendKeys("Bogota");
			driver.findElement(botonbuscar).click();
			Thread.sleep(2000);
			
			
			driver.findElement(ingresaraoferta).click();
			
			if (driver.findElement(bannerempleoLocator).isDisplayed()){
				
				driver.findElement(inscribirtrabajoLocator).click();
				driver.findElement(nombreregistroLocator).sendKeys("JUAN PEREZ");
				driver.findElement(correoregistroLocator).sendKeys("Dlu9012@gmail.com");
				//driver.findElement(captchaLocator).click();
				driver.findElement(botonenviar).click();
	
				
				
			}
			
			
		
		}
		else {
			System.out.println("ERROR AL ENCONTRAR EL LOCALIZADOR");
		}
		
			
	}
}

	
	


