package ch07;

class Book {
	private String title;
	private int page;
	private String author;
	
	public Book() {}
	public Book(String title, int page, String author) {
		this.title = title;
		this.page = page;
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void display() {
		System.out.print(title+" "+page+" "+author+" ");
	}
}

class Magazine extends Book {
	private String releaseDate;
	
	public Magazine() {}
	public Magazine(String title, int page, String author, String releaseDate) {
		super(title, page, author);
		this.releaseDate = releaseDate;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public void display() {
		super.display();
		System.out.println(releaseDate+" ");		
	}
}

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Magazine m = new Magazine("어린왕자",500,"생택쥐페리","1943.xx.xx");
		m.display();
		Book b1 = m;
		b1.display();
	}

}
