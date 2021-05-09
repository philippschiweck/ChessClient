package ChessClient;

import ChessClient.Chesslogic.Board.Board;
import ChessClient.GUI.MainFrame;
import ChessClient.GUI.Menu.*;

public class ChessApp {

    private Board mainBoard;
    private Menu menu;
    private Settings settings;

    private MainFrame frame;

    public ChessApp(){
        initGui();

    }

    private void initGui(){
        frame = new MainFrame();

        menu = new Menu();

        frame.add(menu);

        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }


}
