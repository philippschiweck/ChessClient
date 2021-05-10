package ChessClient.Chesslogic.Pieces;


import ChessClient.Chesslogic.Board.BoardState;
import ChessClient.Chesslogic.Board.FieldPosition;

public abstract class Piece {

    private int value;
    private ChessColor color;
    private PieceType type;
    private String pieceIcon;

    public Piece(ChessColor color, PieceType type, String imagePath){
        this.color = color;
        this.type = type;
        this.value = type.getValue();
        this.pieceIcon = imagePath;
    }

    public abstract boolean validateMove(BoardState currentBoardState, FieldPosition currentFieldPosition, FieldPosition targetFieldPosition);

    public ChessColor getColor(){
        return color;
    }

    public int getValue(){
        return value;
    }

    public PieceType getType() {
        return type;
    }

    public String getPieceIcon() {
        return pieceIcon;
    }



    @Override
    public String toString() {
        return String.format("Piece{%s, %s}", color.toString(), type.toString());
    }
}
