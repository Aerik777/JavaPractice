import javax.swing.*;

public class SwingInheritance extends JFrame{
    JFrame f;
    SwingInheritance(){
        JButton btn = new JButton("Click");
        btn.setBounds(130, 100, 130, 40);
        add(btn);
        setSize(400, 500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new SwingInheritance();
    }
}
