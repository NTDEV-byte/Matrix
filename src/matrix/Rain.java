package matrix;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class Rain {
		
		public static final int MAX_TOTAL_STREAMS = 59;
		public static final int MAX_DIGITS_PER_STREAM = 23;
		
		public static final int CURRENT_TOTAL_STREAMS = 20;
		public static final int CURRENT_DIGITS_PER_STREAM = 5;
		
		public static final int MIN_DIGITS_PER_STREAM = 5;
		public static final int MIN_SPEED_DIGITS = 2;
		
		
			private List<Stream> rain;
			
			
				public Rain() { 
					rain = new ArrayList<>();
					generate();
				}
				
				public void generate() { 
					int x = 10;
					int y = 10;
					int randDigPS;
					int randDigSpeed;
					
					for(int i=0;i<MAX_TOTAL_STREAMS;i++) { 
						//DIGITS_PER_STREAM,1
						randDigPS = (int)(Math.random() * CURRENT_TOTAL_STREAMS) + MIN_DIGITS_PER_STREAM;
						randDigSpeed = (int)(Math.random() * CURRENT_DIGITS_PER_STREAM) + MIN_SPEED_DIGITS;
						rain.add(new matrix.Stream(x,y,randDigPS,randDigSpeed));
						x+=15;
					}
				}
				
				public void update() { 
					for(Stream d : rain) { 
						d.update();
					}
				}
				
				public void render(Graphics g) { 
					for(Stream d : rain) { 
						d.render(g);
					}
				}
}
