import java.util.*;
public class perfect_number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=input.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }

        }
        if(num==sum){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
}
