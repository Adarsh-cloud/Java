package assignment9;

import java.util.*;

public class Exercise2 {
	public static Map<Character, Integer>countCharacter(char[] Input){
		Map<Character,Integer> counterMap = new HashMap<Character,Integer>();
        for(char current : Input){
            if(!counterMap.containsKey(current)){
                counterMap.put(current, 1);
            }
            else{
                counterMap.put(current, counterMap.get(current)+1);
            }
        }
        
        return counterMap;
	}
	 public static void main(String args[] ) throws Exception {
	        Scanner scan=new Scanner(System.in);
			String Input = scan.next();
			HashMap<Character, Integer>hash=new HashMap<Character, Integer>();
			hash.putAll(countCharacter(Input.toCharArray()));
			System.out.println(hash);
			scan.close();
	        
	    }

}
