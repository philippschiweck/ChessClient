package ChessClient.GUI;

import javax.swing.*;

/**
 * JFrame window for the
 */
public class MainFrame extends JFrame {

    public MainFrame(){
        initializeWindow();
    }

    /**
     * Initializes the GUI Window as undecorated Fullscreen JFrame.
     */
    private void initializeWindow(){

        this.setTitle("Chess Client");

        //Fullscreen Application
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setUndecorated(true);

        this.add(new JPanel());


        this.setVisible(true);
    }
}
