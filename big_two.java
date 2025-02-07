import java.util.Scanner;

public class big_two {
    static boolean isgreater(int c, int d){
        if(c>d){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int a=input.nextInt();
        int b=input.nextInt();
        if(isgreater(a,b)){
            System.out.println(a+" is greater");
        }
        else{
            System.out.println(b+" is greater");
        }

    }
}
