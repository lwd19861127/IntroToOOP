package lab3;

public class Pawn extends Piece {
    private boolean promoted;
    private Piece newPiece;

    public Pawn(boolean isWhite) {
        super(1, isWhite);
        this.promoted = false;
        this.newPiece = null;
    }

    public Pawn(int value, boolean isWhite, boolean promoted, Piece newPiece) {
        super(value, isWhite);
        this.promoted = promoted;
        this.newPiece = newPiece;
    }

    public boolean isPromoted() {
        return promoted;
    }

    public void setPromoted(boolean promoted) {
        this.promoted = promoted;
    }

    public Piece getNewPiece() {
        return newPiece;
    }

    public void setNewPiece(Piece newPiece) {
        this.newPiece = newPiece;
    }

    @Override
    public void move() {
        System.out.println("Forward 1");
    }

    @Override
    public String toString() {
        return "Pawn{value='" + super.getValue() + "\' + }";
    }

    public boolean equals(Pawn pawn) {
        if (super.isWhite() != pawn.isWhite() || promoted != pawn.isPromoted()) {
            return false;
        } else {
            return newPiece.equals(pawn.getNewPiece()) ? true : false;
        }
    }

    public void promote(Piece newPiece) {

    }
}
