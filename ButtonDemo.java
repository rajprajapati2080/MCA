import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.sound.sampled.*;
import java.net.URL;
import java.io.*;

class abc implements ActionListener{
    public void actionPerformed(ActionEvent ae){
        JLabel jlab;
        JFrame jfrm = new JFrame("new booty");  
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setLayout(new FlowLayout());

        jfrm.setSize(220,90);
        jlab = new JLabel("booty good");
        
        
        try
        {
            URL file = new URL("file:./moan.wav");
            //URL file = new URL("file:c:/users/netro/java/flyby1.wav");
            // URL file = new URL("https://www.wavsource.com/snds_2020-10-01_3728627494378403/sfx/air_raid.wav");

            AudioInputStream ais = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(ais);
            clip.setFramePosition(0);
            clip.start();
            jfrm.add(jlab);
        }
        catch(Exception c)
        {
            System.out.println(c);

        }
        

    }
}

public class ButtonDemo{ 
    JLabel jlab;
    ButtonDemo(){
        abc action = new abc();
        JFrame jfrm = new JFrame("A Button Example");  
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setLayout(new FlowLayout());

        jfrm.setSize(220,90);
        // jfrm.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        // jfrm.setUndecorated(true);

        JButton jbtnUp = new JButton("Up");
        JButton jbtnDown = new JButton("Down");
        
        jbtnUp.addActionListener(action);
        jbtnDown.addActionListener(action);
        
        jfrm.add(jbtnUp);
        jfrm.add(jbtnDown);
        // 
        jlab = new JLabel("Press a Button");
        
        jfrm.add(jlab);
        
        jfrm.setVisible(true);  
    }
    
    
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
           public void run(){
               new ButtonDemo();
           }
        });
    }
}