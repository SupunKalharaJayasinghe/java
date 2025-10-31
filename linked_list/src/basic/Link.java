package basic;

public class Link {
	
	public int iData;
	public Link next;
	
	public Link(int data) {
		this.iData = data;
		this.next = null;
	}
	
	public void displayLink() {
		System.out.println(iData);
	}
	
}
