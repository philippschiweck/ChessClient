package ChessClient;

import ChessClient.Chesslogic.Board.BoardState;
import ChessClient.GUI.MainFrame;
import ChessClient.GUI.Menu.*;

import javax.swing.*;
import java.awt.*;

public class ChessApp {

    private BoardState mainBoardState;
    private Menu menu;
    private Settings settings;

    private MainFrame frame;

    public ChessApp(){

        initGui();

    }

    private void initGui(){
        frame = new MainFrame();

        //Add Menu
        menu = new Menu(this);
        frame.add(menu, BorderLayout.CENTER);
        initChessApp();

        frame.add(menu);

        //Add Image Icon
        ImageIcon img = new ImageIcon("assets/chess_pieces/w_queen.png");
        this.frame.setIconImage(img.getImage());

        this.frame.setVisible(true);
        this.frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }


}
