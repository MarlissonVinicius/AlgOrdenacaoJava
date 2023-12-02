package index;

//import algOrdenacao.bubbleSort;
import utils.gerarNums;
import java.util.ArrayList;

public class principal {
    public static void main(String[] args) {

        //GERAR AS LISTAS COM NÚMEROS
        gerarNums gerar = new gerarNums();
        //Ordem crescente 
        ArrayList<Integer> listaCres = new ArrayList<>();
        listaCres = gerar.crescente(0);
        //Ordem decrescente 
        ArrayList<Integer> listaDecres = new ArrayList<>();
        listaDecres = gerar.decrescente(10);
        //Ordem aleatória 
        ArrayList<Integer> listaAlea = new ArrayList<>();
        listaAlea = gerar.aleatorio(10);

        System.out.println(listaCres);
        System.out.println(listaDecres);
        System.out.println(listaAlea);

    }
}
