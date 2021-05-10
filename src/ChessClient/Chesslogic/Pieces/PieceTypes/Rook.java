package ChessClient.Chesslogic.Pieces.PieceTypes;

import ChessClient.Chesslogic.Board.BoardState;
import ChessClient.Chesslogic.Board.FieldPosition;
import ChessClient.Chesslogic.MoveValidation;
import ChessClient.Chesslogic.Pieces.ChessColor;
import ChessClient.Chesslogic.Pieces.Piece;
import ChessClient.Chesslogic.Pieces.PieceType;

public class Rook extends Piece {

    public Rook(ChessColor color){

        super(color, PieceType.ROOK, color == ChessColor.WHITE? "assets/chess_pieces/w_rook.png" : "assets/chess_pieces/b_rook.png");
    }

    @Override
    public boolean validateMove(BoardState currentBoardState, FieldPosition currentFieldPosition, FieldPosition targetFieldPosition){
        boolean isMoveValid = false;

        int currentCol = currentFieldPosition.getColumn();
        int currentRow = currentFieldPosition.getRow();

        int targetCol = targetFieldPosition.getColumn();
        int targetRow = targetFieldPosition.getRow();

        //Rook can either move in row or column, meaning one or the other must stay the same
        if(MoveValidation.isMoveInbounds(targetCol, targetRow)){
            if(currentCol == targetCol || currentRow == targetRow){

                int colDiff = currentCol - targetCol;
                int rowDiff = currentRow - targetCol;

                if(colDiff == 0){

                } else if (rowDiff == 0) {

                }
            }
        }

        return isMoveValid;
    }

}
