package calcularPi;

import java.util.Scanner;

public class CalcularPi {

	public static void main(String[] args) {
    double n;
 
    double phi;
      
  
    
  System.out.println("Ingrese un número, cuanto más grande, mejor! (max: mil millones)");
  Scanner sk = new Scanner(System.in);
  
  n= sk.nextInt();
  
  phi=  n* Math.sin(Math.toRadians(180)/ n); 
  
   
  System.out.println(phi); 

      
    
  

	}

}
