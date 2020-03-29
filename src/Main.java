import pieces.Knight;

import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Knight knight = new Knight(35,true);
        Set<Integer> knightsLegMoves = knight.calculateLegalMoves();


            System.out.println(knightsLegMoves);

    }
}
