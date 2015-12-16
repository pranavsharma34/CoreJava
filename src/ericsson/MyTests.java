package ericsson;

import org.junit.Assert;
import org.junit.Test;

public class MyTests
{
	@Test
	public void Employee3()
	{
		Assert.assertEquals(0, EricssonCorporation.CalculateTotalPay(10, 73), 0);
	}
	
	@Test
	public void Employee2()
	{
		Assert.assertEquals((40*8.20) + (7*(8.20*1.5)), EricssonCorporation.CalculateTotalPay(8.20, 47), 0);
	}
	
	@Test
	public void Employee1()
	{
		Assert.assertEquals(0, EricssonCorporation.CalculateTotalPay(7.50, 35), 0);
	}
	
}