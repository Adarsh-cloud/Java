package capgemini.interfaces;

import java.util.Stack;

interface IStack{
	void push(String name);
	String pop();
}
class IStackImpl implements IStack{
	Stack<String> s=new Stack<String>();
	public void push(String name){
		s.push(name);
	}
		
	public String pop()
	{
		return s.pop();
	}
}
public class Istack_Test {

	public static void main(String[] args) {
		IStackImpl istack = new IStackImpl();
		istack.push("hello");
		System.out.println(istack.pop());

	}

}
