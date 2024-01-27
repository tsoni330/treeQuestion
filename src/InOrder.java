public class InOrder {

    public static void inOrderTransvarsal(Node root){
        if(root==null){
            return;
        }
        inOrderTransvarsal(root.left);
        System.out.print(root.data+" ");
        inOrderTransvarsal(root.right);
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.binaryTree(RawData.arr);
        inOrderTransvarsal(root);
    }
}
