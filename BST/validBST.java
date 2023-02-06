static Integer prev=null;
    public static boolean validateBST(BinaryTreeNode<Integer> root){
        if(root==null) return true;
        if(!validateBST(root.left))
            return false;
        if(prev!=null&& prev>root.data) return false;
        prev=root.data;
        if(!validateBST(root.right)) return false;
        return true;
    }
// The first method is using inorder to check if the next value is greater than previous one as it is inorder of a BST.
// The problem with above solution is it cannot handle duplicate values consecutively, so we have to consider that there are none.






public static boolean validateBST(BinaryTreeNode<Integer> root){
         return validateBST(root, Integer.MAX_VALUE, Integer.MIN_VALUE);

    }
    public static boolean validateBST(BinaryTreeNode<Integer> root, int max, int min){
        if(root==null) return true;
        if(root.data<min||root.data>=max) return false;
        if(!validateBST(root.left,min,root.data)||!validateBST(root.right,root.data,max)) return false;
        return true;
    }
// In this solution time is O(n) and space is O(D).
