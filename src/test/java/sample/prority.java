package sample;

import org.testng.annotations.Test;

public class prority
{
	@Test(priority=1)
	public void createUser()
	{
		System.out.println("user created");
	}
	@Test(priority=2)
	public void modifyUser()
	{
		System.out.println("user modified");
	}
	@Test(priority=3)
	public void deleteUser()
	{
		System.out.println("user deleted");
	}
}
