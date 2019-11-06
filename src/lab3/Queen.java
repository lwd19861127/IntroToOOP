package lab3;

public class Queen extends Piece {

    public Queen(boolean isWhite) {
        super(9, isWhite);
    }

    public Queen(int value, boolean isWhite) {
        super(value, isWhite);
    }

    @Override
    public String toString() {
        return "Queen{value='" + super.getValue() + "\' + }";
    }

    @Override
    public void move() {
        System.out.println("Like bishop and rook");
    }
}
