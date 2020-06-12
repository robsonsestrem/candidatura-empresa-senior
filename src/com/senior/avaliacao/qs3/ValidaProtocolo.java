package com.senior.avaliacao.qs3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author robson
 */
public class ValidaProtocolo implements IValidaProtocolo {

    @Override
    public boolean validaProtocolo(String protocolo) {

        boolean conclusao = false;
        boolean digito01 = false;
        boolean digito02 = false;

        char[] dados = protocolo.toCharArray();
        List<Integer> calc01 = new ArrayList<>();
        List<Integer> calc02 = new ArrayList<>();

        for (int i = 0; i < dados.length; i++) {
            if (Character.isDigit(dados[i])) {
                calc01.add(Character.getNumericValue(dados[i]));
            }
        }

        int multiplicador01 = 2;
        int somarProduto01 = 0;

        for (int i = calc01.size() - 3; i >= 0; i--) {
            somarProduto01 += calc01.get(i) * multiplicador01;
            multiplicador01++;
        }

        int multiplicador02 = 2;
        int somarProduto02 = 0;

        for (int i = 0; i < calc01.size() - 1; i++) {
            if (i == 6) {
                calc02.add((somarProduto01 * 10) % 11);
            } else {
                calc02.add(calc01.get(i));
            }
        }

        for (int i = calc02.size() - 1; i >= 0; i--) {
            somarProduto02 += calc02.get(i) * multiplicador02;
            multiplicador02++;
        }

        int validaDigito01 = (somarProduto01 * 10) % 11;
        int validaDigito02 = (somarProduto02 * 10) % 11;

        for (int i = 0; i < calc01.size(); i++) {
            if (i == 6 && calc01.get(i) == validaDigito01) {
                digito01 = true;
            }
            if (i == 7 && calc01.get(i) == validaDigito02) {
                digito02 = true;
            }
        }

        if (digito01 == true && digito02 == true) {
            conclusao = true;
        }

        return conclusao;
    }
}
