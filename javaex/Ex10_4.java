import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

public class Ex10_4 {
    public static void main(String[] args) {
        // Create a JFrame (window) and set its properties
        JFrame frame = new JFrame("Choice List Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        // Create a JPanel to hold components
        JPanel panel = new JPanel();
        frame.add(panel);

        // Create a label
        JLabel label = new JLabel("Select an item:");
        panel.add(label);

        // Create a choice list
        Choice choice = new Choice();
        choice.add("Item 1");
        choice.add("Item 2");
        choice.add("Item 3");
        panel.add(choice);

        // Make the frame visible
        frame.setVisible(true);
    }
}

