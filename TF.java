import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class TF implements ActionListener{
    // Label for text
    JLabel L1, L2;
    // For Text box
    JTextField jtf;
    // Generating random no 1 to 100
    int random_num = new Random().nextInt(99)+1;
    int NumberOf_try = 0;
    TF(){
        JFrame jfrm = new JFrame("Guess the number 1 to 100");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(270,150);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jbtn = new JButton("Submit Guess");
        jbtn.setActionCommand("guess");
        jbtn.addActionListener(this);
        jtf = new JTextField(10);
        jtf.setActionCommand("number");
        jtf.addActionListener(this);
        L1 = new JLabel("Enter guess number ");
        L2 = new JLabel("");
        jfrm.add(L1);
        jfrm.add(jtf);
        jfrm.add(jbtn);
        jfrm.add(L2);
        jfrm.setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        int num = Integer.parseInt(jtf.getText());
        NumberOf_try++;
        if (num == random_num)
        {
            JFrame jFrame = new JFrame();
            JOptionPane.showMessageDialog(jFrame, "Congratulations! You win \nIt took you "+NumberOf_try+ " NumberOf_try...");
            L2.setText("Close Game");
        }
        else if (num < random_num)
        {
            L2.setText("Guess higher Number");
        }
        else if (num > random_num){
            L2.setText("Guess lower Number");
        }

    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new TF();
            }
        });
    }
}