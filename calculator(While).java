import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        while(true){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your Operation :");
            String s=input.nextLine();
            if(s.equals("esc"))break;

            switch(s){
                case "+":
                    System.out.println("Enter the two values: ");
                    int a  =input.nextInt();
                    int b =input.nextInt();
                    System.out.println(a+b);
                    break;
                case "-":
                    System.out.println("Enter the two values: ");
                    a  =input.nextInt();
                    b =input.nextInt();
                    System.out.println(a-b);
                    break;
                case "*":
                    System.out.println("Enter the two values: ");
                    a  =input.nextInt();
                    b =input.nextInt();
                    System.out.println(a*b);
                    break;
                case "/":
                    System.out.println("Enter the two values: ");
                    a  =input.nextInt();
                    b =input.nextInt();
                    System.out.println(a/b);
                    break;
                case "esc":
                    break;
                default:
                    System.out.println("Invaild input");


            }



        }


    }
}
