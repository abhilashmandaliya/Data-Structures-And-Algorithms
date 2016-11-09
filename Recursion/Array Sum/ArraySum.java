public class ArraySum {
    public static void main(String[] args) {
        int ary[] = {1,2,3,4,5,6,7};
        System.out.println(arraySum(ary,ary.length));
    }
    public static int arraySum(int ary[], int n){
        if(n==1)
            return ary[0];
        else
            return arraySum(ary,n-1) + ary[n-1];
    }
}