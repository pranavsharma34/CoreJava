package ericsson;

import org.junit.Assert;
import org.junit.Test;

/**
 * JUnit Testing of EmployeePay 
 * @author Pranav Sharma
 * @version 1.0
 * @since 2015-12-16
*/
public class MyTests
{
	private EmployeePay _employeePay;
	
	/**
	 * Base Pay - 10, Hours worked - 73 
	*/
	@Test
	public void Employee3()
	{
		_employeePay = new EmployeePay(10, 73);	
		Assert.assertEquals(0, _employeePay.CalculateTotalPay(), 0);
	}
	
	/**
	 * Base Pay - 8.20, Hours worked - 47 
	*/
	@Test
	public void Employee2()
	{
		_employeePay = new EmployeePay(8.20, 47);	
		Assert.assertEquals((40*8.20) + (7*(8.20*1.5)), _employeePay.CalculateTotalPay(), 0);
	}
	
	/**
	 * Base Pay - 7.50, Hours worked - 35 
	*/
	@Test
	public void Employee1()
	{
		_employeePay = new EmployeePay(7.50, 35);	
		Assert.assertEquals(0, _employeePay.CalculateTotalPay(), 0);
	}
	
}