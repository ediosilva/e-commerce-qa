package com.br.validacao;

import com.br.paginas.SignInPage;
import org.testng.Assert;

public class ValidacaoSignInPage {

    public void validarCamposTelaSignIn(SignInPage loginPage){
        Assert.assertTrue(loginPage.getBotaoSubmit().isEnabled());
        Assert.assertTrue(loginPage.getCampoEmail().isEnabled());
        Assert.assertTrue(loginPage.getCampoSenha().isEnabled());
    }
}
