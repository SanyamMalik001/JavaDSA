public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data) {

        if (root == null) {
            return null;
        }

        if (root.data == data) {
            ArrayList<Integer> res = new ArrayList<>();
            res.add(data);
            return res;
        }
        if (root.data > data) {
            ArrayList<Integer> leftOut = getPath(root.left, data);
            if (leftOut != null) {
                leftOut.add(root.data);
                return leftOut;
            }
        }
        if (root.data < data) {
            ArrayList<Integer> rightOut = getPath(root.right, data);
            if (rightOut != null) {
                rightOut.add(root.data);
                return rightOut;
            }
        }
        return null;
    }
