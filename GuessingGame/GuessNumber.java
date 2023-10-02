// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.util.Random;

// public class GuessNumber {
//     private int level;
//     private int maxAttempts;
//     private int randomNumber;
//     private int attempts;
//     private int score;
//     private JFrame frame;
//     private JTextField guessField;
//     private JButton guessButton;
//     private JLabel resultLabel;
//     private JLabel scoreLabel;
//     private JLabel attemptLabels;

//     public GuessNumber() {
//         level = 1;
//         maxAttempts = 10;
//         newGame();

//         frame = new JFrame("Guess the Number");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setSize(1400, 1000);
//         frame.setLayout(new GridLayout(5, 1));

//         guessField = new JTextField();
//         guessButton = new JButton("Guess");
//         resultLabel = new JLabel("");
//         scoreLabel = new JLabel("Score: " + score);
//         attemptLabels = new JLabel();

//         guessField.setFont(new Font("Calibre" ,Font.BOLD,40));

//         frame.add(new JLabel("Level " + level + ": I'm thinking of a number between 1 and 100."));
//         frame.add(new JLabel("You have " + maxAttempts + " attempts."));
//         frame.add(guessField);
//         frame.add(guessButton);
//         frame.add(resultLabel);
//         frame.add(scoreLabel);
//         frame.add(attemptLabels);

//         guessButton.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 checkGuess();
//             }
//         });

//         frame.setVisible(true);
//     }

//     private void newGame() {
//         Random rand = new Random();
//         randomNumber = rand.nextInt(100) + 1;
//         attempts = 0;
//     }

//     private void checkGuess() {
//         try {
//             int userGuess = Integer.parseInt(guessField.getText());
//             attempts++;

//             if (userGuess == randomNumber) {
//                 resultLabel.setText("Congratulations! You guessed it in " + attempts + " attempts.");
//                 guessField.setEnabled(false);
//                 guessButton.setEnabled(false);
//                 score += maxAttempts - attempts + 1;
//                 scoreLabel.setText("Score: " + score);
//                 level++;
//                 maxAttempts += 2; // Increase attempts for the next level
//                 newGame();
//                 guessField.setEnabled(true);
//                 guessButton.setEnabled(true);
//                 resultLabel.setText("");
//                 scoreLabel.setText("Score: " + score);
//                 frame.setTitle("Guess the Number - Level " + level);
//                 frame.remove(0); // Remove previous level label
//                 frame.add(new JLabel("Level " + level + ": I'm thinking of a number between 1 and 100."));
//                 frame.add(new JLabel("You have " + maxAttempts + " attempts."));
//                 frame.add(attemptLabels);
//                 frame.validate();
//             } else if (attempts >= maxAttempts) {
//                 resultLabel.setText("Out of attempts. The number was " + randomNumber + ".");
//                 guessField.setEnabled(false);
//                 guessButton.setEnabled(false);
//             } else if (userGuess < randomNumber) {
//                 attemptLabels.setText("You have "+(maxAttempts-attempts)+" Attempts Left !");
//                 resultLabel.setText("Try a higher number.");
//             } else {
//                 resultLabel.setText("Try a lower number.");
//                 attemptLabels.setText("You have "+(maxAttempts-attempts)+" Attempts Left !");
//             }
//         } catch (NumberFormatException ex) {
//             resultLabel.setText("Please enter a valid number.");
//         }
//         guessField.setText("");
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(new Runnable() {
//             public void run() {
//                 new GuessNumber();
//             }
//         });
//     }
// }


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessNumber {

    private int level;
    private int maxAttempts;
    private int randomNumber;
    private int attempts;
    private int score;
    private JFrame frame;
    private JTextField guessField;
    private JButton guessButton;
    private JLabel resultLabel;
    private JLabel scoreLabel;
    private JLabel attemptLabels;
    private JLabel levelEsti;
    private JLabel maxAttemptsEsti;

    public GuessNumber() {
        level = 1;
        maxAttempts = 10;
        newGame();

        frame = new JFrame("Guess the Number");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1400, 1000);
        frame.setLayout(new GridLayout(5, 1));

        guessField = new JTextField();
        guessButton = new JButton("Guess");
        resultLabel = new JLabel("");
        scoreLabel = new JLabel("Score: " + score);
        attemptLabels = new JLabel();

        guessField.setFont(new Font("Calibre", Font.BOLD, 40));
        levelEsti  = new JLabel("Level " + level + ": I'm thinking of a number between 1 and 100.");

        frame.add(levelEsti);
        maxAttemptsEsti = new JLabel("You have " + maxAttempts + " attempts.");
        frame.add(maxAttemptsEsti);
        frame.add(guessField);
        frame.add(guessButton);
        frame.add(resultLabel);
        frame.add(scoreLabel);
        frame.add(attemptLabels);

        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkGuess();
            }
        });

        frame.setVisible(true);
    }

    private void newGame() {
        Random rand = new Random();
        randomNumber = rand.nextInt(100) + 1;
        attempts = 0;
    }

    private void checkGuess() {
        try {
            int userGuess = Integer.parseInt(guessField.getText());
            System.out.println(randomNumber);
            attempts++;

            if (userGuess == randomNumber) {
                resultLabel.setText("Congratulations! You guessed it in " + attempts + " attempts.");
              
                guessField.setEnabled(false);
                guessButton.setEnabled(false);
                score += maxAttempts - attempts + 1;
                scoreLabel.setText("Score: " + score);
                level++;
                maxAttempts += 2; // Increase attempts for the next level
                newGame();
                guessField.setEnabled(true);
                guessButton.setEnabled(true);
                resultLabel.setText("");
                scoreLabel.setText("Score: " + score);
                frame.setTitle("Guess the Number - Level " + level);
                // frame.remove(0); // Remove previous level label
                // frame.add(new JLabel("Level " + level + ": I'm thinking of a number between 1 and 100."));
                levelEsti.setText("Level " + level + ": I'm thinking of a number between 1 and 100.");
                // frame.add(new JLabel("You have " + maxAttempts + " attempts."));
                frame.add(attemptLabels);
                frame.validate();
                maxAttemptsEsti.setText("You have " + maxAttempts + " attempts.");
            } else if (attempts >= maxAttempts) {
                resultLabel.setText("Out of attempts. The number was " + randomNumber + ".");
                guessField.setEnabled(false);
                guessButton.setEnabled(false);
            } else if (userGuess < randomNumber) {
                attemptLabels.setText("You have " + (maxAttempts - attempts) + " Attempts Left !");
                resultLabel.setText("Try a higher number.");
            } else {
                resultLabel.setText("Try a lower number.");
                attemptLabels.setText("You have " + (maxAttempts - attempts) + " Attempts Left !");
            }
        } catch (NumberFormatException ex) {
            resultLabel.setText("Please enter a valid number.");
        }
        guessField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GuessNumber();
            }
        });
    }
}
