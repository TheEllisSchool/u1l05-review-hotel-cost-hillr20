import javax.swing.JOptionPane;

public class HotelCostnBarGraphs {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Central Hotel: 1 night = $363
		//Clayton Hotel Burlington Road: 1 night = $421
		//The Fitzwilliam Hotel: 1 night = $456
		JOptionPane.showMessageDialog(null, "You'll be going to Dublin, Ireland!");
		//String input = JOptionPane.showInputDialog(null, "How many nights "
				//+ "will you be staying in Dublin?");
		int cenHotel = 363;
		int clayHotel = 421;
		int fitzHotel = 465;
		int numNights;

		//int numNights = Integer.parseInt(input);
		do {
			String input = JOptionPane.showInputDialog(null, "How many nights "
					+ "will you be staying in Dublin? (Enter a positive number) ");

			numNights = Integer.parseInt(input);
		}while (numNights < 0);
		
		//JOptionPane.showMessageDialog(null, "Please enter a positive number.");
					
			
		JOptionPane.showMessageDialog(null, "You will be staying " + numNights + " nights.");
		while (numNights > 0) {
			int costCen = numNights * cenHotel;
			int costClay = numNights * clayHotel;
			int costFitz = numNights * fitzHotel;
			
			for (costCen = 1; costCen < numNights; costCen++) 
	        {
	            System.out.printf("*");
	         }
			for (costClay = 1; costClay < numNights; costClay++) {
				System.out.print("*");
			}
			for (costFitz = 1; costFitz < numNights; costFitz++)
				System.out.print("*");
		}
			
		
			/*while (numNights > 0){
				int numStar = costCen/50;
				int numStar2 = costClay/50;
				int numStar3 = costFitz/50;
				if 
			
			
			}	*/		
		}
}
	
