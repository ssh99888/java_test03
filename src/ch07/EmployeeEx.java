package ch07;

class Employee {
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
		return "Employee [eno=" + eno + ", name=" + name + ", dept=" + dept + ", sal=" + sal + "]";
	}
	
}

public class EmployeeEx {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"홍길동","영업",500);
		System.out.println(e1.toString());
		System.out.println(e1);
	}

}
