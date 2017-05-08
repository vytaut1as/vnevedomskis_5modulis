package uzd5;

import java.util.Scanner;

public class Saldainiai {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int kaina =0;
		int pinigu=0;
		int kupon=0;
		int kiek=0;
		
		System.out.println("Įveskite saldainių maišelio kainą: ");
		kaina= sc.nextInt();
		System.out.println("Įveskite pinigų sumą skirtą saldainiams pirkti: ");
		pinigu = sc.nextInt();
		
		while(pinigu>=kaina){
			
			pinigu-=kaina;
			++kiek;
			++kupon;
			if(kupon==3){
				kupon=1;
				++kiek;
			}
			
		}
		
		System.out.printf("Saldainių maišeliu: %d\n", kiek);
//		vienas po 1 yra 17
//		17 maiseliu 17 kuponu
//		17/3=5, 17+5=22 maiseliai ir 5+2=7 kuponai
//		7/3, 22+2=24 maiseliai ir 2+1=3 kuponai
//		3/3, 24+1=25 maiseliai ir 1 kuponas

	}

}
