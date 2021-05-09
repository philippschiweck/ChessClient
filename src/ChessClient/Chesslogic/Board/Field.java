package ChessClient.Chesslogic.Board;

import ChessClient.Pieces.Piece;

public class Field {

    private Piece piece;
    private int x;
    private int y;

    public Field(Piece piece, int x, int y){


    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}
