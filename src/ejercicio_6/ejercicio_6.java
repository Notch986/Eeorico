package ejercicio_6;

public class ejercicio_6 {

	public static void main (String [] Args) {
		
		//System.out.print("Hola mundo");
		ListaCircular<Integer> li = new ListaCircular<Integer>();
		li.add(34);
		li.add(56);
		li.add(12);
		li.add(78);
		li.add(32);
		li.add(25);
		li.add(50);
		li.add(70);
		li.stringLeft();
		System.out.println();
		System.out.println("*******************");
		li.stringRight();
		System.out.println();
		System.out.println("*******************");
		ListaCircular<String> lio = new ListaCircular<String>();
		lio.add("luis");
		lio.add("diego");
		lio.add("gonzalo");
		lio.add("perez");
		lio.add("rene");
		lio.add("zamudio");
		
		lio.stringLeft();
		System.out.println();
		System.out.println("*******************");
		lio.stringRight();
		
	}
}
