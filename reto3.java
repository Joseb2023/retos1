import java.util.Random;

public class reto3 {
public String juegocarizellazo() {
	Random rand =new Random();
	int lanzamoneda=Math.abs(rand.nextInt())% 2;
	String  resultado;
	

	if (lanzamoneda==1)
		resultado= "salio CARA ganaste";
	else
		resultado= "salio SELLO perdiste";

	
	return resultado; 
}
public static void main(String[]args){
	
	carizellazo1 c1=new carizellazo1();
	System.out.println(c1.juegocarizellazo());
	System.out.println(c1.juegocarizellazo());

			}
}
