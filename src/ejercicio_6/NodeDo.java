package ejercicio_6;

public class NodeDo<T> {

	private T informacion;
	private NodeDo<T> siguiente;
	private NodeDo<T> anterior;
	
	public NodeDo() {
		this.siguiente = null;
		this.anterior = null;
	}
	public NodeDo(T data) {
		this.informacion = data;
		this.siguiente = null;
		this.anterior = null;
	}
	public T getInformacion() {
		return informacion;
	}
	public void setInformacion(T informacion) {
		this.informacion = informacion;
	}
	public NodeDo<T> getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(NodeDo<T> siguiente) {
		this.siguiente = siguiente;
	}
	public NodeDo<T> getAnterior() {
		return anterior;
	}
	public void setAnterior(NodeDo<T> anterior) {
		this.anterior = anterior;
	}
	
	
	
	
	
	
}
