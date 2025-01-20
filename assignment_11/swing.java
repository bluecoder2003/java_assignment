package assignment_11;
import javax.swing.*;

public class swing {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Simple Form");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        // Create components
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        JRadioButton maleButton = new JRadioButton("Male");
        JRadioButton femaleButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        JButton submitButton = new JButton("Submit");

        // Add components to frame
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(maleButton);
        frame.add(femaleButton);
        frame.add(submitButton);

        // Display the frame
        frame.setVisible(true);
    }
}
