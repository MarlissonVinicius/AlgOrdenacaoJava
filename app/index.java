package app;

//import algOrdenacao.bubbleSort;
import utils.*;
import java.util.ArrayList;
//import java.util.Date;


public class index {
    public static void main(String[] args) {

        //GERAR AS LISTAS COM NÚMEROS
        gerarNums gerar = new gerarNums();
        //Ordem crescente 
        ArrayList<Integer> listaCres = new ArrayList<>();
        listaCres = gerar.crescente(10);
        //Ordem decrescente 
        ArrayList<Integer> listaDecres = new ArrayList<>();
        listaDecres = gerar.decrescente(10);
        //Ordem aleatória 
        ArrayList<Integer> listaAlea = new ArrayList<>();
        listaAlea = gerar.aleatorio(10);
        
        //UTILIZAR O BUBBLESORT PARA ORGANIZAR AS LISTAS
        algsOrdenacao organizar = new algsOrdenacao();
        //crescente
        System.out.println(listaCres);
        listaAlea = organizar.bubble(listaCres);
        System.out.println(listaCres+"\n");
        //decrescente
        System.out.println(listaDecres);
        listaAlea = organizar.bubble(listaDecres);
        System.out.println(listaDecres+"\n");
        //aleatoria
        System.out.println(listaAlea);
        listaAlea = organizar.bubble(listaAlea);
        System.out.println(listaAlea+"\n");
    }
}
