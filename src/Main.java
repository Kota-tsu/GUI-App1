import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Plugin");

        final JPanel panelMain = new JPanel();

        panelMain.add( new JLabel("No Plugin"));
        frame.getContentPane().add(
                panelMain,
                BorderLayout.CENTER
        );

        JMenuBar menubar = new JMenuBar();
        JMenu menuPlugin = new JMenu("Plugin");
        menubar.add(menuPlugin);

        frame.setJMenuBar(menubar);

        frame.setSize(350, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}