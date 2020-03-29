public class OccupiedTile extends Tile {
    Piece pieceOnTile;

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
