package com.chess.board;

import pieces.Piece;

public abstract class Tile {

    protected final int coordinates;
    boolean isOccupatied;

    public Tile(final int coordinates, final boolean isOccupatied) {
        this.coordinates = coordinates;
        this.isOccupatied = isOccupatied;
    }



    public boolean isOccupatied(){
        return this.isOccupatied;
    }

    public abstract Piece getPiece();


}
