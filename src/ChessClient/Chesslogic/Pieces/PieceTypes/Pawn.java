package ChessClient.Chesslogic.Pieces.PieceTypes;

import ChessClient.Chesslogic.Pieces.Piece;
import ChessClient.Chesslogic.Pieces.ChessColor;
import ChessClient.Chesslogic.Pieces.PieceType;

public class Pawn extends Piece {

    private boolean hasMoved;

    public Pawn(ChessColor color){
        super(color, PieceType.PAWN, color == ChessColor.WHITE? "assets/chess_pieces/w_pawn.png" : "assets/chess_pieces/b_pawn.png");
        this.hasMoved = false;
    }
}
