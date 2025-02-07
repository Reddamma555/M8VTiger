package sample;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertion 
{
	@Test
	public void strictLevelComparison() 
	{
		String exceptedValue="Reedy";
		String actualValue="ReDDy";
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualValue, exceptedValue);
		System.out.println("before validation");
		System.out.println("validation ended");
		s.assertAll();
	}
	@Test
	public void containLevelComparison()
	{
		String exceptedValue="sign";
		String actualValue="signout";
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualValue.contains(exceptedValue),true);
		System.out.println("hi");
		s.assertFalse(actualValue.contains(exceptedValue));
		s.assertAll();
	} 
}
