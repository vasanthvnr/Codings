import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int a=in.nextInt();
        int b=in.nextInt();
        if(a>b){
            int i=1;
            while(i<a){
                if(a%b!=0){
                    a=a*i;
                    i++;
                }
                else {
                    System.out.println(a+" is lcm");
                    break;
                }
            }
        }
        else{
            int i=1;
            while(i<b){
                if(b%a!=0){
                    b=b*i;
                    i++;
                }
                else{
                    System.out.println(b+" is lcm");
                    break;
                }
            }
        }
    }
}
