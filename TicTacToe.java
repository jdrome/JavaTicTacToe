import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TicTacToe implements ActionListener{

    // Class Attributes
    Random random = new Random();
    JFrame frame = new JFrame(); // This JFrame will hold our game board
    JPanel titlePanel = new JPanel();
    JPanel buttonPanel = new JPanel();
    JLabel textField = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player1_turn;

    // Constructor
    TicTacToe(){
        // Defines scale and style of frame JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.getContentPane().setBackground(new Color(50,50,50));
        frame.setLayout(new BorderLayout());

        // Defines scale and style of textField JLabel - this is essentially the title of the gameboard
        textField.setBackground(new Color(25, 25, 25));
        textField.setForeground(new Color(25, 255, 0));
        textField.setFont(new Font("Noteworthy", Font.BOLD,75));
        textField.setHorizontalAlignment(JLabel.CENTER);
        textField.setText("Tic-Tac-Toe");
        textField.setOpaque(true);

        // Location and layout for titlePanel
        titlePanel.setLayout(new BorderLayout());
        titlePanel.setBounds(0, 0, 800, 100); // titlePanel location in frame

        // Location and layout for buttonPanel
        buttonPanel.setLayout(new GridLayout(3, 3));
        buttonPanel.setBackground(new Color (150, 150, 150));

        // Create and add buttons JButton to buttonPanel
        for(int i = 0; i < 9; i++){
            buttons[i] = new JButton();
            buttonPanel.add(buttons[i]);
            buttons[i].setFont(new Font("Noteworthy", Font.BOLD,120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }

        titlePanel.add(textField);
        frame.add(titlePanel, BorderLayout.NORTH);
        frame.add(buttonPanel);

        firstTurn();

        frame.setVisible(true); // This allows us to see the board when running the code.
    } // End of constructor

    @Override
    public void actionPerformed(ActionEvent e){

    }

    public void firstTurn(){
        if(random.nextInt(2) == 0) {
            player1_turn = true;
            textField.setText("X's turn");
        }
        else {
            player1_turn = false;
            textField.setText("O turn");
        }
    }

    public void check(){

    }

    public void xWins(int a, int b, int c){

    }

    public void oWins(int a, int b, int c){

    }
}