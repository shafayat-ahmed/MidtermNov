package design;

import java.util.Scanner;

public class EmployeeInfo extends Departments implements Employee {

	/*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
	 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
	 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
	 * go to FortuneEmployee class to apply all the fields and attributes.
	 *
	 * Important: YOU MUST USE the
	 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
	 * Use all kind of keywords(super,this,static,final........)
	 * Implement Nested class.
	 * Use Exception Handling.
	 *
	 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	final static String companyName = "PPNT";
	int employeeId;
	String name;
	static double monthlySalary;
	String dep;


	/*
	 * You must implement the logic for below 2 methods and
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */

	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */

	//default constructor
	public EmployeeInfo() {
		employeeId = 0;
		name = "";
	}

	public EmployeeInfo(int employeeId) {
		this.employeeId = employeeId;
	}

	public EmployeeInfo(String name, int employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}

	public EmployeeInfo(String name, int employeeId, double salary) {
		this.name = name;
		this.employeeId = employeeId;
		this.monthlySalary = salary;
	}

	public EmployeeInfo(String name, int employeeId, double salary, String dep) {
		this.name = name;
		this.employeeId = employeeId;
		this.monthlySalary = salary;
		this.dep = dep;
	}


	@Override
	public void Departments() {
		System.out.println("The Departments of this organization are: \n" + department + "\n" + department2 + "\n" + department3);
	}

	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 *
	 */
	public static double calculateEmployeeBonus(int numberOfYearsWithCompany) {
		double total = 0;

		if (numberOfYearsWithCompany > 2) {
			total = (monthlySalary * 12) * 0.10;
		} else if (numberOfYearsWithCompany <= 2) {
			total = (monthlySalary * 12) * 0.08;
		}


		System.out.println("Bonus: " + total);
		// returns only the bonus amount
		return total;
	}

	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 *
	 */
	public static int calculateEmployeePension() {
		int total = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
		String convertedJoiningDate = DateConversion.convertDate(joiningDate);
		String convertedTodaysDate = DateConversion.convertDate(todaysDate);

		//implement numbers of year from above two dates
		//Calculate pension

		if (convertedJoiningDate.endsWith("2015") && convertedTodaysDate.endsWith("2018")) {
			total = ((int) ((monthlySalary * 12) * 0.15));
		} else if (convertedJoiningDate.endsWith("2016") && convertedTodaysDate.endsWith("2018")) {
			total = ((int) ((monthlySalary * 12) * 0.10));
		} else if (convertedJoiningDate.endsWith("2017") && convertedTodaysDate.endsWith("2018")) {
			total = ((int) ((monthlySalary * 12) * 0.05));
		}
		System.out.println("Pension: " + total);
		return total;
	}


	@Override
	public int employeeId() {
		return employeeId;
	}

	@Override
	public String employeeName() {
		return name;
	}

	@Override
	public void assignDepartment() {
		Departments();

		Scanner input = new Scanner(System.in);
		System.out.println("\nEnter department name: ");
		String d = input.nextLine();

		dep = d;
		System.out.println(name + " has been assigned to " + d);

	}

	@Override
	public int calculateSalary() {
		int salary = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("Please insert your monthly salary here");
		double monthly = input.nextInt();
		this.monthlySalary = monthly;
		System.out.println("Employee: " + name + "\nMonthly salary: " + monthly + "\nAnnual salary: " + monthly * 12);

		return salary;

	}

	@Override
	public void benefitLayout() {

	}


	public void setEmployeeId(int id) {
		employeeId = id;
	}


	public void setName(String n) {
		name = n;
	}


	public void setSalary(double s) {
		monthlySalary = s;
	}

	public void setDepartment(String s){
		dep = s;
	}

	public double getSalary() {
		return monthlySalary;
	}


	public double hourlySalary() {
		double hourly;

		hourly = ((monthlySalary / 4) / 5) / 8;

		System.out.println("Hourly Salary: " + hourly);
		return hourly;
	}

	public double annualSalary() {
		double yearly;

		yearly = monthlySalary * 12;
		System.out.println("Annual Salary: " + yearly);
		return yearly;
	}


	@Override
	public String toString(){
		return "Employee ID: " + employeeId + "\nName: " + name + "\nDepartment: " + dep + "\nMonthly Salary: " + monthlySalary;
	}

	private static class DateConversion {

		public DateConversion(Months months) {
		}

		public static String convertDate(String date) {
			String[] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
}
