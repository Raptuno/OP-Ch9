package core;
import java.io.*;

public class Main {
	public static void main (String[] args) throws IOException {
		Helpers h=new Helpers();
		
		int randomNumber=h.randomPicker(6)-1;
		int index=1;
		boolean cutter=(randomNumber!=6|index!=1048576);
		
		do {
			
			System.out.println("Iteración "+index+": "+randomNumber);
			index++;
			randomNumber=h.randomPicker(6)-1;
		} while(index!=10);
		if (index==10) {
			System.out.println("Iteración "+index+": "+randomNumber);
		}
		
		for(int i=0; i<6; i++) {
			h.setHelpers(i+1);
		}
		
		
		
		for(int i=0; i<h.helpersList.size(); i++) {
			System.out.println(h.helpersList);
		}
	}
}
