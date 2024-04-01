package com.TestNGdifferentMethods;

import org.testng.annotations.Test;

public class TestNg1 
{
@Test(groups = {"smoke testing"})
public void testcase1()
{
	System.out.println("TestNg1-testcase1");
}
@Test(priority=2,groups = {"regresiontesting"})
public void testcase2()
{
	System.out.println("TestNg1-testcase2");
}
@Test(groups = {"smoke testing"})
public void testcase3()
{
	System.out.println("TestNg1-testcase3");
}
@Test(priority=1,groups = {"regresiontesting"})
public void testcase4()
{
	System.out.println("TestNg1-testcase4");
}
}
