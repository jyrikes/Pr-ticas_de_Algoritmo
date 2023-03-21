public class App {

  public static void main(String[] args){
    // No<Integer> no = new No<>(20);
    // Integer[] a = {1,2,3,4};
    // Pilha<Integer> pilha = new Pilha<>();
    // System.out.println(pilha);
    // Fila<Integer> fila = new Fila<>();
    // fila.enqueue(10);
    // fila.enqueue(20);
    // fila.enqueue(30);
    // fila.enqueue(null);
    // System.out.println(fila);

    // ListaEnca<Integer>  lista = new ListaEnca<>();
    // lista.insert(10);
    // lista.insert(20);
    // lista.insert(30);
    // lista.insert(40);
    // System.out.println(lista);
    // lista.delete(10);
    // System.out.println(lista);
    // lista.insert(10);
    // System.out.println(lista);
    // lista.delete(40);
    // System.out.println(lista);
    // System.out.println(lista.maximum());
    // System.out.println(lista.minimum());
    // Selection s = new Selection();
    // insertion in = new insertion();
    // int[] a = {-1,1,5,7,0,3,5};
    // a = in.sort(a);
    // for(int i = 0 ; i < a.length; i++){
    //   System.out.println(a[i]);
    // }
    Tree arvore = new Tree<>(null);
  
    arvore.insert("d");
    arvore.insert("b");
    arvore.insert("a");
    arvore.displayInOrder();
    
  

    
    
  
  }
}