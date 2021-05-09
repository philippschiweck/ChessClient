package ChessClient.GUI;

import ChessClient.Chesslogic.Board.Board;
import ChessClient.GUI.Menu.Menu;
import ChessClient.GUI.Menu.Settings;

public class ChessApp {

    private Board mainBoard;
    private Menu menu;
    private Settings settings;

    private MainFrame frame;

    public ChessApp(){
        frame = new MainFrame();

        menu = new Menu();

        frame.add(menu);

        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }


}
