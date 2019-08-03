import java.io.FileWriter;
import java.io.IOException;

public class Delete {
	public static void main(String[] args) {
		try {
			FileWriter clear =new FileWriter("c:\\Users\\shakthk\\Desktop\\capgemini\\target.txt");
			clear.write("");
			clear.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
