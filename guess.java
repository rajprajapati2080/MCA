import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class guess implements ActionListener{
    JLabel jlab, jlab2;
    JTextField jtf;
    int internal_guess = new Random().nextInt(99)+1;
    int tries = 0;
    guess(){
        JFrame jfrm = new JFrame("Guess the number (1-100)");
        
        jfrm.setLayout(new FlowLayout());
        
        jfrm.setSize(250,130);
        
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton jbtn = new JButton("Submit Guess");
        jbtn.setActionCommand("guess");
        jbtn.addActionListener(this);
        
        // jfrm.add(jbtn);

        jtf = new JTextField(10);
        jtf.setActionCommand("number");
        jtf.addActionListener(this);

        
        jlab = new JLabel("Take a guess");
        jlab2 = new JLabel("");
        jfrm.add(jlab);
        jfrm.add(jtf);
        jfrm.add(jbtn);
        jfrm.add(jlab2);
        jfrm.setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        tries++;
        int g = Integer.parseInt(jtf.getText());
        if (g == internal_guess)
        {
            JFrame jFrame = new JFrame();
            JOptionPane.showMessageDialog(jFrame, "Congratulations! You guessed it right! \nIt took you "+tries+ " tries...");
            jlab2.setText("You can close the game now.");
        }
        else if (g < internal_guess)
        {
            jlab2.setText("Guess higher..");
        }
        else{
            jlab2.setText("Guess lower..");
        }

    }
    
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
           public void run(){
               new guess();
           }
        });
    }
}