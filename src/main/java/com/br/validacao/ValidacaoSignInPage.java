package com.br.validacao;

import com.br.paginas.elementosdapagina.ElementoSignInPage;
import org.testng.Assert;

public class ValidacaoSignInPage {

    public void validarCamposTelaSignIn(ElementoSignInPage elementoSignInPage) {
        Assert.assertTrue(elementoSignInPage.getBotaoSubmit().isEnabled());
        Assert.assertTrue(elementoSignInPage.getCampoEmail().isEnabled());
        Assert.assertTrue(elementoSignInPage.getCampoSenha().isEnabled());
    }
}
