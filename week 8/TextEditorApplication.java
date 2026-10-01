import javax.swing.*;
import java.awt.*;

public class TextEditorApplication extends JFrame {
    JTextArea textArea = new JTextArea();

    public TextEditorApplication() {
        setTitle("Simple Text Editor");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem clear = new JMenuItem("Clear");
        JMenuItem exit = new JMenuItem("Exit");
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");

        newItem.addActionListener(e -> textArea.setText(""));
        clear.addActionListener(e -> textArea.setText(""));
        exit.addActionListener(e -> System.exit(0));
        cut.addActionListener(e -> textArea.cut());
        copy.addActionListener(e -> textArea.copy());
        paste.addActionListener(e -> textArea.paste());

        file.add(newItem); file.add(clear); file.add(exit);
        edit.add(cut); edit.add(copy); edit.add(paste);
        menuBar.add(file); menuBar.add(edit);
        setJMenuBar(menuBar);
        setVisible(true);
    }

    public static void main(String[] args) { new TextEditorApplication(); }
}