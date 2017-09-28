package example;



public class SinglyLinkedList {
	private Node head;
	private int size;
	
	public SinglyLinkedList() {
		this.head = null;
		this.size = 0;
	}
	
	public void add(int data) {
		Node tmp = new Node(data);
		Node current = head;
		
		//if list is empty
		if(head == null) {
			head = tmp;
			size++;
		//if list is not empty
		} else {
			while(current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(tmp);
			size++;
			
		}
		
	}
	
	/**
	 * remove last node in list
	 */
	public void removeLast() {
		Node currentNode = head;
		if(size > 0) {
			for(int i = 0; i < size - 1; i++) {
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(currentNode.getNext());
			size--;
		}
		
		
	}
	
	/**
	 * remove all elements in list that is great than a taget value
	 * @param target that do you want to remove
	 * 
	 */
	public void removeByValue(int target) {
		Node tmpNode = head;
		int i = 0;
		while(tmpNode.getNext() != null && i != size - 1) {
			if(tmpNode.getData() > target) {
				tmpNode = tmpNode.getNext();
				size--;
			} else {
				tmpNode = tmpNode.getNext();
			}
		}
	}
	
	public void printList() {
		Node current = head;
		for(int i = 0; i < size; i++) {
			System.out.println(current.getData());
			current = current.getNext();
		}
		
	}
}	
