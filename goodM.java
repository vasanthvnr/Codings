import java.util.Scanner;

public class goodM {
    static String isgood(int a){
        if(a%3==0 && a%4==0){
            return "Good Morning";
        } else if (a%4==0) {
            return "Good afternoon";
        } else if (a%3==0) {
            return "Good Evening";
        }
        else
            return "Good Night";
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=in.nextInt();
        System.out.println(isgood(num));
    }
}
