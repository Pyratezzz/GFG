package Arrays.Arrangement_Rearrangement;

/**
 *
 * Minimum swaps required to bring all elements less than or equal to k together
 */
public class Problem5 {
    public static void main(String[] args){
        int a[] ={2, 1, 5, 6, 3};
        int k=3;
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<=k)
                count++;
        }
        int i=0;
        int j=count-1;
        int curr=0;
        int min=0;
        for(int l=i;l<=j;l++){
            if(a[l]>k)
                curr++;
        }
        min=curr;
        while(j<a.length-1){
            if(a[i]>k)
                curr--;
            if(j+1<a.length && a[j+1]>k)
                curr++;
            if(min>curr)
                min=curr;

            i++;
            j++;
        }
            System.out.println(min);

    }
}
