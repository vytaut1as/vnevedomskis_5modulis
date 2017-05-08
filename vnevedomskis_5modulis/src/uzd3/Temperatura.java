package uzd3;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Temperatūrų skalės. %n Įveskite temperatūrą Kelvino skalėje: ");
		double kelvin;
		kelvin = sc.nextDouble();		
		double celsij=kelvin-273.16;
		double faren=celsij*9d/5d+32;
		double reom=celsij*0.8;
		
		
		System.out.printf("1. %.2f Celsijaus laipsnių %n", celsij);
		System.out.printf("2. %.2f Farenheito laipsnių %n", faren);
		System.out.printf("3. %.2f Reomiūro laipsnių %n", reom);
		System.out.printf("Programa darbą baigė. Ačiū, kad skaičiavote.");
		

	}

}
