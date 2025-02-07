package sample;

import org.testng.annotations.Test;

public class depends 
{
	@Test(priority=3)
	public void createUser()
	{
		System.out.println("user created");
	}
	@Test(priority=1,invocationCount=3)
	public void modifyUser()
	{
		System.out.println("user modified");
	}
	@Test(dependsOnMethods = {"createUser","modifyUser"})
	public void deleteUser()
	{
		System.out.println("user deleted");
	}
}
