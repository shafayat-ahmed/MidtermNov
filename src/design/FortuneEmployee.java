package design;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {
		EmployeeInfo e1 = new EmployeeInfo();
		e1.setEmployeeId(1);
		e1.setName("Bob Ross");
		e1.setSalary(4000);
		e1.setDepartment("A");

		System.out.println("---------Employee e1----------\n"+e1.toString());
		e1.calculateEmployeeBonus(3);

		e1.calculateEmployeePension();
		System.out.println("------------------------------");



		EmployeeInfo e2 = new EmployeeInfo("John Doe", 2, 6000, "C");
		System.out.println("---------Employee e2----------\n"+e2.toString());
		e1.hourlySalary();
		e1.annualSalary();
		System.out.println("------------------------------");

		EmployeeInfo e3 = new EmployeeInfo("Jimmy S", 3);
		System.out.println("---------Employee e3----------\n"+e2.toString());
		e3.calculateSalary();
		e3.calculateEmployeeBonus(1);
		System.out.println("------------------------------");

	}

}
