package sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hardAssertion 
{
	@Test
	public void strictLevelComparison()
	{
		String exceptedName="Reedy";
		String actualName="ReDDy";
//		Assert.assertEquals(actualName.equals(exceptedName), true);
		Assert.assertEquals(actualName, exceptedName);
		System.out.println("validation ended");
	}
	@Test
	public void containLevelComparison()
	{
		String exceptedName="don";
		String actualName="london";
		Assert.assertTrue(actualName.contains(exceptedName));
		System.out.println("validation ended");
	}
}
