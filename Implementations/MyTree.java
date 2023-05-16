import java.util.Iterator;

public interface MyTree<T> {
    TreeNode<T> root();
    TreeNode<T> parent(TreeNode<T> n) throws IllegalArgumentException;
    Iterable<TreeNode<T>> children(TreeNode<T> n)throws IllegalArgumentException;
    int numChildren(TreeNode<T> n) throws IllegalArgumentException;
    boolean isExternal(TreeNode<T> n) throws IllegalArgumentException;
    boolean isInternal(TreeNode<T> n) throws IllegalArgumentException;
    boolean isRoot(TreeNode<T> n) throws IllegalArgumentException;
    int size();
    boolean isEmpty();
    Iterable<TreeNode<T>> nodesInorder();
    Iterable<TreeNode<T>> nodesPreorder();
    Iterable<TreeNode<T>> nodesPostorder();
}
