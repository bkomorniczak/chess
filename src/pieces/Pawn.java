package pieces;

import com.chess.board.Board;
import com.chess.board.Move;
import com.chess.board.OccupiedTile;
import com.chess.board.Tile;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Pawn extends Piece {
    private int[] whitePawnStartingCoords = {48,49,50,51,52,53,54,55};
    public Pawn(int pieceCoordinates, boolean isWhite) {
        super(pieceCoordinates, isWhite);
    }

    @Override
    public Set <Integer> calculateLegalMoves() {
        Set<Integer>legalCoordinates = new HashSet<>();
        if(isWhite ){
            if(Arrays.asList(whitePawnStartingCoords).contains(this.whitePawnStartingCoords) && Tile.EMPTY_TILE_MAP.containsKey(this.pieceCoordinates - 8)){
                legalCoordinates.add(this.pieceCoordinates -16);
            }else if(Tile.EMPTY_TILE_MAP.containsKey(this.pieceCoordinates -8)){
                legalCoordinates.add(this.pieceCoordinates - 8);
            }
            if(!Tile.EMPTY_TILE_MAP.containsKey(this.pieceCoordinates -7 )){
                //wpisać logikę, która sprawdza czy zajęte pole jest okupowane przez figurę czarną

            }
            if(!Tile.EMPTY_TILE_MAP.containsKey(this.pieceCoordinates -9)){
                //wpisać logikę, która sprawdza czy zajęte pole jest okupowane przez figurę czarną

            }

        }


        return null;
    }


}
