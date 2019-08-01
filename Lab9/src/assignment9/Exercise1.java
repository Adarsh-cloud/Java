package assignment9;

import java.util.*;

public class Exercise1 {
	public static List<Integer> getValues(HashMap<Integer, Integer> hash) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= hash.size(); i++) {
			list.add(hash.get(i));
		}
		Collections.sort(list);
		return list;
	}

	public static void main(String[] args) {
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number: ");
		for(int i=1;i<=5;i++){
			hash.put(i,scan.nextInt());			
		}
		List<Integer> list = new ArrayList<Integer>();
		list = getValues(hash);
		System.out.println(list);
		scan.close();
	}
}
