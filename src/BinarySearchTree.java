public class BinarySearchTree {
    private static TreeNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    //二叉树查找
    public TreeNode search(int key) {
        TreeNode current = root;
        while (current != null && current.value != key) {
            if (key < current.value)
                current = current.TREE_LEFT;
            else
                current = current.TREE_RIGHT;
        }
        return current;
    }


}
