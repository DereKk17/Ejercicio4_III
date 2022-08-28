package TdaLista;

import java.io.ObjectStreamException;

public class SList {
    private Object[] sLista= new Object[200];
    private int size = 0;


    public boolean isEmpty(){
        return sLista == null;
    }

    public void append(Object dato){
        if(isEmpty()){
            sLista[size] = dato;
        }
        else{
            while(sLista[size] != null){
                size++;
            }
            sLista[size] = dato;
        }
        size = 0;
    }

    public void appendComienzo(Object dato) {
        if (isEmpty()) {
            sLista[size] = dato;
        } else {
            while (sLista[size] != null) {
                size++;
            }
             while (size >= 1) {
                sLista[size--] = sLista[size];
             }
             sLista[0] = dato;
        }

    }

    public void appendEntreDato(Object dato, Object siguiente){
        if (isEmpty()) {
            sLista[size] = dato;
        }else{
            while(sLista[size] != null){
                if(sLista[size] == siguiente){
                    break;
                }
                size++;
            }
            int objetoSeparar = size;

            while (sLista[size] != null) {
                size++;
            }
            while (size > objetoSeparar) {
                sLista[size--] = sLista[size];
            }
            sLista[objetoSeparar] = dato;

        }
    }

    public void appendEntre(Object dato, int indice){
        if (isEmpty()) {
            sLista[size] = dato;
        }else{

            while (sLista[size] != null) {
                size++;
            }
            while (size > indice) {
                sLista[size--] = sLista[size];
            }
            sLista[indice] = dato;

        }
    }

    public Object obtenerIndice(Object dato){
        while(sLista[size] != null){
            if(sLista[size] == dato){
                break;
            }
            size++;
        }
        return size;
    }


    public boolean esta(Object dato){
        boolean estado = false;
        while(sLista[size] != null){
            if(sLista[size] == dato){
                estado = true;
                break;
            }
            size++;
        }
        size = 0;
        return estado;
    }

    public void borrar(Object dato){
        while(sLista[size] != null){
            size++;
        }

        int ultimo = size;
        size = 0;

        while(sLista[size] != null){
            if(sLista[size] == dato){
                sLista[size] = null;
                break;
            }
            size++;
        }


        for(int borrada = size + 1 ; size <= ultimo; size++ ){
            sLista[size] = sLista[size + 1];
        }
        size = 0;
    }

    public String toString(){
        String lista = "";
        for(size = 0; sLista[size] != null; size++){
            lista = lista + " " + sLista[size];
        }
        size = 0;
        return lista;
    }

}
