package com.br.paginas;

import com.br.paginas.elementosdapagina.ElementoHomePage;
import com.br.validacao.ValidationHomePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private static final Logger logger = Logger.getLogger(HomePage.class);
    private ValidationHomePage validationHomePage;
    private ElementoHomePage elementoHomePage;

    public HomePage(WebDriver driver) {
        super(driver);
        validationHomePage = new ValidationHomePage();
        elementoHomePage = new ElementoHomePage(driver);
    }

    public SignInPage entrar() {
        logger.info("clicando no botão SigIn");
        elementoHomePage.getBotaoLogin().click();
        return new SignInPage(driver);
    }

    public void validarCampoBotaoLogin() {
        validationHomePage.validacaoBotaoLogin(elementoHomePage.getBotaoLogin());
    }

    public void validarSeEstouNaTelaHome() {
        validationHomePage.validacaoSeEstouNaTelaHome(elementoHomePage);
    }

}
