package ChessClient.GUI.BoardGui;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DnDConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Icon extends JLabel {

    public Icon(ImageIcon currentIcon, int position) {
        super(currentIcon, position);

        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        this.setTransferHandler(new TransferHandler("icon"));

        this.addMouseMotionListener(new DragMouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                JLabel lbl = (JLabel) e.getSource();
                TransferHandler handle = lbl.getTransferHandler();
                handle.exportAsDrag(lbl, e, TransferHandler.COPY);
            }
        });

    }

    private class DragMouseAdapter extends MouseAdapter {

        public void mousePressed(MouseEvent e) {

            JComponent c = (JComponent) e.getSource();
            TransferHandler handler = c.getTransferHandler();
            handler.exportAsDrag(c, e, TransferHandler.COPY);
        }
    }

}
