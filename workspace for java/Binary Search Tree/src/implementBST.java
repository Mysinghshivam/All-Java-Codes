public class implementBST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insertBST(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (root.data > key) {
            //left side insertion
            root.left = insertBST(root.left, key);
        } else {
            root.right = insertBST(root.right, key);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    //search a node in BST
    public static boolean search(Node rootNode, int key) {
        if (rootNode == null) {
            return false;
        }
        if (rootNode.data > key) {
            return search(rootNode.left, key);
        } else if (rootNode.data == key) {
            return true;
        } else {
            return search(rootNode.right, key);
        }
    }
    //delete a node in BST

    public static Node deleteNode(Node rootNode, int key) {
        if (rootNode.data > key) {
            rootNode.left = deleteNode(rootNode.left, key);
        } else if (rootNode.data < key) {
            rootNode.right = deleteNode(rootNode.right, key);
        } else {
            //case 1
            if (rootNode.left == null && rootNode.right == null) {
                return null;
            }
            //case 2
            if (rootNode.left == null) {
                return rootNode.right;
            } else if (rootNode.right == null) {
                return rootNode.left;
            }
            //case 3
            Node Is = inorderSuccesser(rootNode.right);
            rootNode.data = Is.data;
            rootNode.right = deleteNode(rootNode.right, Is.data);
        }
        return rootNode;
    }

    public static Node inorderSuccesser(Node rootNode) {
        while (rootNode.left != null) {
            rootNode = rootNode.left;
        }
        return rootNode;
    }

    public static void main(String[] args) {
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insertBST(root, values[i]);
        }
        inorder(root);
        System.out.println();

        //search a node
        if (search(root,2)){
            System.out.println("found");
        }else
            System.out.println("Not found");

        //delete node
        inorder(root);
        deleteNode(root, 1);
        System.out.println();
        inorder(root);
    }
}
