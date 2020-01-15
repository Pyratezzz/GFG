package Arrays.Rotation;

/**
 *
 * Find maximum value of Sum( i*arr[i]) with only rotations on given array allowed
 */
public class Problem4 {
    public static void main(String[] args){
        int a[] =new int[]{10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int cur_sum=0;
        int max_sum=0;
        int sum=0;
        for (int i=0;i<a.length;i++){
            cur_sum=cur_sum+i*a[i];
            sum=sum+a[i];
        }

        max_sum=cur_sum;

        for(int i=1;i<a.length;i++)
        {
            cur_sum=cur_sum+a[i-1]*a.length-sum;
            if(cur_sum>max_sum)
                max_sum=cur_sum;
        }

        System.out.println(max_sum);
    }
}
