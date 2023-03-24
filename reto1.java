
import java.util.Scanner;

public class reto1 {
	
		public class Main {
		  public static void main(String[] args) {
		         Scanner src = new Scanner(System.in);
		         double gradosC, gradosF,gradosK;
		         System.out.println("Introduce grados Centigrados:");
		         gradosC = src.nextDouble();
		         gradosF = 32 + (gradosC*9 / 5);
		         gradosK = 273.15 + (gradosF-32*9 / 5);
		         System.out.println(gradosC +" ÂºC = " + gradosF + " ÂºF");         
		         System.out.println(gradosC +" ÂºC = " + gradosK + " ÂºF"); 
		  }
		}

	}