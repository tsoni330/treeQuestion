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
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.binaryTree(RawData.arr);
    }
}
