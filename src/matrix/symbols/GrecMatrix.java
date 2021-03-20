package matrix.symbols;

public class GrecMatrix extends Symbol{

	public GrecMatrix(int x,int y,int speed) { 
 		this.x = x;
 		this.y = y;
 		this.speed = speed;
 		this.visible = true;
 		//like this
 		symbols = generateSymbols(0x03B0,10);
 		pickSymbol();
 	}
 	
	

	@Override
	public String[] generateSymbols(int start,int amount) {
		String symbols [] = new String[amount];
		
				for(int i = 0 ; i< amount;i++) { 
					int x = start + i;
					char z = (char) x;
					symbols[i] = String.valueOf(z);
				} 
		return symbols;
	}

}



