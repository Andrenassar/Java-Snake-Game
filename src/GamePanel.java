
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
 

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
 
public class GamePanel extends JPanel implements ActionListener {
		private Timer timer = new Timer(20,this);
		private Snake snake = new Snake();
		private GameTile[] tiles = new GameTile[625];
      
        public GamePanel() {
        	this.setLayout(new GridLayout(25,25));
            this.setBackground(Color.black);
             
            	for (int i=0; i<25; i++){
            		for(int j=0; j<25; j++){
            			final GameTile tile = new GameTile();
                        tile.setBorder(BorderFactory.createLineBorder(Color.pink));
                        add(tile);
                        //add(snake); may not need to "add" it. it will just be an indicator
                     }
              }
            	
            	Point p = snake.snake_body.get(0);
            	//this.getComponentAt(snake.snake_body.get(0)).setBackground(Color.cyan);;
            	
            	this.getComponent(50).setBackground(Color.cyan);
            	
            	timer.start();
        }

     
        
        protected void paintComponent(Graphics g){
			super.paintComponent(g);
			g.setColor(Color.black);
			g.fillRect(0, 0, 800, 800);
			
			//snake movement (in a method later?)
			//snake.
				((GameTile) getComponent(50)).changeColorBlack();
			
		
			
		}
	
        
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			repaint();
			snake.repaint();
			
		}
      
      
      
      
      
}
