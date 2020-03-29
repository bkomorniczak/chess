public abstract class Tile {

    public int coordinates;
    boolean isOccupatied;

    public Tile(int coordinates, boolean isOccupatied) {
        this.coordinates = coordinates;
        this.isOccupatied = isOccupatied;
    }



    public boolean isOccupatied(){
        return this.isOccupatied;
    }

    public abstract Piece getPiece();


}
