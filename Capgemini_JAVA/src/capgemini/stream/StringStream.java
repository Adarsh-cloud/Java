package capgemini.stream;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class StringStream {

	public static void main(String[] args) {
		String st="This is University";
		String[] str=st.split("");
		System.out.println(Arrays.toString(str));
		Predicate<String> predicate = (c) ->Pattern.matches("[aeiouAEIOU]+",c);
		Arrays.stream(str).filter(predicate).forEach(System.out::println);
	}

}
