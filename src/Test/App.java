package Test;

import TdaLista.Pila;
import TdaLista.SPila;
import TdaLista.Lista;
import TdaLista.SList;

public class App {
    public static void main(String[] args) {

        Pila<Integer> miPila = new Pila<>();

        int numero = 11;

        for (int i = 0; i < 10; i++){
            miPila.push(numero);
            numero ++;
        }



        miPila.limpiar();

        System.out.println(miPila);

        for (int i = 0; i < 10; i++){
            miPila.push(numero);
            numero ++;
        }
        System.out.println(miPila);





    }
}
