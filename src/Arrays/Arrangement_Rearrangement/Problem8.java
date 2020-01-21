package Arrays.Arrangement_Rearrangement;

import static Arrays.Arrangement_Rearrangement.Problem1.swap;
import static java.lang.Math.pow;


/**
 *
 * Positive elements at even and negative at odd positions (Relative order not maintained)
 */
public class Problem8 {
    public static void main(String[] args){
        int a[] ={1, -3, 5, 6, -3, 6, 7, -4, 9, 10};
        int n =a.length;
        for(int i=0;i<n;i++){
            if(pow(-1,i)*a[i]<0){
                int k=i;
                while(k<n && pow(-1,i)*a[k]<0){
                    k++;
                }
                if(k<n)
                    swap(a,i,k);
                else
                    break;
            }

        }
        for(int i=0;i<n;i++)
        System.out.println(a[i]);
    }
}
