package ejercicio_3;

import java.util.ArrayList;

public class Operaciones <T> {

	public static <T extends Comparable<T>> T menor(ArrayList<T> array) { // usando el compare to 
		T min = array.get(0);
		for (int i=1; i<array.size(); i++) {
			if(array.get(i)!=null) {
				if (min.compareTo(array.get(i))>0) {
					min = array.get(i);
				}
			}
		}	
		return min;
	}
    
    }

//falta

