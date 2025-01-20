package assignment_11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator
{
    public static void main(String args[])
    {
        JFrame frame = new JFrame("calculator");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField textField = new JTextField();
        textField.setHorizontalAlignment(JTextField.RIGHT);
        frame.add(textField, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,4 ));
        frame.add(panel, BorderLayout.CENTER);

        String[] buttons = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"};

        final double[] firstOperand={0};
        final String[] operator={" "};
        
        for(String label : buttons){
        JButton button = new JButton(label);
        panel.add(button);

        button.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    String text = button.getText();

                    if("=".equals(text))
                    {
                        try
                        {
                            double secondOperand = Double.parseDouble(textField.getText());
                            switch (operator[0]) {
                                case "+": textField.setText(String.valueOf(firstOperand[0] + secondOperand)); break;
                                case "-": textField.setText(String.valueOf(firstOperand[0] - secondOperand)); break;
                                case "*": textField.setText(String.valueOf(firstOperand[0] * secondOperand)); break;
                                case "/": textField.setText(secondOperand != 0 ? String.valueOf(firstOperand[0] / secondOperand) : "Error"); break;
                            }
                        }
                        catch (Exception ex) {
                            textField.setText("Error");
                        }
                    }
                    else if ("+".equals(text) || "-".equals(text) || "*".equals(text) || "/".equals(text)) {
                        firstOperand[0] = Double.parseDouble(textField.getText());
                        operator[0] = text;
                        textField.setText("");
                    }
                    else {
                        textField.setText(textField.getText() + text);
                    }
                }

        });
    }
    frame.setVisible(true);

    }
}