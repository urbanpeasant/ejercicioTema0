package com.corenetworks.jose.tema2;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		Coche coche1 = new Coche();
		System.out.println(coche1.getVelocidad());
		coche1.acelera(10);
		System.out.println(coche1.getVelocidad());
		coche1.frena(2);
		System.out.println(coche1.getVelocidad());
		

	}

}
