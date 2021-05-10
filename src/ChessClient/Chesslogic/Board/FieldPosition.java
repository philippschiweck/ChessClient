package ChessClient.Chesslogic.Board;

import ChessClient.Chesslogic.Pieces.Piece;

public class FieldPosition {

    private Piece piece;
    private int column;
    private int row;

    public FieldPosition(Piece piece, int column, int row){
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

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    @Override
    public String toString() {
        return String.format("Column %i| Row %i ", column, row) ;
    }
}
