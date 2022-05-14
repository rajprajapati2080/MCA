public class useStackSLL {

    public static void main(String[] args) {
        stackSLL s = new stackSLL();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.pop();
        s.pop();
        s.pop();
        System.out.println(s.top());
    }
}
