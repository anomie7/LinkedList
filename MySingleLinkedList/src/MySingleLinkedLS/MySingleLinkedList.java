package MySingleLinkedLS;

public class MySingleLinkedList<T> {
	public Node<T> head = null;
	public int size = 0;
	
	
	public void firstAdd(T item){
		Node<T> tmp = new Node<T>(item);
		tmp.next = head;
		head = tmp;
		size++;
	}
	
	public void addAfter(Node<T> before, T item){
		Node<T> tmp = new Node<T>(item);
		tmp.next = before.next;
		before.next = tmp;
		size++;
	}
	
	public void addLast(T item){
		Node<T> tmp = new Node<T>(item);
		Node<T> p = head;
		while(p.next != null){
			p = p.next;
		}
		p.next = tmp;
	}
	
	public void removeFirst(){
		if(head == null){
			return;
		}
		head = head.next;
		size--;
	}
	
	public void removeAfter(Node<T> before){
		if(before.next == null){
			return;
		}
		
		before.next = before.next.next;
		size--;
	}
	
	public int IndexOf(T item){
		int idx = 0;
		Node<T> tmp = head;
		
		while(tmp != null){
			if(tmp.data.equals(item)){
				return idx;
			}
			tmp = tmp.next;
			idx++;
		}
		return -1;
	}
	
	public Node<T> getNode(int idx){
		if(idx < 0 || idx >= size)
			return null;
		
		Node<T> tmp = head;
		for(int i = 0; i < idx; i++){
			tmp = tmp.next;
		}
		
		return tmp;
	}
  	
	public T get(int idx){
		if(idx < 0 || idx >= size)
			return null;
		
		Node<T> tmp = head;
		for(int i = 0; i < idx; i++){
			tmp = tmp.next;
		}
		
		return tmp.data;
	}
	
	public void add(int idx, T item){
		if(idx < 0 || idx >= size){
			return;			
		}else if(idx == 0){
			firstAdd(item);
		}else{
			Node<T> before = getNode(idx-1);
			addAfter(before, item);
		}
	}
	
	public static void main(String[] args){
		MySingleLinkedList<String> test = new MySingleLinkedList<>();
		test.firstAdd("");
		
	}

}
