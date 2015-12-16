package ericsson;

public class EricssonCorporation {

	private static double _basePay = 0;
	private static int _hours = 0;
	
	public static void main(String[] args) {
			
		System.out.println("Testing Employee 1");
		_basePay = 7.50;
		_hours = 35;
		CalculateTotalPay(_basePay, _hours);
		System.out.println('\n');
	
		System.out.println("Testing Employee 2");
		_basePay = 8.20;
		_hours = 47;
		CalculateTotalPay(_basePay, _hours);
		System.out.println('\n');
			
		System.out.println("Testing Employee 3");
		_basePay = 10.00;
		_hours = 73;
		CalculateTotalPay(_basePay, _hours);
	
	}
	
	public static double CalculateTotalPay(double basePay, int hours)
	{
		double totalPay = 0;
		boolean error = false;
		
		if (basePay < 8.00 || hours > 60)
		{
			error = true;
		}
		
		else 
		{
			if (hours > 40)
			{
				totalPay = CalculatePay(hours - 40, basePay * 1.5);
				hours = 40;
			}
			totalPay = totalPay + CalculatePay(hours, basePay);
		}
		
		PrintTotalPay(totalPay, error);
		return totalPay;
	}

	private static void PrintTotalPay(double totalPay, boolean error)
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
	
	private static double CalculatePay(int hours, double pay) 
	{
		return hours * pay;
	}
}
