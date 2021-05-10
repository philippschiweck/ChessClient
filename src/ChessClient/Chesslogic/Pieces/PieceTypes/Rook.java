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

        // Check if Move is inbounds and not to the same field the piece is already on
        if(!MoveValidation.isMoveInbounds(targetCol, targetRow) || !MoveValidation.isNotSameField(currentCol, currentRow, targetCol, targetRow)) {
            isMoveValid = false;
        } else {
            if(currentRow == targetRow) { // Horizontal move, check if the move happens in the column (row stays the same)
                int dx = (currentCol < targetCol) ? 1 : -1;

                isMoveValid = true;
                for (int i = currentCol + dx; i != targetCol; i += dx){
                    if(currentBoardState.getBoardState()[currentRow][i].getPiece() != null){
                        isMoveValid = false;
                        break;
                    }
                }
            } else if (currentCol == targetCol){ // Vertical move, check if the move happens in the row (column stays the same)
                int dy = (currentRow < targetRow) ? 1 : -1;

                isMoveValid = true;
                for (int i = currentCol + dy; i != targetCol; i += dy){
                    if(currentBoardState.getBoardState()[i][currentCol].getPiece() != null){
                        isMoveValid = false;
                        break;
                    }
                }
            } else { //If move is neither in same column or row, move is invalid
                isMoveValid = false;
            }
        }
        return isMoveValid;
    }
}
