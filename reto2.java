import java.util.Scanner;

import javax.swing.JOptionPane;


public class reto2 {
	
		    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	      
	        double p,m,d;
	     
	      
	        System.out.println("ingrese peso del bebe ");
	        p= sc.nextDouble();
	        System.out.println("ingrese los meses que tiene el bebe");
	        m= sc.nextDouble();
	       
	        d= (p+10/m*10)*8;
	        System.out.println("la dosis para el bebe es:"+d);
	        sc.next();
	   
	        JOptionPane.showInputDialog(" nombre del bebe");
	        JOptionPane.showInputDialog(" nombre del medico");
	        JOptionPane.showInputDialog(" nombre de la vacuna");
			JOptionPane.showMessageDialog(null, "datos guardados " );
	                      
	          	          
		    }

            
}