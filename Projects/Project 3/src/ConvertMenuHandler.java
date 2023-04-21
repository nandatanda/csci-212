import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConvertMenuHandler implements ActionListener {
    JFrame jframe;

    public ConvertMenuHandler(JFrame jf) {
        jframe = jf;
    }

    public void actionPerformed(ActionEvent event) {
        String menuName = event.getActionCommand();
        if (menuName.equals("Roman to Arabic"))
            JOptionPane.showMessageDialog(null, "You clicked on Roman to Arabic");
    }
}