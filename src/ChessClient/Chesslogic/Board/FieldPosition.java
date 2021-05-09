package ChessClient.Chesslogic.Board;

import ChessClient.Pieces.Piece;

public class FieldPosition {

    private Piece piece;
    private char column;
    private int row;

    public FieldPosition(Piece piece, char column, int row){
        this.piece = piece;
        this.column = column;
        this.row = row;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    @Override
    public String toString() {
        return column + Integer.toString(row + 1);
    }
}
