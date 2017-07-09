package MySingleLinkedLS;

public class MySingleLinkedList<T> {
	public Node<T> head = null;
	public int size = 0;
	
	
	public void firstAdd(T item){
		Node<T> tmp = new Node<T>(item);
		head = tmp;
		size++;
	}
	
	public static void main(String[] args){
		MySingleLinkedList<String> test = new MySingleLinkedList<>();
		test.firstAdd("»ç¶ûÇØ");
		
	}

}
