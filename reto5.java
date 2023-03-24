import java.util.Scanner;
public class reto5{
	 public static void main(String[] args) {
	    Scanner teclado=new Scanner(System.in);
	  String producto1,producto2,producto3,
	  producto4,producto5;
	  int precio1=1500,precio2=2000,precio3=2500,precio4=3000,precio5=3500;
	  int valor;
	   
	    System.out.println("Escriba lo que desea comprar:esfero,marcador,cuaderno,cartuchera,block");
	    producto1=teclado.nextLine();
	    System.out.println("Escriba la cantidad que quiere llevar");
	    precio1=teclado.nextInt();
	    
	    System.out.println("desea llevar otro producto,ingreselo");
	    producto2=teclado.next();
	    System.out.println("Escriba la cantidad que quiere llevar");
	    precio2=teclado.nextInt();
	    
	    System.out.println("desea llevar otro producto,ingreselo");
	    producto3=teclado.next();
	    System.out.println("Escriba la cantidad que quiere llevar");
	    precio3=teclado.nextInt();
	    
	    System.out.println("desea llevar otro producto,ingreselo");
	    producto4=teclado.next();
	    System.out.println("Escriba la cantidad que quiere llevar");
	    precio4=teclado.nextInt();
	    
	    System.out.println("desea llevar otro producto,ingreselo");
	    producto5=teclado.next();
	    System.out.println("Escriba la cantidad que quiere llevar");
	    precio5=teclado.nextInt();
	    
	    valor=precio1*1500*precio2*200*precio3*2500*precio4*300*precio5*3500;
	    System.out.println("El total que debe pagar es de:"+valor);
	    
	    }
	 }