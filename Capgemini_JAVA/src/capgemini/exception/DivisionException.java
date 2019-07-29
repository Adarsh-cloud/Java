package capgemini.exception;

public class DivisionException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public DivisionException(String message){
		super(message);
	}
	@Override
	public String getMessage(){
	   return super.getMessage()+"Cannot divide by zero value...";
   }
}
