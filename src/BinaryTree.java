public class BinaryTree {

    int idx=-1;
    public Node binaryTree(int arr[]){
        idx++;
        if(arr[idx] == -1){
            return null;
        }
        Node newNode = new Node(arr[idx]);
        newNode.left = binaryTree(arr);
        newNode.right=binaryTree(arr);
        return newNode;
    }


    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.binaryTree(node);
    }
}
