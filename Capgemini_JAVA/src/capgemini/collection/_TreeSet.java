package capgemini.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class _TreeSet {
	public static void main(String[] args) {
		TreeSet<String> treeset = new TreeSet<String>();
		System.out.println("Size: " + treeset.size() + "\t" + treeset);
		//treeset.add(null);// no null can be used...NullPointerException...
		treeset.add("A");
		treeset.add("A");//duplicate cannot be used....
		treeset.add("C");
		treeset.add("B");//sorts values on insertion..
		System.out.println("Size: " + treeset.size() + "\t" + treeset);

		Iterator<String> iterator = treeset.iterator();
		System.out.println("Printing in ascending order....");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("Printing in descending order....");
		Iterator<String> descendingiterator = treeset.descendingIterator();
		while (descendingiterator.hasNext()) {
			System.out.println(descendingiterator.next());
		}
	}
}
