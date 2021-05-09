package ChessClient.Pieces.PieceTypes;

import ChessClient.Pieces.ChessColor;
import ChessClient.Pieces.Piece;
import ChessClient.Pieces.PieceType;

public class Queen extends Piece {

    public Queen(ChessColor color){
        super(color, PieceType.QUEEN, color == ChessColor.WHITE? "assets/chess_pieces/w_queen.png" : "assets/chess_pieces/b_queen.png");
    }
}
