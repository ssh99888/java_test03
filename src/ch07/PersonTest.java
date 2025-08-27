package ch07;

class Person {
	private String name;
	private String addr;
	private String tel;
	
	public Person() {}
	public Person(String name, String addr, String tel) {
		this.name = name;
		this.addr = addr;
		this.tel = tel;
	}
	public String getName(String name) {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr(String addr) {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public void display() {
		System.out.println(name+" "+addr+" "+tel);
	}
}

class Customer extends Person {
	private int cno;
	private int mileage;
	
	public Customer() {}
	public Customer(int cno, int mileage, String name, String addr, String tel) {
		super(name, addr, tel);
		this.cno = cno;
		this.mileage = mileage;
	}
	public void cusDisplay() {
		System.out.print(cno+" "+mileage+" ");
		display();
	}
}

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer(1,100,"Hong","Busan","010-1234-5678");
		c.cusDisplay();
		
		Person p = c;
		p.display();
	
		Customer c3 = (Customer)p; 
		c3.cusDisplay();

	}

}
