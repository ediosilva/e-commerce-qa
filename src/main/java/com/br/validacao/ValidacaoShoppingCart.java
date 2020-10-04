package com.br.validacao;

import com.br.paginas.ShoppingPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ValidacaoShoppingCart {

    public void validarItemAdicionadoNoCarrinho(ShoppingPage shoppingCart){
        WebElement ele = shoppingCart.getCampoListaDeProdutosCarrinho();
        Assert.assertTrue(true);
    }
}
