package ejercicioTema0;

public class Temperatura {
	
	public double celsiusToFarenheit (double temp) {
		return (temp -32)/1.8;
	}
	
	public double farenheitToCelsius (double temp) {
		return (1.8)*temp + 32;
	}

	public static void main(String[] args) {
		Temperatura myTemp = new Temperatura ();
			
		myTemp.celsiusToFarenheit(18.0);
		
		
	}
}
