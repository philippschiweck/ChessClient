package ChessClient.Chesslogic;

import ChessClient.Chesslogic.Board.BoardState;

public abstract class Game {

    protected Player playerWhite;
    protected Player playerBlack;
    protected Player currentPlayer;
    protected Player winner;

    protected BoardState boardstate;

    public Game(Player playerWhite, Player playerBlack){
        initGame(playerWhite, playerBlack);
    }

    public abstract boolean nextTurn();

    private void initGame(Player playerWhite, Player playerBlack){
        this.playerWhite = playerWhite;
        this.playerBlack = playerBlack;
        this.winner = null;
        this.boardstate = new BoardState(this);
        this.currentPlayer = playerWhite;
    }


    protected void nextPlayer(){
        currentPlayer = currentPlayer.equals(playerWhite) ? playerBlack : playerWhite;
    }

    //Get and Set Methods
    public Player getPlayerWhite() { return playerWhite; }

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
