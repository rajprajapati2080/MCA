class UseSLL{
	public static void main(String[] args){
	SLL myList = new SLL();

	myList.insertAtBegin(10);
	myList.insertAtBegin(20);
	myList.insertAtBegin(30);

	System.out.println("Total sum of values in list is "+myList.getSum());
}

}