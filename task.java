1. nth prime:
public class prime {
    public static void main(String[] args) {
        int n=13;
        int count=0;
        for (int i=2;i<n-1;i++){
//by leaving the first number and last number and check the remaining number
            if(n%i==0){
                count+=1;
            }

        }
        if(count==0){
            System.out.println("its is a prime");
        }
        else{
            System.out.println("Its not a prime");
        }
    }
}

2. divisible of 27:
public class multipleof {
    public static void main(String[] args) {
        int a=54;
        if(a%27==0){
//the number divided by 27 the rem is 0, it is a divided by 27. 
            System.out.println("yes is multiple of 27");
        }
        else{
            System.out.println("its is not multiple of 27");
        }
    }
}

3. add and subb:
public class Main {
    public static void main(String[] args) {
        int a=10;
        int b=10;
        System.out.println(a+b);
        if(a<b) {
            System.out.println((a - b) * -1);
        }
//if it in negative to multiply *-1 to positive value
        else{
            System.out.println(a-b);
        }


    }
}
