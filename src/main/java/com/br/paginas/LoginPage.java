package com.br.paginas;

import com.br.modelos.Usuario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(id = "email")
    private WebElement campoEmail;

    @FindBy(id = "passwd")
    private WebElement campoSenha;

    @FindBy(id = "SubmitLogin")
    private WebElement botaoSubmit;

    @FindBy(className = "alert alert-danger")
    private WebElement campoMensagemErro;

    public LoginPage(WebDriver driver) {
        super(driver);
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

    public ShoppingPage realizarLogin(Usuario usuario) {
        campoEmail.sendKeys(usuario.getEmail());
        campoSenha.sendKeys(usuario.getSenha());
        botaoSubmit.click();
        return new ShoppingPage(driver);
    }
}
