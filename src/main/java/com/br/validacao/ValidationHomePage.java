package com.br.validacao;

import com.br.paginas.HomePage;
import com.br.paginas.elementosdapagina.ElementoHomePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ValidationHomePage {

    private static String MENSAGEM_NO_CAMPO_CARRINHO = "Cart (empty)";
    private static final Logger logger = Logger.getLogger(ValidationHomePage.class);

    public ValidationHomePage() {
    }

    public void validacaoSeEstouNaTelaHome( ElementoHomePage elementoHomePage) {
        logger.info("Entrei no metodo validacaoSeEstouNaTelaHome");
        logger.info("realizando as validações Asserts");
        Assert.assertTrue(elementoHomePage.getBotaoLogin().isDisplayed());
        Assert.assertTrue(elementoHomePage.getBotaoLogin().isEnabled());
        Assert.assertTrue(elementoHomePage.getLogoDaTelaPrincipal().isEnabled());
        Assert.assertTrue(elementoHomePage.getCampoListaDeProdutosCarrinho().isEnabled());
        Assert.assertTrue(elementoHomePage.getCampoDePesquisa().isEnabled());
        Assert.assertEquals(elementoHomePage.getCampoListaDeProdutosCarrinho().getText(), MENSAGEM_NO_CAMPO_CARRINHO);
        logger.info("validação nos assert comcluida com sucesso");
        logger.info("Saindo do metodo validacaoSeEstouNaTelaHome");

    }

    public void validacaoBotaoLogin(WebElement botaoLogin) {
        Assert.assertTrue(botaoLogin.isEnabled());
    }
}
