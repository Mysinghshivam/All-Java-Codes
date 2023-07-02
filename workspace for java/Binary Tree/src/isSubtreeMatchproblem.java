public class isSubtreeMatchproblem {

    static class Node {
        int data;
        Node leftChild;
        Node rightChild;

        Node(int data) {
            this.data = data;
            this.leftChild = null;
            this.rightChild = null;
        }
    }

    static class binaryTree {
        int idx = -1;

        public Node binaryTreeImplimentation(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            int data = nodes[idx];
            Node newNode = new Node(data);
            newNode.leftChild = binaryTreeImplimentation(nodes);
            newNode.rightChild = binaryTreeImplimentation(nodes);

            return newNode;
        }

        public boolean isSame(Node rootNode, Node subRoot) {
            if (rootNode == null && subRoot == null) {
                return true;
            }
            if (rootNode == null || subRoot == null) {
                return false;
            }
            if (rootNode.data == subRoot.data) {
                return isSame(rootNode.leftChild, subRoot.leftChild) && isSame(rootNode.rightChild, subRoot.rightChild);
            }
            return false;
        }

        public boolean isSubTree(Node rootNode, Node subRoot) {

            if (subRoot == null) {
                return true;
            }
            if (rootNode == null) {
                return false;
            }
            if (isSame(rootNode, subRoot)) {
                return true;
            }
            return isSubTree(rootNode.leftChild, subRoot) || isSubTree(rootNode.rightChild, subRoot);
        }

    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 3, 4, -1, -1, 5, -1, -1, 6, 7, -1, -1, 8, -1, -1, 9, -1, 10, -1, -1};
        binaryTree b1 = new binaryTree();
        Node rootNode = b1.binaryTreeImplimentation(nodes);
        System.out.println(rootNode.data);

        binaryTree b2 = new binaryTree();
        int[] subTreeNode = {6, 7, -1, -1, 8, -1, -1};
        Node subRoot = b2.binaryTreeImplimentation(subTreeNode);
        System.out.println(subRoot.data);

        System.out.println(b1.isSubTree(rootNode, subRoot));


    }
}
