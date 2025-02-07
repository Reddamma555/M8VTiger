package sample;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ignoring
{
	@Test(priority=3)
	public void createUser()
	{
		System.out.println("user created");
	}
	@Ignore
	@Test(priority=1,invocationCount=3)
	public void modifyUser()
	{
		System.out.println("user modified");
	}
	@Test(dependsOnMethods = {"createUser"},enabled=false)
	public void deleteUser()
	{
		System.out.println("user deleted");
	}
}
