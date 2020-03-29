package com.chess.board;


import pieces.Piece;

import java.util.HashMap;
import java.util.Map;

public  final class EmptyTile extends Tile{

    private EmptyTile(int coordinates, boolean isOccupied) {
        super(coordinates, false);
    }


    @Override
    public Piece getPiece() {
        return null;
    }

    public boolean isOccupied(){
        return false;
    }

}
