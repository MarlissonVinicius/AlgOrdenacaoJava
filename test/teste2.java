package test;

import java.util.ArrayList;
import utils.GerarNums;
public class teste2 {

    public static ArrayList<Integer> selection(ArrayList<Integer> listaEntrada) {
        int aux;
        int menor;
    
        for (int i = 0; i < listaEntrada.size() - 1; i++) {
            menor = i;
    
            for (int j = i + 1; j < listaEntrada.size(); j++) {
                if (listaEntrada.get(j) < listaEntrada.get(menor)) {
                    menor = j;
                }
            }
    
            aux = listaEntrada.get(menor);
            listaEntrada.set(menor, listaEntrada.get(i));
            listaEntrada.set(i, aux);
        }
    
        return listaEntrada;
    }
    

    public static void main(String[] args) {
        GerarNums gerar = new GerarNums();
        ArrayList<Integer> listDeso = gerar.aleatorio(10);
        System.out.println(listDeso);
        selection(listDeso);
        System.out.println(listDeso);


    }
    
}
