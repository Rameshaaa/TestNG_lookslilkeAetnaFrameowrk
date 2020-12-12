package Data;

import org.testng.annotations.DataProvider;

public class getData {
	
	
	@DataProvider(name = "firstTesCase")
	public static Object[][] Testcase1(){
		
		Object[][] data = new Object[1][1];
		data[0][0] = "Ramesh";
		
		return data;
	}
	
	@DataProvider(name = "SecondData")
	public static Object[][] Testcase2(){
		
		Object[][] data = new Object[1][1];
		data[0][0] = "Ramesh";
		
		return data;
	}

}
