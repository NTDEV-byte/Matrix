package matrix;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Matrix extends JPanel{
	
	
	
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public static final int FALL_RATE = 5;
	
		public static Font font = new Font("Verdana",Font.BOLD,15);
		public static final int WIDTH = 900;
		public static final int HEIGHT = 600;
		
			private Rain digitalRain;
			
			public Matrix() { 
				setPreferredSize(new Dimension(WIDTH,HEIGHT));
				digitalRain = new Rain();
			}
	
	
		public void paint(Graphics g) { 
			g.setColor(Color.black);
			g.fillRect(0,0,WIDTH, HEIGHT);
			digitalRain.update();
			digitalRain.render(g);
			try {
				Thread.sleep(FALL_RATE);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			repaint();
		}
		
		
		public static void main(String[] args) {
			 JFrame window = new JFrame("Matrix");
			 window.setVisible(true);
			 window.setResizable(false);
			 window.setLocationRelativeTo(null);
			 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 window.add(new Matrix());
			 window.pack();
		}

}
