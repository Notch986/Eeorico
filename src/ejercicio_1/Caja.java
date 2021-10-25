package ejercicio_1;

public class Caja<T extends Integer> {
	protected T valor;

	public Caja(T valor) {
		super();
		this.valor = valor;
	}

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}
	
	
	

}
