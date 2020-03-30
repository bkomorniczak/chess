import com.chess.board.Board;
import pieces.Knight;
import pieces.Pawn;

import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Board board = new Board();
       // Knight knight = new Knight(35,true);
        Knight knight1 = new Knight(0,true);
        Pawn pawn = new Pawn (48,true);
       // Pawn pawn1 = new Pawn (37, true);
        //Set<Integer> knightsLegMoves = knight.calculateLegalMoves(board);
        Set<Integer> knight1sLegMoves = knight1.calculateLegalMoves(board);
        Set<Integer> pawnsLegMoves = pawn.calculateLegalMoves(board);
        //Set<Integer> pawn1sLegMoves = pawn1.calculateLegalMoves(board);


            //System.out.println(knightsLegMoves);
            System.out.println(knight1sLegMoves);
            System.out.println(pawnsLegMoves);
            //System.out.println(pawn1sLegMoves);

        //zapisuje wynik do tych samych obiektów
    }
}
