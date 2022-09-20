package Test;

import TdaLista.Pila;
import Actvidad5_Ejercicio4.PilaImpresora;


public class App {
    public static void main(String[] args) {

        PilaImpresora listaImpresiones = new PilaImpresora();

        listaImpresiones.addRequest("gegege", "archivo8");
        listaImpresiones.addRequest("gegehwhwh", "archivo2");
        listaImpresiones.addRequest("gegehwhwh", "archivo3");



        listaImpresiones.showAll(0,3);


        System.out.println(listaImpresiones.getNumRequest());









    }
}
