import java.util.LinkedList;

public class Pilha<T> {
  private No<T> referenciaTopo;

  public Pilha() {
    this.referenciaTopo = null;
  }

  public Pilha(T[] objects) {
    this.referenciaTopo = null;
    for (T t : objects) {
      this.push(t);
    }

  }

  public void push(T object) {
    No novoNo = new No(object);
    No refAux = this.referenciaTopo;
    this.referenciaTopo = novoNo;
    // mudo aqui a referecia
    this.referenciaTopo.setProximoNo(refAux);
  }

  public No topo() {
    return this.referenciaTopo;
  }

  public boolean isEmpty() {
    return referenciaTopo == null ? true : false;
  }

  public No pop() {
    if (!isEmpty()) {
      No noPoped = referenciaTopo;
      referenciaTopo = referenciaTopo.getProximoNo();
      return noPoped;
    }
    return null;
  }

  @Override
  public String toString() {
    String stringRetorno = "------------\n";
    stringRetorno += "   Pilha\n";
    stringRetorno += "------------\n";
    No noAuxiliar = referenciaTopo;
    while (true) {
      if (noAuxiliar != null) {
        stringRetorno += "[No{dado=" + noAuxiliar.getObjetct() + "}]\n";
        noAuxiliar = noAuxiliar.getProximoNo();
      } else {
        break;
      }
    }
    stringRetorno += "============";
    return stringRetorno;
  }

}
