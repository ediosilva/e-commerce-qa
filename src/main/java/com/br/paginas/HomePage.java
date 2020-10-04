package com.br.paginas;

import com.br.validacao.ValidationHomePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    private static final Logger logger = Logger.getLogger(HomePage.class);

    @FindBy(xpath = "//a[contains(@title, 'View my shopping cart')]")
    private WebElement campoListaDeProdutosCarrinho;

    @FindBy(id = "index")
    private WebElement logoDaTelaPrincipal;

    @FindBy(className = "login")
    protected WebElement botaoLogin;

    @FindBy(name = "search_query")
    protected WebElement campoDePesquisa;

    private ValidationHomePage validationHomePage;

    public HomePage(WebDriver driver) {
        super(driver);
        validationHomePage = new ValidationHomePage();
    }

    public SignInPage entrar(){
        logger.info("clicando no botão SigIn");
        botaoLogin.click();
        return new SignInPage(driver);
    }
    public WebElement getCampoListaDeProdutosCarrinho() {
        return campoListaDeProdutosCarrinho;
    }

    public WebElement getLogoDaTelaPrincipal() {
        return logoDaTelaPrincipal;
    }

    public WebElement getBotaoLogin() {
        return botaoLogin;
    }

    public WebElement getCampoDePesquisa() {
        return campoDePesquisa;
    }

    public void validarCampoBotaoLogin() {
        validationHomePage.validacaoBotaoLogin(botaoLogin);
    }

    public void validarSeEstouNaTelaHome() {
        validationHomePage.validacaoSeEstouNaTelaHome(this);
    }

}
