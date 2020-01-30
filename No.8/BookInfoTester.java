public class BookInfoTester{
	public static void main(String[] args){
		BookInfo a1 = new BookInfo("夏目漱石", "坊ちゃん", "春陽堂", 1907);
		BookInfo a2 = new BookInfo("森鴎外", "舞姫", "民友社", 1890);
		BookInfo a3 = new BookInfo("永井荷風", "あめりか物語", "博文館", 1908);
		BookInfo a4 = new BookInfo("村上瀧", "五分後の世界", "幻冬舎", 1994);
		BookInfo a5 = new BookInfo("村上春樹", "1Q84", "新潮社", 2004);
		a1.showBook();
		a2.showBook();
		a3.showBook();
		a4.showBook();
		a5.showBook();

	}
}