import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex10_3{
    public static void main(String[] args) {
        // Create a JFrame (window) and set its properties
        JFrame frame = new JFrame("Button Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        // Create a JPanel to hold the buttons and label
        JPanel panel = new JPanel();
        frame.add(panel);

        // Create a label to display the button press message
        JLabel label = new JLabel();
        panel.add(label);

        // Create the "Yes" button
        JButton yesButton = new JButton("Yes");
        panel.add(yesButton);

        // Create the "No" button
        JButton noButton = new JButton("No");
        panel.add(noButton);

        // Create the "Close" button
        JButton closeButton = new JButton("Close");
        panel.add(closeButton);

        // Add ActionListener for the "Yes" button
        yesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Yes is pressed");
            }
        });

        // Add ActionListener for the "No" button
        noButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button No is pressed");
            }
        });

        // Add ActionListener for the "Close" button
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Close the window
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}