import java.util.Scanner;

public class gcd {
    static int gcd(int n1, int n2){
        return (n2==0)?n1:gcd(n2,n1%n2);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two number :");
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println("The gcd of "+a+" & "+b+" is "+gcd(a,b));
    }

}