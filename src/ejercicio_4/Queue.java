package ejercicio_4;

public interface Queue<E> {
	void enqueue(E x);
	E dequeue();
	E front();
	E back();
	boolean isEmpty();
}
