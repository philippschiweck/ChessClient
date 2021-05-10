package ChessClient;

import ChessClient.Chesslogic.Board.BoardState;
import ChessClient.Chesslogic.Game;
import ChessClient.GUI.BoardGui.BoardGui;
import ChessClient.GUI.MainFrame;
import ChessClient.GUI.Menu.*;

import javax.swing.*;
import java.awt.*;

public class ChessApp {

    private BoardState mainBoardState;
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

        this.game = new Game();
        this.settings = new Settings();
        menu = new ChessMenu(this);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(settings.getBoardsize().getSizeX(), settings.getBoardsize().getSizeY()));
        frame.add(layeredPane);

        JLabel piece = new JLabel( new ImageIcon("assets/chess_pieces/b_bishop.png") );

        this.mainBoardState = new BoardState(game);


        //Add BoardGui
        this.boardgui = new BoardGui(mainBoardState, settings);

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


}
