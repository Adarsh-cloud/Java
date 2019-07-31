package capgemini.generics;

import java.util.*;

class PreGenerics{
	private Object t;
	public Object get(){
		return t;
	}
	public void set(Object t){
		this.t=t;
	}
	public static void main(String args[]){
		PreGenerics type=new PreGenerics();
		type.set("pankaj");
		String str= (String)type.get();//type casting,error prone and can
		System.out.println(str);
		type.set(1);
		int num =(int) type.get();
		System.out.println(num);
	}
}
class GenericsType<T>{
	private T t;
	public T get(){
		return this.t;
	}
	public void set(T t){
		this.t=t;
	}
	public static void main(String[] args) {
		GenericsType type1=new GenericsType();//raw type
		type1.set("Pankaj");
		type1.set(10);
		GenericsType<String> type2=new GenericsType<>();
		type2.set("Pankaj");//valid and autoboxing support
 		String str =type2.get();//type casting not needed,no class cast Exception
 		System.out.println(str);
		//type2.set(10); //error ,not permitted in type string
	}
}
abstract  class Shape{
	abstract void draw();
}
class Rectangle extends Shape{
	void draw(){
		System.out.println("drawing rectangle...");
	}
}
class Circle extends Shape{
	void draw(){
		System.out.println("drawing circle......");
	}
}
class GenericsTest{
	//creating a method that accepts only child class of shape
	public static void drawShapes(List<? extends Shape> list){
		for(Shape shape:list){
			shape.draw();//calling method of shape class by child class instance
		}
	}
	public static void main(String[] args) {
		List<Rectangle> listRectangle=new ArrayList<Rectangle>();
		listRectangle.add(new Rectangle());
		
		List<Circle> listCircle=new ArrayList<Circle>();
		listCircle.add(new Circle());
		drawShapes(listRectangle);
		drawShapes(listCircle);
	}
}
public class Test_Generics {
	public static void main(String[] args) {
		GenericsTest.main(new String[0]);
	}

}
/*
 * Java Generic Type
 * E-Element (used extensively by the java Collections Framework, for example)
 * K-Key(used in map)
 * N-number
 * T-Type
 * V-value(used in map)
 * S,U,V ETC. - 2nd,3rd, 4th types*/