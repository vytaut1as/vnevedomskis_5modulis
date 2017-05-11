package uzd16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Liutis {
		
		static int daugiausia=Integer.MIN_VALUE;
		static int maziausia=Integer.MAX_VALUE;
		static int daugiausiav=0;
		static int maziausiav=0;
		static int krituliuBendrai=0;
		static int duomenukiekis=0;
		static String [] isvestis=new String [4];
		static String inputFile = "src//uzd16//input.txt";
		static String otputFile = "src//uzd16//output.txt";
		static List<Integer> krituliuPerValanda = new ArrayList<Integer>();

		public static void main(String[] args) {
			
			readFile(inputFile);
		    rezultatoFormatas();
			toScreen(isvestis);
			writeFile(isvestis);
		}
		
		public static void readFile(String inputFile){			
			
			    try {
		        BufferedReader br = new BufferedReader(new FileReader(inputFile));
		        String line = br.readLine();
		        int valandu = Integer.parseInt(line);
		        duomenukiekis = valandu;
//	            System.out.println(line);
		        while (line != null && !line.equals(null) && valandu>0) {
		        	--valandu;
		            line=br.readLine();
			krituliuPerValanda.add(Integer.parseInt(line));
			krituliuBendrai += (Integer.parseInt(line));
//		            System.out.println(line);
		        }
		    } catch (Exception e) {
		    	System.out.println(e);
		    }
		            apdorojimas(krituliuPerValanda);
		}
		

		public static void writeFile (String[] lines){
			
			try {
				FileWriter fstream = new FileWriter(otputFile);
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
		
		public static void apdorojimas(List arg1){
			for (int i = 0; i < arg1.size(); i++) {
				if (daugiausia < (int)arg1.get(i)){
					daugiausia = (int)arg1.get(i);
					daugiausiav= i+1;
				}
				if (maziausia > (int)arg1.get(i)){
					maziausia = (int)arg1.get(i);
					maziausiav = i+1;
				}				
			}
		}
		
		private static void rezultatoFormatas() {
			double vidutiniskai = krituliuBendrai/(double)duomenukiekis;
			isvestis[0]=String.format("Liūties metu iškrito %d mm kritulių \n", duomenukiekis);
			isvestis[1]=String.format("Daugiausia kritulių iškrito %d mm per %d liūties valandą \n", daugiausia, daugiausiav);
			isvestis[2]=String.format("Mažiausia kritulių iškrito %d mm per %d liūties valandą \n", maziausia, maziausiav);
			isvestis[3]=String.format("Vidutiniškai per valandą iškrito %.2f mm kritulių", vidutiniskai);	
			
		}
	}