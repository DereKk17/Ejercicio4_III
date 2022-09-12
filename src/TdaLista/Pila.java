package TdaLista;

public class Pila<T> {

    private Nodo inicio;
    private int size;
    Nodo nodo = new Nodo();

    public boolean estaVacia(){
        return inicio ==  null;
    }

    public boolean estaLlena(){
        return !(inicio ==  null);
    }

    public int size() {
        return size;
    }

    public void push(T dato){
        Nodo nuevo = new Nodo();
        nuevo.setDato(dato);

        if(estaVacia())
            inicio.setSiguiente(nuevo);
        else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        size++;
    }

    public Object pop(){
        if(estaVacia())
            System.out.printf("Pila Vacia");
        inicio.setSiguiente(null);
        size --;

        return inicio;
    }

    public Object peek(){
        return inicio.getDato();
    }

    public String toString(){
        String lista = "";
        for(Nodo n = inicio; n != null; n = n.getSiguiente()){
            lista = lista + "\n " + n.getDato();
        }
        return lista;
    }
}
