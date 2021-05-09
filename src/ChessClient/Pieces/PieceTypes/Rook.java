package ChessClient.Pieces.PieceTypes;

import ChessClient.Pieces.ChessColor;
import ChessClient.Pieces.Piece;
import ChessClient.Pieces.PieceType;

public class Rook extends Piece {

    public Rook(ChessColor color){

        super(color, PieceType.ROOK, color == ChessColor.WHITE? "assets/chess_pieces/w_rook.png" : "assets/chess_pieces/b_rook.png");
    }
}
