package capgemini.exception;

public class MyException {
	static int div1(int no1,int no2){
		if(no2<=0)
			try {
				throw new Exception("no2 has a value: "+no2);
			} catch (Exception e) {
				System.err.println("cannot divide by 0...."+e.getMessage());
				//e.printStackTrace();
			}
		return no1/no2;
	}
	static int div2(int no1, int no2) throws Exception{
		if (no2<=0) throw new Exception("no2 has a value: "+no2);
		return no1/no2;
	}
	static int div3(int no1, int no2) throws DivisionException{
		if (no2<=0) throw new DivisionException("no2 has a value: "+no2);
		return no1/no2;
	}
	public static void main(String[] args) {
		System.out.println("started...");

		if (args.length < 2) {
			System.out.println("Please provide 2 arguments....");
			System.exit(0);
		}
		int no1, no2, result;
		no1 = no2 = result = 0;
		try {
			no1 = Integer.parseInt(args[0]);
			no2 = Integer.parseInt(args[1]);
			result = div3(no1 , no2);
			System.out.println("Result: " + result);
		} catch (NumberFormatException ex) {
			System.err.println("Please provide 2 numeric argument...");
			ex.printStackTrace();
		} catch (ArithmeticException ex) {
			System.err.println("Please provide second non 0 numeric argument");
		} 
		catch(Exception e){
			System.err.println("Exception occured in div2..."+e.getMessage());
		}
		finally {
			System.out.println("i can run anywhere......");
		}
		
		System.out.println("end..");
		//unhandled exception type FileNotFoundException
		//FileInputStream fileInput = new FileInputStream("D:\\Readme.txt");
	}
}
