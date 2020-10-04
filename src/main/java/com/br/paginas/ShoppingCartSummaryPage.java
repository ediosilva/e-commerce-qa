package com.br.paginas;

import com.br.paginas.elementosdapagina.ElementoShoppingCartSummaryPage;
import com.br.validacao.ValidacaoShoppingCartSummaryPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class ShoppingCartSummaryPage extends BasePage {

    private static final Logger logger = Logger.getLogger(ShoppingCartSummaryPage.class);
    private ElementoShoppingCartSummaryPage elementoShoppingCartSummary;
    private ValidacaoShoppingCartSummaryPage validacaoShoppingCartSummaryPage;

    public ShoppingCartSummaryPage(WebDriver driver) {
        super(driver);
        logger.info("iniciando o construtor ShoppingCartSummaryPage");
        elementoShoppingCartSummary = new ElementoShoppingCartSummaryPage(driver);
        validacaoShoppingCartSummaryPage = new ValidacaoShoppingCartSummaryPage();
    }

    public ShoppingCartSummaryPage validarSeProdutoSelecionadoExisteNoSummary(String nomeProduto) {
        logger.info("iniciando a validadacao  validarSeProdutoSelecionadoExisteNoSummary");
        validacaoShoppingCartSummaryPage.validarSeoItemSelecionadoExisteNoSummary(elementoShoppingCartSummary.getNomeDoProdutoSelecionadoSumary(), nomeProduto);
        logger.info("finalizado a validadacao  validarSeProdutoSelecionadoExisteNoSummary");
        return this;
    }
}
