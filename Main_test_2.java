package capgemin_LabBook_Lab2;

public class Main_test_2 {

	public static void main(String[] args) {
		Book b1 = new Book();
		b1 = new Book(11, "happy", 2, "ram");
		b1.print();
		JournalPaper j1 = new JournalPaper(11, "happy", 2, "ram");
		j1.print();
		Video v1 = new Video();
		v1 = new Video(14, "hii", 5, 10, "Anurag khashyap", "Comedy", 2009);
		v1.print();
		CD c1 = new CD(14, "heyyyi", 5, 10, "Anurag khashyap", "Comedy");
		c1.print();
	}

}
