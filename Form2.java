import javax.swing.*;
import java.awt.*;

public class Form2 extends JFrame{
    JFrame j;
    JButton btn1, btn2;
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;

    Form2(){
        setTitle("MyForm App");

        l1 = new JLabel("Enter first  number");
        l1.setFont(new Font("serif", Font.BOLD, 20));
        l1.setBounds(15, 80, 200 , 40);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(200, 80, 200, 40);
        add(t1);

        l2 = new JLabel("Enter Second number");
        l2.setFont(new Font("serif", Font.BOLD, 20));
        l2.setBounds(15, 180, 200 , 40);
        add(l2);

        t2 = new JTextField();
        t2.setBounds(200, 180, 200, 40);
        add(t2);

        l3 = new JLabel("Result");
        l3.setFont(new Font("serif", Font.BOLD, 20));
        l3.setBounds(55, 280, 200 , 40);
        add(l3);

        t3 = new JTextField();
        t3.setBounds(200, 280, 200, 40);
        t3.setEditable(false);
        add(t3);

        btn1 = new JButton("ADD");
        btn1.setBounds(90, 380, 90, 40);
        add(btn1);

        btn2 = new JButton("Cancel");
        btn2.setBounds(200, 380, 90, 40);
        add(btn2);

        btn1.addActionListener(e -> {
            try{
                double num1 = Double.parseDouble(t1.getText());
                double num2 = Double.parseDouble(t2.getText());
                t3.setText(String.valueOf(num1 + num2));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Enter valid number", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        btn2.addActionListener(e -> {
            t1.setText("");
            t2.setText("");
            t3.setText("");
        });

        setSize(600, 500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Form2();
    }
}
