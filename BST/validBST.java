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
