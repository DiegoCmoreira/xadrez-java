package xadrez;

import tabuleiro.Board;
import tabuleiro.Position;
import xadrez.pecas.King;
import xadrez.pecas.Rook;

public class ChessMatch {
		
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int i = 0; i<board.getRows(); i++) {
			for(int j = 0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	private void initialSetup () {
		board.placPieces(new Rook(board, Color.WHITE), new Position(2, 1));
		board.placPieces(new King(board, Color.WHITE), new Position(0, 4));
		board.placPieces(new King(board, Color.BLACK), new Position(7, 5));
	}
}
