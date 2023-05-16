import java.util.ArrayList;
import java.util.Iterator;
public class MyBinaryTree<T> implements MyTree<T> {
    TreeNode<T> root;
    int size;
    public MyBinaryTree(){size = 0;}
    @Override
    public TreeNode<T> root() {
        return root;
    }
    public TreeNode<T> left(TreeNode<T> n) throws IllegalArgumentException {
        if (n == null) throw new IllegalArgumentException("Null TreeNode!");
        if (n.left == null) throw new IllegalArgumentException("No left child!");
        return n.left;
    }
    public TreeNode<T> right(TreeNode<T> n) throws IllegalArgumentException {
        if (n == null) throw new IllegalArgumentException("Null TreeNode!");
        if (n.right == null) throw new IllegalArgumentException("No right child!");
        return n.right;
    }
    @Override
    public TreeNode<T> parent(TreeNode<T> n) throws IllegalArgumentException {
        if (n == null) throw new IllegalArgumentException("Null TreeNode!");
        if (n.parent == null) throw new IllegalArgumentException("No Parent Here!");
        return n.parent;
    }
    @Override
    public Iterable<TreeNode<T>> children(TreeNode<T> n) throws IllegalArgumentException {
        ArrayList<TreeNode<T>> children = new ArrayList<>();
        if (n.left != null) children.add(n.left);
        if (n.right != null) children.add(n.right);
        return children;
    }
    @Override
    public int numChildren(TreeNode<T> n) throws IllegalArgumentException {
        int count = 0;
        if (n.left !=  null) count++;
        if (n.right !=  null) count++;
        return count;
    }
    public TreeNode<T> addRoot(T e) throws IllegalStateException {
        if (!isEmpty()) throw new IllegalStateException("Tree is not empty!");
        root = new TreeNode<>(e);
        size = 1;
        return root;
    }
    public TreeNode<T> addLeft(TreeNode<T> n , T e) throws IllegalArgumentException {
        if (n == null) throw new IllegalArgumentException("Null TreeNode!");
        if (n.left != null) throw new IllegalArgumentException("Has a left child!");
        n.left = new TreeNode<>(e , null , null , n);
        size++;
        return n.left;
    }
    public TreeNode<T> addRight(TreeNode<T> n , T e) throws IllegalArgumentException {
        if (n == null) throw new IllegalArgumentException("Null TreeNode!");
        if (n.right != null) throw new IllegalArgumentException("Has a right child!");
        n.right = new TreeNode<>(e , null , null , n);
        size++;
        return n.right;
    }
    public T set(TreeNode<T> n , T e) throws IllegalArgumentException {
        if (n == null) throw new IllegalArgumentException("Null TreeNode!");
        T old = n.e;
        n.e = e;
        return old;
    }
    public void attach(TreeNode<T> n , MyBinaryTree<T> t1 , MyBinaryTree<T> t2)
        throws IllegalArgumentException{
        if (n == null) throw new IllegalArgumentException("Null TreeNode!");
        if (!isExternal(n)) throw new IllegalArgumentException("Must be External!");
        size++;
        if (!t1.isEmpty()) {
            size += t1.size;
            n.left = t1.root;
            t1.root.parent = n;
            t1.root = null;
            t1.size = 0;
        }
        if (!t2.isEmpty()) {
            size += t2.size;
            n.right = t2.root;
            t2.root.parent = n;
            t2.root = null;
            t2.size = 0;
        }
    }
    public T remove(TreeNode<T> n) throws IllegalArgumentException {
        if (n == null) throw new IllegalArgumentException("Null TreeNode!");
        if (!isExternal(n)) throw new IllegalArgumentException("Can't be Removed!");
        if (n == root) {
           root = null;
           size = 0;
           return n.e;
        }
        T e =  n.e;
        if (n.parent.left == n) n.parent.left = null;
        else n.parent.right = null;
        n.parent = n;
        n.e = null;
        return e;
    }
    @Override
    public boolean isExternal(TreeNode<T> n) throws IllegalArgumentException {
        if (n == null) throw new IllegalArgumentException("Null TreeNode!");
        return n.left == null && n.right == null;
    }
    @Override
    public boolean isInternal(TreeNode<T> n) throws IllegalArgumentException {
        if (n == null) throw new IllegalArgumentException("Null TreeNode!");
        return n.parent != null && (n.right != null || n.left != null);
    }
    @Override
    public boolean isRoot(TreeNode<T> n) throws IllegalArgumentException {
        if (n == null) throw new IllegalArgumentException("Null TreeNode!");
        return n == root;
    }
    @Override
    public int size() {return size;}
    @Override
    public boolean isEmpty() {return size == 0;}

    private void inOrder(TreeNode<T> n, ArrayList<TreeNode<T>> list) {
        if (left(n) != null)
            inOrder(left(n) , list);
        list.add(n);
        if (right(n) != null)
            inOrder(right(n) , list);
    }
    private void preOrder(TreeNode<T> n, ArrayList<TreeNode<T>> list) {
        list.add(n);
        if (left(n) != null)
            inOrder(left(n) , list);
        if (right(n) != null)
            inOrder(right(n) , list);
    }
    private void postOrder(TreeNode<T> n, ArrayList<TreeNode<T>> list) {
        if (left(n) != null)
            inOrder(left(n) , list);
        if (right(n) != null)
            inOrder(right(n) , list);
        list.add(n);
    }
    private Iterable<TreeNode<T>> inorderSet() {
        ArrayList<TreeNode<T>> nodes = new ArrayList<>();
        if (!isEmpty()) inOrder(root() , nodes);
        return nodes;
    }
    private Iterable<TreeNode<T>> preorderSet() {
        ArrayList<TreeNode<T>> nodes = new ArrayList<>();
        if (!isEmpty()) preOrder(root() , nodes);
        return nodes;
    }
    private Iterable<TreeNode<T>> postorderSet() {
        ArrayList<TreeNode<T>> nodes = new ArrayList<>();
        if (!isEmpty()) preOrder(root() , nodes);
        return nodes;
    }
    @Override
    public Iterable<TreeNode<T>> nodesInorder() {return inorderSet();}
    @Override
    public Iterable<TreeNode<T>> nodesPreorder() {return preorderSet();}
    @Override
    public Iterable<TreeNode<T>> nodesPostorder() {return postorderSet();}
}