package src;

class App {

    public static void main(String[] args) {

        MyTree tree = new MyTree();
        tree.insert(9);
        tree.insert(4);
        tree.insert(6);
        tree.insert(20);
        tree.insert(170);
        tree.insert(15);
        tree.insert(1);

        MyTree.MyTreeNode data = tree.traverse(tree.rootNode);
        System.out.println(data.leftChild);
        System.out.println(data.rightChild);
        System.out.println(data.value);
    }
}