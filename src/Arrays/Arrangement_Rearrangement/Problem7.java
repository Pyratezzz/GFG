package Arrays.Arrangement_Rearrangement;

/**
 *
 * Rearrange an array in maximum minimum form | Set 2 (O(1) extra space)
 */
public class Problem7 {
    public static void main(String[] args){
        int a[] ={1,2,3,4,6,7};
        int max_index=a.length-1;
        int min_index =0;
        int max_element=a[max_index]+1;

        for(int i=0;i<a.length; i++){
            if(i%2==0){
                a[i]=a[i]+(a[max_index]%max_element)*max_element;
                max_index--;
                System.out.println(a[i]);
            }
            else{
                a[i]=a[i]+(a[min_index]%max_element)*max_element;
                min_index++;
                System.out.println(a[i]);
            }
        }
        for(int i=0;i<a.length; i++){
            a[i]=a[i]/max_element;
            System.out.println(a[i]);
        }
    }

}
