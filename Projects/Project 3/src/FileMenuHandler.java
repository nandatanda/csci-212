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
        String filename = "";
        if (menuName.equals("Open")) {
            filename = JOptionPane.showInputDialog("Enter the location of the file to be read:");
            RomanFile file = new RomanFile(filename);

            Project3.window.clearAll();
            Project3.window.addRomanNumerals(file.toUnsortedRoman());
            Project3.window.setArabicText(file.toUnsortedArabic());
            Project3.window.addSortedArabicNumerals(file.toSortedArabic());
        } else if (menuName.equals("Quit")) {
            JOptionPane.showMessageDialog(null, "Thank you for using my converter!");
            System.exit(0);
        }
    }
}