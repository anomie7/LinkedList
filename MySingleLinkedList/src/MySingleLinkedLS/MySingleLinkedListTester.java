package MySingleLinkedLS;

public class MySingleLinkedListTester {
	
	public static void main(String[] args){
		MySingleLinkedList<String> list = new MySingleLinkedList<>();
		list.addLast("¾È³ç");
		list.addFirst("ÇÏ´Ã");
		list.add(2, "ÅÂ¾ç");
		list.addLast("¶¥");
		list.addFirst("º°");
		list.add(1, "´Þ");
		
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
