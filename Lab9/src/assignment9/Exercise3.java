package assignment9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Exercise3 {
	public static Map<Integer, Integer> getSquares(int[] key){
		HashMap<Integer, Integer> hashMap=new HashMap<Integer, Integer>();
		for(int i=0;i<key.length;i++){
		hashMap.put(key[i],key[i]*key[i]);
		}
		return hashMap;
		
	}
	public static void main(String[] args) {
		int[] key=new int[5];
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the values:");
		for(int i=0;i<5;i++){
			key[i]=scan.nextInt();
		}
		HashMap<Integer, Integer> hashMap =new HashMap<Integer, Integer>();
		hashMap.putAll(getSquares(key));
		Iterator<Integer>itr=hashMap.keySet().iterator();
		while(itr.hasNext()){
			Integer k=itr.next();
			System.out.println(k+":"+hashMap.get(k));
		}
		scan.close();
	}
}
