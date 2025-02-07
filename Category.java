import java.util.Scanner;

public class Category {
    static String isage(int num)
    {
     if(num>=50){
         return "Your age is above 50";
     } else if (num>=40 && num<=50) {
         return "Your age is between 40 to 50";
     }
     else
         return "Your age is less than 40";
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the age :");
        int age=in.nextInt();
        System.out.println(isage(age));

    }
}
