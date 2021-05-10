package ChessClient.Chesslogic;

import ChessClient.Chesslogic.Board.BoardState;
import ChessClient.Pieces.ChessColor;

public abstract class Game {

    private Player playerWhite;
    private Player playerBlack;
    private Player currentPlayer;
    private Player winner;

    private BoardState boardstate;

    public Game(Player playerWhite, Player playerBlack){
        initGame(playerWhite, playerBlack);
    }

    private void initGame(Player playerWhite, Player playerBlack){
        this.playerWhite = playerWhite;
        this.playerBlack = playerBlack;
        this.winner = null;
        this.boardstate = new BoardState(this);
        this.currentPlayer = playerWhite;
    }

    /**
     * This is the function used for the general game loop. nextTurn should be repeatedly called for every turn in the game.
     * @return true if the game is over, false if the game continues
     */
    private boolean nextTurn(){

        boolean nextTurn = true;

        if(winner != null){

            nextTurn = false;
        } else {

            nextPlayer();
        }

        //At the end of a turn, if there is a checkmate, the current Player will be set as winner, ending the game.
        if(MoveValidation.checkForCheckmate()){
            winner = currentPlayer;
        }

        return nextTurn;
    }



    private void nextPlayer(){
        currentPlayer = currentPlayer.equals(playerWhite) ? playerBlack : playerWhite;
    }

    //Get and Set Methods
    public Player getPlayerWhite() {
        return playerWhite;
    }

    public Player getPlayerBlack() {
        return playerBlack;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public BoardState getBoardstate() {
        return boardstate;
    }
}
