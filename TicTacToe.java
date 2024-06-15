// Imports
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
    JPanel resetButtonPanel = new JPanel();
    JLabel textField = new JLabel();
    JButton[] buttons = new JButton[9];
    JButton resetButton = new JButton();
    boolean player1Turn;

    // Constructor
    TicTacToe(){
        // Change UI look and feel to match cross-platform look and feel
        // This will allow us to change the look and feel of JButtons and have them 
        // match the look and feel of the rest of the OS.
        try{
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
          }catch(Exception e){
           e.printStackTrace(); 
          }
        
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

        // Location and layout for resetButtonPanel
        resetButtonPanel.setLayout(new BorderLayout());
        resetButtonPanel.setBounds(0, 600, 800, 100);

        // Configuration of resetButton
        resetButton = new JButton();
        resetButtonPanel.add(resetButton);
        resetButton.setFont(new Font("Noteworthy", Font.BOLD, 75));
        resetButton.setForeground(new Color(255, 255, 255));
        resetButton.setBackground(Color.RED);
        resetButton.setOpaque(true);
        resetButton.setText("Reset");
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        // Create and add buttons JButton to buttonPanel
        for(int i = 0; i < 9; i++){
            buttons[i] = new JButton();
            buttonPanel.add(buttons[i]);
            buttons[i].setFont(new Font("Noteworthy", Font.BOLD,120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }

        // Add Components to Panel and Frame
        titlePanel.add(textField);
        frame.add(titlePanel, BorderLayout.NORTH);
        frame.add(buttonPanel);
        resetButtonPanel.add(resetButton);
        frame.add(resetButtonPanel, BorderLayout.SOUTH);

        frame.setVisible(true); // This allows us to see the board when running the code.

        firstTurn();
    } // End of constructor

    // actionPerformed method needed due to implementation of Action Listener interface
    @Override
    public void actionPerformed(ActionEvent e){
        // Marks X or O depending on what player's turn it is
        for(int i = 0; i < 9; i++){
            if(e.getSource() == buttons[i]) {
                if(player1Turn) {
                    if(buttons[i].getText() == ""){
                        buttons[i].setForeground(new Color(255, 0, 0));
                        buttons[i].setText("X");
                        player1Turn = false;
                        textField.setText("O's turn");
                        check();
                    }
                }
                else {
                    if(buttons[i].getText() == ""){
                        buttons[i].setForeground(new Color(0, 0, 255));
                        buttons[i].setText("O");
                        player1Turn = true;
                        textField.setText("X's turn");
                        check();
                    }
                }
            }
        }

        // Resets the game using resetGame() method
        if (e.getSource() == resetButton) {
            resetGame();
        }
    }

    // Randomly selects which player (X or O) will start the game
    public void firstTurn(){
        try{
            Thread.sleep(2000); // Game title will display for 2 seconds, then the player's turn will display
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        if(random.nextInt(2) == 0) {
            player1Turn = true;
            textField.setText("X's turn");
        }
        else {
            player1Turn = false;
            textField.setText("O's turn");
        }
    }

    // check() method checks when there is a winner
    public void check(){
        // Check for X Winning Conditions

        // Row X Wins
        if(
            (buttons[0].getText() == "X") &&
            (buttons[1].getText() == "X") &&
            (buttons[2].getText() == "X")
        ) {
            xWins(0, 1, 2);
        }
        else if(
            (buttons[3].getText() == "X") &&
            (buttons[4].getText() == "X") &&
            (buttons[5].getText() == "X")
        ) {
            xWins(3, 4, 5);
        }
        else if(
            (buttons[6].getText() == "X") &&
            (buttons[7].getText() == "X") &&
            (buttons[8].getText() == "X")
        ) {
            xWins(6, 7, 8);
        }
        
        // Column X Wins
        else if(
            (buttons[0].getText() == "X") &&
            (buttons[3].getText() == "X") &&
            (buttons[6].getText() == "X")
        ) {
            xWins(0, 3, 6);
        }
        else if(
            (buttons[1].getText() == "X") &&
            (buttons[4].getText() == "X") &&
            (buttons[7].getText() == "X")
        ) {
            xWins(1, 4, 7);
        }
        else if(
            (buttons[2].getText() == "X") &&
            (buttons[5].getText() == "X") &&
            (buttons[8].getText() == "X")
        ) {
            xWins(2, 5, 8);
        }

        // Diagonal X Wins
        else if(
            (buttons[0].getText() == "X") &&
            (buttons[4].getText() == "X") &&
            (buttons[8].getText() == "X")
        ) {
            xWins(0, 4, 8);
        }
        else if(
            (buttons[2].getText() == "X") &&
            (buttons[4].getText() == "X") &&
            (buttons[6].getText() == "X")
        ) {
            xWins(2, 4, 6);
        }
        
        // Check for O Winning Conditions

        // Row O Wins
        else if(
            (buttons[0].getText() == "O") &&
            (buttons[1].getText() == "O") &&
            (buttons[2].getText() == "O")
        ) {
            oWins(0, 1, 2);
        }
        else if(
            (buttons[3].getText() == "O") &&
            (buttons[4].getText() == "O") &&
            (buttons[5].getText() == "O")
        ) {
            oWins(3, 4, 5);
        }
        else if(
            (buttons[6].getText() == "O") &&
            (buttons[7].getText() == "O") &&
            (buttons[8].getText() == "O")
        ) {
            oWins(6, 7, 8);
        }

        // Column O Wins
        else if(
            (buttons[0].getText() == "O") &&
            (buttons[3].getText() == "O") &&
            (buttons[6].getText() == "O")
        ) {
            oWins(0, 3, 6);
        }
        else if(
            (buttons[1].getText() == "O") &&
            (buttons[4].getText() == "O") &&
            (buttons[7].getText() == "O")
        ) {
            oWins(1, 4, 7);
        }
        else if(
            (buttons[2].getText() == "O") &&
            (buttons[5].getText() == "O") &&
            (buttons[8].getText() == "O")
        ) {
            oWins(2, 5, 8);
        }

        // Diagonal O Wins
        else if(
            (buttons[0].getText() == "O") &&
            (buttons[4].getText() == "O") &&
            (buttons[8].getText() == "O")
        ) {
            oWins(0, 4, 8);
        }
        else if(
            (buttons[2].getText() == "O") &&
            (buttons[4].getText() == "O") &&
            (buttons[6].getText() == "O")
        ) {
            oWins(2, 4, 6);
        }

        // Draw - no winner
        else if(
            (buttons[0].getText() != "") &&
            (buttons[1].getText() != "") &&
            (buttons[2].getText() != "") &&
            (buttons[3].getText() != "") &&
            (buttons[4].getText() != "") &&
            (buttons[5].getText() != "") &&
            (buttons[6].getText() != "") &&
            (buttons[7].getText() != "") &&
            (buttons[8].getText() != "")
        ) {
            textField.setText("Tie!");
        }
    }

    // xWins() method will highlight which spots x won in
    public void xWins(int a, int b, int c){
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        // Sets new button color opacity to be true
        buttons[a].setOpaque(true);
        buttons[b].setOpaque(true);
        buttons[c].setOpaque(true);
        
        // Disable buttons after player X wins
        for(int i = 0; i < 9; i++){
            buttons[i].setEnabled(false);
        }

        textField.setText("X Wins!");
    }
    // 0Wins() method will highlight which spots x won in
    public void oWins(int a, int b, int c){
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        // Sets new button color opacity to be true
        buttons[a].setOpaque(true);
        buttons[b].setOpaque(true);
        buttons[c].setOpaque(true);

        // Disable buttons after player O wins
        for(int i = 0; i < 9; i++){
            buttons[i].setEnabled(false);
        }

        textField.setText("O Wins!");
    }

    // Method for resetting game
    public void resetGame() {
        for (int i = 0; i < 9; i++) {
            buttons[i].setText("");
            buttons[i].setEnabled(true);
            buttons[i].setBackground(new JButton().getBackground());
        }
        textField.setText("Tic-Tac-Toe");
        firstTurn(); // Randomly selects a new player to start the game
    }
}