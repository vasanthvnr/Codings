import java.util.Scanner;
public class infinite {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your Option :");
        String a=input.nextLine();
        switch(a){
            case "while":
                while(true){
                    System.out.println("infinite while");
                    //infinite while running

                }
            case "for":
                for(;;){
                    System.out.println("Infinite for");
                    //infinite for running
                }
            default :
                System.out.println("No loop");
                break;
        }

    }
}
