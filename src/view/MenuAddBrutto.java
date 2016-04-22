package view;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MenuAddBrutto extends JMenu {

    /**
     * 
     */
    private static final long serialVersionUID = 4790546772035194942L;
    
    
    public MenuAddBrutto(final JFrame frame) {
        super("Add");
        JMenuItem menuItem = new JMenuItem("Add course");
        menuItem.addActionListener(e -> {
            // aprire finestra di aggiunta corso
        });
        this.add(menuItem);
        menuItem = new JMenuItem("Add lesson");
        menuItem.addActionListener(e -> {
            new AddLessonFrame(frame);
        });
        this.add(menuItem);
    }

}
