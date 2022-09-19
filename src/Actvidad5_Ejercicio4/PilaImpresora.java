package Actvidad5_Ejercicio4;

import TdaLista.Pila;

public class PilaImpresora {

    Pila<PeticionImpresion> pila;

    public PilaImpresora(Pila<PeticionImpresion> pila){
        this.pila = new Pila<>();
    }

    public void addRequest(String id, String archivo){
        pila.push(new PeticionImpresion(id, archivo));
    }

    public int getNumRequest(){
        return pila.size();
    }

    public void printWork(){
        Pila<PeticionImpresion> pilaAux = pila;
        invertirPila(0, pilaAux);

        PeticionImpresion impresion = (PeticionImpresion) pilaAux.peek();
        System.out.println(impresion.getId()+ "  " + impresion.getNombreArchivo());

        pilaAux.pop();

        pila = pilaAux;
        invertirPila(0, pila);
    }

    public Pila invertirPila(int i, Pila pilaAux){
        if(i == pila.size()){
            return pilaAux;
        }
        else{
            pilaAux.push(pila.peek());
            pila.pop();
            return invertirPila(i + 1, pilaAux);
        }

    }

    public String printAll(int i, String peticiones, Pila pila){
        if(i > pila.size()){
            return peticiones;
        }else{
            PeticionImpresion impresion = (PeticionImpresion) pila.peek();
            peticiones += (impresion.getId()+ "  " + impresion.getNombreArchivo());

            pila.pop();

            invertirPila(0, pila);
            return printAll(i + 1, peticiones, pila);
        }
    }


}
