package digitalClock;

import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JFrame;

// membuat subclass dari JFrame
public class DigitalClock extends JFrame{
    JLabel jlabClock;
    ClockThread ct;
    
    public DigitalClock(){
        jlabClock = new JLabel ("");
        setLayout ( new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jlabClock.setFont(new Font ("Arial", Font.CENTER_BASELINE, 80));
        jlabClock.setOpaque(true);
        jlabClock.setBackground(Color.BLUE);
        jlabClock.setForeground(Color.white);
        add(jlabClock);
        setSize(1200, 120); //set ukuran label
        setLocationRelativeTo(null);
        ct = new ClockThread(this);
        setVisible(true);
    }
    
    public static void main(String[] args){
       new DigitalClock();
    }
}


