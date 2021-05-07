package ChessClient.GUI;

import ChessClient.GUI.Board.Board;
import ChessClient.GUI.Menu.Menu;
import ChessClient.GUI.Menu.Settings;

public class ChessApp {

    private Board mainBoard;
    private Menu menu;
    private Settings settings;

    private MainFrame frame;

    public ChessApp(){
        this.frame = new MainFrame();
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }


}
