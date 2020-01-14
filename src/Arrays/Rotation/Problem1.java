package Arrays.Rotation;

/**

 Problem: Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
 **/
public class Problem1 {
    public static void reverse(int[]a, int d, int l){
        while(d<l)
        {
            a[d]=a[d]+a[l];
            a[l]=a[d]-a[l];
            a[d]=a[d]-a[l];
            d++;
            l--;
        }
    }
    public static void  main(String[] args){

        int a[] = new int[]{1,2,3,4,5,6,7,8};
        //n=8
        int n = a.length;
        //d=2
        int d=2;
        if(d>0){
        reverse(a,0,d-1);
        reverse(a,d,n-1);
        reverse(a,0,n-1);
    }
    for(int i=0; i< a.length;i++ )
        System.out.println(a[i]);
    }
}
