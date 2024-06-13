import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class TicTacToeFrame extends JFrame implements ActionListener {
    TicTacToe TicTacToe;
    JPanel resetButtonPanel = new JPanel();
    JButton resetButton;

    TicTacToeFrame() {
        // Change UI look and feel to match cross-platform look and feel
        // This will allow us to change the look and feel of JButtons and have them 
        // match the look and feel of the rest of the OS.
        try{
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
          }catch(Exception e){
           e.printStackTrace(); 
          }
          
        // Defines scale and style of frame JFrame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 800);
        this.getContentPane().setBackground(new Color(50,50,50));
        this.setLayout(new BorderLayout());

        // Location and layout for resetButtonPanel
        resetButtonPanel.setLayout(new BorderLayout());
        resetButtonPanel.setBounds(0, 600, 800, 100);

        // Configuration of resetButton
        resetButton = new JButton();
        resetButton.setForeground(new Color(255, 255, 255));
        resetButton.setBackground(Color.RED);
        resetButton.setOpaque(true);
        resetButton.setText("Reset");
        resetButton.setFont(new Font("Noteworthy", Font.BOLD, 75));
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        TicTacToe = new TicTacToe();

        resetButtonPanel.add(resetButton);
        this.add(resetButtonPanel, BorderLayout.SOUTH);
        this.add(TicTacToe);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resetButton) {
            this.remove(TicTacToe);
            TicTacToe = new TicTacToe();
            this.add(TicTacToe);
            SwingUtilities.updateComponentTreeUI(this);
        }
    }
}