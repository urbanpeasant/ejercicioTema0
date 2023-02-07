package ejercicioTema0;

import java.util.Random;

public class GeneraLetras {
	
	public static void ejercicio8() {
		Random letra = new Random();
		char c = (char) ('a' + letra.nextInt(26));
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
		System.out.println("La letra random es " + c + " y es una vocal");
		} else {
			System.out.println("La letra random es " + c + " y es una consonante");
		}
	
 }
	public static void main(String[] args) {
		ejercicio8();

	}

}



