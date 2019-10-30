package lab3;

import java.util.ArrayList;
import java.util.Queue;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Piece> pieces = new ArrayList<Piece>();

        Piece king = new King(true);
        Piece queue = new Queen(true);
        Piece rook = new Rook(true);
        Piece bishop = new Bishop(true);
        Piece knight = new Knight(true);
        Piece pawn = new Pawn(true);

        pieces.add(king);
        pieces.add(queue);
        pieces.add(rook);
        pieces.add(bishop);
        pieces.add(knight);
        pieces.add(pawn);

        for (Piece p: pieces) {
            p.move();
        }

        Pawn p1 = new Pawn(1, true, true, new Queen(true));
        Pawn p2 = new Pawn(1, true, false, null);
        Pawn p3 = new Pawn(1, false, false, null);
        Pawn p4 = new Pawn(1, false, true, new Queen(false));
        Pawn p5 = new Pawn(1, true,true, new Knight(true));


        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p4));
        System.out.println(p1.equals(p5));
        System.out.println(p2.equals(p3));
        System.out.println(p4.equals(p5));
    }
}


