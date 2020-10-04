package com.br.paginas.elementosdapagina;

import com.br.paginas.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElemetoLoginPage extends BasePage {

    @FindBy(id = "email")
    private WebElement campoEmail;

    @FindBy(id = "passwd")
    private WebElement campoSenha;

    @FindBy(id = "SubmitLogin")
    private WebElement botaoSubmit;

    @FindBy(className = "alert alert-danger")
    private WebElement campoMensagemErro;

    public ElemetoLoginPage(WebDriver driver) {
        super(driver);
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
