package ChessClient.Chesslogic.Pieces;

public enum PieceType {
    QUEEN(9),
    KING(10000),
    ROOK(5),
    BISHOP(3),
    KNIGHT(3),
    PAWN(1);

    private final int value;

    PieceType(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
