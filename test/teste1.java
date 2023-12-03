package test;

import utils.AlgsOrdenacao;
import utils.GerarNums;
import java.util.ArrayList;

public class teste1 {

    private static void processarEExibirResultado(String algoritmo, String ordem, int numElemen, ArrayList<Integer> lista) {
        AlgsOrdenacao organizar = new AlgsOrdenacao();
        long tempoInicio = System.nanoTime();
        long tempoFinal = System.nanoTime();

        switch (algoritmo) {
            case "Bubble":
                tempoInicio = System.nanoTime();
                lista = organizar.bubble(lista);
                tempoFinal = System.nanoTime();
                break;
            
            case "Selection":
                tempoInicio = System.nanoTime();
                lista = organizar.selection(lista);
                tempoFinal = System.nanoTime();
                break;
            default:
                algoritmo = "Desconhecido";
                break;
        }

        double tempoMed = (tempoFinal - tempoInicio) / 1_000_000.0;

        System.out.println("Algoritmo: " + algoritmo);
        System.out.println("Ordenação: "+ ordem);
        System.out.println("Quantidade de números: " + numElemen);
        System.out.println("Tempo gasto para ordenação " + ": " + String.format("%.3f", tempoMed) + " ms\n");
    }

    
    public static void main(String[] args) {
        GerarNums gerar = new GerarNums();
        String algs[] = {"Bubble","Selection"};
        int qtndElementos = 1000; 
        int range = 10;
        int repet = 3;

        for (String alg : algs) {  

            // Ordem crescente
            for (int i = 1; i<=range*repet; i+=range) {
                ArrayList<Integer> listaCres = gerar.crescente(qtndElementos*i);
                processarEExibirResultado(alg, "Crescente", qtndElementos*i, listaCres);
            }

            // Ordem decrescente
            for (int i = 1; i<=range*repet; i+=range) {
                ArrayList<Integer> listaDecres = gerar.decrescente(qtndElementos*i);
                processarEExibirResultado(alg, "Descrescente", qtndElementos*i, listaDecres);
            }
            

            // Ordem aleatória
            for (int i = 1; i<=range*repet; i+=range) {
                ArrayList<Integer> listaAlea = gerar.aleatorio(qtndElementos*i);
                processarEExibirResultado(alg, "Aleatório", qtndElementos*i, listaAlea);
            }
        }
    }
}
