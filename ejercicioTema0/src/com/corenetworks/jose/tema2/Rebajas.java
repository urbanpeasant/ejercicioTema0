package com.corenetworks.jose.tema2;

public class Rebajas {
	
	public double descubrePorcentaje(double precioOriginal, double precioRebajado) {
		return (precioOriginal - precioRebajado) * 100/precioOriginal;
	}

	
}
