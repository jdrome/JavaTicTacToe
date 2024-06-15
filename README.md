# TicTacToe Game

## Description
This is a simple TicTacToe game implemented in Java using Swing for the GUI. The game allows two players to take turns marking spaces in a 3x3 grid, with the objective of getting three of their marks in a row horizontally, vertically, or diagonally. Once a winner is decided, the winning characters are highlighted in green.

## Screenshots
<img width="300" alt="Screenshot 2024-06-13 at 2 00 06 PM" src="https://github.com/jdrome/JavaTicTacToe/assets/127639707/9d246689-92d8-4cfa-af7d-404c8a17dfde">

<img width="300" alt="Screenshot 2024-06-13 at 2 00 28 PM" src="https://github.com/jdrome/JavaTicTacToe/assets/127639707/bdb6003e-7184-4d58-b977-e4adf2f272ba">

<img width="300" alt="Screenshot 2024-06-13 at 2 00 44 PM" src="https://github.com/jdrome/JavaTicTacToe/assets/127639707/28c36fec-5448-41d5-b2da-4ef98757715c">


## Features
- Two-player mode
- Graphical user interface using Swing
- Randomized first turn
- Visual indication of the winning line
- Textbox that communicates player's turn, winner, and when there is a tie
- Reset button to restart game

## File Structure
The project consists of the following files:
- `TicTacToe.java`: Contains the main logic and GUI for the TicTacToe game.
- `TicTacToe.class`: Compiled version of `TicTacToe.java`.
- `Main.java`: The entry point of the application that initializes the game.
- `Main.class`: Compiled version of `Main.java`.
- `License.txt`: MIT License for the project.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher installed on your machine.
- An IDE or text editor for Java development (e.g., IntelliJ IDEA, Eclipse, VS Code).

### Installation
1. Clone the repository to your local machine:
    ```sh
    git clone https://github.com/jdrome/JavaTicTacToe.git JavaTicTacToe
    ```

2. Navigate to the project directory:
    ```sh
    cd TicTacToe
    ```

3. Open the project in your preferred Java IDE.

### Running the Game
1. Compile the Java files:
    ```sh
    javac TicTacToe.java Main.java
    ```

2. Run the compiled `Main` class:
    ```sh
    java Main
    ```

## Usage
- Click on the buttons in the 3x3 grid to mark your move.
- The game will alternate turns between 'X' and 'O'.
- The game will indicate the winner by highlighting the winning line in green.
- The game board can be reset by restarting the application.

### Example
1. To start the game, simply run the `Main` class.
2. The game will randomly decide which player goes first.
3. Players take turns clicking on the buttons to place their marks.
4. The first player to get three of their marks in a row wins, and the winning line is highlighted.
5. Once players want to restart the game, they can hit the reset button on the bottom of the board at any time, and the game will begin anew. 

## License
This project is licensed under the MIT License. See the license.txt file for more details.

## Contact:
- GitHub: jdrome
- Email: josedanilromero@gmail.com
