package utils;

import java.util.ArrayList;

    public class algsOrdenacao {
        public ArrayList<Integer> bubble(ArrayList<Integer> listaEntrada) {

            boolean houveTroca = true;

            while (houveTroca) {
                int j = 0;
                int aux;
                houveTroca = false;

                for (int i = 1; i < listaEntrada.size(); i++) {

                    if (listaEntrada.get(j) > listaEntrada.get(i)) {

                        aux = listaEntrada.get(j);
                        listaEntrada.set(j, listaEntrada.get(i));
                        listaEntrada.set(i, aux);
                        houveTroca = true;
                    }

                    j++;
                }
            }

            return listaEntrada;
        }

    public static void main(String[] args) {
        
    }
}
