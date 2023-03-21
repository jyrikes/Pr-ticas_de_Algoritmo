public class Tree<T extends Comparable<T>> {
  private NodeTree<T> root;

  public Tree(NodeTree<T> root) {
    this.root = null;
  }

  public void insert(T value) {
    NodeTree<T> newNode = new NodeTree<>(value);
    this.root = insert(this.root,newNode);
  }

  public NodeTree<T> insert(NodeTree<T> inNode, NodeTree<T> newNode) {
    if(inNode == null){
      return newNode;
    }
    T currentValue = inNode.getInObject();
    T newValue = newNode.getInObject();
    
    if(newValue.compareTo(currentValue) < 0){
       inNode.setLeft(insert(inNode.getLeft(), newNode));
    }else{
      inNode.setRight(insert(inNode.getRight(), newNode));
    }
    
    return inNode;
  }
  public void displayInOrder(){
    System.out.println("Mostrando em ordem ");
    this.displayInOrder(this.root);
  }

  public void displayInOrder(NodeTree<T> inNode) {
    if (inNode != null) {
      this.displayInOrder(inNode.getLeft());
      System.out.println(inNode.getInObject() + "");
      this.displayInOrder(inNode.getRight());
    }
  }

}
