import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class GameTile extends JPanel {
	
	
	protected void paintComponent(Graphics g){
		
/*			super.paintComponent(g);
			g.setColor(Color.cyan);
			g.fillRect(0, 0, 800, 800);*/
		}
	public void changeColorBlack(){
		this.setBackground(Color.white);
		this.setForeground(Color.white);
	}

}
