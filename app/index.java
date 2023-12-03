package app;

import utils.AlgsOrdenacao;
import utils.GerarNums;
import java.util.ArrayList;

public class Index {

    // Método para processar a ordenação e exibir resultados
    private static void processarEExibirResultado(String algoritmo, String ordem, int numElemen, ArrayList<Integer> lista) {
        // Instanciação da classe que contém os algoritmos de ordenação
        AlgsOrdenacao organizar = new AlgsOrdenacao();
        
        // Inicialização de variáveis para medir o tempo de execução
        long tempoInicio = System.nanoTime();
        long tempoFinal = System.nanoTime();

        // Seleção do algoritmo de ordenação com base no nome fornecido
        switch (algoritmo) {
            case "Bubble":
                // Medição do tempo antes e depois da ordenação utilizando o Bubble Sort
                tempoInicio = System.nanoTime();
                lista = organizar.bubble(lista);
                tempoFinal = System.nanoTime();
                break;

            case "Selection":
                // Medição do tempo antes e depois da ordenação utilizando o Selection Sort
                tempoInicio = System.nanoTime();
                lista = organizar.selection(lista);
                tempoFinal = System.nanoTime();
                break;

            default:
                // Caso o algoritmo seja desconhecido, define o nome como "Desconhecido"
                algoritmo = "Desconhecido";
                break;
        }

        // Cálculo do tempo médio de ordenação em milissegundos
        double tempoMed = (tempoFinal - tempoInicio) / 1_000_000.0;

        // Exibição dos resultados
        System.out.println("Algoritmo: " + algoritmo);
        System.out.println("Ordenação: " + ordem);
        System.out.println("Quantidade de números: " + numElemen);
        System.out.println("Tempo gasto para ordenação: " + String.format("%.3f", tempoMed) + " ms\n");
    }

    // Método principal
    public static void main(String[] args) {
        // Instanciação da classe que gera números
        GerarNums gerar = new GerarNums();
        
        // Algoritmos a serem testados
        String algs[] = {"Bubble", "Selection"};
        
        // Configurações para os testes
        int qtndElementos = 1000; 
        int range = 10; 
        int repet = 3;

        // Itera sobre os algoritmos
        for (String alg : algs) {  

            // Testes com listas em ordem crescente
            for (int i = 1; i <= range * repet; i += range) {
                // Geração de uma lista crescente com base no tamanho especificado
                ArrayList<Integer> listaCres = gerar.crescente(qtndElementos * i);
                // Chamada do método para processar e exibir os resultados
                processarEExibirResultado(alg, "Crescente", qtndElementos * i, listaCres);
            }

            // Testes com listas em ordem decrescente
            for (int i = 1; i <= range * repet; i += range) {
                // Geração de uma lista decrescente com base no tamanho especificado
                ArrayList<Integer> listaDecres = gerar.decrescente(qtndElementos * i);
                // Chamada do método para processar e exibir os resultados
                processarEExibirResultado(alg, "Descrescente", qtndElementos * i, listaDecres);
            }

            // Testes com listas em ordem aleatória
            for (int i = 1; i <= range * repet; i += range) {
                // Geração de uma lista aleatória com base no tamanho especificado
                ArrayList<Integer> listaAlea = gerar.aleatorio(qtndElementos * i);
                // Chamada do método para processar e exibir os resultados
                processarEExibirResultado(alg, "Aleatório", qtndElementos * i, listaAlea);
            }
        }
    }
}
