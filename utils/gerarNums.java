package utils;

import java.util.ArrayList;
import java.util.Random;

public class gerarNums {

    private int sortear(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    public ArrayList<Integer> crescente(int tamanho) {
        ArrayList<Integer> listSaida = new ArrayList<>();
        int num = 0;

        for (int i = 0; i < tamanho; i++) {
            listSaida.add(num);
            num += sortear(0, 4);
        }

        return listSaida;
    }

    public ArrayList<Integer> decrescente(int tamanho) {
        ArrayList<Integer> listSaida = new ArrayList<>();
        int num = tamanho * 2;

        for (int i = 0; i < tamanho; i++) {
            listSaida.add(num);
            num -= sortear(0, 4);
        }

        return listSaida;
    }

    public ArrayList<Integer> aleatorio(int tamanho) {
        ArrayList<Integer> listSaida = new ArrayList<>();

        for (int i = 0; i < tamanho; i++) {
            int num = sortear(-tamanho, tamanho);
            listSaida.add(num);
        }

        return listSaida;
    }

    public static void main(String[] args) {
        System.out.println(aleatorio(1000));
    }
}
