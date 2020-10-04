package com.br.validacao;

import org.apache.log4j.Logger;
import org.testng.Assert;

public class ValidacaoShoppingCartPage {
    private static final Logger logger = Logger.getLogger(ValidacaoShoppingCartPage.class);

    public void validarSeUmNovoItemFoiAdicionado(String tamanhoListaCarrinhoAnterior, String tamanhoListaCarrinho) {
        try {
            if (Integer.parseInt(tamanhoListaCarrinhoAnterior) >= Integer.parseInt(tamanhoListaCarrinho)) {
                Assert.fail("Foi adicionado um novo item no carrinho, porem o tamanho da lista é menor ou igual");
            }
        } catch (Exception e) {
            Assert.fail("Erro ao realizar o parse para inteiro metodo validarSeUmNovoItemFoiAdicionado");
        }
    }

    public void validarSeBotaoRemoveu(String tamanhoListaCarrinhoAnterior, String tamanhoListaCarrinho) {
        try {

            if (!tamanhoListaCarrinhoAnterior.equals(tamanhoListaCarrinho)) {
                logger.error("Quantidade Produto Antes: " + tamanhoListaCarrinhoAnterior);
                logger.error("Quantidade Produto atual: " + tamanhoListaCarrinho);
                Assert.fail("Os valores deveriam ser iguais");
            }
        } catch (Exception e) {
            Assert.fail("Erro ao realizar o parse para inteiro metodo validarSeBotaoRemover");
        }
    }

    public void validaProdutoCarrinhoAdicionadoIgualAoSelecionado(boolean existeProdutoPorNomeNoCarrinho) {
        Assert.assertTrue(existeProdutoPorNomeNoCarrinho, "O Nome no Carrinho deve ser igual ao que o usuario selecionou");
    }
}
