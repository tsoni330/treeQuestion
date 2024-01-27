public class PreOrder{

    BinaryTree binaryTree = new BinaryTree();


    public static void preOrderTransversal(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data);
        System.out.println();
        preOrderTransversal(root.left);
        preOrderTransversal(root.right);


    }

    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.binaryTree(node);
        PreOrder.preOrderTransversal(root);
    }

}
