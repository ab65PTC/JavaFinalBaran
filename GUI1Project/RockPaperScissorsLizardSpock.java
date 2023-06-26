import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class RockPaperScissorsLizardSpock extends JFrame {
    private JLabel playerLabel;
    private JLabel computerLabel;
    private JLabel resultLabel;

    public RockPaperScissorsLizardSpock() {
        setTitle("Rock Paper Scissors Lizard Spock");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        playerLabel = new JLabel();
        computerLabel = new JLabel();
        resultLabel = new JLabel();

        JButton rockButton = createButton("Rock", "../Final/GUI1Project/rock.png");
        JButton paperButton = createButton("Paper", "../Final/GUI1Project/paper.png");
        JButton scissorsButton = createButton("Scissors", "../Final/GUI1Project/scissors.png");
        JButton lizardButton = createButton("Lizard", "../Final/GUI1Project/lizard.png");
        JButton spockButton = createButton("Spock", "../Final/GUI1Project/spock.png");

        rockButton.addActionListener(new ButtonListener());
        paperButton.addActionListener(new ButtonListener());
        scissorsButton.addActionListener(new ButtonListener());
        lizardButton.addActionListener(new ButtonListener());
        spockButton.addActionListener(new ButtonListener());

        add(playerLabel);
        add(computerLabel);
        add(resultLabel);
        add(rockButton);
        add(paperButton);
        add(scissorsButton);
        add(lizardButton);
        add(spockButton);

        pack();
        setVisible(true);
    }

    private JButton createButton(String text, String iconFilename) {
        JButton button = new JButton(text);
        ImageIcon icon = new ImageIcon(iconFilename);
        Image image = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        button.setIcon(new ImageIcon(image));
        return button;
    }
    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String playerChoice = ((JButton) e.getSource()).getText();
            String computerChoice = generateComputerChoice();

            playerLabel.setText("Player: " + playerChoice);
            computerLabel.setText("Computer: " + computerChoice);

            String result = determineWinner(playerChoice, computerChoice);
            resultLabel.setText(result);
        }
    }

    private String generateComputerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors", "Lizard", "Spock"};
        int randomIndex = (int) (Math.random() * choices.length);
        return choices[randomIndex];
    }

    private String determineWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equals(computerChoice)) {
            return "It's a tie!";
        }

        switch (playerChoice) {
            case "Rock":
                if (computerChoice.equals("Paper")){
                return "Computer wins! Paper covers rock!";
                }
                else if (computerChoice.equals("Spock")){
                    return "Computer wins! Spock vaporizes rock!";
                }
                else if (computerChoice.equals("Scissors")){
                    return "Player wins! Rock crushes scissors!";
                }
                else{
                    return "Player wins! Rock crushes lizard!";
                }
            case "Paper":
                if (computerChoice.equals("Rock")){
                return "Player wins! Paper covers rock!";
                }
                else if (computerChoice.equals("Spock")){
                    return "Player wins! Paper disproves Spock!";
                }
                else if (computerChoice.equals("Scissors")){
                    return "Computer wins! Scissors cuts paper!";
                }
                else{
                    return "Computer wins! Lizard eats paper!";
                }
            case "Scissors":
                if (computerChoice.equals("Paper")){
                return "Player wins! Scissors cuts paper!";
                }
                else if (computerChoice.equals("Spock")){
                    return "Computer wins! Spock smashes scissors!";
                }
                else if (computerChoice.equals("Rock")){
                    return "Computer wins! Rock crushes scissors!";
                }
                else{
                    return "Player wins! Scissors decapitates lizard!";
                }
            case "Lizard":
                if (computerChoice.equals("Paper")){
                return "Player wins! Lizard eats paper!";
                }
                else if (computerChoice.equals("Spock")){
                    return "Player wins! Lizard poisons Spock!";
                }
                else if (computerChoice.equals("Scissors")){
                    return "Computer wins! Scissors decapitates lizard!";
                }
                else{
                    return "Computer wins! Rock crushes lizard!";
                }
            case "Spock":
                if (computerChoice.equals("Paper")){
                return "Computer wins! Paper disproves Spock!";
                }
                else if (computerChoice.equals("Rock")){
                    return "Player wins! Spock vaporizes rock!";
                }
                else if (computerChoice.equals("Scissors")){
                    return "Player wins! Spock smashes scissors!";
                }
                else{
                    return "Computer wins! Lizard poisons Spock!";
                }
            default:
                return "";
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RockPaperScissorsLizardSpock());
    }
}
