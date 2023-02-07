package ejercicioTema0;

import java.util.Random;

public class EjerciciosPropuestos {
	static double pi = 3.14;
	
	public static void ejercicio3() {
		int numero=2, cuad=numero*numero;
		System.out.println("El cuad de " +numero+" es: "+ cuad);
	}

	public static void ejercicio4() {
		int num = 5;
		num += num - 1 * 4 + 1;
		System.out.println(num);
		num = 4;
		num %= 7 * num % 3 * 7 >>1;
		System.out.println(num);
	}
	
	
	public static void ejercicio5() {
		int radio = 3;
		double longitud = 2 * pi * radio;
		System.out.println(longitud);
	}
	
	public static void ejercicio6() {
		double radio = 5.2;
		double area = pi * radio * radio;
		System.out.println(area);
	}
	
	public static void ejercicio8() {
		Random rnd = new Random();
		char c = (char) ('a' + rnd.nextInt(26));
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		ejercicio3();
		ejercicio4();
		ejercicio5();
		ejercicio6();
		ejercicio8();
		
	}

}

