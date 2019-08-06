package capgemini.java8;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Builtin_Functionalinterface_Test {
public static void main(String[] args) {
	Consumer<String>consumer=(String str)->System.out.println(str);
	consumer.accept("Consumer.accept()");
	
	Supplier<String>supplier=()->"Supplier.get():";
	System.out.println(supplier.get());
	
	Predicate<Integer> predicate =(num)->num%2==0;
	System.out.println("Predicate Test():"+predicate.test(10));
	
	BiFunction<Integer, Integer, Integer>maxfunction=(x,y)->x>y?x:y;
	System.out.println("BiFunction.apply(): "+maxfunction.apply(10, 20));
}
}
