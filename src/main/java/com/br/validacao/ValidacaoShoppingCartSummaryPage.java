package com.br.validacao;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class ValidacaoShoppingCartSummaryPage {

    private static final Logger logger = Logger.getLogger(ValidacaoShoppingCartPage.class);

    public void validarSeoItemSelecionadoExisteNoSummary(List<WebElement> listaElementos, String nomeProduto) {
        logger.info("validando se existe o produto selecionado na aba Summary");
        boolean existe = false;
        for (WebElement elemento : listaElementos) {
            if (elemento.getText().equals(nomeProduto)) {
                logger.info("Achou o Produto");
                existe = true;
            }
        }
        Assert.assertTrue(existe, "Não encontrou na Aba Summary o produto selecionado: " + nomeProduto);

    }
}
