import java.util.ArrayList;

public class BSTProblems {

    static class Node{
        int data;
        Node leftchild;
        Node rightchild;
        Node(int data){
            this.data = data;
        }
    }

    public static Node implementBST(Node rootnode, int data){
        if (rootnode == null){
            Node newNode = new Node(data);
            return newNode;
        }
        if (rootnode.data > data){
            rootnode.leftchild = implementBST(rootnode.leftchild,data);
        }else {
            rootnode.rightchild = implementBST(rootnode.rightchild, data);
        }
        return rootnode;
    }




    //inorder traversal
    public static void inOrder(Node root){
        if (root == null){
            return;
        }
        inOrder(root.leftchild);
        System.out.print(root.data+" ");
        inOrder((root.rightchild));
    }
    //print in range
    public static void printRange(Node root, int x, int y){
        if (root == null){
            return;
        }
        if (root.data >= x && root.data <= y){
            printRange(root.leftchild, x, y);
            System.out.print(root.data + " ");
            printRange(root.rightchild, x, y);
        }else if(root.data < x){
            printRange(root.rightchild, x, y);
        }else{
            printRange(root.leftchild, x, y);
        }
    }


    public static void printlist(ArrayList<Integer> list){
        for (int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println();
    }
    //print all paths from root to leaf
    public static void root2leaf(Node root, ArrayList<Integer> list){


        list.add(root.data);
        if (root.leftchild == null && root.rightchild == null){
            printlist(list);
        }else {
            root2leaf(root.leftchild, list);
            root2leaf(root.rightchild, list);
        }
        list.remove(list.size()-1);
    }



    public static void main(String[] args) {
        int [] nodes = {10,8,15,4,9,11,16};
                Node root = null;
        for (int i=0; i<nodes.length; i++){
            root = implementBST(root, nodes[i]);
        }
//        inOrder(root);
//        System.out.println();
//        printRange(root,7,15);

        inOrder(root);
        System.out.println();
        root2leaf(root, new ArrayList<Integer>());
    }
}
