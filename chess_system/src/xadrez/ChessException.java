package xadrez;

import tabuleiro.BoardingException;

public class ChessException extends BoardingException{

	private static final long serialVersionUID = 1L;

	public ChessException(String msg) {
		super(msg);
	}
}
