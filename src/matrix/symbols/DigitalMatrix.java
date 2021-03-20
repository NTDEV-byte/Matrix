package matrix.symbols;
import java.awt.Color;

public class DigitalMatrix extends Symbol{

		 	
		 	public DigitalMatrix(int x,int y,int speed) { 
		 		this.x = x;
		 		this.y = y;
		 		this.speed = speed;
		 		this.visible = true;
		 		symbols = generateSymbols(0,10);
		 		pickSymbol();
		 	}
		 	
			public Color getColor() {
				return color;
			}


			public void setColor(Color color) {
				this.color = color;
			}

			@Override
			public String[] generateSymbols(int start,int amount) {
				String symbols[] = new String[amount];
				for(int i=start;i<amount;i++) { 
					symbols[i] = i+"";
 				}
				return symbols;
			}
		 	
		
	
}
