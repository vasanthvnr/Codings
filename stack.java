import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class brackets {
    static boolean isvalid(String s){

        Stack<Character> stack=new Stack<>();//using stack in-built stack
        for (char i:s.toCharArray()){//to convert the string as array
            if(i =='{' || i=='['){
                stack.push(i);
            }
            else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (i == '}' && top != '{' || i == ']' && top != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string :");
        String s= in.nextLine();
        System.out.println(isvalid(s));

    }
}
