package com.chess.board;

import pieces.Piece;

import java.util.HashMap;
import java.util.Map;

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

    public static Tile createTile(final int coordinates, final Piece piece){
        return piece != null ? new OccupiedTile(coordinates, true, piece) : EMPTY_TILE_MAP.get(coordinates);
    }
    private static final Map<Integer,EmptyTile> EMPTY_TILE_MAP = createAllEmptyTiles();

    private static Map<Integer, EmptyTile> createAllEmptyTiles(){
        final Map<Integer,EmptyTile> emptyTileMap = new HashMap<>();
        for(int i =0; i<64;i++){
            emptyTileMap.put(i, new EmptyTile(i,false));
        }
        return emptyTileMap;
    }

}
