package com.chess.board;

import pieces.Piece;

public final class OccupiedTile extends Tile {
   private static Piece pieceOnTile;

    public OccupiedTile(final int coordinates, final boolean isOccupied, final Piece pieceOnTile ){
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
