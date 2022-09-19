package Test;

import TdaLista.Pila;

public class App {
    public static void main(String[] args) {

        Pila<Integer> miPila = new Pila<>();

        int numero = 11;

        for (int i = 0; i < 10; i++){
            miPila.push(numero);
            numero ++;
        }
        miPila.push(200);


        System.out.println(miPila);

        miPila.





    }
}
