package pieces;

import com.chess.board.Board;
import com.chess.board.Move;
import com.chess.board.OccupiedTile;
import com.chess.board.Tile;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class Pawn extends Piece {
    private int[] whitePawnStartingCoords = {48,49,50,51,52,53,54,55};
    private int[] blackPawnStartingCoords = {8,9,10,11,12,13,14,15};
    public Pawn(int pieceCoordinates, boolean isWhite) {
        super(pieceCoordinates, isWhite);
    }

    @Override
    public Set <Integer> calculateLegalMoves(Board board) {
        Set<Integer>legalCoordinates = new HashSet<>();

        if(isWhite ){
            if(IntStream.of(whitePawnStartingCoords).anyMatch(x->x==pieceCoordinates) && Tile.EMPTY_TILE_MAP.containsKey(pieceCoordinates - 8)){
                legalCoordinates.add(pieceCoordinates - 16);
            }
            if(Tile.EMPTY_TILE_MAP.containsKey(pieceCoordinates - 8)){
                legalCoordinates.add(pieceCoordinates - 8);
            }
            if(!Tile.EMPTY_TILE_MAP.containsKey(pieceCoordinates - 7 )){
                Tile destinationTile = board.getTile(pieceCoordinates - 7);
                Piece pieceAtDestinationTile = destinationTile.getPiece();
                if(!pieceAtDestinationTile.isWhite()){
                    legalCoordinates.add(pieceCoordinates - 7);
                }

            }
            if(!Tile.EMPTY_TILE_MAP.containsKey(pieceCoordinates - 9)){
                Tile destinationTile = board.getTile(pieceCoordinates - 9);
                Piece pieceAtDestinationTile = destinationTile.getPiece();
                if(!pieceAtDestinationTile.isWhite()){
                    legalCoordinates.add(pieceCoordinates - 9);
                }

            }

        }else{
            if(IntStream.of(blackPawnStartingCoords).anyMatch(x->x==pieceCoordinates) && Tile.EMPTY_TILE_MAP.containsKey(pieceCoordinates + 8)){
                legalCoordinates.add(pieceCoordinates + 16);
            }
            if(Tile.EMPTY_TILE_MAP.containsKey(pieceCoordinates + 8)){
                legalCoordinates.add(pieceCoordinates + 8);
            }
            if(!Tile.EMPTY_TILE_MAP.containsKey(pieceCoordinates + 7 )){
                Tile destinationTile = board.getTile(pieceCoordinates + 7);
                Piece pieceAtDestinationTile = destinationTile.getPiece();
                if(isWhite()){
                    legalCoordinates.add(pieceCoordinates + 7);
                }

            }
            if(!Tile.EMPTY_TILE_MAP.containsKey(pieceCoordinates + 9)){
                Tile destinationTile = board.getTile(pieceCoordinates + 9);
                Piece pieceAtDestinationTile = destinationTile.getPiece();
                if(isWhite()){
                    legalCoordinates.add(pieceCoordinates + 9);
                }

            }
        }


        return legalCoordinates;
    }


}
