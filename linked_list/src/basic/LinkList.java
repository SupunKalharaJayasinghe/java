package basic;

public class LinkList {
	
	private Link first;

	public LinkList() {
		this.first = null;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void displayList() {
		
		Link current = first;
		
		while(current != null) {
			current.displayLink();
			current = current.next;
		}
	}
	
	public Link find(int key) {
		Link current = first;
		
		while(current != null) {
			if(current.iData == key) {
				return current;
			}
			else
				current = current.next;
		}
		return null;
	}
	
	public void insertFirst(int key) {
		Link n1 = new Link(key);
		
		n1.next = first;
		first = n1;
	}
	
	public Link deleteFirst() {
		Link temp = first;
		first = first.next;
		return temp;
	}
	
}
