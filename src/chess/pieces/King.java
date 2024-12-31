package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

	public King(Board boar, Color color) {
		super(boar, color);
	}

	@Override
	public String toString() {
		return "K";
	}
	
}
