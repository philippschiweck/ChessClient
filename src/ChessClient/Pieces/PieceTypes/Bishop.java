package ChessClient.Pieces.PieceTypes;

import ChessClient.Pieces.ChessColor;
import ChessClient.Pieces.Piece;
import ChessClient.Pieces.PieceType;

public class Bishop extends Piece {

    public Bishop(ChessColor color){
        super(color, PieceType.BISHOP, color == ChessColor.WHITE? "assets/chess_pieces/w_bishop.png" : "assets/chess_pieces/b_bishop.png");
    }
}
