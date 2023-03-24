import java.util.*;

public class reto6{
	
		public static void main(String[] args) {
			  Scanner sc = new Scanner(System.in);
			  Scanner seguir = new Scanner(System.in);
			  String eleccion="",jugardenuevo="";
			  int cara=0, sello=0;
			  int ganadas=0,perdidas=0,totalpartidas=0,valorapostado=0, valorganado=0;
			  boolean pase=false; 
			  
			  cara=(int)(Math.random()*100+2);
			  sello=(int)(Math.random()*100+2);
		do {
			 System.out.println("cual es tu eleccion");	
			eleccion= sc.nextLine();
			 System.out.println("de cuanto es tu apuesta");	
				valorapostado= sc.nextInt();
			if (eleccion.equalsIgnoreCase("cara") || eleccion.equalsIgnoreCase("sello")) {
				pase=true;
			}
		}while (pase==false);
		
		if (eleccion.equalsIgnoreCase("cara")) {
			if (cara>sello) {
				ganadas+=1;
				System.out.println("has ganado!!!"+valorapostado);
			}else {
			perdidas+=1;
			System.out.println("has perdido!!!"+valorapostado);
			}
		}else {
			if(sello>cara) {
				ganadas+=1;
			System.out.println ("has ganado!!!"+valorapostado);	
			}else{
				perdidas+=1;
				System.out.println("has perdido!!!"+valorapostado);
			}
			System.out.println("partidas ganadas"+ganadas);
			System.out.println("partidas perdidas"+perdidas);
			totalpartidas+=1;
			
			System.out.print("deseas jugar de nuevo? S/N:");
			jugardenuevo=seguir.nextLine();
		}while(jugardenuevo.equalsIgnoreCase("S"));
		
		System.out.println("total partidas"+totalpartidas);
		System.out.println("total ganado"+valorganado);
		valorganado+=valorapostado;
		
			System.out.println("Â¡Gracias por jugar!");
		}
	}
