package ejercicioTema0;

public class Ejercicio1 {

	public static void main(String[] args) {
		Temperatura myTemp = new Temperatura ();
		
		myTemp.celsiusToFarenheit(18.0);
		
		TemperaturaMejorada temperaturaActual = new TemperaturaMejorada();
		
		temperaturaActual.darTemperatura(40);
		System.out.println(temperaturaActual.devolverTemperatura());
		
		
	}

}
