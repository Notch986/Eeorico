package ejercicio_3;

import java.util.ArrayList;
import java.util.Iterator;

public class test {
	public static void main (String [] Args) {
	
	ArrayList<String> nombreArrayList = new ArrayList<String>();

	// Añadimos 10 Elementos en el ArrayList
	for (int i=1; i<=3; i++){
		nombreArrayList.add("Elemento "+i); 
	}


	// Declaramos el Iterador e imprimimos los Elementos del ArrayList
	Iterator<String> nombreIterator = nombreArrayList.iterator();
	while(nombreIterator.hasNext()){
		String elemento = nombreIterator.next();
		System.out.print(elemento+" / ");
		}
	}
}
