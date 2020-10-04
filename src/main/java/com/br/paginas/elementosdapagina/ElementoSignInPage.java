package com.br.paginas.elementosdapagina;

import com.br.paginas.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementoSignInPage extends BasePage {


    @FindBy(xpath = "//label[@for='email_create']")
    private WebElement textoEnderecoEmail;

    @FindBy(className = "page-heading")
    private WebElement textoAutentificacao;

    @FindBy(className = "page-subheading")
    private WebElement textoCriarUmaConta;

    @FindBy(id = "email")
    private WebElement campoEmail;

    @FindBy(id = "passwd")
    private WebElement campoSenha;

    @FindBy(id = "SubmitLogin")
    private WebElement botaoSubmit;

    @FindBy(className = "alert alert-danger")
    private WebElement campoMensagemErro;

    public ElementoSignInPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getTextoEnderecoEmail() {
        return textoEnderecoEmail;
    }

    public void setTextoEnderecoEmail(WebElement textoEnderecoEmail) {
        this.textoEnderecoEmail = textoEnderecoEmail;
    }

    public WebElement getTextoAutentificacao() {
        return textoAutentificacao;
    }

    public void setTextoAutentificacao(WebElement textoAutentificacao) {
        this.textoAutentificacao = textoAutentificacao;
    }

    public WebElement getTextoCriarUmaConta() {
        return textoCriarUmaConta;
    }

    public void setTextoCriarUmaConta(WebElement textoCriarUmaConta) {
        this.textoCriarUmaConta = textoCriarUmaConta;
    }

    public WebElement getCampoEmail() {
        return campoEmail;
    }

    public void setCampoEmail(WebElement campoEmail) {
        this.campoEmail = campoEmail;
    }

    public WebElement getCampoSenha() {
        return campoSenha;
    }

    public void setCampoSenha(WebElement campoSenha) {
        this.campoSenha = campoSenha;
    }

    public WebElement getBotaoSubmit() {
        return botaoSubmit;
    }

    public void setBotaoSubmit(WebElement botaoSubmit) {
        this.botaoSubmit = botaoSubmit;
    }

    public WebElement getCampoMensagemErro() {
        return campoMensagemErro;
    }

    public void setCampoMensagemErro(WebElement campoMensagemErro) {
        this.campoMensagemErro = campoMensagemErro;
    }
}
