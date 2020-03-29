public  final class EmptyTile extends Tile{

    public EmptyTile(int coordinates, boolean isOccupied) {
        super(coordinates, false);
    }

    @Override
    public Piece getPiece() {
        return null;
    }

    public boolean isOccupied(){
        return false;
    }
}
