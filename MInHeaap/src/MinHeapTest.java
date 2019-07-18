
public class MinHeapTest {
 public static void main(String []args) {
	 int []key= {5,3,8,6,2,1,7,9,4,0};
	 MinHeap m= new MinHeap(key);
	 m.print();
	 System.out.print(m.parent(2));
	System.out.println(m.get(m.parent(2)));
	System.out.println(m.parent(0));
	 System.out.println(m.left(1));
	 System.out.println(m.get(m.left(1)));
	 int l=m.left(3);
	 if(l!=-1)
		 System.out.println(m.get(l));
	 System.out.println(m.check(3));
	m.print();
	m.buildHeap();
	m.print();
 }
}
