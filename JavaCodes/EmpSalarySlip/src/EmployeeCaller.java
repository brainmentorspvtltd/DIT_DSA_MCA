import java.util.Scanner;

public class EmployeeCaller {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		MessageReader msg = new MessageReader();
		//System.out.println("Enter Emp ID : ");
		System.out.println(msg.getMessages("input.id"));
		int empId = scanner.nextInt();
		
		scanner.nextLine();
		//System.out.println("Enter Emp Name : ");
		System.out.println(msg.getMessages("input.name"));
		String name = scanner.nextLine();
		
		//System.out.println("Enter Emp Salary : ");
		System.out.println(msg.getMessages("input.salary"));
		double salary = scanner.nextDouble();
		
		// Default Const...
		//Employee emp = new Employee();
		
		// Param
		Employee emp = new Employee(empId, name, salary);
//		System.out.println("Company : " + emp.getCompanyName());
//		System.out.println("Emp ID : " + emp.getEmpId());
//		System.out.println("Emp Name : " + emp.getEmpName());
//		System.out.println("Emp Department : " + emp.getEmpDept());
//		System.out.println("Emp Salary : " + emp.netSalary());
		// will print hashcode
		// hashcode - string representation of object
		//System.out.println(emp);
		System.out.println(emp.toString());
		// toString - convert object into string representation
		// it's a pre-defined method inside Object class
		// Object class is the parent of all Java classes
		
		scanner.close();
	}
}
