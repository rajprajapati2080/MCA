class SLL{
private Node head;

//Constructors
//Methods
public void insertAtBegin(int v){
	Node s = new Node(v);
	if (head==null){
		head = s;
	}
	else{
		
		s.setNext(head);
		head = s;
	}
}

public int getSum(){
	return head.sum();
}

}