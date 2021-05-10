package ChessClient.Chesslogic.Pieces.PieceTypes;

import ChessClient.Chesslogic.Pieces.ChessColor;
import ChessClient.Chesslogic.Pieces.Piece;
import ChessClient.Chesslogic.Pieces.PieceType;

public class Rook extends Piece {

    public Rook(ChessColor color){

        super(color, PieceType.ROOK, color == ChessColor.WHITE? "assets/chess_pieces/w_rook.png" : "assets/chess_pieces/b_rook.png");
    }
}
