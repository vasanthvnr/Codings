import java.util.Scanner;
public class fizz {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num= input.nextInt();
        if(num %3==0 && num%5==0){
            System.out.println("FizzBuzz");
        }
        else if(num%3==0){
            System.out.println("fizz");
        }
        else
            System.out.println(num);
    }


}
