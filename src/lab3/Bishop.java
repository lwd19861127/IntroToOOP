package lab3;

public class Bishop extends Piece{
    public Bishop(boolean isWhite) {
        super(3, isWhite);
    }

    public Bishop(int value, boolean isWhite) {
        super(value, isWhite);
    }

    @Override
    public String toString() {
        return "Bishop{value='" + super.getValue() + "\' + }";
    }

    @Override
    public void move() {
        System.out.println("Diagonally");
    }
}
