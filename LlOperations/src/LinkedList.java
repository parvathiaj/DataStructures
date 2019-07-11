
public class LinkedList {
Node head;
void insert(int key) {
	Node temp =new Node();
	temp.data=key;
	if(head==null)
	  head=temp;
	else
	{Node curr=head;
	while(curr.next!=null) {
		curr=curr.next;
		
	}
	curr.next=temp;
	}
}
void delete() {//delete from top
	head=head.next;
}
int  search(int key) {
	int pos=1;
	Node tp1=head;
	while(tp1!=null) {
		if(tp1.data==key)
			return pos;
		else {
			tp1=tp1.next;
			pos+=1;
		}
		
	}
	
	return -1;
}

void print() {
	Node tp1=head;
	while(tp1!=null) {
		System.out.println(tp1.data);
		tp1=tp1.next;
	}
}
}
