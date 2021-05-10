package ChessClient.Chesslogic.Pieces.PieceTypes;

import ChessClient.Chesslogic.Pieces.ChessColor;
import ChessClient.Chesslogic.Pieces.Piece;
import ChessClient.Chesslogic.Pieces.PieceType;

public class Queen extends Piece {

    public Queen(ChessColor color){
        super(color, PieceType.QUEEN, color == ChessColor.WHITE? "assets/chess_pieces/w_queen.png" : "assets/chess_pieces/b_queen.png");
    }
}
