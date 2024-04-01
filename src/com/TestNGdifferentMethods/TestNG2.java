package com.TestNGdifferentMethods;

import org.testng.annotations.Test;

public class TestNG2 {
  @Test(groups = {"regresiontesting"})
  public void testscenario1()
  {
	  System.out.println("TestNg2-testscenario1");
  }
  @Test(groups = {"smoke testing"})
  public void testscenario2()
  {
	  System.out.println("TestNg2-testscenario2");
  }
  @Test(groups = {"smoke testing"})
  public void testscenario3()
  {
	  System.out.println("TestNg2-testscenario3");
  }
  @Test(groups = {"regresiontesting"})
  public void testscenario4()
  {
	  System.out.println("TestNg2-testscenario4");
  }
}
