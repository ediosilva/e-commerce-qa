package com.br.validacao;

import org.apache.log4j.Logger;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

public class ValidacaoShoppingCartPaymentPage {
    private static final Logger logger = Logger.getLogger(ValidacaoShoppingCartPaymentPage.class);


    public void validarListaDeMensagem(String mensagemDaTela, String mensagem) {
        logger.info("validando se existe a mensagem na tela");
        boolean achouMensagem = false;
        for (String mensagemlist : Arrays.asList(mensagemDaTela.split("\\r?\\n"))) {
            if (mensagemlist.contains(mensagem)) {
                achouMensagem = true;
            }
        }
        Assert.assertTrue(achouMensagem, "Não existe a mensagem na aba Payment: " + mensagem);
    }

    public void validarMensagem(String mensagemDaTela, String mensagem) {
        logger.info("validando se existe a mensagem na tela");
        Assert.assertEquals(mensagemDaTela, mensagem);
    }
}
