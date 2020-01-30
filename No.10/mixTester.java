public class mixTester{
	public static void main(String[] args){
		BookInfo[] a = {new MultilingualBook("Lewis Carroll", "Alice’s Adventures in Wonderland", "MacmillanPublishers", 1865, "英語", true, "高山宏", "不思議の国のアリス", "東京図書"),
		new BookInfo("夏目漱石", "坊ちゃん", "春陽堂", 1907), new MultilingualBook("Albert Camus", "L'Etranger", "Edications Galimard", 1942, "仏語", true, "窪田啓作", "異邦人", "新潮文庫")};
		for (int i = 0; i < a.length; i++){
			if (a[i] instanceof MultilingualBook){
				((MultilingualBook)a[i]).showBook();
			} else {
			a[i].showBook();
			}
		}
	}
}