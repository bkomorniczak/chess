package pieces;

import com.chess.board.*;

import java.util.HashSet;
import java.util.Set;

public class Knight extends Piece{

    public Knight(int pieceCoordinates, boolean isWhite) {
        super(pieceCoordinates, isWhite);
    }


    @Override
    public Set <Integer> calculateLegalMoves(Board board) {
        Set<Integer>legalCoordinates = new HashSet <>();
        if(this.pieceCoordinates - 17 <64&& Tile.EMPTY_TILE_MAP.containsKey(this.pieceCoordinates-17) ){
            legalCoordinates.add(this.pieceCoordinates-17);
        }else if(this.pieceCoordinates - 17 <64 && !Tile.EMPTY_TILE_MAP.containsKey(this.pieceCoordinates-17 )){
            Tile destinationTile = board.getTile(this.pieceCoordinates - 17);
            Piece pieceAtDestinationTile = destinationTile.getPiece();
            if(this.isWhite() && !pieceAtDestinationTile.isWhite()){
                legalCoordinates.add(this.pieceCoordinates-17);
            }else if(!this.isWhite() && pieceAtDestinationTile.isWhite()){
                legalCoordinates.add(this.pieceCoordinates-17);
            }
        }
        if(this.pieceCoordinates - 15 <64&& Tile.EMPTY_TILE_MAP.containsKey(this.pieceCoordinates-15)){
            legalCoordinates.add(this.pieceCoordinates-15);
        }else if(this.pieceCoordinates - 15 <64 && !Tile.EMPTY_TILE_MAP.containsKey(this.pieceCoordinates-15)){
            Tile destinationTile = board.getTile(this.pieceCoordinates - 15);
            Piece pieceAtDestinationTile = destinationTile.getPiece();
            if(this.isWhite() && !pieceAtDestinationTile.isWhite()){
                legalCoordinates.add(this.pieceCoordinates-15);
            }else if(!this.isWhite() && pieceAtDestinationTile.isWhite()){
                legalCoordinates.add(this.pieceCoordinates-15);
            }
        }
        if(this.pieceCoordinates-10<64&& Tile.EMPTY_TILE_MAP.containsKey(this.pieceCoordinates-10)){
            legalCoordinates.add(this.pieceCoordinates-10);
        }else if(this.pieceCoordinates - 10 <64 && !Tile.EMPTY_TILE_MAP.containsKey(this.pieceCoordinates-10)){
            Tile destinationTile = board.getTile(this.pieceCoordinates - 10);
            Piece pieceAtDestinationTile = destinationTile.getPiece();
            if(this.isWhite() && !pieceAtDestinationTile.isWhite()){
                legalCoordinates.add(this.pieceCoordinates-10);
            }else if(!this.isWhite() && pieceAtDestinationTile.isWhite()){
                legalCoordinates.add(this.pieceCoordinates-10);
            }
        }
        if (this.pieceCoordinates - 6 < 64&& Tile.EMPTY_TILE_MAP.containsKey(this.pieceCoordinates-6)) {
            legalCoordinates.add(this.pieceCoordinates-6);
        }else if(this.pieceCoordinates - 6 <64 && !Tile.EMPTY_TILE_MAP.containsKey(this.pieceCoordinates-6)){
            Tile destinationTile = board.getTile(this.pieceCoordinates - 6);
            Piece pieceAtDestinationTile = destinationTile.getPiece();
            if(this.isWhite() && !pieceAtDestinationTile.isWhite()){
                legalCoordinates.add(this.pieceCoordinates-6);
            }else if(!this.isWhite() && pieceAtDestinationTile.isWhite()){
                legalCoordinates.add(this.pieceCoordinates-6);
            }
        }
        if(this.pieceCoordinates+6 <64&& Tile.EMPTY_TILE_MAP.containsKey(this.pieceCoordinates+6)){
            legalCoordinates.add(this.pieceCoordinates+6);
        }else if(this.pieceCoordinates + 6 <64 && !Tile.EMPTY_TILE_MAP.containsKey(this.pieceCoordinates+6)){
            Tile destinationTile = board.getTile(this.pieceCoordinates + 6);
            Piece pieceAtDestinationTile = destinationTile.getPiece();
            if(this.isWhite() && !pieceAtDestinationTile.isWhite()){
                legalCoordinates.add(this.pieceCoordinates+6);
            }else if(!this.isWhite() && pieceAtDestinationTile.isWhite()){
                legalCoordinates.add(this.pieceCoordinates+6);
            }
        }
        if(this.pieceCoordinates+10 <64&& Tile.EMPTY_TILE_MAP.containsKey(this.pieceCoordinates+10)){
            legalCoordinates.add(this.pieceCoordinates+10);
        }else if(this.pieceCoordinates + 10 <64 && !Tile.EMPTY_TILE_MAP.containsKey(this.pieceCoordinates+10)){
            Tile destinationTile = board.getTile(this.pieceCoordinates + 10);
            Piece pieceAtDestinationTile = destinationTile.getPiece();
            if(this.isWhite() && !pieceAtDestinationTile.isWhite()){
                legalCoordinates.add(this.pieceCoordinates+10);
            }else if(!this.isWhite() && pieceAtDestinationTile.isWhite()){
                legalCoordinates.add(this.pieceCoordinates+10);
            }
        }
        if (this.pieceCoordinates + 15 < 64&& Tile.EMPTY_TILE_MAP.containsKey(this.pieceCoordinates+15)) {
            legalCoordinates.add(this.pieceCoordinates+15);
        }else if(this.pieceCoordinates + 15 <64 && !Tile.EMPTY_TILE_MAP.containsKey(this.pieceCoordinates+15)){
            Tile destinationTile = board.getTile(this.pieceCoordinates + 15);
            Piece pieceAtDestinationTile = destinationTile.getPiece();
            if(this.isWhite() && !pieceAtDestinationTile.isWhite()){
                legalCoordinates.add(this.pieceCoordinates+15);
            }else if(!this.isWhite() && pieceAtDestinationTile.isWhite()){
                legalCoordinates.add(this.pieceCoordinates+15);
            }
        }
        if (this.pieceCoordinates + 17 < 64&& Tile.EMPTY_TILE_MAP.containsKey(this.pieceCoordinates+17)) {
            legalCoordinates.add(this.pieceCoordinates+17);
        }else if(this.pieceCoordinates + 17 <64 && !Tile.EMPTY_TILE_MAP.containsKey(this.pieceCoordinates+17)) {
            Tile destinationTile = board.getTile(this.pieceCoordinates + 17);
            Piece pieceAtDestinationTile = destinationTile.getPiece();
            if (this.isWhite() && !pieceAtDestinationTile.isWhite()) {
                legalCoordinates.add(this.pieceCoordinates + 17);
            } else if (!this.isWhite() && pieceAtDestinationTile.isWhite()) {
                legalCoordinates.add(this.pieceCoordinates + 17);
            }
        }
        return legalCoordinates;
    }
}
