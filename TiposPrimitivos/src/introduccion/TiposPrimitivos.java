package introduccion;

public class TiposPrimitivos {

	public static void main (String [] args) {
		
		int var1=5;
		int var2=50;
		int var3=5, var4=8;
		
		
		
		// también se podrán declarar variables seguidas de coma. Ej.
		
		
		
		byte minumero = (byte) 55;
		System.out.println(minumero);
		short v2=minumero;
		System.out.println(minumero);
		int v3 = 77;
		
		//convierte entero a byte pero se pierde información
		minumero = (byte)v3;
		System.out.println(minumero);
		
		//caracteres la palabra CHAR representa enteros y valores ascii. Por tanto se mostrará el código ascii para 65 (la A)
		char c = 65;
		System.out.println(c);
		
		char c11 = 'R';
		System.out.println(c11);
		
		int entero1=c11;
		System.out.println(entero1);
		
		boolean v1 = true;
		boolean v4 = false;
		
		
		
	}
}
