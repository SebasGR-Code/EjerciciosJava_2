
import javax.swing.*;
public class numero12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int celular =Integer.parseInt( JOptionPane.showInputDialog(" ingresa un numero entero"));
		System.out.println("La raiz cuadrada es "+Math.sqrt(celular));
		System.out.println("El numero elevado a la 4 es "+Math.pow(celular,4));
		double var=Math.sqrt(celular);
		System.out.println("El redondeo es "+Math.round(var));

	}

}
