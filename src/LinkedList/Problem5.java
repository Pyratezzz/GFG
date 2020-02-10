package LinkedList;

/***
 *
 * 2D array to 2D list
 */
public class Problem5 {
    static class Node{
        int data;
        Node right;
        Node down;

        Node(int d){
            data = d;
            right = down = null;
        }
    }

    public static Node arrToList(int [][]arr, int i, int j){
        int n = arr.length;
        int m = arr[0].length;
        if(i >= m || j >= n){
            return null;
        }
        Node root = new Node(arr[i][j]);
        root.right = arrToList(arr,i,j+1);
        root.down = arrToList(arr,i+1,j);
        return root;
    }

    public static void print(Node n){
        Node p = n,q = n;

        while(q != null){
            int num = 0;
            while(p != null){
                System.out.print(p.data+"-");
                p=p.right;
                num++;
            }
            System.out.print("N");
            System.out.println();
            int temp = num;
            while(num != 0){
                num--;
             System.out.print("| ");
            }
            if(q.down == null)
            {
                System.out.println();
            }
            while(temp != 0 && q.down == null){
                temp--;
                System.out.print("N ");
            }

            System.out.println();
            q = q.down;
            p = q;
        }
    }

    public static void main(String [] args){
        int [][] a =new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        Node head = arrToList(a,0,0);
        print(head);
    }
}
