package capgemini.stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class My_Stream {

	public static void main(String[] args) {
		//generate an int array of 10
		//fill it with random numbers between 0-100
		//print it
		int[]num=new int[10];
		for(int i=0;i<num.length;i++)
		num[i] = (int) (Math.random()*100);
		System.out.println(Arrays.toString(num));
		
		/*Consumer<Integer>number =System.out::println;
		for(int i=0;i<num.length;i++){
			number.accept(num[i]);
		}*/
		
		IntConsumer number=System.out::print;
		Consumer<String>space=System.out::print;
		for(int i=0;i<num.length;i++){
			number.accept(num[i]);
			space.accept(" ");
		}
	}

}
