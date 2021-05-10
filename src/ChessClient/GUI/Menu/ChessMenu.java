package ChessClient.GUI.Menu;

import ChessClient.ChessApp;

import javax.swing.*;
import java.awt.*;

public class ChessMenu extends JPanel {

    private ChessApp app;
    
    public ChessMenu(ChessApp app){

        this.app = app;

        initMenuGui();
    }

    private void initMenuGui() {

        JButton button = new JButton("Click");

        this.setSize(new Dimension(640, 480));

        this.setBackground(Color.GRAY);

        this.add(button, BorderLayout.CENTER);
    }

}
