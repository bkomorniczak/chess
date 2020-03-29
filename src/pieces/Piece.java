package pieces;

import java.util.Set;

public abstract class Piece {

    protected final int pieceCoordinates;
    protected boolean isWhite;

    public Piece(int pieceCoordinates, boolean isWhite) {
        this.pieceCoordinates = pieceCoordinates;
        this.isWhite = isWhite;
    }

    public int getPieceCoordinates() {
        return pieceCoordinates;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public abstract Set <Integer> calculateLegalMoves();
}
