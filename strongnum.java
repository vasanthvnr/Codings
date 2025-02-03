import java.util.Scanner;

public class strongnum {
    static int fact(int n){
        if(n==1){
            return 1;
        }
        else
            return n * fact(n-1);

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=input.nextInt();
        int temp=num;
        int sum=0;
        while (num > 0) {
            int res=num%10;
            sum+=fact(res);
            num=num/10;
        }
        System.out.println(sum);
        if(sum==temp){
            System.out.println("Strong");
        }
        else
            System.out.println("Not strong");

    }
}
