package com.senior.avaliacao.qs3;

/**
 *
 * @author robson
 */
public class Appqs3 {

    public static void main(String[] args) {

        String testProtocolo = "040.674-01";
        ValidaProtocolo retorno = new ValidaProtocolo();

        if (retorno.validaProtocolo(testProtocolo)) {
            System.out.println("Protocolo é válido!");
        } else {
            System.out.println("Protocolo não é válido!");
        }
    }
}
