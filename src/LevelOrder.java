import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {


    public static void printLevelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()){
            Node currNode = queue.remove();
            if(currNode==null){
                System.out.println();
                if(queue.isEmpty()) break;
                else queue.add(null);
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    queue.add(currNode.left);
                }
                if (currNode.right!=null){
                    queue.add(currNode.right);
                }
            }
        }
    }


    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.binaryTree(RawData.arr);
        printLevelOrder(root);
    }
}
