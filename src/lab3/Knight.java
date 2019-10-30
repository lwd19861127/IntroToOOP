package lab3;

public class Knight extends Piece {

    public Knight(boolean isWhite) {
        super(2, isWhite);
    }

    public Knight(int value, boolean isWhite) {
        super(value, isWhite);
    }

    @Override
    public void move() {
        System.out.println("Like an L");
    }
}
