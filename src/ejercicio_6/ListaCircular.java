package ejercicio_6;

public class ListaCircular<T extends Comparable<T>> {

	private NodeDo<T> primero;
	private NodeDo<T> ultimoLeft;
	private NodeDo<T> ultimoRight;
	
	public ListaCircular() {
		this.primero = null;
		this.ultimoLeft = null;
		this.ultimoRight = null;
	}
	
	public void add(T dato) {
		//Node<T> nuevo = new Node<T>();
		if(empty()) {
			NodeDo<T> nuevoHead = new NodeDo<T>(dato);
			this.primero = nuevoHead;
			this.ultimoRight = primero;
			this.ultimoLeft = primero;
		}else {
			if(this.primero.getInformacion().compareTo(dato) < 0) {
				NodeDo<T> nuevo = new NodeDo<T>(dato);
				this.ultimoRight.setSiguiente(nuevo);
				nuevo.setSiguiente(primero);
				this.ultimoRight = nuevo;
			}
			if(this.primero.getInformacion().compareTo(dato) > 0) {
				NodeDo<T> nuevo = new NodeDo<T>(dato);
				this.ultimoLeft.setAnterior(nuevo);
				nuevo.setAnterior(primero);
				this.ultimoLeft = nuevo;
			}
		}
		
		
		
		/*nuevo.setInformacion(dato);
		if(empty()) {
			this.primero = nuevo;
			this.ultimoLeft = this.primero;
			this.primero.setSiguiente(ultimoLeft);
		}else {
			this.ultimoLeft.setSiguiente(nuevo);
			nuevo.setSiguiente(primero);
			this.ultimoLeft = nuevo;
		}*/
	}
	
	/*public void string() {
		Node<T> nod = new Node<T>();
		nod = this.primero;
		do {
			System.out.println(" "+nod.getInformacion());
			nod = nod.getSiguiente();
		}while(nod != this.primero);
	}*/
	public void stringLeft() {
		NodeDo<T> nod = new NodeDo<T>();
		nod = this.primero;
		do {
			System.out.println(" "+nod.getInformacion());
			nod = nod.getAnterior();
		}while(nod != this.primero);
	}
	public void stringRight() {
		NodeDo<T> nod = new NodeDo<T>();
		nod = this.primero;
		do {
			System.out.println(" "+nod.getInformacion());
			nod = nod.getSiguiente();
		}while(nod != this.primero);
	}
	
	/*public void mostrarDere() {
		if(!empty()) {
			String datos = "<=>";
			NodeDo aux = this.primero;
			while(aux != null) {
				datos = datos + "["+aux.getInformacion()+"]<=>";
				aux = aux.getSiguiente();
			}
			System.out.println(datos);
		}
	}*/
	
	
	public boolean empty() {
		return this.primero == null;
	}
	
	public int compareTo(T x) {
		if (this.primero.getInformacion().compareTo(x) < 0) return -1;
		if (this.primero.getInformacion().compareTo(x) > 0) return 1;
		return 0;

	}
}
