package com.br.paginas;

import com.br.validacao.ValidacaoSignInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

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

    private ValidacaoSignInPage validacaoSignInPage;

    public WebElement getTextoEnderecoEmail() {
        return textoEnderecoEmail;
    }

    public WebElement getTextoAutentificacao() {
        return textoAutentificacao;
    }

    public WebElement getTextoCriarUmaConta() {
        return textoCriarUmaConta;
    }

    public WebElement getCampoEmail() {
        return campoEmail;
    }

    public WebElement getCampoSenha() {
        return campoSenha;
    }

    public WebElement getBotaoSubmit() {
        return botaoSubmit;
    }

    public WebElement getCampoMensagemErro() {
        return campoMensagemErro;
    }

    public SignInPage(WebDriver driver) {
        super(driver);
        validacaoSignInPage = new ValidacaoSignInPage();
    }

    public LoginPage entrarTelaLogin() {
        return new LoginPage(driver);
    }


    public void validacaoTelaLogin() {
        validacaoSignInPage.validarCamposTelaSignIn(this);

    }
}
