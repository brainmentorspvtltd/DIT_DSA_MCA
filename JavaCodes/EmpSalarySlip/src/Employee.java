//Encapsulation
//- wrapping of data members and methods in a single unit known as class
//Good Encapsulation - Encapsulation + Data Hiding
//Data Hiding - Private members and public methods

// Every java class internally inherit Object class
public class Employee extends Object {
	//Instance Variables
	private int empId;
	private String empName;
	private String empDept;
	private double salary;
	private String companyName;
	
	// Default Constructor
	// - it is called when we create object of class
	// - every java class has a by default constructor
	// - constructor is not a method so it don't have any return type
	// - to initialize variables
	public Employee() {
		System.out.println("Default Const...");
		this.companyName = "Brain Mentors";
	}
	
	public Employee(String empDept) {
		this();		// it will call default constructor
		System.out.println("Department Const...");
		this.empDept = empDept;
	}
	
	// Param Constructor
	public Employee(int empId, String empName, double salary) {
		// Constructor Chaining
		this("IT");		// it will call department constructor
		System.out.println("Param Const...");
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	// Getter and Setter
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCompanyName() {
		return companyName;
	}
	
	// Earnings
	public double getHRA() {
		return this.salary * 0.30;
	}
	public double getTA() {
		return this.salary * 0.15;
	}
	public double getDA() {
		return this.salary * 0.20;
	}
	public double getMA() {
		return this.salary * 0.10;
	}
	
	// Deductions
	public double getTDS() {
		return this.salary * 0.10;
	}
	public double getPF() {
		return this.salary * 0.05;
	}
	
	public double netSalary() {
		double earnings = this.salary + getHRA() + getDA() + getMA() + getTA();
		double deductions = getPF() + getTDS();
		this.salary = earnings - deductions;
		return salary;
	}
	
	@Override
	public String toString() {
		// create object of commonutils
		// call formatName and formatDate
		return "Emp Name : " + empName + "\n" + 
				"Emp Dept : " + empDept + "\n" +
				"Emp Salary : " + netSalary() ;
	}
	
}
