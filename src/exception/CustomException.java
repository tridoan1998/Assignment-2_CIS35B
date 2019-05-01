package exception;
//RuntimeException: In Java, there are two types of exceptions: checked exceptions and un-checked 
//exceptions.A checked exception must be handled explicitly by the code, whereas, an un-checked
//exception does not need to be explicitly handled.
/*
For checked exceptions, you either have to put a try/catch block around the code that could 
potentially throw the exception, or add a "throws" clause to the method, to indicate that the 
method might throw this type of exception (which must be handled in the calling class or above).
 */
public class CustomException extends Exception {
	public static final long serialVersionUID = 42L;
	private int errornum;
	private String message;
	
	public CustomException(int error_code, String message)
	{
		super();
		this.errornum = error_code;
		this.message = message;
		printmyproblem();
	}
	
	public String printmyproblem()
	{
		Fix1to100 FixFile = new Fix1to100();

		switch(errornum)
		{
			case 1:
				return FixFile.fixerror1();
			case 2:
				System.out.println(message);
				return "";
			case 3:
				System.out.println(message);
				return "";
			case 4:
				System.out.println(message);
				return "";
			case 5:
				String newfilename = FixFile.fixfilename();
				return newfilename;
			case 6:
				System.out.println(message);
				return "";
			default:
				return "";
		}
	}
}