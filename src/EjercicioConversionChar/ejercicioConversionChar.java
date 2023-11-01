package EjercicioConversionChar;

import java.util.Scanner;

public class ejercicioConversionChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 char tecla;
			System.out.println("Introduce un caracter");
			Scanner sc = new Scanner(System.in);
			tecla = sc.next().charAt(0);
			Character tecla1 = Character.valueOf(tecla);
			System.out.println(tecla1.getClass().getName());
			
	}

}
