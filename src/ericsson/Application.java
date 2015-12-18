package ericsson;

public class Application {

	public static void main(String[] args) 
	{
		System.out.println("Testing Employee 1");
		EmployeePay employeePay1 = new EmployeePay(7.50, 35);
		employeePay1.CalculateTotalPay();
		System.out.println('\n');
	
		System.out.println("Testing Employee 2");
		EmployeePay employeePay2 = new EmployeePay(8.20, 47);
		employeePay2.CalculateTotalPay();
		System.out.println('\n');
			
		System.out.println("Testing Employee 3");
		EmployeePay employeePay3 = new EmployeePay(10.00, 73);
		employeePay3.CalculateTotalPay();
	}
}
