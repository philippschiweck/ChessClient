package ChessClient.Pieces.PieceTypes;


import ChessClient.Pieces.ChessColor;
import ChessClient.Pieces.Piece;
import ChessClient.Pieces.PieceType;

public class King extends Piece {

    public King(ChessColor color){

        super(color, PieceType.KING, color == ChessColor.WHITE? "assets/chess_pieces/w_king.png" : "assets/chess_pieces/b_king.png");
    }

}
