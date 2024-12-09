package login_and_search;

import org.openqa.selenium.WebDriver;

public interface LoginEngine {
	public abstract void getWeb();
	public abstract void setUpInfor();
	public abstract void fillGmail();
	public abstract void fillUsername();
	public abstract void fillPassword();
	public abstract void close();
	public abstract void init(String url);
	public abstract WebDriver getWebDriver();
	public abstract void setUrl(String url);
} 
