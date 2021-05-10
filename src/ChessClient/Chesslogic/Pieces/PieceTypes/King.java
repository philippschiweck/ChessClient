package ChessClient.Chesslogic.Pieces.PieceTypes;


import ChessClient.Chesslogic.Board.BoardState;
import ChessClient.Chesslogic.Board.FieldPosition;
import ChessClient.Chesslogic.Pieces.ChessColor;
import ChessClient.Chesslogic.Pieces.Piece;
import ChessClient.Chesslogic.Pieces.PieceType;

public class King extends Piece {

    public King(ChessColor color){

        super(color, PieceType.KING, color == ChessColor.WHITE? "assets/chess_pieces/w_king.png" : "assets/chess_pieces/b_king.png");
    }

    @Override
    public boolean validateMove(BoardState currentBoardState, FieldPosition currentFieldPosition, FieldPosition targetFieldPosition){
        boolean isMoveValid = false;


        return isMoveValid;
    }
}
