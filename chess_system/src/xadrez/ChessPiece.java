package xadrez;

import tabuleiro.Board;
import tabuleiro.Piece;
import tabuleiro.Position;

public abstract class ChessPiece extends Piece{

	private Color color;
	private int moveCount;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	public int getMoveCount() {
		return moveCount;
	}
	
	public void increseMoveCount() {
		moveCount++;
	}
	
	public void decreseMoveCount() {
		moveCount--;
	}
	
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPostion(position);
	}
	
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
	}
}
