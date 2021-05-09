package ChessClient.Pieces.PieceTypes;

import ChessClient.Pieces.Piece;
import ChessClient.Pieces.ChessColor;
import ChessClient.Pieces.PieceType;

public class Pawn extends Piece {

    public Pawn(ChessColor color){
        super(color, PieceType.PAWN, color == ChessColor.WHITE? "assets/chess_pieces/w_pawn.png" : "assets/chess_pieces/b_pawn.png");
    }
}
