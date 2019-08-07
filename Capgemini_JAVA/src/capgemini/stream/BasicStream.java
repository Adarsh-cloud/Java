package capgemini.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
//import java.util.function.Predicate;
import java.util.stream.Stream;

public class BasicStream {

	public static void main(String[] args) {
		Integer[]num=new Integer[10];
		for(int i=0;i<num.length;i++)
		num[i] = (int) (Math.random()*100);
		//System.out.println(Arrays.toString(num));
		//obtaining a stream
		//Stream<Integer>stream0=Arrays.stream(num);
		
		//consumer->lambda expression
		//stream0.forEach((numb)->System.out.println(numb));
		
		//consumer->method reference
		//stream0.forEach(System.out::println);
		
		Integer[]nums=new Integer[]{1,2,3,1,5,2,5,3,4,8};
		Stream<Integer>stream1=Arrays.stream(nums);
		
		//print distinct(Unique) numbers of the array
		//stream1.distinct().forEach(System.out::println);
		
		//print first distinct(Unique) numbers of the array
		//stream1.distinct().limit(3).forEach(System.out::println);
		
		//print even numbers in the set
		//stream1.filter((value)->value%2==0).forEach(System.out::println);
		
		//print odd numbers only
		//Predicate<Integer> oddPredicate=(value)->value%2!=0;
		//stream1.filter(oddPredicate).forEach(System.out::println);
		
		//print min
		//stream1.sorted().limit(1).forEach(System.out::println);
		
		//print max
		Comparator<Integer>comp=(num1,num2)->num1>num2?1:num2>num1?-1:0;
		Optional<Integer> optionalmax = stream1.max(comp);
		System.out.println(optionalmax.get());
	}
}
