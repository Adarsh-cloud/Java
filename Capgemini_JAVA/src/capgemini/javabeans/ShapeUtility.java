package capgemini.javabeans;

public class ShapeUtility {
	//no instance field....
	//no instance methods...
	//ALL static fields only...
	//ALL static methods only...
	public static Rectangle whoisBiggertwo(Rectangle rectOne, Rectangle rectTwo)
	{
		if(rectOne.getLength()<rectTwo.getLength())
		{
			return rectTwo;
		}
		else{
			return rectOne;
		}
	}
}
