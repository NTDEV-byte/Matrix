package matrix;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import matrix.symbols.DigitalMatrix;
import matrix.symbols.GrecMatrix;
import matrix.symbols.Symbol;

public class Stream {
	
		public static final int DIGIT_MATRIX = 0;
		public static final int GREC_MATRIX = 1;
	
		public static final int YOFFSET_PER_DIGIT = 25; 
		
		private int x,y;
		private int size;
		private int speed;
		private List<Symbol> stream;
			
				public Stream(int x,int y,int size,int speed) { 
					this.x = x;
					this.y = y;
					this.speed = speed;
					this.size = size;
					stream = new ArrayList<Symbol>();
					generate(GREC_MATRIX);
					makeFastetsWhite(2);
				}

				
				public void update() { 
					for(Symbol d : stream) { 
						d.fall();
					}
				}
				
				public void render(Graphics g) { 
					for(Symbol d : stream) { 
						d.render(g);
					}
				}
				
				private void makeFastetsWhite(int total) { 
					for(int i=0;i<total;i++) { 
						  stream.get(stream.size() - 1 -i).setColor(Color.white);
					}
				}

				
				private void generate(int type) { 
					int startX = x;
					int startY = y;
					
					switch(type) { 
					case 0:
						for(int i = 0; i< size ; i++) { 
							 stream.add(new DigitalMatrix(startX,startY,speed));
							 startY += YOFFSET_PER_DIGIT;
						}
						break;
						
					case 1:
						for(int i = 0; i< size ; i++) { 
							 stream.add(new GrecMatrix(startX,startY,speed));
							 startY += YOFFSET_PER_DIGIT;
						}
						break;
					}
					
				}
}
