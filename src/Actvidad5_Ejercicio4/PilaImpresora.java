package Actvidad5_Ejercicio4;

import TdaLista.Pila;

public class PilaImpresora {

    Pila<PeticionImpresion> pila;

    public PilaImpresora(){
        this.pila = new Pila<>();
    }

    public void addRequest(String id, String archivo){
        pila.push(new PeticionImpresion(id, archivo));
    }

    public int getNumRequest(){
        return pila.size();
    }

    public PeticionImpresion cima(){
        return (PeticionImpresion) pila.peek();
    }

    public void printWork(){

        Pila<PeticionImpresion> pilaAux = pila.invertir();

        PeticionImpresion impresion = (PeticionImpresion) pilaAux.peek();
        System.out.println(impresion.getId()+ "  " + impresion.getNombreArchivo());

        pilaAux.pop();

        pila = pilaAux.invertir();

    }


    public void printAll(){
        if(pila.size() == 0){
            System.out.println("NO HAY IMPRESIONES PENDIENTES");;
        }else{
            Pila<PeticionImpresion> pilaAux = pila.invertir();

            PeticionImpresion impresion = (PeticionImpresion) pilaAux.peek();
            System.out.println(impresion.getId()+ "  " + impresion.getNombreArchivo());
            pilaAux.pop();

            pila = pilaAux.invertir();
            printAll();
        }
    }

    public void showAll(int i, int tamanioPila){
        if(i >= tamanioPila){
            System.out.println("PETICIONES PENDIENTES");
        }else{
            Pila<PeticionImpresion> pilaAux = pila;

            System.out.println(pila.size());

            PeticionImpresion impresion = (PeticionImpresion) pilaAux.peek();
            System.out.println(impresion.getId()+ "  " + impresion.getNombreArchivo());
            pilaAux.pop();


            showAll(i + 1, tamanioPila);
        }
    }


}
