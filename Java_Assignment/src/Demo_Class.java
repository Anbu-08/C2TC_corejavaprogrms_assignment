

import com.anbu.assignment.employee.*;
import com.anbu.assignment.utilites.*;



public class Demo_Class {

	public static void main(String[] args) {
		// Manager Instance 
		
		Manager m = new Manager();
		m.setEmployeeId(101);
		m.setName("Adithiyaa");
		m.setSalary(80000);
		
		m.setTeams("Team Alpha");
		m.setManagerId(01);
		m.setDept("AIML");
		
		
		//Developer Instance
		
		 Developer d = new Developer();
	        d.setEmployeeId(102);         // From Employee class
	        d.setName("Selva");
	        d.setSalary(60000);

	        // Developer-specific fields
	        d.setDeveloperId(301);
	        d.setProjectId("PRJ-501");
	        d.setSecuritykey(9999);

	        // Using utilities to print and modify
	        EmployeeUtilites.printEmployeeInfo(m);
	        EmployeeUtilites.provideBonus(m, 10);

	        System.out.println("-------------------------");

	        EmployeeUtilites.printEmployeeInfo(d);
	        EmployeeUtilites.provideBonus(d, 15);

	        // You can also call their own display methods:
	        System.out.println("\nManager Full Info:");
	        m.displayManagerInfo();

	        System.out.println("\nDeveloper Full Info:");
	        d.displayManagerInfo();

	}

}
