public class BookTester{
	public static void main(String[] args){
		MultilingualBook a1 = new MultilingualBook("Victor Hugo", "Les Miserables", "A.laroix,Verboeck-hoven&Ce.", 1862, "仏語", true, "豊島与志雄", "レ・ミゼラブル", "岩波出版");
		MultilingualBook a2 = new MultilingualBook("Lewis Carroll", "Alice’s Adventures in Wonderland", "MacmillanPublishers", 1865, "英語", true, "高山宏", "不思議の国のアリス", "東京図書");
		MultilingualBook a3 = new MultilingualBook("Albert Camus", "L'Etranger", "Edications Galimard", 1942, "仏語", true, "窪田啓作", "異邦人", "新潮文庫");
		MultilingualBook a4 = new MultilingualBook("J.D.Salinger", "The Catcher in the Rye", "Little, Brown and Company", 1951, "英語", true, "野崎孝", "ライ麦畑で捕まえて", "白水社");
		MultilingualBook a5 = new MultilingualBook("Antoine de SaintExupery ", "Le Petit Prince", "Reynal and Hitchcock", 1943, "仏語", true, "内藤濯", "星の王子さま", "岩波書店");
		a1.showBook();
		a2.showBook();
		a3.showBook();
		a4.showBook();
		a5.showBook();

	}
}