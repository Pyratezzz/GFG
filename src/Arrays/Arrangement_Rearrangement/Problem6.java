package Arrays.Arrangement_Rearrangement;

import static Arrays.Arrangement_Rearrangement.Problem1.swap;


/**
 *
 * Reorder an array according to given indexes
 */
public class Problem6 {
    public static void main(String[] args){

        int a[]  = {10, 11, 12};
        int i[]={1, 0, 2};

        int n=a.length;
        for(int j=0;j<n;j++){
            while(i[j]!=j){
                swap(a,i[j],i[i[j]]);
                swap(i,i[j],i[i[j]]);
            }
        }

        for(int j=0;j<n;j++){
            System.out.println(i[j]+" : "+a[j]);
        }
    }
}
