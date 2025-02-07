package sample;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(genaricutility.ListenersImplementation.class)
public class testngpractice 
{
	@Test(priority=3)
	public void createUser()
	{
		System.out.println("user created");
	}
	//@Ignore
	@Test(priority=1)
	public void modifyUser()
	{
		System.out.println("user modified");
		Assert.fail();
	}
	@Test(dependsOnMethods = {"modifyUser"},enabled=true)
	public void deleteUser()
	{
		System.out.println("user deleted");
	}
}
