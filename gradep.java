public class gradep {
    public static void main(String[] args) {
        int num=98;
        if(num>=90){
            System.out.println("A");

        } else if (num>=80 && num<=89) {
            System.out.println("B");
        } else if (num>=70 && num<=79) {
            System.out.println("C");
        } else if (num>=60 && num<=69) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
    }
}
