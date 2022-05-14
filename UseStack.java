import java.util.Scanner;
public class UseStack{
	public static boolean checkParenthesis(String str){
		Stack s = new Stack();
		for(int i = 0; i < str.length(); i++){
        if(str.charAt(i) == '('){
            s.push(str.charAt(i));
        }else if(str.charAt(i) == ')'){
				if(s.isEmpty()){
					return false;
				}else{
					char ch = s.top();
					s.pop();
					if(ch!='('){
						return false;
					}
				}
			}
		}
		if(s.isEmpty()) return true;
		return false;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		if(checkParenthesis(str)){
			System.out.println("Balanced parenthesis.");
		}else{
			System.out.println("Not Balanced parenthesis.")	;
		}
	}
}