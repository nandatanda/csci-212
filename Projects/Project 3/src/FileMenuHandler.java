import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileMenuHandler implements ActionListener {
    JFrame jframe;

    public FileMenuHandler(JFrame jf) {
        jframe = jf;
    }

    public void actionPerformed(ActionEvent event) {
        String menuName = event.getActionCommand();
        if (menuName.equals("Open"))
            JOptionPane.showMessageDialog(null, "You clicked on Open");
        else if (menuName.equals("Quit"))
            JOptionPane.showMessageDialog(null, "Thank you for using our converter!");
            System.exit(0);
    }
}