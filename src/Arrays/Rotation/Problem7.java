package Arrays.Rotation;

/**
 *
 * Find element at given index after a number of right rotations
 */
public class Problem7 {
    public static void main(String[]args){
        int a[]={1,2,3,4,5};
        int r1[]={0,2};
        int r2[]={0,3};
        int k =1;

        int r[][]={r1,r2};
        int l=r.length;

        for(int i=l-1;i>=0;i--){
            if(k>=r[i][0] && k<=r[i][1])
            {
                int rl=r[i][1]-r[i][0]+1;
                k=(k-1+rl)%rl;
            }
        }

        System.out.println(a[k]);


    }
}
