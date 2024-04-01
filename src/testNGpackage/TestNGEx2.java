package testNGpackage;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestNGEx2 
{
@Test(priority = 3)
public void registration()
{
	System.out.println("registration");
	Assert.assertTrue(false);
}
@Test(priority = 1, dependsOnMethods = "registration")
public void signin()
{
	System.out.println("sign in");
}
@Test(priority = 2, dependsOnMethods = "registration")
public void signout()
{
	System.out.println("sign out");
}
}
