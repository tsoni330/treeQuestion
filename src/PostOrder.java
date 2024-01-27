public class PostOrder {

    // in which first we pring left child then we print right child and then print rood node.

    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.binaryTree(RawData.arr);
        postOrder(root);
    }
}
