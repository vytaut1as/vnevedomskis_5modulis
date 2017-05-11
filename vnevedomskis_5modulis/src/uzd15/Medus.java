package uzd15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Medus {
	
	static int lietus=0;
	static int dregna=0; // 21-25 3kg
	static int sausa=0; // >25 1kg
	static int vesu=0; // <21 2kg
	static int dienu=0;
	static String [] isvestis=new String [4];
	static String duomenys = "src//uzd15//medus-uzd15.txt";
	static String isvedimas = "src//uzd15//output.txt";

	public static void main(String[] args) {
		
		readFile(duomenys);
	    rezultatoFormatas();
		toScreen(isvestis);
		toFile(isvestis);
	}
	
	public static void readFile(String adresas){
		    try {
	        BufferedReader br = new BufferedReader(new FileReader(adresas));
	        String line = br.readLine();
	        int dienos = Integer.parseInt(line);
	        dienu = dienos;
//            System.out.println(line);
	        while (line != null && !line.equals(null) && dienos>0) {
	        	--dienos;
	            line=br.readLine();
//	            System.out.println(line);
	            avilasGamina(line);
	        }
	    } catch (Exception e) {
	    	System.out.println(e);
	    }
	}
	

	public static void toFile (String[] lines){
		
		try {
			FileWriter fstream = new FileWriter(isvedimas);
			BufferedWriter out = new BufferedWriter(fstream);
			
				for (String string : lines) {					
			out.write(string);
			out.newLine();
				}
				
			out.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}

	public static void toScreen (String[] lines){
		for (String string : lines) {
			System.out.print(string);
			
		}
	}
	
	public static void avilasGamina(String orai){
		int a = Integer.parseInt(orai.substring(0, 1));
		if (a==0){
			++lietus;
		}
		else{
		String [] dienosOras = orai.split(" ");
		if (Integer.parseInt(dienosOras[1])<21){
			++vesu;
		}else if (Integer.parseInt(dienosOras[1])>25){
			++sausa;
		}else{
			++dregna;
		}
		}
	}
	
	private static void rezultatoFormatas() {
		double kgdiena = (dregna*3+vesu*2+sausa)/(double)dienu;
		isvestis[0]=String.format("Per %d dienų bitės sunešė %.0f kilogramų medaus \n", dienu, kgdiena*dienu);
		isvestis[1]=String.format("Lietingų dienų kiekis %d\n", lietus);
		isvestis[2]=String.format("Medunešiui palankiausių dienų kiekis %d\n", dregna);
		isvestis[3]=String.format("Vidutiniškai bitės per dieną prinešė medaus %.3f kg", kgdiena);	
		
	}
}