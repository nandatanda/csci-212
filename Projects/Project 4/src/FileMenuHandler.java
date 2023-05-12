import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class FileMenuHandler implements ActionListener {
    JFrame jframe;

    public FileMenuHandler(JFrame jf) {
        jframe = jf;
    }

    public void actionPerformed(ActionEvent event) {
        // Store the latest action
        String menuName;
        menuName = event.getActionCommand();

        // Check if that action was to click the "Open" button
        if (menuName.equals("Open"))
            openFile();
        // Otherwise check if "Close" was pressed
        else if (menuName.equals("Quit"))
            System.exit(0);
    }

    private void openFile() {
        // Display a window for user to pick which file to open
        JFileChooser chooser;
        int status;
        chooser = new JFileChooser();
        status = chooser.showOpenDialog(null);
        if (status == JFileChooser.APPROVE_OPTION)
            readSource(chooser.getSelectedFile());
        else
            JOptionPane.showMessageDialog(null, "Open File dialog canceled");
    }

    private void readSource(File chosenFile) {
        // Create a file reader object to parse file
        String chosenFileName = chosenFile.getName();
        FileReader file = new FileReader(chosenFileName);

        // Populate GUI with the file's contents
        Project3.window.setRomanText(file.toRomanString());
        Project3.window.setArabicText(file.toArabicString());
        Project3.window.setSortedArabicText(file.toSortedArabicString());
    }
}