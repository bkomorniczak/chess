package pieces;

import com.chess.board.Board;

import java.util.Set;

public abstract class Piece {

    protected static int pieceCoordinates;
    protected static boolean isWhite;

    public Piece(int pieceCoordinates, boolean isWhite) {
        this.pieceCoordinates = pieceCoordinates;
        this.isWhite = isWhite;
    }

    public static int getPieceCoordinates() {
        return pieceCoordinates;
    }

    public static boolean isWhite() {
        return isWhite;
    }

   public  Set <Integer> calculateLegalMoves(Board board){
        return null;
   }
}
