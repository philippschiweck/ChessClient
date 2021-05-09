package ChessClient.GUI;

import javax.swing.*;
import java.awt.*;

/**
 * JFrame window for the ChessApp.
 */
public class MainFrame extends JFrame {

    MainFrame(){
        initializeWindow();
    }

    /**
     * Initializes the GUI Window as undecorated Fullscreen JFrame.
     */
    private void initializeWindow(){

        this.setTitle("Queens Chess");

        this.setLayout(new BorderLayout());
        this.setBackground(Color.GREEN);

        //Fullscreen Application
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setUndecorated(true);

        this.setVisible(true);
    }
}
