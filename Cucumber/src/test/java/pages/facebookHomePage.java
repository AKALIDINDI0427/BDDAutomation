package pages;

import resources.BasePage;

public class facebookHomePage extends BasePage{
	
	public void launchURL()
	{
		System.out.println("hi");
		invokeApp("FacebookHome.URL");
	}
	
	public void createAccount() {
		// TODO Auto-generated method stub
		elementsendText("FacebookHome.firstName", "akjsbfkj");
		elementsendText("FacebookHome.lastName", "sadgbshjdbv");
		elementsendText("FacebookHome.email", "ajbgkjbsd@gmail.com");
		elementsendText("FacebookHome.password", "sdfv@2019");
		selectDropDownbyIndex("FacebookHome.birthMM", 4);
		selectDropDownbyValue("FacebookHome.birthDD", "17");
		selectDropDownbyVisibleText("FacebookHome.birthYY", "1989");
		//elementClick("FacebookHome.gender");
		
	}
}
