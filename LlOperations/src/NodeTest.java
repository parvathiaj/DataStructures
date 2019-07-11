
public class NodeTest {
	public static void main(String []args) {
		Node n=new Node();
		n.data=4;
		
		Node m=new Node();
		m.data=9;
		n.next=m;
		System.out.println(n.data);
		System.out.println(m.data);
	}


}
