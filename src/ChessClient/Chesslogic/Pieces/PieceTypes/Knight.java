package ChessClient.Chesslogic.Pieces.PieceTypes;

import ChessClient.Chesslogic.Board.BoardState;
import ChessClient.Chesslogic.Board.FieldPosition;
import ChessClient.Chesslogic.Pieces.ChessColor;
import ChessClient.Chesslogic.Pieces.Piece;
import ChessClient.Chesslogic.Pieces.PieceType;

public class Knight extends Piece {

    public Knight(ChessColor color){
        super(color, PieceType.KNIGHT, color == ChessColor.WHITE? "assets/chess_pieces/w_knight.png" : "assets/chess_pieces/b_knight.png");
    }

    @Override
    public boolean validateMove(BoardState currentBoardState, FieldPosition currentFieldPosition, FieldPosition targetFieldPosition){
        boolean isMoveValid = false;


        return isMoveValid;
    }
}
