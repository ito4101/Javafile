class BookInfo{
	protected String author;
	protected String title;
	protected String publisher;
	protected int pYear;

	BookInfo(){}

	BookInfo(String author, String title, String publisher, int pYear){
		this.author = author;
		this.title = title;
		this.publisher = publisher;
		this.pYear = pYear;
	}

	void setAuthor(String author){
		this.author = author;
	}

	void setTitle(String title){
		this.title = title;
	}

	void setPublisher(String publisher){
		this.publisher = publisher;
	}

	void setPYear(int pYear){
		this.pYear = pYear;
	}

	String getAuthor(){
		return author;
	}

	String getTitle(){
		return title;
	}

	String getPublisher(){
		return publisher;
	}

	int getPYear(){
		return pYear;
	}

	void showBook(){
		System.out.println("著者名: " + author);
		System.out.println("題名: " + title);
		System.out.println("出版社: " + publisher);
		System.out.println("出版年: " + pYear);
	}
}

class MultilingualBook extends BookInfo {
	private String language;
	private boolean trans = false;
	private String translater;
	private String transBook;
	private String transPub;

	MultilingualBook(){}

	MultilingualBook(String author, String title, String publisher, int pYear, String language, boolean trans, String translater, String transBook, String transPub){
		super(author, title, publisher, pYear);
		this.language = language;
		if (trans){
			this.trans = trans;
			this.translater = translater;
			this.transBook = transBook;
			this.transPub = transPub;
		}
	}

	void setlanguage(String language){
		this.language = language;
	}

	void settrans(boolean trans){
		this.trans = trans;
	}

	void settranslater(String translater){
		this.translater = translater;
	}

	void settransBook(String transBook){
		this.transBook = transBook;
	}

	void settransPub(String transPub){
		this.transPub = transPub;
	}
	String getlanguage(){
		return language;
	}

	boolean gettrans(){
		return trans;
	}

	String gettranslater(){
		return translater;
	}

	String gettransBook(){
		return transBook;
	}

	String gettransPub(){
		return transPub;
	}

	void showBook(){
		super.showBook();
		System.out.println("言語: " + language);
		System.out.println("訳書の有無: " + trans);
		System.out.println("訳者名: " + translater);
		System.out.println("訳書名: " + transBook);
		System.out.println("訳書出版社: " + transPub);
	}

}