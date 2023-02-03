package qsp2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class microsotegdeopne {

	public static void main(String[] args) {
   System.setProperty("webdriver.edge.driver","../Automation2/driver/msedgedriver.exe");
     
      WebDriver driver=new EdgeDriver();
      
      driver.manage().window().maximize();
      driver.get("https://www.google.com/");
      driver.get("https://www.myntra.com/myntra-fashion-store?f=Brand%3AAllen%20Solly%2CArrow%2CBlackberrys%2CColorPlus%2CDENNISON%2CEthnix%20by%20Raymond%2CExcalibur%2CHancock%2CINVICTUS%2CJAINISH%2CLouis%20Philippe%2CLouis%20Philippe%20Ath.Work%2CMarks%20%26%20Spencer%2CPark%20Avenue%2CPeter%20England%2CPeter%20England%20Elite%2CRaymond%2CTHE%20BEAR%20HOUSE%2CV%20Dot%2CVan%20Heusen%2CaLL%3A%3ACategories%3AShirts%2CShorts%2CTrousers%2CTshirts%3A%3AGender%3Amen%2Cmen%20women&rf=Discount%20Range%3A10.0_100.0_10.0%20TO%20100.0");
	
	
	}

}
