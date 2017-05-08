package uzd6;

import java.util.Scanner;

public class Autobusas {
		static int h1=0; // isvyko
		static int h2=0; // vaziavo vln pnv
		static int h3=0; // stovejo pnv
		static int h4=0; // vaziavo pnv ryg
		static int[] atvyko={0,0};
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		

		
		System.out.println("Kada autobusas išvyko iš Vilniaus: ");
		h1= sc.nextInt()*60;
		h1+= sc.nextInt();

		System.out.println("Kiek laiko autobusas važiavo iš Vilniaus į Panevėžį: ");
		h2= sc.nextInt()*60;
		h2+= sc.nextInt();

		System.out.println("Kelias minutes autobusas stovėjo Panevėžyje: ");
		h3+= sc.nextInt();
		
		System.out.println("Kiek laiko autobusas važiavo iš Panevėžio į Rygą: ");
		h4= sc.nextInt()*60;
		h4+= sc.nextInt();
		sc.close();
		
		atvykoRyga();
		
		System.out.printf("Autobusas į Rygą atvyks: %d val. %d min.", atvyko[0],atvyko[1]);

	}
	
	public static void atvykoRyga(){
		int suma=h1+h2+h3+h4;
		atvyko [0]= suma/60;
		atvyko [1]= suma%60;
		
		while(atvyko[0]>=24){
			atvyko[0]-=24;
		}
		
	}

}
