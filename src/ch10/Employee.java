package ch10;

public class Employee {
	private int eno;
	private String name;
	private String dept;
	private int sal;
	
	public Employee() {}
	public Employee(int eno, String name, String dept, int sal) {
		super();
		this.eno = eno;
		this.name = name;
		this.dept = dept;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return eno + " " + name + " " + dept + " " + sal;
	}
	
}
