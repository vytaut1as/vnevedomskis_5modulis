
public class Kontrolinis {

	public static void main(String[] args) {
		int maxmok = 49; //maksimum mokiniu klaseje;
		int penketas = 7; // gavo penketus
		int ketvertas = 3; // gavo ketvertus
		int trejetas = 2; // gavo trejetus
		int kiek=penketas*ketvertas*trejetas;
		
		while(kiek<=maxmok){
		System.out.printf("Kontrolinio rezultatai: %n");
		System.out.printf("Klasėje mokosi %d mokiniai %n", kiek);
		System.out.printf("Klasėje %d mokiniai gavo penketus %n", kiek/penketas);
		System.out.printf("Klasėje %d mokiniai gavo ketvertus %n", kiek/ketvertas);
		System.out.printf("Klasėje %d mokiniai gavo trejetus %n", kiek/trejetas);
		System.out.printf("Klasėje %d mokinių gavo nepatenkinamą pažymį %n", kiek-kiek/penketas-kiek/ketvertas-kiek/trejetas);
		kiek+=kiek;
		}

		

	}

}
