package taller1;
import java.util.*;
public class decima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner variable= new Scanner (System.in);
		Scanner num =new Scanner (System.in);
		System.out.println("Ingresa tu nombre");
		String nom= variable.nextLine();
		System.out.println("Ingresa tu año de nacimiento");
		int añ = num.nextInt();
		int edad= 2019- añ;
		System.out.println("Tu nombre es "+nom);
		System.out.println("en 2019 tu edad sera "+edad);
		

	}

}
