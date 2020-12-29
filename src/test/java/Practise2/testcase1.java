package Practise2;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Data.getData;
import objectRepo.POR;
import resources.Base;

public class testcase1 extends Base implements POR{
	
	Base b = new Base();
	
	
	@BeforeTest
	public void initiateBrowser() throws IOException
	{
		b.launchURL();
		
	}
	
	@Test(dataProvider = "firstTesCase", dataProviderClass= getData.class)
	public void e2e(String name) throws IOException
	
	{
		b.ExplicityWait(entertext, 10);
		b.enterText(entertext, name);
		b.Click(radiobtn);
		b.SelectDDropDown(Drpdwn, "Option1");
		String text = b.getText(textget);
		System.out.println(text);
		System.out.println("New lined added at 35");
		System.out.println("New lined added at 36");
		
	}
	
	@AfterTest
	public void teardown()
	{
		b.close();
	}

}
