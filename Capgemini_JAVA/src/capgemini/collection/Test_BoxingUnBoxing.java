package capgemini.collection;

public class Test_BoxingUnBoxing {
	public static void main(String[] args) {
		int intVal = 14;
		// Integer iReference=new Integer(10);//Before java 5 , Explicit
		// Boxing
		Integer iReference = intVal;//AutoBoxing
		System.out.println("Boxing of object"+iReference);
		int intValue = iReference.intValue();
		//object type is converted and assigned to a primitive type
		iReference=Integer.valueOf(intValue);
		intValue=iReference;//in java 5
		System.out.println(intValue);
	}
}
