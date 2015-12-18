package ericsson;

/**
 * Calculates Total Pay of an Employee 
 * @author Pranav Sharma
 * @version 1.0
 * @since 2015-12-16
*/
public class EmployeePay {

	/**
	 * Base Pay of Employee
	*/
	private double _basePay = 0;

	/**
	 * Hours worked by Employee
	*/
	private int _hours = 0;
	
	/**
	 * Instantiating the Class
	*/
	public EmployeePay(double basePay, int hours)
	{
		_basePay = basePay;
		_hours = hours;
	}
	
	/**
	 * Calculating the Final Pay of Employee
	*/
	public double CalculateTotalPay()
	{
		double totalPay = 0;
		boolean error = false;
		
		//If base pay is less than minimum wage
		//Or Hours is greater than maximum hours
		//Throw Error
		if (_basePay < 8.00 || _hours > 60)
		{
			error = true;
		}
		
		else 
		{
			//Calculate Overtime Pay
			if (_hours > 40)
			{
				totalPay = CalculatePay(_hours - 40, _basePay * 1.5);
				_hours = 40;
			}
			//Calculate Regular Hours Pay
			totalPay = totalPay + CalculatePay(_hours, _basePay);
		}
		
		PrintTotalPay(totalPay, error);
		return totalPay;
	}

	/**
	 * Print Pay or Error
	*/
	private void PrintTotalPay(double totalPay, boolean error)
	{
		if (error == true)
		{
			System.out.println("There was an error");
		}
		else
		{
			System.out.println(totalPay);
		}
	}
	
	/**
	 * Return Pay
	*/
	private double CalculatePay(int hours, double pay) 
	{
		return hours * pay;
	}

}
