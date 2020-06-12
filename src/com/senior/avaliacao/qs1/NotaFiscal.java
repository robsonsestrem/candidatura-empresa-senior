package com.senior.avaliacao.qs1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author robson
 */
public class NotaFiscal implements INotaFiscal {

    @Override
    public List<Double> geraParcelas(int nrParcelas, double valorTotal) {

        BigDecimal parcelas = new BigDecimal(Integer.toString(nrParcelas));
        BigDecimal vlrTotal = new BigDecimal(Double.toString(valorTotal));

        double vlrUnitario = vlrTotal.divide(parcelas, 2, RoundingMode.DOWN).doubleValue();

        BigDecimal formatVlrUnitario = new BigDecimal(Double.toString(vlrUnitario));
        double diferenca = vlrTotal.subtract(parcelas.multiply(formatVlrUnitario)).doubleValue();

        BigDecimal formatDiferenca = new BigDecimal(Double.toString(diferenca));

        double ultimaParcela = formatVlrUnitario.add(formatDiferenca).doubleValue();

        List<Double> result = new ArrayList<>();

        for (int i = 0; i < nrParcelas; i++) {

            if (diferenca > 0.00 && i == nrParcelas - 1) {
                result.add(ultimaParcela);
            } else {
                result.add(vlrUnitario);
            }

        }
        return result;
    }
}
