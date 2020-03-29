package com.chess.board;


import pieces.Piece;

import java.util.HashMap;
import java.util.Map;

public  final class EmptyTile extends Tile{

    private EmptyTile(int coordinates, boolean isOccupied) {
        super(coordinates, false);
    }
    public static Tile createTile(final int coordinates, final Piece piece){
        return piece != null ? new OccupiedTile(coordinates, true, piece) : EMPTY_TILE_MAP.get(coordinates);
    }

    @Override
    public Piece getPiece() {
        return null;
    }

    public boolean isOccupied(){
        return false;
    }

    private static final Map<Integer,EmptyTile> EMPTY_TILE_MAP = createAllEmptyTiles();

    private static Map<Integer, EmptyTile> createAllEmptyTiles(){
        final Map<Integer,EmptyTile> emptyTileMap = new HashMap <>();
        for(int i =0; i<64;i++){
            emptyTileMap.put(i, new EmptyTile(i,false));
        }
        return emptyTileMap;
    }
}
