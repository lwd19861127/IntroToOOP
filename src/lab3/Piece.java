package lab3;

public abstract class Piece {
    private int value;
    private boolean isWhite;

    public Piece(int value, boolean isWhite) {
        this.value = value;
        this.isWhite = isWhite;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }

    @Override
    public boolean equals(Object obj) {
        Piece piece = (Piece) obj;
        return value == piece.value && isWhite == piece.isWhite;
    }

    public abstract void move();
}
