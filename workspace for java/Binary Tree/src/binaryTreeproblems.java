
//Count of nodes in binary tree
//sum of nodes in binary tree
public class binaryTreeproblems {
    public static class Node {
        int data;
        Node leftChild;
        Node rightChild;

        Node(int data) {
            this.data = data;
            this.leftChild = null;
            this.rightChild = null;
        }
    }

    public static class binaryTree {
        int idx = -1;

        public Node buildBTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            int data = nodes[idx];
            Node newNode = new Node(data);

            newNode.leftChild = buildBTree(nodes);
            newNode.rightChild = buildBTree(nodes);

            return newNode;
        }

        //count of nodes
        public int countNodes(Node rootNode) {
            if (rootNode == null) {
                return 0;
            }

            int leftNode = countNodes(rootNode.leftChild);
            int rightNode = countNodes(rootNode.rightChild);

            return leftNode + rightNode + 1;
        }

        //sum of nodes
        public int sumOfNodes(Node rootNode){
            if (rootNode == null){
                return 0;
            }

            int leftSum = sumOfNodes(rootNode.leftChild);
            int rightSum = sumOfNodes((rootNode.rightChild));

            return leftSum + rightSum + rootNode.data;
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        binaryTree b1 = new binaryTree();
        Node rootNode = b1.buildBTree(nodes);

        System.out.println(b1.countNodes(rootNode));
        System.out.println(b1.sumOfNodes(rootNode));
    }
}
