package ChessClient.GUI;

import ChessClient.GUI.Board.Board;
import ChessClient.GUI.Menu.Menu;
import ChessClient.GUI.Menu.Settings;

import javax.swing.*;
import java.awt.*;

public class ChessApp {

    private Board mainBoard;
    private Menu menu;
    private Settings settings;

    private MainFrame frame;

    public ChessApp(){

        frame = new MainFrame();

        //Add Menu
        menu = new Menu(this);
        frame.add(menu, BorderLayout.CENTER);
        initChessApp();
    }

    private void initChessApp(){

        //Add Image Icon
        ImageIcon img = new ImageIcon("assets/chess_pieces/w_queen.png");
        this.frame.setIconImage(img.getImage());

        this.frame.setVisible(true);
        this.frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }


}
