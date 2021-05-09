package ChessClient.Pieces.PieceTypes;

import ChessClient.Pieces.ChessColor;
import ChessClient.Pieces.Piece;
import ChessClient.Pieces.PieceType;

public class Knight extends Piece {

    public Knight(ChessColor color){
        super(color, PieceType.KNIGHT, color == ChessColor.WHITE? "assets/chess_pieces/w_knight.png" : "assets/chess_pieces/b_knight.png");
    }
}
