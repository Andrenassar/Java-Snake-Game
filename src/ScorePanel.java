import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
 
public class ScorePanel extends JPanel
                                         implements ActionListener {
      
       private int score;
       private Timer timer;
       private int countdown;
      
      
       public ScorePanel(){
              this.setLayout(new FlowLayout());
              this.setBackground(Color.blue);
             
              final JLabel scoreLabel = new JLabel("current score: " + score);
              scoreLabel.setForeground(Color.white);
             
              final JLabel timeLabel = new JLabel("Time: ");
              timeLabel.setForeground(Color.white);
             
              add(scoreLabel);
              add(timeLabel);
             
             
             
              // not sure if this timer is correct. Might get errors later
              final long start = System.currentTimeMillis();
              Timer timer = new Timer(1000, new ActionListener(){
                  @Override
                  public void actionPerformed(ActionEvent e) {
                    
                      timeLabel.setText("Time: " +((System.currentTimeMillis() - start))/1000);
                      scoreLabel.setText("Score: "  + score);
                     // scoreUpdate(score);
                      
                  }

              });
              timer.start();
       }
 
 
       @Override
       public void actionPerformed(ActionEvent e) {
              // TODO Auto-generated method stub
              timer.start();
             
       }
      
}