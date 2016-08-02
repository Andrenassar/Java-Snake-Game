import java.awt.BorderLayout;

import javax.swing.JFrame;


public class MainScreen {

    static void screenDisplay() {
          
           // making the whole screen here now but will later move it out
           // into different calsses and make it cleaner
          
           ScorePanel scorePanel = new ScorePanel();
           GamePanel gamePanel = new GamePanel();
          
           JFrame  frame = new JFrame( "That snake called sammy");
           frame.setLayout(new BorderLayout());
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
          
           frame.getContentPane().add(scorePanel, BorderLayout.NORTH);
           frame.getContentPane().add(gamePanel);
          
          
           frame.setSize(400, 400);
           frame.setVisible(true);
          
          
          
    }
}
