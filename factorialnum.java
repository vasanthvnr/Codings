import java.util.Scanner;

public class factorialnum {
    static int factorial(int num){
        if(num==1){
            return num;
        }
        return num* factorial(num-1);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value :");
        int a=input.nextInt();
        int result=0;
        result=factorial(a);
        System.out.println(result);
    }
}
