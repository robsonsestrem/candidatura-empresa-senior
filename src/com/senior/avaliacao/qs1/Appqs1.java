package com.senior.avaliacao.qs1;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author robson
 */
public class Appqs1 {

    public static void main(String[] args) {
        List<Double> resultSet = new ArrayList<>();

        NotaFiscal listaParcelas = new NotaFiscal();

        int numParcelas = 30;
        double vlrTotal = 100;

        resultSet = listaParcelas.geraParcelas(numParcelas, vlrTotal);

        DecimalFormat df = new DecimalFormat("##0.00");

        for (int i = 0; i < resultSet.size(); i++) {
            System.out.println("Parcela: " + (i + 1) + " - Valor = R$" + df.format(resultSet.get(i).doubleValue()));
        }
    }
    
}
