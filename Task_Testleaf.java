package com.task;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task_Testleaf {
	public void method() { 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']"));
		element.click();
		WebElement element2 = driver.findElement(By.xpath("(//i[@class='pi pi-fw pi-check-square layout-menuitem-icon'])[1]"));
		element2.click();
		WebElement element3 = driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all']"));
		element3.click();
		element3.sendKeys("kumareswari");
		WebElement element4 = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']"));
		element4.sendKeys(",India");
		WebElement element5 = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt93']"));
		boolean ref = element5.isEnabled();
		System.out.println(ref);
		WebElement element6 = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt95']"));
		element6.sendKeys("hospital");
		element6.clear();
		WebElement element7  = driver.findElement(By.xpath("//input[@value='My learning is superb so far.']"));
		System.out.println(element7.getAttribute("value"));
		WebElement element8 = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt99']"));
		element8.sendKeys("kumaresalagar@gmail.com");
		element8.click();
		WebElement element9 = driver.findElement(By.xpath("//textarea[@id='j_idt88:j_idt101']"));
		element9.sendKeys("Myself Kumareswari, ");
		WebElement element10 = driver.findElement(By.xpath ("//input[@id='j_idt106:auto-complete_input']"));
		element10.sendKeys("kumares");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement element11 = driver.findElement(By.xpath("(//span[@class='ui-autocomplete-query'])[3]"));
        element11.click();
        WebElement element12 = driver.findElement(By.xpath("//input[@class='ui-inputfield ui-widget ui-state-default ui-corner-all']"));
        element12.sendKeys("09/28/2003");
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        WebElement element13 = driver.findElement(By.xpath("//input[@id='j_idt106:j_idt118_input']"));
        element13.sendKeys("5");
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        WebElement element14 = driver.findElement(By.xpath("//span[@class='ui-icon ui-c ui-icon-triangle-1-n']"));
        element14.click();
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        WebElement element15 = driver.findElement(By.xpath("//span[@class='ui-icon ui-c ui-icon-triangle-1-s']"));
        element15.click();
        WebElement element16 = driver.findElement(By.xpath("(//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all'])[5]"));
        element16.sendKeys("89");
        
	}
 public static void main(String[]args) {
		Task_Testleaf calling = new Task_Testleaf();
		calling.method();
		}
}
