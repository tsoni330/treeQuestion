public class PreOrder{

    BinaryTree binaryTree = new BinaryTree();


    public static void preOrderTransversal(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrderTransversal(root.left);
        preOrderTransversal(root.right);


    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.binaryTree(RawData.arr);
        PreOrder.preOrderTransversal(root);
    }

}
