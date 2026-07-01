
# Number Guessing Game

A simple console-based Number Guessing Game built in Java. The computer randomly selects a number between **1 and 100**, and the player has **5 attempts** to guess it correctly.

## Features

* Random number generation
* Limited number of attempts
* Feedback after each guess ("Too High" / "Too Low")
* Replay option to play multiple rounds
* Uses try-with-resources for safe resource management
* Clean and beginner-friendly Java code

## Technologies Used

* Java
* VS Code
* Git
* GitHub

## Project Structure

```
01-number-guessing-game/
├── README.md
├── screenshots/
└── src/
    └── NumberGuessingGame.java
```

## How to Run

1. Clone the repository.
2. Open the project in VS Code or your preferred Java IDE.
3. Navigate to the `src` folder.
4. Compile the program:

```bash
javac NumberGuessingGame.java
```

5. Run the program:

```bash
java NumberGuessingGame
```

## Sample Output

```
Welcome to the Number Guessing Game!

I have selected a number between 1 and 100.
You have 5 attempts.

Enter your guess: 50
Too high! Try again.

Enter your guess: 25
Too low! Try again.
```

## Concepts Practiced

* Variables and Data Types
* User Input (`Scanner`)
* Conditional Statements (`if-else`)
* Loops (`while` and `do-while`)
* Methods
* Random Number Generation (`Math.random()`)
* Constants (`final`)
* Try-with-resources
* Basic Program Design

## Future Improvements

* Difficulty Levels (Easy, Medium, Hard)
* Input Validation
* Score Tracking
* High Score System
* Multiple Players
* Graphical User Interface (GUI)

## Author

**Siddhima Tiwari**

This project is part of my Java learning journey and GitHub portfolio.
=======
## Updated Features

- Input validation for non-numeric values
- Range validation (1–100)
