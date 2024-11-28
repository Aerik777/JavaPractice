import javax.swing.*;
import java.awt.*;

public class form extends JFrame{
    JFrame j;
    JButton btn;
    JLabel l,l1, l2, l3, l4, l5, l6;
    JTextField tf1, tf2, tf3, tf4, tf5, tf6;

    form(){
        setTitle("User Registration");

        l = new JLabel("New user registration");
        l.setFont(new Font("serif", Font.BOLD, 20));
        l.setBounds(200, 50, 300 ,50);
        add(l);

        //l1
        l1 = new JLabel("first name:");
        l1.setFont(new Font("serif", Font.BOLD, 20));
        l1.setBounds(15, 110, 200, 40);
        add(l1);

        tf1 = new JTextField();
        tf1.setBounds(115, 120, 200, 40);
        add(tf1);

        //l2
        l2 = new JLabel("Username:");
        l2.setFont(new Font("serif", Font.BOLD, 20));
        l2.setBounds(400, 110, 200, 40);
        add(l2);

        tf2 = new JTextField();
        tf2.setBounds(500, 120, 200, 40);
        add(tf2);

         //l3
         l3 = new JLabel("Last name:");
         l3.setFont(new Font("serif", Font.BOLD, 20));
         l3.setBounds(15, 210, 200, 40);
         add(l3);
 
         tf3 = new JTextField();
         tf3.setBounds(115, 220, 200, 40);
         add(tf3);
 
         //l4
         l4 = new JLabel("Password:");
         l4.setFont(new Font("serif", Font.BOLD, 20));
         l4.setBounds(400, 210, 200, 40);
         add(l4);
 
         tf4 = new JPasswordField();
         tf4.setBounds(500, 220, 200, 40);
         add(tf4);

         //l5
         l5 = new JLabel("Email Address:");
         l5.setFont(new Font("serif", Font.BOLD, 20));
         l5.setBounds(15, 310, 200, 40);
         add(l5);
 
         tf5 = new JTextField();
         tf5.setBounds(150, 320, 200, 40);
         add(tf5);
 
         //l6
         l6 = new JLabel("Mobile Number:");
         l6.setFont(new Font("serif", Font.BOLD, 20));
         l6.setBounds(400, 310, 200, 40);
         add(l6);
 
         tf6 = new JTextField();
         tf6.setBounds(550, 320, 200, 40);
         add(tf6);

         btn = new JButton("Register");
         btn.setBounds(350, 420, 200, 40);
         add(btn);
        
        setSize(600, 500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new form();
    }
}
