package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {

		/* Testing a match and Board printing*/
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
		
	}

}
