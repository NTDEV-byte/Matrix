package matrix.symbols;

import static matrix.Matrix.font;

import java.awt.Color;
import java.awt.Graphics;

import matrix.Matrix;

public abstract class Symbol {

	
	public String symbols[];
 	protected String value;
 	protected int x,y;
 	protected int speed;
 	protected boolean visible;
 	protected Color color;

 		/*
 		 * With this method you can generate any unicode Symbol
 		 * start for the starting Code in Hex for ex: 0xEF
 		 * amount for the number to generate starting from start
 		 */
 	
 		public abstract String[] generateSymbols(int start,int amount);
 	
 	
 		public void fall() { 
 			y+=speed;
 			if(outBounds()) y = 0;
 		}
 		
 		
 		protected void pickSymbol() { 
 	 		int picked = (int)(Math.random() * symbols.length);
 	 		this.value = symbols[picked];
 	 		this.color = Color.green;
 		}
 		
	 	public void render(Graphics g) { 
	 		g.setColor(color);
	 		g.setFont(font);
	 		g.drawString(value+"", x, y);
	 	}
	 	
 		public boolean outBounds() {
	 		 return y >= Matrix.HEIGHT - 10;
	 	}

 		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		public int getSpeed() {
			return speed;
		}
		public void setSpeed(int speed) {
			this.speed = speed;
		}
		public boolean isVisible() {
			return visible;
		}
		public void setVisible(boolean visible) {
			this.visible = visible;
		}
		public Color getColor() {
			return color;
		}
		public void setColor(Color color) {
			this.color = color;
		}
 	
 		
 		
 		
	
}
