package com.br.paginas.elementosdapagina;

import com.br.paginas.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementoHomePage extends BasePage {

    @FindBy(xpath = "//a[contains(@title, 'View my shopping cart')]")
    private WebElement campoListaDeProdutosCarrinho;

    @FindBy(id = "index")
    private WebElement logoDaTelaPrincipal;

    @FindBy(className = "login")
    protected WebElement botaoLogin;

    @FindBy(name = "search_query")
    protected WebElement campoDePesquisa;

    public ElementoHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getCampoListaDeProdutosCarrinho() {
        return campoListaDeProdutosCarrinho;
    }

    public void setCampoListaDeProdutosCarrinho(WebElement campoListaDeProdutosCarrinho) {
        this.campoListaDeProdutosCarrinho = campoListaDeProdutosCarrinho;
    }

    public WebElement getLogoDaTelaPrincipal() {
        return logoDaTelaPrincipal;
    }

    public void setLogoDaTelaPrincipal(WebElement logoDaTelaPrincipal) {
        this.logoDaTelaPrincipal = logoDaTelaPrincipal;
    }

    public WebElement getBotaoLogin() {
        return botaoLogin;
    }

    public void setBotaoLogin(WebElement botaoLogin) {
        this.botaoLogin = botaoLogin;
    }

    public WebElement getCampoDePesquisa() {
        return campoDePesquisa;
    }

    public void setCampoDePesquisa(WebElement campoDePesquisa) {
        this.campoDePesquisa = campoDePesquisa;
    }
}
