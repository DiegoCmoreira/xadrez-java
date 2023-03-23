package xadrez.pecas;

import tabuleiro.Board;
import xadrez.ChessPiece;
import xadrez.Color;

public class King extends ChessPiece{

	public King(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "K";
	}
}
