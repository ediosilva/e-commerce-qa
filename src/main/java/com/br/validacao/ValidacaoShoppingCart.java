package com.br.validacao;

import com.br.paginas.ShoppingPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ValidacaoShoppingCart {

    public void validarItemAdicionadoNoCarrinho(ShoppingPage shoppingCart, int tamanhoListaCarrinho) {
        // WebElement ele = shoppingCart.getCampoListaDeProdutosCarrinho();
        /// Assert.assertTrue(true);
    }

    public void validarSeUmNovoItemFoiAdicionado(String tamanhoListaCarrinhoAnterior, String tamanhoListaCarrinho) {
        try {
            if (Integer.parseInt(tamanhoListaCarrinhoAnterior) >= Integer.parseInt(tamanhoListaCarrinho)) {
                Assert.fail("Foi adicionado um novo item no carrinho, porem o tamanho da lista é menor ou igual");
            }
        } catch (Exception e) {
            Assert.fail("Erro ao realizar o parse para inteiro metodo validarSeUmNovoItemFoiAdicionado");
        }
    }

    public void validarSeBotaoRemover(String tamanhoListaCarrinhoAnterior, String tamanhoListaCarrinho) {
        try {
            if (!tamanhoListaCarrinhoAnterior.equals(tamanhoListaCarrinho)) {
                Assert.fail("Os valores deveriam ser iguais");
            }
        } catch (Exception e) {
            Assert.fail("Erro ao realizar o parse para inteiro metodo validarSeBotaoRemover");
        }
    }
}
