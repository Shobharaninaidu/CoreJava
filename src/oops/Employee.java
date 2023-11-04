package oops;

public class Employee {
	public String Name;
	public int EmpId;
	private int Salary;

	public void Display() {
		System.out.println("Name of the Employee is " + Name);
		System.out.println("Id of the Employee is " + EmpId);
		System.out.println("Salary of the Employee is " + Salary);
	}

	public void SetSalary(int sal) {
		Salary = sal;
	}

	public Employee() {
		System.out.println("Inside Default Cons");
	}

	public Employee(String Name1, int EmpId1, int Salary1) {
		System.out.println("Inside Parameterised const");
		this.Name = Name1;
		this.EmpId = EmpId1;
		this.Salary = Salary1;
	}

}
