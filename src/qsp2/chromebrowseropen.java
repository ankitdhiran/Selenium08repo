package qsp2;

import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowseropen {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/ChromeDriver.exe");
		ChromeDriver c1=new ChromeDriver();
		c1.get( "https://www.google.com/");
		String title=c1.getTitle();
		System.out.println(title);
	
		c1.close();
	}

}
