
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;


import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	private Timer timer = new Timer(200,this);
	private Snake snake = new Snake();
	private JPanel[][] tiles = new JPanel[25][25];
	private int snake_length = 3; // this might be part o the snake class. We'll see.
	private int head_pos;
	private int x_cord;
	private int y_cord;
	private int direction; // I guess 1 left, 2 right, 3 up 4 down for now then we change into keys


	public GamePanel() {
		this.setLayout(new GridLayout(25,25));
		this.setBackground(Color.black);
		
		this.addKeyListener(this);
        this.setFocusable(true);
        this.requestFocusInWindow();

		// add all tiles
		for (y_cord=0; y_cord<25; y_cord++){
			for(x_cord=0; x_cord<25; x_cord++){
				tiles[x_cord][y_cord] = new JPanel();
				tiles[x_cord][y_cord].setBorder(BorderFactory.createLineBorder(Color.pink));
				add(tiles[x_cord][y_cord]);
				tiles[x_cord][y_cord].setBackground(Color.white);
				//add(snake); may not need to "add" it. it will just be an indicator
			}
		}

		//this.getComponentAt(snake.snake_body.get(0)).setBackground(Color.cyan);;

		y_cord --;   //adjust these late somehow
		x_cord --;

		timer.start();


		// going to hard code this stuff for now then later change

		head_pos = 16; //let's just start the head from there. 


		
		x_cord = 16;
		y_cord = 16;

		direction = 2; //left first
		//initial snake
		for(int i=0;i<snake_length;i++){
			tiles[x_cord+i][y_cord].setBackground(Color.green);
		}

	}



	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.black);
		g.fillRect(0, 0, 800, 800);

		//snake movement (in a method later?)
		//left to right movement. 
		if(direction == 1 ) {
			
			head_pos = x_cord - 1; // figure out why this works exactly to avoid errors
			
			if(head_pos >= 0  ){

				x_cord = head_pos;				
				tiles[x_cord][y_cord].setBackground(Color.green);
				tiles[x_cord+snake_length][y_cord].setBackground(Color.white);
				head_pos --;
			}

			else {
				System.out.println("You lost");
				return;
			}
		}

		if(direction == 2 ) {
			
			head_pos = y_cord+1;
			//conversion of current head position (in terms of x) now in terms of y)
			System.out.println(head_pos);

			if(head_pos < 25  ){

				y_cord = head_pos;				
				tiles[x_cord][y_cord].setBackground(Color.green);
				tiles[x_cord][y_cord-snake_length].setBackground(Color.white);
				head_pos ++;
			}

			else {
				System.out.println("You lost");
				return;
			}
		}


		System.out.println("I'm being executed");
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		repaint();

	}



	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyCode());
		if(e.getKeyCode() == 37) {
			direction  = 1;
			}
		if(e.getKeyCode() == 38) {
			direction  = 3;
			}
		
		if(e.getKeyCode() == 39) {
			direction  = 4;
			}
		
		if(e.getKeyCode() == 40) {
			direction  = 2;
			}
		
	}



	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}





}
