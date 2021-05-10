package ChessClient;

import ChessClient.Chesslogic.Game;
import ChessClient.Chesslogic.LocalGame;
import ChessClient.Chesslogic.Player;
import ChessClient.GUI.BoardGui.BoardGui;
import ChessClient.GUI.MainFrame;
import ChessClient.GUI.Menu.*;
import ChessClient.Chesslogic.Pieces.ChessColor;

import javax.swing.*;
import java.awt.*;

public class ChessApp {

    private ChessMenu menu;
    private Game game;
    private Settings settings;
    private BoardGui boardgui;

    private MainFrame frame;

    public ChessApp(){
        initGui();
    }

    private void initGui(){
        frame = new MainFrame();

        this.game = new LocalGame(new Player(ChessColor.WHITE), new Player(ChessColor.BLACK));
        this.settings = new Settings();
        menu = new ChessMenu(this);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(settings.getBoardsize().getSizeX(), settings.getBoardsize().getSizeY()));
        frame.add(layeredPane);

        JLabel piece = new JLabel( new ImageIcon("assets/chess_pieces/b_bishop.png") );

        //Add BoardGui
        this.boardgui = new BoardGui(game.getBoardstate(), settings);
        layeredPane.add(boardgui, JLayeredPane.DEFAULT_LAYER);

        //Add Menu
        /*frame.add(menu, BorderLayout.CENTER);
        initChessApp();

        frame.add(menu);*/

        //Add Image Icon
        ImageIcon img = new ImageIcon("assets/chess_pieces/w_queen.png");
        this.frame.setIconImage(img.getImage());

        this.frame.setVisible(true);
        this.frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }

    private void initChessApp(){

    }

    private void playGame(){

    }


}
