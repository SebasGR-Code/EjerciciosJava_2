package taller1;
import java.util.*;
public class undecima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner (System.in);
		System.out.println("ingresa un numero");
		int var= num.nextShort();
		double raiz=Math.sqrt(var);
		long redondeo= Math.round(raiz);
		double elev = Math.pow(var,4); 
		short ra=(short) Math.sqrt(var);
		short re=(short) Math.round(raiz);
		short e=(short) Math.pow(var,4);
		System.out.println("La raiz es "+Math.sqrt(var));
		System.out.println("el redondeo es "+Math.round(raiz));
		System.out.println("el numero elevado a la 4 es "+Math.pow(var,4));
		System.out.println(ra);
		System.out.println(re);
		System.out.println(e);

	}

}
