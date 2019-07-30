package capgemini.collection;

import java.util.*;

public class Array_List {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(3);
		//LinkedList<String>list= new LinkedList<String>();//three of them produces the same effect....
		//Vector<String>list=new Vector<String>();
		System.out.println("Size: " + list.size() + "\t" + list);
		list.add("Sun");
		//list.add(null);//Multiple nulls are allowed...

		list.add("Mon");
		list.add("Wed");
		System.out.println("Size: " + list.size() + "\t" + list);
		// array based on index....
		list.add(2, "Tues");
		System.out.println("Size: " + list.size() + "\t" + list);

		list.add("Thurs");
		list.add("Free");
		list.add("Sat");
		list.add("soon");
		System.out.println("Size: " + list.size() + "\t" + list);
		int index=list.indexOf("Free");

		if (list.contains("Free")||index!=-1)//both the expression performs the same task
			list.set(list.indexOf("Free"), "Fri");// modify value
		if (list.contains("soon")) {
			list.remove("soon");
		}
		System.out.println("Size: " + list.size() + "\t" + list);
		for(Object obj:list){
				System.out.print(obj);
				if(list.lastIndexOf(obj)!=list.size()-1)
					System.out.print(",");
			}
		ListIterator<String> listIterator=list.listIterator();
		while(listIterator.hasNext()){
			System.out.println(listIterator.next());
		}
		while(listIterator.hasPrevious()){
			System.out.println(listIterator.previous());
		}
	}
}
