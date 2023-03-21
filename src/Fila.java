public class Fila<T> {
  private No<T> inicioDaFila;
  private No<T> finalDaFila;

  public Fila() {
    this.inicioDaFila = null;
    this.finalDaFila = null;
  }

  public No<T> getInicioDaFila() {
    return inicioDaFila;
  }

  public No<T> getFinalDaFila() {
    return finalDaFila;
  }

  public void enqueue(T object) {

    No novoNo = new No(object);
    if (this.inicioDaFila == null) {
      this.inicioDaFila = novoNo;
      this.finalDaFila = novoNo;
    }
    novoNo.setProximoNo(finalDaFila);
    this.finalDaFila = novoNo;
    if(this.finalDaFila.getProximoNo().equals(inicioDaFila)){
      this.inicioDaFila.setNoAnterior(this.finalDaFila);
    }

  }

  @Override
  public String toString() {
    String textoDeRetorno = "";
    No noDeBusca = this.finalDaFila;
    while (!noDeBusca.equals(this.inicioDaFila)) {
      textoDeRetorno = textoDeRetorno + noDeBusca;
      noDeBusca = noDeBusca.getProximoNo();
    }
    return textoDeRetorno;
  }

}