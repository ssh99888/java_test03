package ch07.exam;

public class Book extends Product {
	private String title;
	private String author;
	
	public Book() {}
	public Book(int id, String comment, String productor, int price, String title, String author) {
		super(id, comment, productor, price);
		this.title = title;
		this.author = author;
	}
	
	public void display() {
		super.display();
		System.out.print(title+"\t"+author+"\t");
	}
}
