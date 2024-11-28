import javax.swing.*;
import java.awt.*;

public class clickEvent  extends JFrame{
    JTextField tf;
    JLabel l;
    JButton btn;

    clickEvent(){
        setTitle("Name App");

        l = new JLabel("Enter your name");
        l.setFont(new Font("serif", Font.BOLD, 20));
        l.setBounds(15, 80, 200 , 40);
        add(l);

        tf = new JTextField();
        tf.setBounds(200, 80, 200, 40);
        add(tf);

        btn = new JButton("Add");
        btn.setBounds(115, 180, 80, 40);
        add(btn);

        btn.addActionListener(e-> {
          
            String name = tf.getText();
            JOptionPane.showMessageDialog(null, "Your name is " + name);
          
        });

        setSize(600, 600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new clickEvent();
    }
}
