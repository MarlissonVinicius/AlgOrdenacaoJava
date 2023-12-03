package utils;

import java.util.ArrayList;

    public class AlgsOrdenacao {
        
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

        public ArrayList<Integer> selection(ArrayList<Integer> listaEntrada){
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
}
