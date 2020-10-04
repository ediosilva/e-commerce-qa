package com.br.paginas;

import com.br.modelos.Usuario;
import com.br.paginas.elementosdapagina.ElemetoLoginPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private static final Logger logger = Logger.getLogger(LoginPage.class);
    private ElemetoLoginPage elemetoLoginPage;

    public LoginPage(WebDriver driver) {
        super(driver);
        elemetoLoginPage = new ElemetoLoginPage(driver);
    }

    public ShoppingPage realizarLogin(Usuario usuario) {
        logger.info("realizando o logins: " + usuario);
        elemetoLoginPage.getCampoEmail().sendKeys(usuario.getEmail());
        elemetoLoginPage.getCampoSenha().sendKeys(usuario.getSenha());
        elemetoLoginPage.getBotaoSubmit().click();
        logger.info("login realizado com sucesso");
        return new ShoppingPage(driver);
    }
}
