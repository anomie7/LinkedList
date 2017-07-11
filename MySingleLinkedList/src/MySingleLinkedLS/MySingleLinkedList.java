package MySingleLinkedLS;

public class MySingleLinkedList<T> {
	public Node<T> head = null;
	public int size = 0;

	public void addFirst(T item) {
		Node<T> tmp = new Node<T>(item);
		tmp.next = head;
		head = tmp;
		size++;
	}
	
	public Node<T> getHead() {
		return head;
	}

	public int getSize() {
		return size;
	}

	public void addAfter(Node<T> before, T item) {
		Node<T> tmp = new Node<T>(item);
		tmp.next = before.next;
		before.next = tmp;
		size++;
	}

	public void addLast(T item) {
		Node<T> tmp = new Node<T>(item);
		if(head == null){
			addFirst(item);
			return;
		}
		
		Node<T> p = head;
		while (p.next != null) {
			p = p.next;
		}
		p.next = tmp;
		size++;
	}

	public T removeFirst() {
		if (head == null) {
			return null;
		}
		Node<T> tmp = head;
		head = head.next;
		size--;
		return tmp.data;
	}

	public T removeAfter(Node<T> before) {
		Node<T> tmp = before.next;
		if (tmp == null) {
			return null;
		}
		before.next = tmp.next;
		size--;
		return tmp.data;
	}

	public int IndexOf(T item) {
		int idx = 0;
		Node<T> tmp = head;

		while (tmp != null) {
			if (tmp.data.equals(item)) {
				return idx;
			}
			tmp = tmp.next;
			idx++;
		}
		return -1;
	}

	public Node<T> getNode(int idx) {
		if (idx < 0 || idx >= size)
			return null;

		Node<T> tmp = head;
		for (int i = 0; i < idx; i++) {
			tmp = tmp.next;
		}

		return tmp;
	}

	public T get(int idx) {
		if (idx < 0 || idx >= size)
			return null;

		Node<T> tmp = head;
		for (int i = 0; i < idx; i++) {
			tmp = tmp.next;
		}
		return tmp.data;
	}

	public void add(int idx, T item) {
		if (idx < 0 || idx > size) {
			return;
		} else if (idx == 0) {
			addFirst(item);
			return;
		} else {
			Node<T> before = getNode(idx - 1);
			addAfter(before, item);
		}
	}

	public T remove(int idx) {
		if (idx < 0 || idx >= size) {
			return null;
		} else if (idx == 0) {
			removeFirst();
		}
		Node<T> before = getNode(idx - 1);
		size--;
		return removeAfter(before);
	}

	public T remove(T item) {
		int idx = IndexOf(item);
		size--;
		return remove(idx);
	}
}
