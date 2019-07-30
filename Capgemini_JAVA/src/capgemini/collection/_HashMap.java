package capgemini.collection;

import java.util.HashMap;
import java.util.Iterator;

public class _HashMap {

	public static void main(String[] args) {
		HashMap<Integer,String>hashmap=new HashMap<Integer,String>();
		System.out.println("Size: " + hashmap.size() + "\t" + hashmap);

		hashmap.put(null,"");
		hashmap.put(null, null);//allows only one null key
		hashmap.put(0,null);   //allows many null values
		hashmap.put(1, "Mon"); //duplicate keys are not allowed,if so, the last key is considered
		hashmap.put(1,"Jan");
		hashmap.put(2,"Feb");
		hashmap.put(3, "Mar");
		System.out.println("Size: " + hashmap.size() + "\t" + hashmap);
		//hashmap.iterator();//it don't get iterator directly.....
		Iterator<Integer> iterator = hashmap.keySet().iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		System.out.println("Printing values....");
		Iterator<String>iter=hashmap.values().iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
		System.out.println("Printing key:values...");
		Iterator<Integer>itr=hashmap.keySet().iterator();
		while(itr.hasNext()){
			Integer key=itr.next();
			System.out.println(key+":"+hashmap.get(key));
		}
	}
}
