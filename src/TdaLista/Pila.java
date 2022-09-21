package TdaLista;
public class Pila<T> {

    private Nodo cima;
    private int size;
    Nodo nodo = new Nodo();

    public boolean estaVacia(){
        return cima ==  null;
    }

    public boolean estaLlena(){
        return !(cima ==  null);
    }

    public int size() {
        return size;
    }

    public void push(T dato){
        Nodo nuevo = new Nodo();
        nuevo.setDato(dato);

        if(estaVacia())
            cima = nuevo;
        else{
            nuevo.setSiguiente(cima);
            cima = nuevo;
        }
        size++;
    }

    public Object pop(){
        Nodo borrado = new Nodo();
        if(estaVacia())
            System.out.printf("Pila Vacia");
        else {
            borrado = cima;
            cima = cima.getSiguiente();
            size--;
        }
        return borrado.getDato();
    }

    public Object peek(){
        return cima.getDato();
    }

    public void limpiar(){
        cima = null;
        size =0;
    }

    public Pila invertir(){
        Nodo temporal = cima;

        Pila invertida = new Pila();

        while(estaLlena()){
            invertida.push(cima.getDato());
            cima = cima.getSiguiente();
        }
        cima = temporal;
        return invertida;
    }

    public String toString(){
        String Pila = "";
        for(Nodo n = cima; n != null; n = n.getSiguiente()){
            Pila = Pila + "\n " + n.getDato();
        }
        return Pila;
    }



}
