package example;

public class test {

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(6);
		list.printList();
		System.out.println("======");
		list.removeByValue(0);
		//list.removeLast();
		list.printList();
	}

}
