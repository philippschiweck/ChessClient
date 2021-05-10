package ChessClient.Chesslogic;

import ChessClient.Chesslogic.Board.BoardState;
import ChessClient.Chesslogic.Board.FieldPosition;
import ChessClient.Chesslogic.Pieces.Piece;

import java.lang.reflect.Field;

public class LocalGame extends Game {

    public LocalGame(Player playerWhite, Player playerBlack){
        super(playerWhite, playerBlack);
    }

    /**
     * This is the function used for the general game loop. nextTurn should be repeatedly called for every turn in the game.
     * @return true if the game is over, false if the game continues
     */
    @Override
    public boolean nextTurn(){

        boolean nextTurn = true;

        if(winner != null){

            nextTurn = false;
        } else {

            nextPlayer();
        }

        //At the end of a turn, if there is a checkmate, the current Player will be set as winner, ending the game.
        if(MoveValidation.checkForCheckmate(boardstate)){
            winner = currentPlayer;
        }

        return nextTurn;
    }

    /**
     * Makes the move, if the move is the move is a valid chessmove, and if the new boardstate would not be a checkmate position.
     * The validation logic of the legality of the piece movement and of the legality of the new board state after the move are separated on purpose.
     *
     * @param piece
     * @param current
     * @param target
     * @return true if the move was made, otherwise false.
     */
    public boolean makeMove(Piece piece, FieldPosition current, FieldPosition target){
        boolean moveMade = false;
        if(piece.validateMove(boardstate, current, target)){
            BoardState newBoardState = getNewBoardState(boardstate, current, target);

            //Check if there would be a checkmate if the move is made
            if(!MoveValidation.checkForCheckmate(newBoardState)){
                this.boardstate = newBoardState;
                moveMade = true;
            }
        }
        return moveMade;
    }

    /**
     * Call after move has been validated, to move the piece to the new Position.
     * The new BoardState still has to be checked for Checkmate, before the move is finally made.
     *
     * @param boardState
     * @param current
     * @param target
     * @return
     */
    private BoardState getNewBoardState(BoardState boardState, FieldPosition current, FieldPosition target){
        BoardState newBoardState = boardState;
        //TODO Generate new Boardstate
        return newBoardState;
    }
}
