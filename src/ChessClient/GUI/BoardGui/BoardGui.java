package ChessClient.GUI.BoardGui;

import ChessClient.Chesslogic.Board.Board;

import javax.swing.*;

public class BoardGui extends JLayeredPane {

    private Board board;

    public BoardGui(Board board){
        this.board = board;

        initBoardGui();
        addPieces();
    }

    private void initBoardGui(){

    }

    private void addPieces(){

    }

}
