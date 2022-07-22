class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        this.left = null;

        this.right = null;

    }
}

public class BinarySearchTreeIm {
    Node root;

    public Node InsertRecursively(Node n, int value) {

        if (n == null) {
            Node newnode = new Node(value);
            return newnode;
        } else {

            if (value < n.value) {

                n.left = InsertRecursively(n.left, value);

            } else {
                n.right = InsertRecursively(n.right, value);
            }
            return n;

        }

    }

    public Node insert(int value) {
        return InsertRecursively(root, value);

    }

    public void Inorder(Node n) {
        if (n != null) {
            Inorder(n.left);
            System.out.print(n.value + " ");
            Inorder(n.right);
        }
    }

    public void PreOrder(Node n) {
        if (n != null) {

            System.out.print(n.value + " ");
            PreOrder(n.left);
            PreOrder(n.right);

        }
    }

    public void PostOrder(Node n) {
        if (n != null) {
            PostOrder(n.left);
            PostOrder(n.right);
            System.out.print(n.value + " ");
        }
    }

    public static void main(String args[]) {
        BinarySearchTreeIm b = new BinarySearchTreeIm();

        b.root = b.insert(6);
        b.insert(12);
        b.insert(5);
        b.insert(3);
        b.Inorder(b.root);
        System.out.println("\n");
        b.PreOrder(b.root);
        System.out.println("\n");
        b.PostOrder(b.root);
    }

}
