import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JPanel;


public class Snake extends JPanel {
		public ArrayList<Point> snake_body = new ArrayList<Point>();
		//public static int currColor = 0;
		
		public Snake(){
			snake_body.add(new Point(15,15));
		}
		
		
		protected void paintComponent(Graphics g){
		/*	super.paintComponent(g);
			g.setColor(new Color(currColor));
			currColor++;
			g.fillRect(0, 0, 800, 800);*/
		}
	

}
