package lab2122.ex3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    public Main(){
        super("Redactor");
        this.setBounds(200, 200, 500, 500);
        Container pane = this.getContentPane();
        pane.setLayout(new GridLayout(4, 4, 1, 1));

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menuFile());
        setJMenuBar(menuBar);
        setSize(500, 275);
        setVisible(true);
    }

    private JMenu menuFile() {
        JMenu file = new JMenu("File");
        JMenu newFile = new JMenu("New");
        JMenuItem textDocumentNew = new JMenuItem("Text Document");
        JMenuItem imageDocumentNew = new JMenuItem("Image Document");
        JMenuItem musicDocumentNew = new JMenuItem("Music Document");
        JMenu open = new JMenu("Open");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem textDocumentOpen = new JMenuItem("Text");
        JMenuItem imageDocumentOpen = new JMenuItem("Image");
        JMenuItem musicDocumentOpen = new JMenuItem("Music");

        file.add(newFile);
        newFile.add(textDocumentNew);
        newFile.add(imageDocumentNew);
        newFile.add(musicDocumentNew);
        file.add(open);
        open.add(textDocumentOpen);
        open.add(imageDocumentOpen);
        open.add(musicDocumentOpen);
        file.addSeparator();
        file.add(save);

        InterfaceDocument imageFac = new CreateImageDoc();
        InterfaceDocument textFac = new CreateTextDoc();
        InterfaceDocument musicFac = new CreateMusicDoc();

        imageDocumentNew.addActionListener(arg0 -> {
            imageFac.CreateNew();
        });
        textDocumentNew.addActionListener(arg0 -> {
            textFac.CreateNew();
        });
        musicDocumentNew.addActionListener(arg0 -> {
            musicFac.CreateNew();
        });

        imageDocumentOpen.addActionListener(arg0 -> {
            imageFac.CrOpen();
        });
        textDocumentOpen.addActionListener(arg0 -> {
            textFac.CrOpen();
        });
        musicDocumentOpen.addActionListener(arg0 -> {
            musicFac.CrOpen();
        });

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Document has been saved.", "Saved", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("Document has been saved.");
            }
        });

        return file;
    }

    public static void main(String[] args){
        Main app = new Main();
        app.setVisible(true);
    }
}
