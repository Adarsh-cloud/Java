package capgemini.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

	public static void main(String[] args) {
		//3 ways of representation of pattern and matcher regex
		Pattern p= Pattern.compile(".s");// . represents single character 
		Matcher m= p.matcher("as");
		boolean b=m.matches();
		
		boolean b2= Pattern.compile(".s").matcher("as").matches();
		
	   //efficient way
		boolean b3=Pattern.matches(".s", "as");
		System.out.println(b+","+b2+","+b3);
		
		//Regex characters
		System.out.println(Pattern.matches("[amn]", "abcd"));//false because its not only in a,m or n
		System.out.println(Pattern.matches("[amn]", "a"));//true
		System.out.println(Pattern.matches("[amn]", "ammam"));//false because a and m appears more than one time
		System.out.println(Pattern.matches("[a-zA-Z] ","abcd" ));//true 
		System.out.println(Pattern.matches("[a-zA-Z] ","abaabc" ));
		//Using quantifier
		System.out.println(Pattern.matches("[amn]+", "a"));//+ can be used to match occurrence more than one time
		System.out.println(Pattern.matches("[amn]+", "ammama"));
		System.out.println(Pattern.matches("[a-zA-Z]*","abcd" ));//* used for zero or more occurrences
		System.out.println(Pattern.matches("[a-zA-Z]{6} ","abcd" ));//{} is used to represent the number of characters allowed in the string
		
		//meta characters...
		System.out.println(Pattern.matches("\\d", "1"));
		
		}
}
