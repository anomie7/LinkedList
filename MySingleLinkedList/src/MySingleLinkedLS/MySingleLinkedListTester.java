package MySingleLinkedLS;

public class MySingleLinkedListTester {
	
	public static void main(String[] args){
		MySingleLinkedList<String> list = new MySingleLinkedList<>();
		list.addLast("�ȳ�");
		list.addFirst("�ϴ�");
		list.add(2, "�¾�");
		list.addLast("��");
		list.addFirst("��");
		list.add(1, "��");
		
		printList(list);
		
//		System.out.println(list.get(0));
		
	}

	private static void printList(MySingleLinkedList<String> list) {
		for(int i = 0; i < list.getSize(); i++){
			System.out.print(list.get(i));
			if(i < list.getSize() -1)
				System.out.print(", ");
		}
	}
}
