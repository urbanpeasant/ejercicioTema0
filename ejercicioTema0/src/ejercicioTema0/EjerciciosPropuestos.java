package ejercicioTema0;

public class EjerciciosPropuestos {
	
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
	
	public static void main(String[] args) {
		ejercicio3();
		ejercicio4();

	}

}
