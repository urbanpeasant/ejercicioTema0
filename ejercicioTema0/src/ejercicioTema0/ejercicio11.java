package ejercicioTema0;

import java.util.Scanner;



public class ejercicio11 {
	
	public static void pedirSegundos() {

int t, segundos, minutos, horas;
		
		try (Scanner pedirteclado = new Scanner (System.in)) {
			System.out.print("Introduce el tiempo en segundos: ");
			
			t = pedirteclado.nextInt();
		}
		
		minutos = t / 60;
		segundos = t % 60;
		horas = minutos / 60;
		minutos = minutos % 60;
		System.out.println("Has introducido " + t + " segundos, que corresponden a: "+ horas + " horas "+ minutos + " minutos " + segundos + " segundos ");
		
	}

	public static void main(String[] args) {
		pedirSegundos();
		
	}

}
