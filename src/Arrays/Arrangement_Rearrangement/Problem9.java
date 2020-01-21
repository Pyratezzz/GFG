package Arrays.Arrangement_Rearrangement;

/**
 *
 * Replace every array element by multiplication of previous and next
 */
public class Problem9 {
    public static void main(String []args){
        int[] a={2, 3, 4, 5, 6};
        int temp =a[0];
        int temp1=1;
        for(int i=0;i<a.length-1;i++){
            temp1=a[i];
            a[i]=a[i+1]*temp;
            temp=temp1;
        }
        a[a.length-1]=temp*a[a.length-1];
        for(int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
