/**
 * ExJframe
 */
import javax.swing.*;
import java.awt.event.*;

public class ExJframe extends JFrame implements ActionListener{
    JFrame j;
    JTextField tf;
    JLabel lbl;
    JButton btn;

    ExJframe(){
        
        tf = new JTextField();
        tf.setBounds(50,50,150,20);
        add(tf);

        //JButton
        btn = new JButton("FInd IP");
        btn.setBounds(500, 150, 95 ,30);
        btn.addActionListener(this);
        add(btn);

        //JLabel
        lbl = new JLabel();
        lbl.setBounds(50, 100, 250, 20);
        setSize(400, 400);
        add(lbl);

        //JFrame settings
        setTitle("My App");
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        
        try{
            String host = tf.getText();
            String Ip = java.net.InetAddress.getByName(host).getHostAddress();
            lbl.setText("IP of "+ host + "is: " +Ip);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    public static void main(String[] args) {
        new ExJframe(); 
    }
}