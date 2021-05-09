package ChessClient.GUI.Board;

import ChessClient.Pieces.Piece;

public class Field {

    private Piece piece;

    public Field(){
        this.piece = null;
    }

    public Field(Piece piece){
        this.piece = piece;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public void removePiece(){
        this.piece = null;
    }
}
