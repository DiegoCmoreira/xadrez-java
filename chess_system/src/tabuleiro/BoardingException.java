package tabuleiro;

public class BoardingException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public BoardingException(String msg) {
		super(msg);
	}
}
