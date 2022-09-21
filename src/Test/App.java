package Test;

import Actvidad5_Ejercicio4.PeticionImpresion;
import TdaLista.Pila;
import Actvidad5_Ejercicio4.PilaImpresora;


public class App {

    static PilaImpresora listaImpresiones = new PilaImpresora();
    public static void main(String[] args) {


        listaImpresiones.addRequest("gegege", "archivo8");
        listaImpresiones.addRequest("gegehwhwh", "archivo2");
        listaImpresiones.addRequest("gegehwhwh", "archivo3");





        showAll();

        System.out.println(listaImpresiones.getNumRequest());

        listaImpresiones.printWork();

        System.out.println(listaImpresiones.getNumRequest());

        System.out.println();
        System.out.println("Funcion printAll");
        listaImpresiones.printAll();












    }

    public static void showAll(){
        Pila<PeticionImpresion> pilaAxuliar = new Pila<>();
        listaImpresiones.showAll(0, listaImpresiones.getNumRequest(), pilaAxuliar);
    }
}
