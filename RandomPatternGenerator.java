import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class RandomPatternGenerator extends JFrame {
    private JTextArea patternTextArea;

    public RandomPatternGenerator() {
        setTitle("Random Pattern Generator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create button
        JButton generateButton = new JButton("Generate Pattern");
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generatePattern();
            }
        });

        // Create text area
        patternTextArea = new JTextArea();
        patternTextArea.setEditable(false);

        // Add components to frame
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(generateButton, BorderLayout.NORTH);
        getContentPane().add(new JScrollPane(patternTextArea), BorderLayout.CENTER);

        setVisible(true);
    }

    private void generatePattern() {
        StringBuilder pattern = new StringBuilder();
        Random random = new Random();
        // Generate random pattern here, for example:
        int rows = random.nextInt(10) + 1; // Random number of rows (1 to 10)
        for (int i = 0; i < rows; i++) {
            int cols = random.nextInt(10) + 1; // Random number of columns (1 to 10)
            for (int j = 0; j < cols; j++) {
                pattern.append(random.nextBoolean() ? "* " : "- "); // Randomly choose between '*' and '-'
            }
            pattern.append("\n");
        }
        patternTextArea.setText(pattern.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RandomPatternGenerator();
            }
        });
    }
}
