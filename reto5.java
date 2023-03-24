import java.util.Scanner;
public class reto5 {
	
		    public static void main(String[] ar) {
	    	Scanner teclado=new Scanner(System.in);
	    	int cantidad;
	    	float precio;
	    	float total;
	    	System.out.print("Ingrese la cantidad de artÃ­culos:");
	    	cantidad=teclado.nextInt();
	    	System.out.print("Ingrese el valor unitario del producto:");
	    	precio=teclado.nextFloat();
	    	total=precio * cantidad;
	    	System.out.print("El total a pagar es:");
	    	System.out.print(total);
	    }
	
	}