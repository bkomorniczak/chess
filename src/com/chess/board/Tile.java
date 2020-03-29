package com.chess.board;

import pieces.Piece;

public abstract class Tile {

    private int coordinates;
    boolean isOccupatied;

    public Tile(int coordinates, boolean isOccupatied) {
        this.coordinates = coordinates;
        this.isOccupatied = isOccupatied;
    }



    public boolean isOccupatied(){
        return this.isOccupatied;
    }

    public abstract Piece getPiece();


}
