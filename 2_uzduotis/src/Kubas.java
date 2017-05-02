import java.util.Scanner;

public class Kubas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double kub=0d;
		double rut=0d;
		
		System.out.println("Įveskite kubo kraštinės ilgį");
		kub = sc.nextDouble();
		System.out.println("Įveskite rutulio skersmenį");
		rut = sc.nextDouble();
		
		if(rut>kub){
			System.out.println("Sfera netelpa i kuba!");
		}else{			

			rut = (4d/3d)*Math.PI*Math.pow(rut/2, 3d);
			kub = Math.pow(kub, 3d);

			System.out.printf("Kubo tūris: %.2f %n", kub);
			System.out.printf("Rutulio tūris: %.2f %n", rut);
			System.out.printf("Vandens tūris: %.2f %n", kub-rut);
			
		}

	}

}
