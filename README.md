# TicTacToe Game

## Description
This is a simple TicTacToe game implemented in Java using Swing for the GUI. The game allows two players to take turns marking spaces in a 3x3 grid, with the objective of getting three of their marks in a row horizontally, vertically, or diagonally. Once a winner is decided, the winning characters are highlighted in green.

## Screenshots
<img width="400" alt="Screenshot of Tic Tac Toe game board. A text field shows O's turn is next at the top" src="https://github.com/jdrome/JavaTicTacToe/assets/127639707/8f78e79f-d361-4e47-a174-4527f2ebce59">

<img width="400" alt="Screenshot of Tic Tac Toe game board. Player O has won the game diagonally from left to right. A text field shows O wins at the top." src="https://github.com/jdrome/JavaTicTacToe/assets/127639707/77a85570-d9c8-4065-a220-e7c5897712e0">


## Features
- Two-player mode
- Graphical user interface using Swing
- Randomized first turn
- Visual indication of the winning line

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
    git clone https://github.com/yourusername/TicTacToe.git
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

## Upcoming Features
1. A button users can push to reset the game after a game has ended.
2. A message that appears once a game is ended in a draw with no winner. 

## License
This project is licensed under the MIT License. See the license.txt file for more details.

## Contact:
- GitHub: jdrome
- Email: josedanilromero@gmail.com
