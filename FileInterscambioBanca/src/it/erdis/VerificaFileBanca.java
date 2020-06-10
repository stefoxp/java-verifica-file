package it.erdis;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class VerificaFileBanca extends JFrame {
    private JButton butSfoglia;
    private JTextField txtFilePath;
    private JButton butVerifica;
    private JTextArea txtRisultato;
    private JPanel panel;

    private javax.swing.JFileChooser fileChooser;

    public VerificaFileBanca() {
        butSfoglia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*int returnVal = fileChooser.showOpenDialog(VerificaFileBanca.this);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    try {
                        // What to do with the file, e.g. display it in a TextArea
                        txtRisultato.read( new FileReader( file.getAbsolutePath() ), null );
                        // memorizza il path del file
                        txtFilePath.setText(file.getAbsolutePath());
                    } catch (IOException ex) {
                        System.out.println("problem accessing file" + file.getAbsolutePath());
                    }
                } else {
                    System.out.println("File access cancelled by user.");
                }*/
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
