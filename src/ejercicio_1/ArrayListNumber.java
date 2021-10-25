package ejercicio_1;

import java.util.ArrayList;

public class ArrayListNumber {

	
	ArrayList<Caja> numeros(){
		
		Caja d1 = new Caja(5);
		Caja d2 = new Caja(2);
		
		
		
	ArrayList<Caja> numberlist = new ArrayList <Caja>();
	
			numberlist.add(d1);
			numberlist.add(d2);
	
	
	
	return numberlist;
	}
	
	public static void main(String[] args) 
	{ 
	// Call AddingData class by creating object of that class. 
	   ArrayListNumber data = new ArrayListNumber(); 

	// Call studentData() method using reference variable data. 
	   ArrayList<Caja> listst = data.numeros(); 

	// Now iterate and display all the Student data. 
	   for(Caja st:listst)
	   { 
	     System.out.println(st.valor); 
 
	   } 
	  } 
	}
