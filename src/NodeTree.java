public class NodeTree<T extends Comparable<T>> {
  private T inObject;
  private NodeTree<T> left;
  private NodeTree<T> right;

  public NodeTree(T object) {
    this.left = null;
    this.right = null;
    this.inObject = object;

  }

  public T getInObject() {
    return inObject;
  }

  public void setInObject(T object) {
    this.inObject = object;
  }

  public NodeTree<T> getLeft() {
    return left;
  }

  public void setLeft(NodeTree<T> esquerda) {
    this.left = esquerda;
  }

  public NodeTree<T> getRight() {
    return right;
  }

  public void setRight(NodeTree<T> direita) {
    this.right = direita;
  }

  @Override
  public String toString() {
    return "" + inObject;
  }

}
