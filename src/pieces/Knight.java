package pieces;

import com.chess.board.*;

import java.util.HashSet;
import java.util.Set;

public class Knight extends Piece{

    public Knight(int pieceCoordinates, boolean isWhite) {
        super(pieceCoordinates, isWhite);
    }

    @Override
    public Set <Integer> calculateLegalMoves() {
        Set<Integer>legalCoordinates = new HashSet <>();
        if(this.pieceCoordinates - 17 <64 ){
            legalCoordinates.add(this.pieceCoordinates-17);
        }
        if(this.pieceCoordinates - 15 <64&& Tile.EMPTY_TILE_MAP.containsKey(this.pieceCoordinates-15)){
            legalCoordinates.add(this.pieceCoordinates-15);
        }
        if(this.pieceCoordinates-10<64&& Tile.EMPTY_TILE_MAP.containsKey(this.pieceCoordinates-10)){
            legalCoordinates.add(this.pieceCoordinates-10);
        }
        if (this.pieceCoordinates - 6 < 64&& Tile.EMPTY_TILE_MAP.containsKey(this.pieceCoordinates-6)) {
            legalCoordinates.add(this.pieceCoordinates-6);
        }
        if(this.pieceCoordinates+6 <64&& Tile.EMPTY_TILE_MAP.containsKey(this.pieceCoordinates+6)){
            legalCoordinates.add(this.pieceCoordinates+6);
        }
        if(this.pieceCoordinates+10 <64&& Tile.EMPTY_TILE_MAP.containsKey(this.pieceCoordinates+10)){
            legalCoordinates.add(this.pieceCoordinates+10);
        }
        if (this.pieceCoordinates + 15 < 64&& Tile.EMPTY_TILE_MAP.containsKey(this.pieceCoordinates-17)) {
            legalCoordinates.add(this.pieceCoordinates+15);
        }
        if (this.pieceCoordinates + 17 < 64&& Tile.EMPTY_TILE_MAP.containsKey(this.pieceCoordinates-17)) {
            legalCoordinates.add(this.pieceCoordinates+17);
        }
        return legalCoordinates;
    }
}
