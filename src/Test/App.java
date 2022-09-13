package Test;

import TdaLista.Pila;
import TdaLista.SPila;
import TdaLista.Lista;
import TdaLista.SList;

public class App {
    public static void main(String[] args) {

        SPila<Integer> miPila = new SPila<>();

        int numero = 11;

        for (int i = 0; i < 10; i++){
            miPila.push(numero);
            numero ++;
        }
        miPila.push(200);



        miPila.limpiar();

        System.out.println(miPila);





    }
}
