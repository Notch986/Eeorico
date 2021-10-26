package ejercicio_5;

public interface Queue{
	public Item peek();
	public Item pop();
	public void push(Item newPush);
	public boolean isEmpty();
}
