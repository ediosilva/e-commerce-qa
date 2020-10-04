package com.br.paginas;

import com.br.paginas.elementosdapagina.ElementoSignInPage;
import com.br.validacao.ValidacaoSignInPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

    private static final Logger logger = Logger.getLogger(SignInPage.class);
    private ValidacaoSignInPage validacaoSignInPage;
    private ElementoSignInPage elementoSignInPage;

    public SignInPage(WebDriver driver) {
        super(driver);
        validacaoSignInPage = new ValidacaoSignInPage();
        elementoSignInPage = new ElementoSignInPage(driver);
    }

    public LoginPage entrarTelaLogin() {
        logger.info("entrando para logar na tela");
        return new LoginPage(driver);
    }


    public void validacaoTelaLogin() {
        validacaoSignInPage.validarCamposTelaSignIn(elementoSignInPage);

    }
}
