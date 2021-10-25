package ejercicio_6;

public class Node<T> {
	
	private T informacion;
	private NodeDo<T> siguienteDo;
	
	public Node() {
		this.siguienteDo = null;
	}
	
	public Node(T data) {
		this.informacion = data;
		this.siguienteDo = null;
	}
	public Node(T data, NodeDo<T> next) {
		this.informacion = data;
		this.siguienteDo = next;
	}

	public T getInformacion() {
		return informacion;
	}

	public void setInformacion(T informacion) {
		this.informacion = informacion;
	}

	public NodeDo<T> getSiguienteDo() {
		return siguienteDo;
	}

	public void setSiguienteDo(NodeDo<T> siguienteDo) {
		this.siguienteDo = siguienteDo;
	}

	

	
	
}
