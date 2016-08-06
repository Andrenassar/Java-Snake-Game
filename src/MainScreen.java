import java.awt.BorderLayout;

import javax.swing.JFrame;


public class MainScreen {

    static void screenDisplay() {
          
          
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
