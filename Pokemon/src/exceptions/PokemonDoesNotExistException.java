package exceptions;

public class PokemonDoesNotExistException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public PokemonDoesNotExistException(String pokemon){
		super(pokemon);
	}
	
	public PokemonDoesNotExistException() {
		
	}

	public String getMessage() {
		return "This Pokemon does not exist.";
	}

}
