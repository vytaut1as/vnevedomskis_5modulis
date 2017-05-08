package uzd15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Medus {

	public static void main(String[] args) {
		String kuryra = "medus-uzd15.txt";
	    try {
	        BufferedReader br = new BufferedReader(new FileReader(kuryra));
	        String line = br.readLine();
	        int dienos = Integer.parseInt(line);
//            System.out.println(line);
	        while (line != null && !line.equals(null) && dienos>0) {
	        	--dienos;
	            line=br.readLine();
	            System.out.println(line);
	        }
	    } catch (Exception e) {
	    	System.out.println(e);
	    }
	}
	
	public void toFile (String lines){
		
		try {
			FileWriter fstream = new FileWriter("output.txt");
			BufferedWriter out = new BufferedWriter(fstream);
			out.write("asdf asdf 12345 \n miau gau");
			out.newLine();
			out.write("tguj");
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}