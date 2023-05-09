public class TreeNode<T> {
    T e;
    TreeNode<T> left , right , parent;
    public TreeNode(){}
    public TreeNode(T e){this.e = e;}
    public TreeNode(T e , TreeNode<T> left , TreeNode<T> right , TreeNode<T> parent){
        this(e);
        this.left = left;
        this.right = right;
        this.parent = parent;
    }
}
