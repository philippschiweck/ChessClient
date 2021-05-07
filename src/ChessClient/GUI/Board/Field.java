package ChessClient.GUI.Board;

import ChessClient.Pieces.Piece;

public class Field {

    private Piece piece;

    public Field(){

    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}
