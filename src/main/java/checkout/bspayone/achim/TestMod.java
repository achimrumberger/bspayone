package checkout.bspayone.achim;

import java.util.Arrays;
import java.util.List;

public class TestMod {

	public static void main(String[] args) {
		List<Integer>  intList = Arrays.asList(3, 9, 5, 1, 11, 0);
		int teiler = 3;
		for(Integer inti : intList) {
			int a = inti % teiler ;
			if(a == 0 ) {
				int b = wieOft(inti, teiler);
				System.out.println("b ist = " + b);
			} else if(inti > teiler) {
				int c = inti - a;
				int d = wieOft(c, teiler);
				
				System.out.println("modulo d ist " + d +" rest a ist = " + a);
			} else {
				System.out.println("rest a ist = " + a);
			}
		}

	}
	
	public static int wieOft(int zaehler, int teiler) {
		return zaehler/teiler;
	}

}
