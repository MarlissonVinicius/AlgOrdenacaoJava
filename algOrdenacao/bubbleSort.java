package algOrdenacao;

import java.util.ArrayList;
import utils.gerarNums;

public class bubbleSort {

    public static ArrayList<Integer> organizar(ArrayList<Integer> listEntrada){

        boolean houveTroca = true;


        while(houveTroca){
            int j = 0;
            int aux;
            houveTroca = false;

            for (int i = 1; i < listEntrada.size(); i++) {

                if(listEntrada.get(j) > listEntrada.get(i)){
                    
                    aux = listEntrada.get(j);
                    listEntrada.set(j, listEntrada.get(i));
                    listEntrada.set(i, aux);
                    houveTroca = true;
                }

                j++;
            }
        }
    
        return listEntrada;
    }

    public static void main(String[] args) {

        ArrayList<Integer> listdesor = new ArrayList<>();
        listdesor = gerarNums.aleatorio(10);
        System.out.println(listdesor);

        System.out.println();

        organizar(listdesor);
        System.out.println(listdesor);

    }
}