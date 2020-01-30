package LinkedList;

import apple.laf.JRSUIUtils;


/**
 *
 * Binary tree to circullary doubly linked list
 */
public class Problem1 {

   static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int d){
            data = d;
            left = null;
            right = null;
        }
    }


    public static TreeNode concateList(TreeNode leftList, TreeNode rightList){
       if(rightList == null)
           return leftList;
       if(leftList == null)
           return rightList;
       TreeNode leftLast = leftList.left;
       TreeNode rightLast = rightList.left;
       leftLast.right = rightList;
       rightList.left = leftLast;
       rightLast.right = leftList;
       leftList.left = rightLast;
       return leftList;
    }

    public static TreeNode convertTreetoList(TreeNode t){
       if(t==null)
           return null;
      TreeNode left = convertTreetoList(t.left);

      TreeNode right = convertTreetoList(t.right);

        t.right =t.left =t;

      TreeNode a = concateList(concateList(left,t),right);
      return a;

    }
    public static void main(String[] args){
        TreeNode t = new TreeNode(1);//Inoder 425163
        t.left = new TreeNode(2);
        t.right = new TreeNode(3);
        t.left.left = new TreeNode(4);
        t.left.right = new TreeNode(5);
        t.right.left = new TreeNode(6);

        TreeNode n = convertTreetoList(t);

        TreeNode p = n;
        System.out.println(p.data);
        p=p.right;
        while(p != n){
            System.out.println(p.data);
            p=p.right;
        }

    }
}
