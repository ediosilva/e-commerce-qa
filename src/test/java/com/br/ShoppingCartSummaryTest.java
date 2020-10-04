package com.br;

import com.br.dataproviders.DataProviderItensCompra;
import com.br.util.BaseTest;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class ShoppingCartSummaryTest extends BaseTest {
    private static final Logger logger = Logger.getLogger(ShoppingTest.class);

    @Test(dataProvider = "produto", dataProviderClass = DataProviderItensCompra.class)
    public void validarNomeProdutoSelecionadoSummary(String nomeProduto) {
        logger.info("entrando no metodo validarNomeProdutoSelecionadoSummary");
        homePage.entrar()
                .entrarTelaLogin()
                .realizarLogin(usuario)
                .adicionarItemNoCarrinho(nomeProduto)
                .irParaShoppingCartSummary()
                .validarSeProdutoSelecionadoExisteNoSummary(nomeProduto);
        logger.info("saindo no metodo validarNomeProdutoSelecionadoSummary");


    }
}
