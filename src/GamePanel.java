
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
 
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
public class GamePanel extends JPanel {
      
      // private Snake snake;
      
       public GamePanel() {
              this.setLayout(new GridLayout(25,25));
              this.setBackground(Color.black);
             
              for (int i=0; i<25; i++){
                     for(int j=0; j<25; j++){
                           final JLabel label = new JLabel("bla");
                           label.setBorder(BorderFactory.createLineBorder(Color.pink));
                           add(label);
                     }
                    
              }     
      
      
      
       }
      
      
      
      
      
}
