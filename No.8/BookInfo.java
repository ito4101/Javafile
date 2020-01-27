public class BookInfo{
	protected String author;
	protected String title;
	protected String publisher;
	protected int pYear;

	public BookInfo(String author, String title, String publisher, int pYear){
		this.author = author;
		this.title = title;
		this.publisher = publisher;
		this.pYear = pYear;
	}

	public void setAuthor(String author){
		this.author = author;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public void setPublisher(String publisher){
		this.publisher = publisher;
	}

	public void setPYear(int pYear){
		this.pYear = pYear;
	}

	public String getAuthor(){
		return author;
	}

	public String getTitle(){
		return title;
	}

	public String getPublisher(){
		return publisher;
	}

	public int getPYear(){
		return pYear;
	}

	public void showBook(){
		System.out.println("著者名: " + author);
		System.out.println("題名: " + title);
		System.out.println("出版社: " + publisher);
		System.out.println("出版年: " + pYear);
	}
}