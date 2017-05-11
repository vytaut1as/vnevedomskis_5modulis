package uzd21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.logging.Level;

import com.sun.istack.internal.logging.Logger;

public class Robotai {
	
	public static final Logger logas = Logger.getLogger(uzd21.Robotai.class);
	public static int x1 = 0;
	public static int y1 = 0;
	public static int x2 = 0;
	public static int y2 = 0;
	static String inputFile = "src//uzd21//robots.txt";
	static String otputFile = "src//uzd21//output.txt";
	static int [] koordinates = new int[5];
	static String [] komandos;

	public static void main(String[] args) {
		
//		logas.setLevel(Level.FINE);
		readFile(inputFile);

	}
	
	public static void readFile(String inputFile){			
		

        	try {
        		
		        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        while(true){
		        String line = br.readLine();
		        
//		        System.out.println("line yra: "+ line);
//		        System.out.println("line == null " + line == null);
//		        System.out.println("line.equals(null) "+line.equals(null));
		        
		        if (line == null || line.equals(null)){ break;}
		        
		        String [] laikinas = new String[5];
		        laikinas = line.split(" ");
		        
		        for (int i = 0; i < laikinas.length; i++) {
					koordinates[i] = Integer.parseInt(laikinas[i]);	
				}
		        
		        komandos = new String [koordinates[4]];
		//        komandos = new String [10];
		        line = br.readLine();
		        komandos = line.split(" ");
			    simuliacija();
        }
		
		    } catch (Exception e) {
		    	System.out.println(e);
		    }
}
	/** Ivigdo komandas robotams ir išveda rezultatą */
	public static void simuliacija (){
		x1 = koordinates[0];
		y1 = koordinates[1];
		x2 = koordinates[2];
		y2 = koordinates[3];
		
		for (int i = 0; i < komandos.length; i++) {
			if (i%2==0){
//				logas.log(Level.FINE, "lyginis koordinates x: {0} y: {1}", new Object[]{x1 , y1});
//				System.out.println("lyginis");
				if (komandos[i].equalsIgnoreCase("a")){
					--x1;
				}else if (komandos[i].equalsIgnoreCase("p")){
					++x1;
				}else if (komandos[i].equalsIgnoreCase("k")){
					++y1;
				}else if (komandos[i].equalsIgnoreCase("d")){
					--y1;
				}
			}else if (i%2!=0){
//				logas.info("nelyginis");
//				System.out.println("nelyginis");
				if (komandos[i].equalsIgnoreCase("a")){
					--x2;
				}else if (komandos[i].equalsIgnoreCase("p")){
					++x2;
				}else if (komandos[i].equalsIgnoreCase("k")){
					++y2;
				}else if (komandos[i].equalsIgnoreCase("d")){
					--y2;
				}
			}
		}
		
		System.out.printf("%d %d %d %d ",x1,y1,x2,y2);
		if (100<Math.abs(x1) || 100<Math.abs(x2) || 100<Math.abs(y1) || 100<Math.abs(y2)){
			System.out.println("Robotas nukrito nuo stalo!");
		}else if(x1==x2 && y1==y2){
			System.out.println("AVARIJA");
		}else{
			System.out.println();
		}
		
	}

}
