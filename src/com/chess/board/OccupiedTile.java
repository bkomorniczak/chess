package com.chess.board;

import pieces.Piece;

public class OccupiedTile extends Tile {
   private Piece pieceOnTile;

    OccupiedTile(int coordinates, boolean isOccupied, Piece pieceOnTile ){
        super(coordinates,true);
        this.pieceOnTile = pieceOnTile;
    }

    @Override
    public Piece getPiece() {
        return pieceOnTile;
    }

  public boolean isOccupied(){
        return true;
  }
}
