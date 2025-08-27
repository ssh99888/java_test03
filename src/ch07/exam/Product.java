package ch07.exam;

public class Product {
	private int id;
	private String comment;
	private String productor;
	private int price;
	
	public Product() {}
	public Product(int id, String comment, String productor, int price) {
		this.id = id;
		this.comment = comment;
		this.productor = productor;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	
	public void display() {
		System.out.print(id+"\t"+comment+"\t"+productor+"\t"+price+"\t");
	}
}
