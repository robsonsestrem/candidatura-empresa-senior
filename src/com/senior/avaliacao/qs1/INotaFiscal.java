package com.senior.avaliacao.qs1;

import java.util.List;

/**
 *
 * @author robson
 */
public interface INotaFiscal {

    List<Double> geraParcelas(int nrParcelas, double valorTotal);
}
