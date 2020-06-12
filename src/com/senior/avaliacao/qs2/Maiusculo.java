package com.senior.avaliacao.qs2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author robson
 */
public class Maiusculo implements IMaiusculo {

    public String converteMaiusculo(String par) {

        List<String> palavras = new ArrayList<>();

        char[] letras = par.toCharArray();
        String aux = "";

        for (int i = 0; i < letras.length; i++) {

            if (letras[i] != ' ') {
                aux += letras[i];
            } else {
                palavras.add(aux);
                aux = "";
            }
            if (letras[i] != ' ' && i == letras.length - 1) {
                palavras.add(aux);
            }
        }

        String novaFrase = "";
        for (int i = 0; i < palavras.size(); i++) {
            if (i == palavras.size() - 1) {
                novaFrase += palavras.get(i).substring(0, 1).toUpperCase() + palavras.get(i).substring(1).toLowerCase();
            } else {
                novaFrase += palavras.get(i).substring(0, 1).toUpperCase() + palavras.get(i).substring(1).toLowerCase()
                        + " ,";
            }
        }
        return novaFrase;
    }

}
