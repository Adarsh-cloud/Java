package capgemini.lang;

public class Simplestring {

	public static void main(String[] args) {
		String s1="Java";
		String s2="Java";
		String s3="Java";
		
		//char[] value =new char[] {'j','a','v','a'};
		//String s4=new String(value);
		//String s5=new String(s4);
		if(s1==s2){
			System.out.println("s1==s2");
		}
		if(s1!=s3){
			System.out.println("s1!=s3");
		}
		System.out.println("s1 equals s3 "+s1.equals(s3));
		System.out.println("s");
		System.out.println("Charater at position 2 is: "+s1.charAt(2));
		System.out.println("Concatination of string is "+s1.concat("JDK8"));
		System.out.println("Whether the string ends with the suffix: "+s1.endsWith("a"));
		System.out.println("The bytes in the strings: "+s1.getBytes());
		System.out.println(s1.indexOf('v'));
		System.out.println(s1.indexOf("a"));
		System.out.println(s1.isEmpty());
		System.out.println(s1.length());
		System.out.println(s1.split("a"));
		System.out.println(s1.startsWith("J"));
		System.out.println(s1.substring(1));
		System.out.println(s1.substring(0,2));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.trim());

	}

}
