package capgemini.collection;

import java.util.HashSet;
import java.util.Iterator;

public class _Set {
	public static void main(String[] args) {
		HashSet<String> hashset=new HashSet<String>();
		System.out.println("Size: "+hashset.size()+"\t"+hashset);
		hashset.add("Jan");
		hashset.add("Jan");//no duplicates are allowed
		hashset.add("Feb");//order is not maintained
		hashset.add("Mar");
		hashset.add(null);
		hashset.add(null);//not more is one null is allowed
		hashset.add("Apr");
		System.out.println("Size: "+hashset.size()+"\t"+hashset);
		
		hashset.remove("Mar");
		System.out.println("Size: "+hashset.size()+"\t"+hashset);
		
		Iterator<String> iterator = hashset.iterator();
		System.out.println("**Iterator*****");
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		//enhanced for loop
		System.out.println("**Enhanced for loop");
		for(Object value:hashset){
			System.out.println(value);
		}
	}

}
