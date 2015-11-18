package curso.java.holamundo;

import org.joda.time.*;

public class HolaMundoApp{
	
	public static void main(String[] args){
		DateTime ahora = new DateTime();
		DateTime ayer = ahora.plusDays(-1);
		System.out.println("Ahora: " + ahora);
		System.out.println("Ayer: " + ayer);
	}
}