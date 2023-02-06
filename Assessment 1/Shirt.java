package Tshirt;
import java.util.Scanner;



public class Shirt {


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String[] cart = {"round-neck", "collared", "hooded", "round-neck", "round-neck"};
			int TC = 0;
			int discount = 0;
			int final_Amount = 0;
			
			for (String type : cart) {
				  if (type.equals("round-neck")) {
					  TC =TC+ 200;
				  } else if (type.equals("collared")) {
					  TC =TC +250;
				  } else if (type.equals("hooded")) {
					  TC = TC +300;
				  }
				}

				if (cart.length < 5) {
				  discount = 0;
				} else if (cart.length >= 5 && cart.length <= 10) {
				  discount = 10;
				} else if (cart.length > 10) {
				  discount = 20;
				}
				 final_Amount = TC - (TC * discount / 100);
				System.out.println("The final price is Rs." + final_Amount);
			
		}
		
	

}