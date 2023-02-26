package automation_code_feb_21st_2023;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptions_Code {
	
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments ("--Start-maximized");
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		
	}

}
