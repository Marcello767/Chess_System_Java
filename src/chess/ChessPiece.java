package chess;

import boardgame.Board;
import boardgame.Piece;

public abstract class ChessPiece extends Piece {
	
	private Color color;

	public ChessPiece(Board boar, Color color) {
		super(boar);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}	

}
