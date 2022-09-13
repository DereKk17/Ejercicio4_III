package TdaLista;

public class SPila<T> {
    private Object[] sPila = new Object[200];
    private int size = 0;

    public boolean estaVacia() {
        return sPila == null;
    }

    public boolean estaLlena() {
        return !(sPila == null);
    }

    public void push(Object dato) {
        sPila[size] = dato;
        size++;
    }

    public void pop() {
        sPila[size] = null;
        size--;
    }

    public Object peek() {
        return sPila[size - 1];
    }

    public void limpiar() {
        size = 0;
    }


    public String toString() {
        String pila = "";

        if (size == 0) {
            System.out.println("Pila vacia");
        } else {
            String pPila = "";
            for (int i = size - 1; i >= 0; i--) {
                pPila = pPila + "\n" + sPila[i];
            }
            pila = pPila;
        }
        return pila;
    }
}
