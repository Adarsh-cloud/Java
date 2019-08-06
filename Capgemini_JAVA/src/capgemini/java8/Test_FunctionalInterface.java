package capgemini.java8;

@FunctionalInterface
interface Hello {
	void sayHello();
	// void sayHi();
}

// Before JDK8
/*
 * class HelloImpl implements Hello {
 * 
 * @Override public void sayHello() {
 * System.out.println("HelloImpl->hello...."); } }
 */

public class Test_FunctionalInterface {
	public static void main(String[] args) {
		// Before JDK8
		/*
		 * Hello hello = new HelloImpl(); hello.sayHello();
		 */

		// anonymous class implementation
		/*
		 * new Hello() {
		 * 
		 * @Override public void sayHello() {
		 * System.out.println("Hello anonymous Impl"); } }.sayHello();
		 * 
		 * Hello hello1=new Hello(){
		 * 
		 * @Override public void sayHello() {
		 * System.out.println("Hello1 hi Impl"); } };
		 * 
		 * Hello hello2 = new Hello(){
		 * 
		 * @Override public void sayHello() {
		 * System.out.println("Anonymous hihello"); } }; hello1.sayHello();
		 * hello2.sayHello();
		 */

		// Lambda Expression..

		// type Inference->one method,no input, void return
		Hello hello3 = () -> System.out.println("Lambda->Hi..");
		Hello hello4 = () -> System.out.println("Lambda->Hello");
		Hello hello5 = () -> System.out.println("Lambda->hiHello");
		hello3.sayHello();
		hello4.sayHello();
		hello5.sayHello();
	}
}
