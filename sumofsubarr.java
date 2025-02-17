public class sumofsubarr {
    static int max(int a, int b){
        return a>b? a : b;
    }
    public static void main(String[] args) {
        int[] arr={1,3,5,2,4,6};
        int k=3;
        int maxS=0;
        int curS=0;
        if (k> arr.length) System.out.println(-1);
        for (int i=0;i<k;i++) {
            curS += arr[i];
        }
        maxS=curS;
        for (int i=k;i< arr.length;i++){//kadanes algorithm
            curS=curS+arr[i]-arr[i-k];
            maxS=max(maxS,curS);
        }

        System.out.println(maxS);
    }
}
