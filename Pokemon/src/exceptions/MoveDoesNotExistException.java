package exceptions;

public class MoveDoesNotExistException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MoveDoesNotExistException(String move){
		super(move);
	}
	
	public MoveDoesNotExistException() {
		
	}

	public String getMessage() {
		return "This move does not exist.";
	}
}
