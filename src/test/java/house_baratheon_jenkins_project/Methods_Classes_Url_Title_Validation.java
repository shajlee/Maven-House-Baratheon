package house_baratheon_jenkins_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Methods_Classes_Url_Title_Validation {


	
	public static void main(String[] args) {
		Methods_Classes_Url_Title_Validation.RobertBaratheon();
		Methods_Classes_Url_Title_Validation.StannisBaratheon();
		
		Methods_Classes_Url_Title_Validation HouseBaratheon = new Methods_Classes_Url_Title_Validation();
		HouseBaratheon.RenlyBaratheon();
		HouseBaratheon.SerDavosSeaworth();
		
		Methods_Classes_Url_Title_Validation HouseBaratheon1 = new Methods_Classes_Url_Title_Validation();
		HouseBaratheon1.Melissandre();
		
		
		
	}
	public static void RobertBaratheon() {
		System.out.println("King of the Seven Kingdoms");
	}
	public static void StannisBaratheon() {
		System.out.println("Lord of Darkness");
	}
	public static void RenlyBaratheon() {
		System.out.println("Master of Laws");
	}
	public static void SerDavosSeaworth() {
		System.out.println("The Onion Knight");
	}
	public static void Melissandre() {
		System.out.println("The Red Priestess");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://awoiaf.westeros.org/index.php/House_Baratheon");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		String actualCurrentUrl = "https://awoiaf.westeros.org/index.php/House_Baratheon";
		String expectedCurrentUrl = driver.getCurrentUrl();
		
		String actualTitle = "House Baratheon - A Wiki of Ice and Fire";
		String expectedTitle = driver.getTitle();
		
		if(actualTitle.equals(expectedTitle) && actualCurrentUrl.equals(expectedCurrentUrl)) {
			System.out.println("URL is valid & working");
		}else {
			System.out.println("Url is not valid");
			
		}
		
		
		
		
		

	}



		
	
		

	}


