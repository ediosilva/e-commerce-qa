package com.br.validacao;

import com.br.paginas.HomePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ValidationHomePage {

    private static String MENSAGEM_NO_CAMPO_CARRINHO = "Cart (empty)";
    private static final Logger logger = Logger.getLogger(ValidationHomePage.class);

    public ValidationHomePage() {
    }

    public void validacaoSeEstouNaTelaHome(HomePage homePage) {
        logger.info("Entrei no metodo validacaoSeEstouNaTelaHome");
        logger.info("realizando as validações Asserts");
        Assert.assertTrue(homePage.getBotaoLogin().isDisplayed());
        Assert.assertTrue(homePage.getBotaoLogin().isEnabled());
        Assert.assertTrue(homePage.getLogoDaTelaPrincipal().isEnabled());
        Assert.assertTrue(homePage.getCampoListaDeProdutosCarrinho().isEnabled());
        Assert.assertTrue(homePage.getCampoDePesquisa().isEnabled());
        Assert.assertEquals(homePage.getCampoListaDeProdutosCarrinho().getText(), MENSAGEM_NO_CAMPO_CARRINHO);
        logger.info("validação nos assert comcluida com sucesso");
        logger.info("Saindo do metodo validacaoSeEstouNaTelaHome");

    }

    public void validacaoBotaoLogin(WebElement botaoLogin) {
        Assert.assertTrue(botaoLogin.isEnabled());
    }
}
