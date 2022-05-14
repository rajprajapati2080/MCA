public class Stack {
    int capacity ;
    int top;
	
    char a[] ; 
	
	public Stack(){
		top = -1;
		capacity = 10;
		a = new char[capacity];
	}
    boolean isEmpty()
    {
        return (top < 0);
    }
 
    boolean push(char x)
    {
        if (top >= (capacity - 1)) {
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            a[++top] = x;
            return true;
        }
    }
 
    char pop()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            char x = a[top--];
            return x;
        }
    }
 
    char top()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            char x = a[top];
            return x;
        }
    }
    
    void print(){
    for(int i = top;i>-1;i--){
      System.out.print(" "+ a[i]);
    }
  }
}