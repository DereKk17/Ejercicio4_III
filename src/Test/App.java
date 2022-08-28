package Test;


import TdaLista.Lista;
import TdaLista.SList;

public class App {
    public static void main(String[] args) {
        Lista<Integer> listaNumeros= new Lista<>();
        SList listaNumerosE = new SList();



        int dato = 1;

        for(int i = 0; i < 20; i++){
            listaNumerosE.append(dato);
            dato ++;
        }




        System.out.println(listaNumerosE);







    }
}
