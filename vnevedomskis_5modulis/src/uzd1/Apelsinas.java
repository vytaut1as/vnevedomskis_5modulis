package uzd1;

import java.util.Scanner;

public class Apelsinas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double d=0d;
		double a=0d;
		double v=0d;
		
		System.out.println("įveskite apelsino skersmenį: ");
		d = sc.nextDouble();
		System.out.println("įveskite apelsino žievelės storį: ");
		a =sc.nextDouble();
		v = (4d/3d)*Math.PI*Math.pow(d/2-a, 3d);
		System.out.printf("Apelsino minkštimo tūris: %.2f", v);
	}

}
