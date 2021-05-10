package ChessClient.Chesslogic.Pieces.PieceTypes;

import ChessClient.Chesslogic.Board.BoardState;
import ChessClient.Chesslogic.Board.FieldPosition;
import ChessClient.Chesslogic.Pieces.ChessColor;
import ChessClient.Chesslogic.Pieces.Piece;
import ChessClient.Chesslogic.Pieces.PieceType;

public class Bishop extends Piece {

    public Bishop(ChessColor color){
        super(color, PieceType.BISHOP, color == ChessColor.WHITE? "assets/chess_pieces/w_bishop.png" : "assets/chess_pieces/b_bishop.png");
    }

    @Override
    public boolean validateMove(BoardState currentBoardState, FieldPosition currentFieldPosition, FieldPosition targetFieldPosition){
        boolean isMoveValid = false;


        return isMoveValid;
    }
}
