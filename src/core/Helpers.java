package core;
import java.util.*;
import org.apache.commons.lang3.Range;


public class Helpers {
	
	public LinkedHashMap<String, Object> helpersList = new LinkedHashMap<>();
	
	private LinkedHashMap <String, LinkedHashMap<String, Object>> helperAttrib = new LinkedHashMap<>();
	
	private Object[] helperContainer=new Object[5];
	
	protected int randomPicker(int max) {
		return (int)(Math.random()*((max-1)+1)+1);
	}
	
	protected void setHelpers(int number) {
		//helpersList.add("Ayudante "+number);
	}
	
	private Object[] helperAttribs = new Object[6];
	private String[] attribsList= {"Ojos", "Color de piel", "Altura", "Nivel de creación", "Nivel de reparación", "Nivel de Destrucción"};
	private String[] skinColors = {"Amarilla", "Morada"};
	private String[] height = {"Mediano", "Alto"};
	
	Range<Integer> checker1=Range.between(0, 1);
	Range<Integer> checker2=Range.between(0, 5);
	
	private void setAttribs() {
		for (int i = 0; i < helperAttribs.length; i++) {
			Object attrib = new Object();
			if (checker1.contains(i)) {
				if(i==0) {
					attrib=(Integer)randomPicker(2)-1;
				}
			} else if (checker2.contains(i)) {
				
			}
			
		}
	}
}
